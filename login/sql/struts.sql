-- 文字コードと外部キーのチェックを無効化
SET names utf8;
SET foreign_key_checks = 0;

DROP DATABASE IF EXISTS logindb_ohki;
CREATE DATABASE logindb_ohki;
USE logindb_ohki;

CREATE TABLE user(
id int,
user_name varchar(255),
password varchar(255)
);

INSERT INTO user VALUES
(1, "taro", "123"),
(2, "jiro", "123"),
(3, "hanako", "123"),
(4, "saburo", "123");