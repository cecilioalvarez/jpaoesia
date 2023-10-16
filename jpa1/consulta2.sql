select 
libro0_.isbn as isbn1_1_0_, 
categoria1_.id as id1_0_1_,
libro0_.autor as autor2_1_0_,
libro0_.categorias_id as categori6_1_0_,
libro0_.fecha as fecha3_1_0_,
libro0_.precio as precio4_1_0_, 
libro0_.titulo as titulo5_1_0_,
categoria1_.nombre as nombre2_0_1_ 
from Libros libro0_ inner join Categorias
categoria1_ on libro0_.categorias_id=categoria1_.id
