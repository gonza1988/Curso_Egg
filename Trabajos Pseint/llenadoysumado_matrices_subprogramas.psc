Algoritmo ej3guia42
	
	//Dada una matriz de orden n * m (donde n y m son valores ingresados por el usuario)
	//realizar un subprograma que llene la matriz de numeros aleatorios. Despues, crearemos
	//otro subprograma que calcule y muestre la suma de los elementos de la matriz. Mostrar
	//la matriz y los resultados por pantalla. 

	Definir matriz, n, m, sumamatriz Como Entero
	
	Escribir "Ingrese el tamaño de la matriz: "
	Leer n, m
	
	Dimension matriz(n,m)
	
	llenadomatriz(matriz,n,m)
	sumamatriz = muestramatriz(matriz,n,m)
	Escribir "La suma de la matriz es igual a: " sumamatriz
	
FinAlgoritmo

SubProceso llenadomatriz(matriz,n,m)
	Definir i,j, num Como Entero
	
	Escribir "Subproceso llenado de matriz: "
	
	Para i = 0 Hasta n-1 Hacer
		Para j = 0 Hasta m-1 Hacer
			matriz(i,j) = Aleatorio(1,100)
		FinPara
	FinPara
FinSubProceso

Funcion  suma = muestramatriz(matriz,n,m)
	Definir i, j, suma Como Entero
	
	suma = 0
	
	Escribir "Funcion muestra y suma MATRIZ: "
	
	Para i=0 Hasta n-1 Hacer
		Para j=0 Hasta m-1 Hacer
			suma = suma + matriz(i,j)
			Escribir Sin Saltar " [ " matriz(i,j) " ] "
		Fin Para
		Escribir " "
	Fin Para
FinFuncion

