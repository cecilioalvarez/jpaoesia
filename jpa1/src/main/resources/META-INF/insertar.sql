INSERT INTO `Categorias` (`id`, `nombre`) VALUES ('1', 'programacion');
INSERT INTO `Categorias` (`id`, `nombre`) VALUES ('2', 'web');


INSERT INTO `Libros` (`isbn`, `titulo`, `autor`, `fecha`, `precio`, `categorias_id`) VALUES ('1AB', 'Java', 'cecilio', '2020-01-01', '3',1)
INSERT INTO `Libros` (`isbn`, `titulo`, `autor`, `fecha`, `precio`,`categorias_id`) VALUES ('2AC', 'Java Web', 'cecilio', '2020-01-02', '3',2)
INSERT INTO `Libros` (`isbn`, `titulo`, `autor`, `fecha`, `precio`,`categorias_id`) VALUES ('3BC', 'html', 'gema', '2020-01-02', '2',2)
INSERT INTO `Libros` (`isbn`, `titulo`, `autor`, `fecha`, `precio`,`categorias_id`) VALUES ('4BD', 'html5', 'andres', '2020-01-02', '2',2)