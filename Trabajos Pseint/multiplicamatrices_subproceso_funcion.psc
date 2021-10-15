Algoritmo ej4extra42
	
	//Realizar un programa que calcule la multiplicación de dos matrices de enteros de 3x3.
	//Inicialice las matrices para evitar el ingreso de datos por teclado
	
	Definir matriza,matrizb Como Entero
	
	Dimension matriza(3,3)
	Dimension matrizb(3,3)
	
	llenadomatriz(matriza)
	llenadomatriz(matrizb)
	Escribir "Matriz A: "
	muestramatriz(matriza)
	Escribir "Matriz B: "
	muestramatriz(matrizb)
	Escribir "El resultado de la multiplicacion de las dos matrices es: "
	Escribir multiplicamatrices(matriza,matrizb)
	
FinAlgoritmo

SubProceso llenadomatriz(matriz)
	Definir i,j, num Como Entero
	
	Escribir "Subproceso llenado de matriz: "
	
	Para i = 0 Hasta 2 Hacer
		Para j = 0 Hasta 2 Hacer
			matriz(i,j) = Aleatorio(1,10)
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



Funcion multiplicacion = multiplicamatrices(matriza,matrizb)
	Definir i, j Como Entero
	Definir multiplicacion Como Real
	
	multiplicacion = 1
	Para i = 0 Hasta 2 Hacer
		Para j = 0 Hasta 2 Hacer
			multiplicacion = multiplicacion * (matriza(i,j) * matrizb(i,j))
		FinPara
	FinPara
FinFuncion
	