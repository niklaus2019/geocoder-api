drop table if exists geo_coder;
create table geo_coder(
    id bigint auto_increment primary key,
    latitude double,
    longitude double,
    type varchar(255),
    name varchar(255),
    number varchar(255),
    postal_code varchar(255),
    street varchar(255),
    confidence int,
    region varchar(255),
    region_code varchar(255),
    county varchar(255),
    locality varchar(255),
    administrative_area varchar(255),
    neighbourhood varchar(255),
    country varchar(255),
    country_code varchar(255),
    continent varchar(255),
    label varchar(255),
    map_url varchar(255)
);