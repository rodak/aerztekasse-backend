const places = require("./places_example.json");


let place_id = 1;
for (const p of Object.values(places)) {
    for (const place of p) {
        console.log("insert into place(id, label, location) VALUES ("+place_id+", '"+place.label+"', '"+place.location+"');");
        for (const days of Object.values(place.opening_hours)) {
                for (const day in days) {
                    const times = days[day];
                    for (const time of times) {
                        console.log("insert into opening_hour(place_id, day, time_start, time_end) VALUES ("+place_id+"," +
                            "'"+day+"', '"+time.start+"', '"+time.end+"');");
                    }
                }
        }
        place_id++;
    }

}