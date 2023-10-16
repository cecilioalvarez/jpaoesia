CREATE TABLE `Categorias` (`id` INT,`Nombre` VARCHAR(25) NOT NULL);
CREATE TABLE `Ejemplares` (`codigo`  VARCHAR(25) ,`Libros_isbn` VARCHAR(25) NOT NULL, PRIMARY KEY (`codigo`));
CREATE TABLE `Libros` (`isbn` VARCHAR(25) NOT NULL,`titulo` VARCHAR(25) NOT NULL,`autor` VARCHAR(25) NOT NULL,`fecha` DATE NOT NULL,`precio` INT ,`categorias_id` INT ,PRIMARY KEY (`isbn`));
CREATE TABLE `Prestamos` (`id` INT ,`fecha` Date, PRIMARY KEY (`id`));
CREATE TABLE `EjemplaresPrestamo` (`id` INT ,`isbn` VARCHAR(25) ,PRIMARY KEY (`id`,`isbn`));
