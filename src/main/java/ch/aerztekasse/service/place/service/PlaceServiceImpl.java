package ch.aerztekasse.service.place.service;

import ch.aerztekasse.service.place.model.PlaceDetails;
import ch.aerztekasse.service.place.model.PlaceDetailsOpeningHour;
import ch.aerztekasse.service.place.repository.OpeningHourRepository;
import ch.aerztekasse.service.place.repository.PlaceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;
import java.util.stream.Collectors;

@Component
public class PlaceServiceImpl implements PlaceService {

    @Autowired
    private PlaceRepository placeRepository;

    @Autowired
    private OpeningHourRepository openingHourRepository;

    public Optional<PlaceDetails> getPlace(int id) {
        var placeOpt = this.placeRepository.findById(id);
        if (placeOpt.isEmpty()) {
            return Optional.empty();
        }
        var place = placeOpt.get();
        var hours = this.openingHourRepository.findByPlaceId(place.getId());
        PlaceDetails details = new PlaceDetails();
        details.setId(place.getId());
        details.setLabel(place.getLabel());
        details.setLocation(place.getLocation());
        details.setOpeningHours(hours.stream().map(oh -> PlaceDetailsOpeningHour.createFromOpeningHour(oh)).collect(Collectors.toList()));
        return Optional.of(details);
    }

}
