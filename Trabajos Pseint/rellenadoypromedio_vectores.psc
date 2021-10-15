Algoritmo ej2extra4
	
	//Realizar un programa que rellene un vector de tamaño N, con valores ingresados por el
	//usuario y muestre por pantalla el promedio de la suma de todos los valores ingresados. 
	
	Definir vector, tamano, i, num Como Entero
	Definir promedio Como Real
	
	Escribir "Ingrese el tamaño del vector "
	Leer tamano
	
	Dimension vector(tamano)
	
	Para i = 0 Hasta (tamano-1) Hacer
		Escribir "Ingrese numero al vector: "
		Leer num
		vector(i) = num
	FinPara
	
	Para i = 0 Hasta (tamano-1) Hacer
		Escribir " [ " vector(i) " ] " Sin Saltar
	FinPara
	Escribir ""
	
	promedio = 0
	
	Para i = 0 Hasta (tamano-1) Hacer
		promedio = promedio + vector(i)
	FinPara
	Escribir "El promedio del vector es igual a: " promedio/tamano
FinAlgoritmo
