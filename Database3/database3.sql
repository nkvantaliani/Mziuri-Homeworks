CREATE TABLE authors(
    id SERIAL PRIMARY KEY,
    first_name TEXT,
    last_name TEXT
);

CREATE TABLE books(
    id SERIAL PRIMARY KEY,
    title TEXT NOT NULL,
    author_id INTEGER REFERENCES authors(id),
    price NUMERIC(6,2) NOT NULL
);

CREATE TABLE sales(
    id SERIAL PRIMARY KEY,
    book_id INTEGER REFERENCES books(id),
    quantity INTEGER,
    sale_date DATE
);

INSERT INTO authors (first_name, last_name) VALUES
('Jane', 'Austen'),
('Charles', 'Dickens'),
('Mark', 'Twain'),
('ilia', 'chavchavadze'),
('akaki', 'wereteli'),
('shota', 'rustaveli');

INSERT INTO books (title, author_id, price) VALUES
('Pride and Prejudice', 1, 19.99),
('David Copperfield', 2, 15.50),
('Adventures of Huckleberry Finn', 3, 8.99),
('Emma', 1, 12.50),
('Great Expectations', 2, 10.00),
('kacia adamiani', 4, 16.99),
('gamzrdeli', 5, 9.50),
('vefxistyaosani', 6, 27.30),
('otarant qvrivi', 4, 17.00);

INSERT INTO sales (book_id, quantity, sale_date) VALUES
(1, 2, '2024-01-10'),
(2, 1, '2024-01-11'),
(5, 3, '2024-01-12'),
(6, 2, '2024-12-30'),
(7, 1, '2025-09-02'),
(8, 4, '2026-05-03');

SELECT 
    authors.id,
    authors.first_name,
    authors.last_name,
    books.id,
    books.title,
    books.price
FROM BOOKS JOIN authors ON (books.author_id = authors.id);

SELECT SUM(books.price * sales.quantity)
FROM sales JOIN books ON sales.book_id = books.id;

SELECT 
    books.title,
    authors.first_name,
    authors.last_name,
    sales.sale_date
FROM sales JOIN books ON sales.book_id = books.id
JOIN authors ON books.author_id = authors.id
WHERE sales.sale_date = '2024-01-12';




