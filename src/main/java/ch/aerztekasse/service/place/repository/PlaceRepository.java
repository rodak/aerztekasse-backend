package ch.aerztekasse.service.place.repository;

import ch.aerztekasse.service.place.model.Place;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface PlaceRepository extends CrudRepository<Place, Integer> {

    List<Place> findByLabelContainingIgnoreCaseOrLocationContainingIgnoreCase(String label, String location);

}
