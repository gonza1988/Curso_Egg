-- 1. Mostrar el nombre de todos los jugadores ordenados alfabéticamente
SELECT NOMBRE 
FROM JUGADORES
ORDER BY NOMBRE;

-- 2. Mostrar el nombre de los jugadores que sean pivots (‘C’) y que pesen más de 200 libras, ordenados por
-- nombre alfabéticamente.
SELECT NOMBRE, POSICION,PESO 
FROM JUGADORES 
WHERE POSICION = 'C' AND PESO > 200
ORDER BY NOMBRE;

-- 3. Mostrar el nombre de todos los equipos ordenados alfabéticamente.
SELECT * 
FROM equipos
ORDER BY NOMBRE;

-- 4. Mostrar el nombre de los equipos del este (East).
SELECT NOMBRE,CONFERENCIA
FROM EQUIPOS
WHERE CONFERENCIA LIKE 'EAST';

-- 5. Mostrar los equipos donde su ciudad empieza con la letra ‘c’, ordenados por nombre.
SELECT * 
FROM EQUIPOS
WHERE CIUDAD LIKE 'C%'
ORDER BY NOMBRE;

-- 6. Mostrar todos los jugadores y su equipo ordenados por nombre del equipo.
SELECT J.NOMBRE AS 'NOMBRE', E.NOMBRE AS 'NOMBRE EQUIPO'
FROM JUGADORES J
INNER JOIN EQUIPOS E
ON J.NOMBRE_EQUIPO = E.NOMBRE
ORDER BY E.NOMBRE;

-- 7. Mostrar todos los jugadores del equipo “Raptors” ordenados por nombre.alter
SELECT J.NOMBRE AS 'NOMBRE', E.NOMBRE AS 'NOMBRE EQUIPO'
FROM JUGADORES J
INNER JOIN EQUIPOS E
ON J.NOMBRE_EQUIPO = E.NOMBRE
WHERE E.NOMBRE LIKE 'RAPTORS';

-- 8. Mostrar los puntos por partido del jugador ‘Pau Gasol’
SELECT E.PUNTOS_POR_PARTIDO, J.NOMBRE
FROM estadisticas E
INNER JOIN JUGADORES J
ON E.jugador = J.CODIGO
WHERE J.NOMBRE LIKE 'PAU GASOL';

-- 9. Mostrar los puntos por partido del jugador ‘Pau Gasol’ en la temporada ’04/05′.
SELECT E.PUNTOS_POR_PARTIDO, E.temporada, J.NOMBRE
FROM estadisticas E
INNER JOIN JUGADORES J
ON E.jugador = J.CODIGO
WHERE J.NOMBRE LIKE 'PAU GASOL'
AND E.temporada = '04/05';

-- 10. Mostrar el número de puntos de cada jugador en toda su carrera.
SELECT ROUND(SUM(E.Puntos_por_partido)) AS 'PUNTOS TOTALES', J.NOMBRE
FROM estadisticas E
INNER JOIN JUGADORES J
ON E.JUGADOR = J.CODIGO
group by J.NOMBRE
ORDER BY sum(puntos_por_partido) desc;

-- 11. Mostrar el número de jugadores de cada equipo.
SELECT COUNT(J.nombre) AS 'NUMERO JUGADORES', E.NOMBRE AS 'NOMBRE EQUIPO'
FROM EQUIPOS E
INNER JOIN JUGADORES J
ON E.NOMBRE = J.NOMBRE_EQUIPO
group by E.NOMBRE
ORDER BY E.NOMBRE;

-- 12. Mostrar el jugador que más puntos ha realizado en toda su carrera.
select e.jugador, j.nombre, sum(puntos_por_partido)
from estadisticas e
inner join jugadores j
on e.jugador=j.codigo
group by e.jugador
order by sum(puntos_por_partido) desc limit 1;

-- 13. Mostrar el nombre del equipo, conferencia y división del jugador más alto de la NBA.  
 SELECT E.NOMBRE AS 'NOMBRE EQUIPO',E.CONFERENCIA , E.DIVISION, J.NOMBRE,J.Altura
 FROM equipos E
 INNER JOIN jugadores J
 ON E.NOMBRE = J.Nombre_equipo
 WHERE J.ALTURA = (SELECT MAX(J.Altura)
		FROM jugadores J,EQUIPOS e
        WHERE E.NOMBRE = J.Nombre_equipo); 

