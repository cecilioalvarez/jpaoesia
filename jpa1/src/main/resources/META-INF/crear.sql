CREATE TABLE `Categorias` (`id` INT,`Nombre` VARCHAR(25) NOT NULL);
CREATE TABLE `Libros` (`isbn` VARCHAR(255) NOT NULL,`titulo` VARCHAR(25) NOT NULL,`autor` VARCHAR(25) NOT NULL,`fecha` DATE NOT NULL,`precio` INT ,`categorias_id` INT ,PRIMARY KEY (`isbn`));
