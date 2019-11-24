DROP DATABASE IF EXISTS testdb;

CREATE DATABASE testdb;
USE testdb;

CREATE TABLE users(
	user_id int primary key auto_increment,
	user_name varchar(255),
	password varchar(255)
);

INSERT INTO users(user_name, password) VALUES
("taro", "123"),
("jiro", "456"),
("hanako", "789");

CREATE TABLE inquiry(
	name varchar(255),
	qtype varchar(255),
	body varchar(255)
);