-- OTRA MANERA
select e.Nombre, e.Conferencia, e.Division, j.Nombre, j.Altura
from equipos e
join jugadores j
on j.Nombre_equipo = e.Nombre
order by j.Altura desc limit 1;

-- OTRA MANERA
select j.nombre as jugador, e.nombre as equipo, e.conferencia, e.division,j.Altura 
from equipos e, jugadores j 
where e.nombre = j.nombre_equipo 
and j.altura=(select max(altura) 
              from jugadores);

-- 14. Mostrar la media de puntos en partidos DE LOCAL de los equipos de la división Pacific
SELECT ROUND(AVG(P.PUNTOS_LOCAL)) AS 'MEDIA PUNTOS LOCAL', E.NOMBRE,E.DIVISION
FROM PARTIDOS P
INNER JOIN EQUIPOS E
ON P.EQUIPO_LOCAL = E.NOMBRE
WHERE E.DIVISION LIKE 'PACIFIC'
GROUP BY E.NOMBRE;

-- 15. Mostrar el partido o partidos (equipo_local, equipo_visitante y diferencia) con mayor diferencia 
-- de puntos.
SELECT equipo_local, equipo_visitante, diferencia 
FROM (SELECT equipo_local, equipo_visitante, abs(puntos_local - puntos_visitante) as diferencia
		FROM partidos) t
		WHERE diferencia = (SELECT max(abs(puntos_local - puntos_visitante))
        FROM partidos);

-- saco la diferencia de puntos por partido
SELECT equipo_local, equipo_visitante, abs(puntos_local - puntos_visitante) as diferencia 
FROM partidos
ORDER BY abs(puntos_local - puntos_visitante) DESC;
-- la maxima diferencia
SELECT max(abs(puntos_local - puntos_visitante)) 
FROM partidos; 

-- 16. Mostrar la media de puntos en partidos DE VISITANTE de los equipos de la división Pacific.
SELECT ROUND(AVG(P.PUNTOS_VISITANTE)) AS 'MEDIA PUNTOS VISITANTE', E.NOMBRE,E.DIVISION
FROM PARTIDOS P
INNER JOIN EQUIPOS E
ON P.EQUIPO_VISITANTE = E.NOMBRE
WHERE E.DIVISION LIKE 'PACIFIC'
GROUP BY E.NOMBRE;

-- 17. Mostrar los puntos de cada equipo en los partidos, tanto de local como de visitante
select equipo_local,puntos_local,equipo_visitante,puntos_visitante
from partidos
group by codigo;

-- 18. Mostrar quien gana en cada partido (codigo, equipo_local, equipo_visitante, equipo_ganador), en
-- caso de empate sera null.
select codigo, 
       equipo_local,puntos_local, 
       equipo_visitante,puntos_visitante,
       case when p.puntos_local>p.puntos_visitante then equipo_local
            when p.puntos_local<p.puntos_visitante then equipo_visitante 
            else null end as equipo_ganador
from partidos p;

-- 19. Mostrar la suma de los puntos por partido de todos los jugadores españoles donde el equipo donde
-- juegan este en ‘Los Angeles’.        
select sum(puntos_por_partido) as puntos
from estadisticas
where jugador = (select codigo
                  from jugadores
                  where lower(procedencia) = 'spain'
                  and nombre_equipo in (select nombre
                                            from equipos
                                            where lower(ciudad) = 'los angeles'));

-- 20. Mostrar la media de puntos en partidos de los equipos de la division Pacific. 
SELECT avg(puntos)
from (select sum(puntos_local) as puntos
      from PARTIDOS
      where equipo_local in (select nombre
                              from equipos
                              where lower(DIVISION) = 'pacific')
      union
      select sum(puntos_visitante) as puntos
      from PARTIDOS
      where equipo_visitante in (select nombre
                              from equipos
                              where lower(DIVISION) = 'pacific')) t ;                                          