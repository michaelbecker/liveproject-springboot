-------------------------------------------------------------------
-- V1 - Initia Database creation and population.
-------------------------------------------------------------------

CREATE DATABASE pastry_repository;

--USE pastry_repository;
-- \connect to pastry_repository
\c pastry_repository;


CREATE TABLE pastry (
	id CHAR(10) PRIMARY KEY,
	description VARCHAR(100) NOT NULL,
	price REAL NOT NULL
);


-------------------------------------------------------------------
-- Preload our test data for Milestone #2
-------------------------------------------------------------------
INSERT INTO pastry VALUES
('abcr', 'All Butter Croissant', 0.75),
('ccr', 'Chocolate Croissant', 0.95),
('b', 'Fresh Baguette', 1.60),
('rv', 'Red Velvet', 3.95),
('vs', 'Victoria Sponge', 5.45),
('cc', 'Carrot Cake', 3.45);

