Algoritmo ej1extra2
	
	//Realizar un programa que pida tres notas y determine si un alumno aprueba o reprueba
	//un curso, sabiendo que aprobará el curso si su promedio de tres calificaciones es mayor
	//	o igual a 70; y reprueba en caso contrario. 

	Definir nota1, nota2, nota3 , promedio Como Real
	
	Escribir "Ingresar las 3 notas del alumno DEL 1 AL 100: "
	Leer nota1,nota2,nota3
	
	promedio = (nota1 + nota2 + nota3) / 3
	
	si promedio >= 70 Entonces
		Escribir "El promedio del alumno es: " promedio
		Escribir "EL alumno esta APROBADO "
	SiNo
		Escribir "El promedio del alumno es: " promedio
		Escribir "El alumno esta DESAPROBADO "
	FinSi
FinAlgoritmo
