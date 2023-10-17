INSERT INTO `Categorias` (`id`, `nombre`) VALUES ('1', 'programacion');
INSERT INTO `Categorias` (`id`, `nombre`) VALUES ('2', 'web');
INSERT INTO `Categorias` (`id`, `nombre`) VALUES ('3', 'movil');
INSERT INTO `Categorias` (`id`, `nombre`) VALUES ('4', 'web2');
INSERT INTO `Categorias` (`id`, `nombre`) VALUES ('5', 'deskop');
INSERT INTO `Categorias` (`id`, `nombre`) VALUES ('6', 'otra');


INSERT INTO `Libros` (`isbn`, `titulo`, `autor`, `fecha`, `precio`, `categorias_id`) VALUES ('1AB', 'Java', 'cecilio', '2020-01-01', '3',1)
INSERT INTO `Libros` (`isbn`, `titulo`, `autor`, `fecha`, `precio`,`categorias_id`) VALUES ('2AC', 'Java Web', 'cecilio', '2020-01-02', '3',2)
INSERT INTO `Libros` (`isbn`, `titulo`, `autor`, `fecha`, `precio`,`categorias_id`) VALUES ('3BC', 'html', 'gema', '2020-01-02', '2',2)
INSERT INTO `Libros` (`isbn`, `titulo`, `autor`, `fecha`, `precio`,`categorias_id`) VALUES ('5BD', 'android', 'andres', '2020-01-02', '2',3)
INSERT INTO `Libros` (`isbn`, `titulo`, `autor`, `fecha`, `precio`,`categorias_id`) VALUES ('6AC', 'php', 'cecilio', '2020-01-02', '3',4)
INSERT INTO `Libros` (`isbn`, `titulo`, `autor`, `fecha`, `precio`,`categorias_id`) VALUES ('7BC', 'swing', 'gema', '2020-01-02', '2',5)
INSERT INTO `Libros` (`isbn`, `titulo`, `autor`, `fecha`, `precio`,`categorias_id`) VALUES ('8BD', 'php laravel', 'andres', '2020-01-02', '2',4)


INSERT INTO `Ejemplares` (`Codigo`, `Libros_isbn`) VALUES ('123','1AB' );
INSERT INTO `Ejemplares` (`Codigo`, `Libros_isbn`) VALUES ('234','1AB' );
INSERT INTO `Ejemplares` (`Codigo`, `Libros_isbn`) VALUES ('456','2AC' );

INSERT INTO `Prestamos` (`Id`, `Fecha`) VALUES ('1','2020-10-10' );

INSERT INTO `Socios` (`dni`, `nombre`, `apellidos`) VALUES ('123','pedro','gomez' );
INSERT INTO `Socios` (`dni`, `nombre`, `apellidos`) VALUES ('321','ana','gomez' );


INSERT INTO `Tarjetas` (`dni`, `numero`, `fecha`) VALUES ('123','1','2026-10-10' );
INSERT INTO `Tarjetas` (`dni`, `numero`, `fecha`) VALUES ('321','2','2026-10-11' );
