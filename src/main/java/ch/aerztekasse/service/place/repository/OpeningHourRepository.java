package ch.aerztekasse.service.place.repository;

import ch.aerztekasse.service.place.model.OpeningHour;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface OpeningHourRepository extends CrudRepository<OpeningHour, Integer> {

    List<OpeningHour> findByPlaceId(int placeId);

}
