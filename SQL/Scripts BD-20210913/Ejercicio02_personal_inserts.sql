#Ejercicio 2
select * from empleados;
select * from departamentos;

#Parte "a" de los ejercicios de la guia
select nombre_depto
 from departamentos;
 
select nombre, sal_emp
 from empleados;
 
select comision_emp 
from empleados;

select * from empleados
 where cargo_emp = 'Secretaria';
 
select * from empleados
 where cargo_emp = 'vendedor' order by nombre asc;
 
select nombre,cargo_emp,sal_emp
 from empleados 
order by sal_emp asc;

select nombre as 'Nombre',cargo_emp as 'Cargo'
from empleados;

select sal_emp, comision_emp 
from empleados
where id_depto = 2000
order by comision_emp asc;

/*11. Obtener el valor total a pagar que resulta de sumar el salario y la comisión de los
empleados del departamento 3000 una bonificación de 500, en orden alfabético
del empleado.*/
select nombre ,sum(sal_emp),sum(comision_emp)
from empleados
where id_depto = 3000
group by nombre;

#12.Muestra los empleados cuyo nombre empiece con la letra J
select nombre 
from empleados
where nombre like 'j%';

-- 13. Listar el salario, la comisión, el salario total (salario + comisión) y nombre, de aquellos empleados que tienen comisión superior a 1000.--
SELECT sal_emp AS "Salario", comision_emp AS "Comision", (sal_emp + comision_emp) AS "Salario + Comision", nombre AS "Nombre"
 FROM empleados WHERE comision_emp > 1000;
 
 #14. Obtener un listado similar al anterior, pero de aquellos empleados que NO tienen comisión.
 SELECT sal_emp AS "Salario", comision_emp AS "Comision", (sal_emp + comision_emp) AS "Salario + Comision", nombre AS "Nombre"
 FROM personal.empleados WHERE comision_emp =0; 
 
#15. Obtener la lista de los empleados que ganan una comisión superior a su sueldo. --
SELECT nombre AS "Nombre", sal_emp AS "Salario", comision_emp AS "Comision"
 FROM personal.empleados
 WHERE comision_emp > sal_emp
 ORDER BY nombre;
 
-- 16. Listar los empleados cuya comisión es menor o igual que el 30% de su sueldo. --
SELECT nombre AS "Nombre", comision_emp AS "Comision", sal_emp AS "Salario"
 FROM personal.empleados
 WHERE comision_emp <= sal_emp * 0.30
 ORDER BY nombre;
 
-- 17. Hallar los empleados cuyo nombre no contiene la cadena “MA” --
SELECT nombre AS "Nombre"
 FROM personal.empleados
 WHERE nombre NOT LIKE "%MA%";
 
-- 18. Obtener los nombres de los departamentos que sean “Ventas” ni “Investigación” ni ‘Mantenimiento". --
SELECT DISTINCT nombre_depto AS "Nombre Departamento"
 FROM personal.departamentos
 WHERE nombre_depto IN ("Ventas", "Investigación", "Mantenimiento");
 
-- 19. Ahora obtener los nombres de los departamentos que no sean “Ventas” ni “Investigación” ni ‘Mantenimiento. --
SELECT nombre_depto AS "Nombre Departamento"
 FROM personal.departamentos
 WHERE nombre_depto NOT IN ("Ventas", "Mantenimiento", "Investigación");

-- 20. Mostrar el salario más alto de la empresa --
select id_emp,nombre,MAX(sal_emp) as 'Salario Maximo'
from personal.empleados;

-- 21. Mostrar el nombre del último empleado de la lista por orden alfabético. --
select nombre 
 from personal.empleados
 order by nombre desc
 limit 3;
 
 # 22. Hallar el salario más alto, el más bajo y la diferencia entre ellos.
 select max(sal_emp) as 'Mayor sueldo', min(sal_emp) as' Menor sueldo', (max(sal_emp)-min(sal_emp)) as 'Diferencia'
 from personal.empleados;
 
 -- 23. Hallar el salario promedio por departamento. --
SELECT  id_depto,sum(sal_emp) AS 'Total Salario', COUNT(sal_emp) as 'Cant. de Salarios',  round(SUM(sal_emp) / COUNT(sal_emp),2) as 'Promedio'
 FROM personal.empleados
 group by id_depto;
 
 # Consultas con Having
#24. Hallar los departamentos que tienen más de tres empleados. Mostrar el número de empleados de esos departamentos.
select id_depto,count(id_emp) as 'Cantidad empleados'
from personal.empleados
group by id_depto
having count(nombre) > 3;

-- 25. Mostrar el código y nombre de cada jefe, junto al número de empleados que dirige. Solo los que tengan más de dos empleados (2 incluido).
SELECT e.nombre, e.cod_jefe, count(*) AS 'Nº EMPLEADOS'
FROM departamentos d, empleados e
WHERE d.cod_director = e.cod_jefe
GROUP BY e.cod_jefe
HAVING count(*) >= 2;

#26. Hallar los departamentos que no tienen empleados
DELETE FROM empleados WHERE (`id_emp` = '338');
-- 1ro se tuvo que borrar un empleado para verificar que algun departamento no tenga empleado
select nombre_depto as 'Departamento sin Empleados'
from departamentos d
left join empleados e
on d.id_depto = e.id_depto
 where e.id_depto is null;

#Consulta con Subconsulta
#27. Mostrar la lista de los empleados cuyo salario es mayor o igual que el promedio de la empresa. Ordenarlo por departamento.
select nombre 'Nombre Empleado', sal_emp 'Salario mayor o igual al promedio' 
from empleados 
where sal_emp >= (select avg(sal_emp) from empleados);