Algoritmo ej4guia42
	
	//Rellenar en un subproceso una matriz cuadrada con números aleatorios salvo en la
	//diagonal principal, la cual debe rellenarse con ceros. Una vez llena la matriz debe
	//generar otro subproceso para imprimir la matriz.
	
	Definir matriz Como Entero
	
	Dimension matriz(4,4)
	
	llenadomatriz0(matriz)
	muestramatriz(matriz)
	
FinAlgoritmo

SubProceso llenadomatriz0(matriz)
	Definir i,j Como Entero
	
	Escribir "Subproceso llenado de matriz: "
	
	Para i = 0 Hasta 3 Hacer
		Para j = 0 Hasta 3 Hacer
			si i = j Entonces
				matriz(i,j) = 0
			SiNo
				matriz(i,j) = Aleatorio(0,100)
			FinSi
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
