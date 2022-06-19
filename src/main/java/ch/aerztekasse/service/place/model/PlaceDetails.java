package ch.aerztekasse.service.place.model;

import java.util.List;

public class PlaceDetails extends Place {

    private List<OpeningHour> openingHours;

    public List<OpeningHour> getOpeningHours() {
        return openingHours;
    }

    public void setOpeningHours(List<OpeningHour> openingHours) {
        this.openingHours = openingHours;
    }
}
