DROP database IF EXISTS testdb;
CREATE database testdb;
USE testdb;

CREATE TABLE test_table(
user_id int(11),
user_name varchar(255),
password varchar(255)
);

INSERT INTO test_table VALUES
(1, "taro", "123"),
(2, "jiro", "456"),
(3, "hanako", "789");