create database if not exists sampledb;
use sampledb;

create table if not exists sample_table(
No int,
name varchar(50),
age int,
mail varchar(50)
);

insert into sample_table values
(1, "Yamada", 21, "xxx@yahoo.co.jp"),
(2, "Sato", 39, "yyy@google.com"),
(3, "Harada", 44, "zzz@yahoo.co.jp");