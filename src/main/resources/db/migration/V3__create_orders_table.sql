-- CREATE ORDERS TABLE

CREATE TABLE orders (
    id int NOT NULL AUTO_INCREMENT,
    customer_id int NOT NULL,
    PRIMARY KEY (id),
    FOREIGN KEY (customer_id) REFERENCES customers(id)

);