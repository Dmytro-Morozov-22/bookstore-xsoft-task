drop database if exists bookstore_xsoft_task;
create database bookstore_xsoft_task char set utf8;
use bookstore_xsoft_task;


CREATE TABLE users (
    id BIGINT NOT NULL PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(50) NOT NULL,
    email VARCHAR(255) NOT NULL UNIQUE,
    password VARCHAR(255) NOT NULL
);

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