package ch.aerztekasse.service.place.controller;

import ch.aerztekasse.service.place.model.Place;
import ch.aerztekasse.service.place.model.PlaceDetails;
import ch.aerztekasse.service.place.repository.PlaceRepository;
import ch.aerztekasse.service.place.service.PlaceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "/place")
public class PlaceController {

    @Autowired
    private PlaceRepository placeRepository;

    @Autowired
    private PlaceService placeService;

    @GetMapping(path = "/search")
    public List<Place> searchPlaces(@RequestParam("label") Optional<String> label, @RequestParam("location") Optional<String> location) {
        return placeRepository.findByLabelContainingIgnoreCaseOrLocationContainingIgnoreCase(label.orElseGet(() -> null), location.orElseGet(() -> null));
    }

    @GetMapping(path = "/{id}")
    public PlaceDetails getPlace(@PathVariable("id") int id) {
        var place = placeService.getPlace(id);
        return place.get();
    }

}
