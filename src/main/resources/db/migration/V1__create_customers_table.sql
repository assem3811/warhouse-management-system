-- CREATE CUSTOMERS TABLE

CREATE TABLE customers (
    id int NOT NULL AUTO_INCREMENT,
    address_id int NOT NULL,
    name varchar(255) NOT NULL,
    email varchar(255) NOT NULL,
    phone varchar(255) NOT NULL,
    PRIMARY KEY (id)
);