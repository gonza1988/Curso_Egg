Algoritmo ej2guia43
	
	//Escribir un programa que realice la búsqueda lineal de un número entero ingresado por
	//el usuario en una matriz de 5x5, llena de números aleatorios y devuelva por pantalla las
	//coordenadas donde se encuentra el valor, es decir en que fila y columna se encuentra.
	//En caso de no encontrar el valor dentro de la matriz se debe mostrar un mensaje.
	
	Definir matriz, buscado Como Entero
	
	Dimension matriz(5,5)
	
	Escribir "Ingrese el numero a encontrar en la matriz: "
	Leer buscado
	
	llenadomatriz(matriz)
	muestramatriz(matriz)
	coordenada(matriz,buscado)
	
FinAlgoritmo

SubProceso llenadomatriz(matriz)
	Definir i,j, num Como Entero
	
	Escribir "Subproceso llenado de matriz: "
	
	Para i = 0 Hasta 4 Hacer
		Para j = 0 Hasta 4 Hacer
			matriz(i,j) = Aleatorio(1,100)
		FinPara
	FinPara
FinSubProceso

SubProceso muestramatriz(matriz)
	Definir i, j Como Entero
	
	Escribir "Subproceso muestra matriz: "
	
	Para i=0 Hasta 4 Hacer
		Para j=0 Hasta 4 Hacer
			Escribir Sin Saltar " [ " matriz(i,j) " ] "
		Fin Para
		Escribir " "
	Fin Para
FinSubProceso

SubProceso coordenada(matriz,buscado)
	Definir i, j, contadoresta, contadornoesta Como Entero
	
	contadoresta = 0
	contadornoesta = 0
	
	Para i = 0 Hasta 4 Hacer
		Para j = 0 Hasta 4 Hacer
			
		si matriz(i,j) = buscado Entonces
			Escribir "La posicion de su numero buscado y encontrado es : [ " i "," ,j " ] " Sin Saltar
			Escribir ""
			contadoresta= contadoresta +1
		SiNo
			contadornoesta = contadornoesta +1 
		FinSi
	FinPara	
FinPara
si contadornoesta > 0 y contadoresta < 1 entonces
	Escribir " Valor no encontrado "
FinSi
FinSubProceso

	
