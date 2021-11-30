CREATE EXTENSION IF NOT EXISTS "uuid-ossp";

CREATE TABLE student (
    id uuid PRIMARY KEY DEFAULT uuid_generate_v4(), 
    name VARCHAR(255) NOT NULL, 
    age DECIMAL(9,2) NOT NULL,
    gender VARCHAR(32) NOT NULL
);