DELETE FROM student;
DELETE FROM result;

INSERT INTO student(id, name, age, gender) VALUES 
('2e2ccbf8-01e6-4509-96f1-805f098e65da','Fluppe',30, 0), 
('3a71f6c9-7c1a-4f7f-bfb2-c48d633a399c', 'Cinderella', 17, 1);

INSERT INTO result(maths, art, chemistry, student_id) VALUES 
('PASS','FAIL','PASS', '2e2ccbf8-01e6-4509-96f1-805f098e65da'), 
('PASS','FAIL','PASS', '3a71f6c9-7c1a-4f7f-bfb2-c48d633a399c');