CREATE TABLE students(
    id SERIAL PRIMARY KEY,
    first_name TEXT,
    last_name TEXT,
    grade INTEGER 
);
CREATE TABLE subjects(
    id SERIAL PRIMARY KEY,
    subject_name TEXT
);
CREATE TABLE teachers(
    id SERIAL PRIMARY KEY,
    first_name TEXT,
    last_name TEXT,
    subject INTEGER REFERENCES  subjects(id),
    salary NUMERIC(10,2)
);


