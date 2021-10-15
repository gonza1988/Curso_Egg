Algoritmo ej6extra42
	
	//Realizar un programa que permita visualizar el resultado del producto de una matriz de
	//enteros de 3x3 por un vector de 3 elementos. Los valores de la matriz y el vector pueden
	//inicializarse evitando así el ingreso de datos por teclado. Para conocer más acerca de
	//cómo se realiza la multiplicación entre matrices consultar el siguiente link:
	//https://es.wikibooks.org/wiki/%C3%81lgebra_Lineal/Matriz_por_vector
	
	Definir matriz,vector Como Entero
	
	Dimension matriz(3,3)
	Dimension vector(3)
	
	llenadomatrizyvector(matriz,vector)
	muestramatriz(matriz)
	muestravector(vector)
	
	Escribir multiplicamatrices(matriz,vector)
	
	
FinAlgoritmo

SubProceso llenadomatrizyvector(matriz,vector)
	Definir i,j, num Como Entero
	
	Escribir "Subproceso llenado de matriz: "
	
	Para i = 0 Hasta 2 Hacer
		vector(i) = Aleatorio(1,10)
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

SubProceso muestravector(vector)
	Definir i Como Entero
	
	Escribir "Subproceso muestra vector: "
	
	Para i=0 Hasta 2 Hacer
		Escribir Sin Saltar " [ " vector(i) " ] "
	Fin Para
	Escribir " "
FinSubProceso

Funcion resultado <- multiplicamatrices ( matriz,vector )
	Definir i,j Como Entero
	Definir multiplicacion,resultado Como Real
	
	resultado = 0
	
	Para i = 0 Hasta 2 Hacer
		Para j = 0 Hasta 2 Hacer
			multiplicacion = matriz(i,j) * vector(i)
			resultado = resultado + multiplicacion
		FinPara
	FinPara
Fin Funcion

