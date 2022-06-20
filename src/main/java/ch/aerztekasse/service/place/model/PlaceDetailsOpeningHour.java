package ch.aerztekasse.service.place.model;

import java.time.LocalTime;

public class PlaceDetailsOpeningHour {

    private OpeningHourDays day;
    private LocalTime timeStart;
    private LocalTime timeEnd;

    public OpeningHourDays getDay() {
        return day;
    }

    public void setDay(OpeningHourDays day) {
        this.day = day;
    }

    public LocalTime getTimeStart() {
        return timeStart;
    }

    public void setTimeStart(LocalTime timeStart) {
        this.timeStart = timeStart;
    }

    public LocalTime getTimeEnd() {
        return timeEnd;
    }

    public void setTimeEnd(LocalTime timeEnd) {
        this.timeEnd = timeEnd;
    }

    public static PlaceDetailsOpeningHour createFromOpeningHour(OpeningHour openingHour) {
        PlaceDetailsOpeningHour placeDetailsOpeningHour = new PlaceDetailsOpeningHour();
        placeDetailsOpeningHour.setDay(openingHour.getDay());
        placeDetailsOpeningHour.setTimeEnd(openingHour.getTimeEnd());
        placeDetailsOpeningHour.setTimeStart(openingHour.getTimeStart());
        return placeDetailsOpeningHour;
    }

}
