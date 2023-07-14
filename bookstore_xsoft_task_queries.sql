drop database if exists bookstore_xsoft_task;
create database bookstore_xsoft_task char set utf8;
use bookstore_xsoft_task;

CREATE TABLE users (
    id BIGINT NOT NULL PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(50) NOT NULL,
    email VARCHAR(255) NOT NULL UNIQUE,
    password VARCHAR(255) NOT NULL
);

CREATE TABLE categories (
    id BIGINT NOT NULL PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(50) NOT NULL UNIQUE
);

CREATE TABLE books (
    id BIGINT NOT NULL PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(50) NOT NULL,
    author VARCHAR(50) NOT NULL,
    description VARCHAR(1000) NOT NULL,
    user_id BIGINT NOT NULL,
    category_id BIGINT NOT NULL
);
ALTER TABLE books ADD FOREIGN KEY (user_id) REFERENCES users(id);
ALTER TABLE books ADD FOREIGN KEY (category_id) REFERENCES categories(id);




CREATE TABLE roles (
    id BIGINT NOT NULL PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(50) NOT NULL
);

CREATE TABLE user_roles (
   user_id BIGINT NOT NULL,
   role_id BIGINT NOT NULL
);
ALTER TABLE user_roles ADD FOREIGN KEY (user_id) REFERENCES users(id);
ALTER TABLE user_roles  ADD FOREIGN KEY (role_id) REFERENCES roles(id);

SELECT * FROM users;
SELECT * FROM roles;