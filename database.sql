
CREATE DATABASE return_db;

USE return_db;

CREATE TABLE return_record (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    product_name VARCHAR(255),
    category VARCHAR(255),
    reason VARCHAR(255),
    refund_amount DOUBLE,
    original_price DOUBLE,
    current_price DOUBLE,
    is_discounted BOOLEAN,
    qr_code_data VARCHAR(500),
    return_date DATE
);
