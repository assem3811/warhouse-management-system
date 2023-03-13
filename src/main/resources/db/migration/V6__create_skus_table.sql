-- CREATE SKUs TABLE

CREATE TABLE storage_keeping_units (
    id int NOT NULL AUTO_INCREMENT,
    supplier_id int NOT NULL,
    order_id int NOT NULL,
    name varchar(255) NOT NULL,
    description TEXT NOT NULL,
    orientation ENUM('horizontal', 'vertical'),
    type ENUM('single', 'dozen'),
    capacity DOUBLE(4,1) NOT NULL,
    price DOUBLE(4,1) NOT NULL,
    exp_date DATE NOT NULL,
    admittance_date DATE NOT NULL,
    PRIMARY KEY (id),
    FOREIGN KEY (supplier_id) REFERENCES suppliers(id),
    FOREIGN KEY (order_id) REFERENCES orders(id)
);