package ch.aerztekasse.service.place.model;

import java.util.List;

public class PlaceDetails extends Place {

    private List<PlaceDetailsOpeningHour> openingHours;

    public List<PlaceDetailsOpeningHour> getOpeningHours() {
        return openingHours;
    }

    public void setOpeningHours(List<PlaceDetailsOpeningHour> openingHours) {
        this.openingHours = openingHours;
    }
}
