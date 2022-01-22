CREATE SCHEMA desafioapi;

USE desafioapi;

CREATE TABLE movies (
  `id` INT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(50) NOT NULL,
  `description` VARCHAR(150) NOT NULL,
  `score` INT NULL,
  PRIMARY KEY (`id`));