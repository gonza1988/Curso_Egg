Algoritmo ej2extra42
	
	//Crear una matriz de orden n * m (donde n y m son valores ingresados por el usuario),
    //llenarla con números aleatorios entre 1 y 100 y mostrar su traspuesta. NOTA: si no
	//conoces lo que es una traspuesta, mirar el siguiente link: Matriz Traspuesta
	
	Definir matriz, tamano Como Entero
	
	Escribir "Por favor ingrese tamaño de la matriz "
	Leer tamano
	
	Dimension matriz(tamano,tamano)
	
	llenadomatriz(matriz,tamano)
	muestramatriz(matriz,tamano)
	matriztranspuesta(matriz,tamano)
	
FinAlgoritmo

SubProceso llenadomatriz(matriz,tamano)
	Definir i,j Como Entero
	
	Escribir "Subproceso llenado de matriz: "
	
	Para i = 0 Hasta tamano-1 Hacer
		Para j = 0 Hasta tamano-1 Hacer
			matriz(i,j) = Aleatorio(1,100)
		FinPara
	FinPara
FinSubProceso

SubProceso muestramatriz(matriz,tamano)
	Definir i, j Como Entero
	
	Escribir "Subproceso muestra matriz original: "
	
	Para i=0 Hasta tamano-1 Hacer
		Para j=0 Hasta tamano-1 Hacer
			Escribir Sin Saltar " [ " matriz(i,j) " ] "
		Fin Para
		Escribir " "
	Fin Para
FinSubProceso

SubProceso matriztranspuesta(matriz,tamano)
	Definir i, j Como Entero
	
	Escribir "Subproceso matriz transpuesta: "
	
	Para i=0 Hasta tamano-1 Hacer
		Para j=0 Hasta tamano-1 Hacer
			Escribir Sin Saltar " [ " matriz(j,i) " ] "
		Fin Para
		Escribir " "
	Fin Para
FinSubProceso

