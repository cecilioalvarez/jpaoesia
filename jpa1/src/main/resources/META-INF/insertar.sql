INSERT INTO `Categorias` (`id`, `nombre`) VALUES ('1', 'programacion');
INSERT INTO `Categorias` (`id`, `nombre`) VALUES ('2', 'web');
INSERT INTO `Categorias` (`id`, `nombre`) VALUES ('3', 'movil');
INSERT INTO `Categorias` (`id`, `nombre`) VALUES ('4', 'web2');
INSERT INTO `Categorias` (`id`, `nombre`) VALUES ('5', 'deskop');


INSERT INTO `Libros` (`isbn`, `titulo`, `autor`, `fecha`, `precio`, `categorias_id`) VALUES ('1AB', 'Java', 'cecilio', '2020-01-01', '3',1)
INSERT INTO `Libros` (`isbn`, `titulo`, `autor`, `fecha`, `precio`,`categorias_id`) VALUES ('2AC', 'Java Web', 'cecilio', '2020-01-02', '3',2)
INSERT INTO `Libros` (`isbn`, `titulo`, `autor`, `fecha`, `precio`,`categorias_id`) VALUES ('3BC', 'html', 'gema', '2020-01-02', '2',2)
INSERT INTO `Libros` (`isbn`, `titulo`, `autor`, `fecha`, `precio`,`categorias_id`) VALUES ('5BD', 'android', 'andres', '2020-01-02', '2',3)
INSERT INTO `Libros` (`isbn`, `titulo`, `autor`, `fecha`, `precio`,`categorias_id`) VALUES ('6AC', 'php', 'cecilio', '2020-01-02', '3',4)
INSERT INTO `Libros` (`isbn`, `titulo`, `autor`, `fecha`, `precio`,`categorias_id`) VALUES ('7BC', 'swing', 'gema', '2020-01-02', '2',5)
INSERT INTO `Libros` (`isbn`, `titulo`, `autor`, `fecha`, `precio`,`categorias_id`) VALUES ('8BD', 'php laravel', 'andres', '2020-01-02', '2',4)


INSERT INTO `Ejemplares` (`Codigo`, `Libros_isbn`) VALUES ('123','1AB' );

