Algoritmo ej3extra42
	
	//Realizar un programa que cree una matriz de 5x15 y deberemos llenar la matriz de unos
	//y ceros. Llenando el marco o la delimitación externa de la matriz de unos y la parte interna
	//de ceros.
//Por ejemplo, nuestro matriz final debería verse así:
	//111111111111111
	//100000000000001
	//100000000000001
	//100000000000001
	//111111111111111
	
	Definir matriz Como Entero
	
	Dimension matriz(5,15)
	
	llenadomatriz(matriz)
	muestramatriz(matriz)
	
FinAlgoritmo

SubProceso llenadomatriz(matriz)
	Definir i,j Como Entero
	
	Escribir "Subproceso llenado de matriz: "
	
	Para i = 0 Hasta 4 Hacer
		Para j = 0 Hasta 14 Hacer
			si (i > 0 y i < 4) y (j > 0 y j < 14) Entonces
				matriz(i,j) = 0
			SiNo
				matriz(i,j) = 1
			FinSi
		FinPara
	FinPara
FinSubProceso

SubProceso muestramatriz(matriz)
	Definir i, j Como Entero
	
	Escribir "Subproceso muestra matriz original: "
	
	Para i=0 Hasta 4 Hacer
		Para j=0 Hasta 14 Hacer
			Escribir Sin Saltar " [ " matriz(i,j) " ] "
		Fin Para
		Escribir " "
	Fin Para
FinSubProceso

