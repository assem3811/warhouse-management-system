-- CREATE ADDRESS TABLE

CREATE TABLE addresses (
    id int NOT NULL AUTO_INCREMENT,
    customer_id int NOT NULL,
    building_number int NOT NULL,
    street_name varchar(255) NOT NULL,
    district varchar(255) NOT NULL,
    city varchar(255) NOT NULL,
    PRIMARY KEY (id),
    FOREIGN KEY (customer_id) REFERENCES customers(id)
);