CREATE EXTENSION IF NOT EXISTS "uuid-ossp";

CREATE TABLE student (
    id uuid PRIMARY KEY DEFAULT uuid_generate_v4(), 
    name VARCHAR(255) NOT NULL, 
    age INT NOT NULL,
    gender INT NOT NULL
);

CREATE TABLE result (
    id uuid PRIMARY KEY DEFAULT uuid_generate_v4(), 
    maths VARCHAR(255) NOT NULL, 
    art VARCHAR(255) NOT NULL, 
    chemistry VARCHAR(255) NOT NULL, 
    student_id uuid
);

ALTER TABLE result
ADD CONSTRAINT fk_result_student FOREIGN KEY (student_id) REFERENCES student(id);
