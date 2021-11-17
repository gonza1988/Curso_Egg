#1. Lista el nombre de todos los productos que hay en la tabla producto.
SELECT NOMBRE FROM producto;

#2. Lista los nombres y los precios de todos los productos de la tabla producto.
SELECT NOMBRE, PRECIO FROM producto;

-- 3. Lista todas las columnas de la tabla producto. --
SELECT * FROM producto; 
SELECT * FROM FABRICANTE;

-- 4. Lista los nombres y los precios de todos los productos de la tabla producto, redondeando el valor del precio. --
SELECT nombre as 'Nombre Producto', round(precio) as 'Precio Lista $'
 FROM producto;
 
 -- 5. Lista el código de los fabricantes que tienen productos en la tabla producto. --
 SELECT codigo_fabricante,nombre 
  FROM producto;
 
 -- 10. Lista el código de los fabricantes que tienen productos en la tabla producto, sin mostrar los repetidos.
SELECT DISTINCT codigo_fabricante
FROM producto;

-- 11. Lista los nombres de los fabricantes ordenados de forma ascendente
SELECT NOMBRE 
FROM fabricante
ORDER BY NOMBRE;

-- 12. Lista los nombres de los productos ordenados en primer lugar por el nombre de forma ascendente y en segundo lugar por el precio de forma descendente.
SELECT NOMBRE, ROUND(PRECIO) 
FROM producto
ORDER BY NOMBRE ASC,PRECIO DESC;

-- 13. Devuelve una lista con las 5 primeras filas de la tabla fabricante.
SELECT * 
FROM FABRICANTE
LIMIT 5;

-- 14. Lista el nombre y el precio del producto más barato. (Utilice solamente las cláusulas ORDER BY y LIMIT)
SELECT NOMBRE,PRECIO
FROM PRODUCTO
ORDER BY PRECIO ASC
LIMIT 1;

-- 15. Lista el nombre y el precio del producto más caro. (Utilice solamente las cláusulas ORDER BY y LIMIT)
SELECT NOMBRE,PRECIO
FROM PRODUCTO
ORDER BY PRECIO DESC
LIMIT 1;

-- 16. Lista el nombre de los productos que tienen un precio menor o igual a $120.
SELECT NOMBRE , PRECIO
FROM producto
WHERE PRECIO <= 120;

-- 17. Lista todos los productos que tengan un precio entre $60 y $200. Utilizando el operador BETWEEN.
SELECT *
FROM producto
WHERE PRECIO BETWEEN 60 AND 120;

-- 18. Lista todos los productos donde el código de fabricante sea 1, 3 o 5. Utilizando el operador IN.
SELECT *
FROM producto
WHERE codigo_fabricante IN(1,3,5);

-- 23. Devuelve una lista con el nombre de todos los productos que contienen la cadena Portátil en el nombre.
SELECT NOMBRE
FROM PRODUCTO
WHERE NOMBRE LIKE 'Portatil%';

-- Consultas Multitabla 
-- 1. Devuelve una lista con el código del producto, nombre del producto, código del
-- fabricante y nombre del fabricante, de todos los productos de la base de datos.
SELECT P.CODIGO AS 'CODIGO PRODUCTO', P.NOMBRE AS 'NOMBRE PRODUCTO', F.CODIGO AS 'CODIGO FABRICANTE', F.NOMBRE AS 'NOMBRE FABRICANTE'
FROM producto P, fabricante F
WHERE F.CODIGO = P.codigo_fabricante;

-- 2. Devuelve una lista con el nombre del producto, precio y nombre de fabricante de todos los productos
-- de la base de datos. Ordene el resultado por el nombre del fabricante, por orden alfabético.
SELECT P.NOMBRE AS 'NOMBRE PRODUCTO',P.PRECIO, F.NOMBRE AS 'NOMBRE FABRICANTE'
FROM producto P
INNER JOIN fabricante F
ON P.codigo_fabricante = F.codigo
ORDER BY F.nombre;

-- 3. Devuelve el nombre del producto, su precio y el nombre de su fabricante, del producto más barato. 
SELECT P.NOMBRE AS 'NOMBRE PRODUCTO' , P.PRECIO, F.NOMBRE AS 'NOMBRE FABRICANTE'
FROM producto P
INNER JOIN FABRICANTE F
ON P.codigo_fabricante = F.codigo
ORDER BY P.PRECIO
LIMIT 1;

-- 4. Devuelve una lista de todos los productos del fabricante Lenovo.
SELECT *
FROM producto P
INNER JOIN FABRICANTE F
 ON P.codigo_fabricante = F.codigo
WHERE F.NOMBRE LIKE 'LENOVO';

-- 5. Devuelve una lista de todos los productos del fabricante Crucial que tengan un precio mayor que $200.
SELECT *
FROM producto P
INNER JOIN fabricante F
ON P.codigo_fabricante = F.codigo
WHERE F.NOMBRE LIKE 'CRUCIAL' AND P.precio >200;

