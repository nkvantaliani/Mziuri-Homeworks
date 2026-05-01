CREATE TABLE students(
	id SERIAL PRIMARY KEY,
	first_name VARCHAR(50),
	last_name VARCHAR(50),
	dob DATE,
	enrollment_date TIMESTAMP DEFAULT now(),
	grade INTEGER CHECK (grade>=1) CHECK (grade<=12),
	email TEXT UNIQUE
);

INSERT INTO students(first_name, last_name, dob,enrollment_date, grade,email)
VALUES ('nata','kvantaliani','2009-05-20','2022-01-21 12:00:00',11,'nata@gmail.com'),
		('lizi','zerekidze','2009-03-10','2020-02-28 11:01:01',11,'lizi@gmail.com'),
		('nino','gordadze','2008-01-18','2023-07-06 15:00:00',12,'@nino@gmail.com'),
		('salome','bakhtadze','2010-04-25','2026-04-03 22:00:00',10,'@salome@gmail.com'),
		('data','xvichia','2008-12-18','2025-05-06 09:00:00',12,'data@gmail.com');
		--('data','xvichia','2008-12-18','2025-05-06 09:00:00',15,'xvichia@gmail.com');

UPDATE students SET grade = grade+1 WHERE email='nata@gmail.com';
SELECT * FROM students;

DELETE FROM students WHERE first_name ='data';


