CREATE DATABASE IF NOT EXISTS banco;
USE banco;
CREATE table tabela(
id INT NOT NULL primary key auto_increment,
nome VARCHAR(100),
cidade VARCHAR(100)
);
select * from tabela
 
