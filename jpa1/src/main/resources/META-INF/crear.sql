CREATE TABLE `Categorias` (`id` INT,`Nombre` VARCHAR(25) NOT NULL);
CREATE TABLE `Ejemplares` (`codigo`  VARCHAR(25) ,`Libros_isbn` VARCHAR(25) NOT NULL, PRIMARY KEY (`codigo`));
CREATE TABLE `Libros` (`isbn` VARCHAR(25) NOT NULL,`titulo` VARCHAR(25) NOT NULL,`autor` VARCHAR(25) NOT NULL,`fecha` DATE NOT NULL,`precio` INT ,`categorias_id` INT ,PRIMARY KEY (`isbn`));
CREATE TABLE `Prestamos` (`id` INT ,`fecha` Date, PRIMARY KEY (`id`));
CREATE TABLE `EjemplaresPrestamo` (`id` INT ,`isbn` VARCHAR(25) ,PRIMARY KEY (`id`,`isbn`));
CREATE TABLE `Socios` (`dni` VARCHAR(10) ,`nombre` VARCHAR(25) , apellidos VARCHAR(25) , calle VARCHAR (25), numero INT,PRIMARY KEY (`dni`));
CREATE TABLE `Tarjetas` (`dni` VARCHAR(10) ,`numero` INT , fecha DATE ,tipo VARCHAR(20),PRIMARY KEY (`dni`));
CREATE TABLE `Personas` (`id` INT AUTO_INCREMENT ,`nombre` VARCHAR(20) , `apellidos` VARCHAR(20),PRIMARY KEY (`id`));
