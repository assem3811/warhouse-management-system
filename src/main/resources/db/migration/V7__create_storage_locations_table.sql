-- CREATE STORAGE LOCATIONS TABLES

CREATE TABLE storage_locations (
    id int NOT NULL AUTO_INCREMENT,
    sku_id int NOT NULL,
    section_number int NOT NULL,
    shelf_number int NOT NULL,
    unit_number int NOT NULL,
    max_capacity DOUBLE(4,1) NOT NULL,
    PRIMARY KEY (id),
    FOREIGN KEY (sku_id) REFERENCES storage_keeping_units(id)

);