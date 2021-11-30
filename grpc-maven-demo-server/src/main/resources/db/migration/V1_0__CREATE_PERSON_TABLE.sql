CREATE EXTENSION IF NOT EXISTS "uuid-ossp";

CREATE TABLE person (
    id uuid PRIMARY KEY DEFAULT uuid_generate_v4(), 
    firstName VARCHAR(255) NOT NULL, 
    lastName VARCHAR(255) NOT NULL
);