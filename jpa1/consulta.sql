select 
libro0_.isbn as isbn1_1_,
libro0_.autor as autor2_1_,
libro0_.categorias_id as categori6_1_,
libro0_.fecha as fecha3_1_, 
libro0_.precio as precio4_1_,
libro0_.titulo as titulo5_1_ 
from Libros libro0_ 
inner join Categorias categoria1_
on libro0_.categorias_id=categoria1_.id