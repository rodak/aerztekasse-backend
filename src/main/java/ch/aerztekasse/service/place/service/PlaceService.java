package ch.aerztekasse.service.place.service;

import ch.aerztekasse.service.place.model.PlaceDetails;

import java.util.Optional;

public interface PlaceService {

    Optional<PlaceDetails> getPlace(int id);

}
