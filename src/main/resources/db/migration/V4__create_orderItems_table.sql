-- CREATE ORDER ITEM TABLE

CREATE TABLE order_items (
    id int NOT NULL AUTO_INCREMENT,
    order_id int NOT NULL,
    PRIMARY KEY (id),
    FOREIGN KEY (order_id) REFERENCES orders (id)
);