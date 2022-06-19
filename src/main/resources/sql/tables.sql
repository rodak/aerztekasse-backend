CREATE TABLE place(
    id serial primary key,
    label varchar(250),
    location varchar(250)
);

CREATE INDEX label on place(label);
CREATE INDEX location on place(location);

CREATE TABLE opening_hour(
    id serial primary key,
    place_id int references place(id),
    day varchar(20),
    time_start time,
    time_end time
);

CREATE INDEX place_id on opening_hour(place_id);