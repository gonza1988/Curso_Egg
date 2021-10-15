Algoritmo ej1guia42
	
	//Realizar un programa que rellene una matriz de 3x3 con 9 valores ingresados por el
	//usuario y los muestre por pantalla.
	
	Definir matriz Como Entero
	
	Dimension matriz(3,3)
	
	llenadomatriz(matriz)
	muestramatriz(matriz)
	
FinAlgoritmo

SubProceso llenadomatriz(matriz)
	Definir i,j, num Como Entero
	
	Escribir "Subproceso llenado de matriz: "
	
	Para i = 0 Hasta 2 Hacer
		Para j = 0 Hasta 2 Hacer
			Escribir "Ingrese valores a la matriz "
			Leer num
			matriz(i,j) = num
		FinPara
	FinPara
FinSubProceso

SubProceso muestramatriz(matriz)
	Definir i, j Como Entero
	
	Escribir "Subproceso muestra matriz: "
	
	Para i=0 Hasta 2 Hacer
		Para j=0 Hasta 2 Hacer
			Escribir Sin Saltar " [ " matriz(i,j) " ] "
		Fin Para
		Escribir " "
	Fin Para
FinSubProceso
