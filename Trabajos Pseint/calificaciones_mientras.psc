Algoritmo ej4extra22
	
	//Calcular las calificaciones de un grupo de alumnos. La nota final de cada alumno se
    //calcula seg�n el siguiente criterio: la parte pr�ctica vale el 10%; la parte de problemas
	//vale el 50% y la parte te�rica el 40%. El programa leer� el nombre del alumno, las tres
	//notas obtenidas, mostrar� el resultado por pantalla, y a continuaci�n volver� a pedir los
	//datos del siguiente alumno hasta que el nombre sea una cadena vac�a. Las notas deben
	//estar comprendidas entre 0 y 10, y si no est�n dentro de ese rango no se imprimir� el
	//	promedio y se mostrar� un mensaje de error.
	
	Definir alumno Como Caracter
	Definir practica, problemas, teoria, promedio Como Real
	
	alumno = " "
	practica = 0
	problemas = 0
	teoria = 0
	
	Mientras alumno  <> ""
		Escribir "Ingrese nombre del alumno: "
		Leer alumno
		si alumno = "" Entonces
			Escribir "Ustede sera sacado del programa "
		SiNo
			Escribir "Ahora ingrese notas de la practica, problemas y teoria respectivamente "
			Leer practica, problemas, teoria
			si (practica >= 0 y  practica <= 10 ) y (problemas >= 0 y  problemas <= 10 ) y (teoria >= 0 y  teoria <= 10 ) Entonces
				promedio = ((practica/100)*10) + ((problemas/100)*50) + ((teoria/100)*40) 
				Escribir "El alumno " alumno " tiene un promedio de: " promedio
			SiNo
				Escribir "Error al ingresar las notas "
		FinSi

	FinSi
	
	FinMientras
FinAlgoritmo
