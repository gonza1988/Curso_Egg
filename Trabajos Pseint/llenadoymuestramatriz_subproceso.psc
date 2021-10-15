Algoritmo ej1extra42
	
	//Realizar un programa que rellene de números aleatorios una matriz a través de un
	//subprograma y generar otro subprograma que muestre por pantalla la matriz final.
	
	Definir matriz Como Entero
	
	Dimension matriz(4,4)
	
	llenadomatriz(matriz)
	muestramatriz(matriz)
	
FinAlgoritmo

SubProceso llenadomatriz(matriz)
	Definir i,j, num Como Entero
	
	Escribir "Subproceso llenado de matriz: "
	
	Para i = 0 Hasta 3 Hacer
		Para j = 0 Hasta 3 Hacer
			matriz(i,j) = azar(50)
		FinPara
	FinPara
FinSubProceso

SubProceso muestramatriz(matriz)
	Definir i, j Como Entero
	
	Escribir "Subproceso muestra matriz: "
	
	Para i=0 Hasta 3 Hacer
		Para j=0 Hasta 3 Hacer
			Escribir Sin Saltar " [ " matriz(i,j) " ] "
		Fin Para
		Escribir " "
	Fin Para
FinSubProceso