-- 6. Devuelve un listado con todos los productos de los fabricantes Asus, HewlettPackard. Utilizando el
-- operador IN.
SELECT *
FROM producto P
INNER JOIN fabricante F
ON P.codigo_fabricante = F.codigo
WHERE F.NOMBRE IN('ASUS','Hewlett-Packard');

-- 7. Devuelve un listado con el nombre de producto, precio y nombre de fabricante, de todos los productos
-- que tengan un precio mayor o igual a $180. Ordene el resultado en primer lugar por el precio
-- (en orden descendente) y en segundo lugar por el nombre (en orden ascendente)
SELECT P.NOMBRE AS 'NOMBRE PRODUCTO', P.PRECIO,
	   F.NOMBRE AS 'NOMBRE FABRICANTE'
FROM PRODUCTO p
INNER JOIN FABRICANTE F
ON P.CODIGO_FABRICANTE = F.CODIGO
WHERE P.PRECIO >= 180
ORDER BY P.PRECIO DESC, P.NOMBRE ASC;       

-- Consultas Multitabla
-- Resuelva todas las consultas utilizando las cláusulas LEFT JOIN y RIGHT JOIN.
-- 1. Devuelve un listado de todos los fabricantes que existen en la base de datos, junto con los productos
-- que tiene cada uno de ellos. El listado deberá mostrar también aquellos fabricantes que no tienen productos
-- asociados.
SELECT * 
FROM FABRICANTE F
LEFT JOIN PRODUCTO P
ON F.CODIGO = P.CODIGO_FABRICANTE;

-- 2. Devuelve un listado donde sólo aparezcan aquellos fabricantes que no tienen ningún producto asociado.
SELECT * 
FROM FABRICANTE F
WHERE NOT EXISTS(SELECT P.CODIGO_FABRICANTE
				FROM PRODUCTO P
                WHERE F.CODIGO = P.CODIGO_FABRICANTE);
 
-- Subconsultas (En la cláusula WHERE)
-- Con operadores básicos de comparación
-- 1. Devuelve todos los productos del fabricante Lenovo. (Sin utilizar INNER JOIN). 
SELECT *
FROM PRODUCTO P
WHERE (SELECT F.NOMBRE LIKE 'LENOVO'
        FROM FABRICANTE F
        WHERE F.CODIGO = P.CODIGO_FABRICANTE);

-- 2. Devuelve todos los datos de los productos que tienen el mismo precio que el producto más caro del
-- fabricante Lenovo. (Sin utilizar INNER JOIN).
SELECT *
FROM producto p
WHERE P.PRECIO = (SELECT MAX(P.PRECIO)
					FROM PRODUCTO P, FABRICANTE F
                    WHERE P.codigo_fabricante = F.codigo
                    AND F.NOMBRE LIKE 'LENOVO');

-- 3. Lista el nombre del producto más caro del fabricante Lenovo
SELECT P.NOMBRE,MAX(P.PRECIO)
FROM PRODUCTO P
WHERE (SELECT F.NOMBRE LIKE 'LENOVO'
        FROM FABRICANTE F
        WHERE F.CODIGO = P.CODIGO_FABRICANTE);

-- 4. Lista todos los productos del fabricante Asus que tienen un precio superior al precio medio de
-- todos sus productos.
select p.nombre as Producto, p.precio as Precio
from producto p
where p.codigo_fabricante=(select f.codigo
							from fabricante f
							where f.nombre="Asus")
							and p.precio> (select avg(p.precio)
											from producto p
											where p.codigo_fabricante=(select f.codigo
																		from fabricante f
																		where f.nombre="Asus"));
		
-- Subconsultas con IN y NOT IN
-- 1. Devuelve los nombres de los fabricantes que tienen productos asociados. (Utilizando IN o NOT IN). 
SELECT F.NOMBRE,F.CODIGO 
FROM FABRICANTE F                
WHERE F.CODIGO IN(SELECT P.CODIGO_FABRICANTE  
		FROM producto P
        WHERE F.CODIGO = P.CODIGO_FABRICANTE);
   
-- 2. Devuelve los nombres de los fabricantes que no tienen productos asociados.(Utilizando IN o NOT IN).
 SELECT F.NOMBRE,F.CODIGO 
FROM FABRICANTE F                
WHERE F.CODIGO NOT IN(SELECT P.CODIGO_FABRICANTE  
		FROM producto P
        WHERE F.CODIGO = P.CODIGO_FABRICANTE);  
        
-- Subconsultas (En la cláusula HAVING)
-- 1. Devuelve un listado con todos los nombres de los fabricantes que tienen el mismo número de productos
-- que el fabricante Lenovo.   
SELECT  f.nombre, count(*)
FROM producto p, fabricante f
WHERE p.codigo_fabricante = f.codigo
GROUP BY f.nombre
HAVING count(*) = (SELECT count(*)
                   FROM producto p, fabricante f
                   WHERE p.codigo_fabricante = f.codigo
                   AND f.nombre = 'Lenovo');	