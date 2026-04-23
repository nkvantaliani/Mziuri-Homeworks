CREATE TABLE teachers(
	id BIGINT,
	first_name VARCHAR(50),
	last_name VARCHAR(50),
	hire_date DATE,
	email TEXT
);

INSERT INTO teachers VALUES(1,'Lali','Dzidziguri','03-20-2018','dzidzigurilali@email.com');
INSERT INTO teachers VALUES(1,'Nargiza','Lomidze','01-02-1989','nargizalomidze@email.com');
INSERT INTO teachers VALUES(1,'Data','Maisuradze','05-23-2023','datamaisuradze@email.com');
INSERT INTO teachers VALUES(1,'Miranda','Khurtsilava','02-08-1987','khurtsilavamiranda@email.com');
INSERT INTO teachers VALUES(1,'Marina','Bzikadze','09-25-2007','dzidzigurilali@email.com');


SELECT * FROM teachers WHERE hire_date > '01-01-2009';

ALTER TABLE teachers ADD COLUMN department TEXT;

ALTER TABLE teachers RENAME COLUMN email TO contact_email;

SELECT (first_name,contact_email) FROM teachers WHERE hire_date < '01-01-2015' OR hire_date> '01-01-2018';



