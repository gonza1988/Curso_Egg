Algoritmo ej6guia42
	
	//Una matriz mágica es una matriz cuadrada (tiene igual número de filas que de columnas)
	//que tiene como propiedad especial que la suma de las filas, las columnas y las
    //diagonales es igual. Por ejemplo:
	//2 7 6
	//9 5 1
	//4 3 8
	//En la matriz de ejemplo las sumas son siempre 15. Considere el problema de construir
	//un algoritmo que compruebe si una matriz de datos enteros es mágica o no, y en caso
	//de que sea mágica escribir la suma. Además, el programa deberá comprobar que los
	//números introducidos son correctos, es decir, están entre el 1 y el 9. El usuario ingresa el
	//tamaño de la matriz que no debe superar orden igual a 10.
	
	Definir matriz, tamano Como entero
	
	Escribir "Ingrese tamaño de la matriz no mayor a 9 "
	Leer tamano
	aseguratamano(tamano)
	
	Dimension  matriz(tamano,tamano)
	
	aseguranums(matriz,tamano)
	muestramatriz(matriz,tamano)
	
	Escribir "Su matriz es magica? "
	Escribir ""
	Escribir cajamagica(matriz,tamano)
	
FinAlgoritmo

SubProceso aseguratamano(tamano Por Referencia)
	
	Mientras tamano <= 0 o tamano > 9 Hacer
		Escribir "Tamaño de la matriz mal definida, REINTENTE "
		Leer tamano
	FinMientras
	

FinSubProceso

SubProceso aseguranums(matriz,tamano)
	Definir i,j, num Como Entero
	
	Para i = 0 Hasta tamano-1 Hacer
		Para j = 0 Hasta tamano-1 Hacer
			Escribir "Ingrese numeros a la matriz " " [ " i " ] " " [ ",j " ] "
			Leer num
			Mientras num <= 0 o num > 9 Hacer
				Escribir "Numero mal ingresado, REINTENTE " " [ " i " ] " " [ ",j " ] "
				leer num
			FinMientras
			matriz(i,j) = num
		Fin Para
	FinPara
FinSubProceso

SubProceso muestramatriz(matriz,tamano)
	Definir i, j Como Entero
	
	Escribir "Subproceso muestra matriz: "
	
	Para i=0 Hasta tamano-1 Hacer
		Para j=0 Hasta tamano-1 Hacer
			Escribir Sin Saltar " [ " matriz(i,j) " ] "
		Fin Para
		Escribir " "
	Fin Para
FinSubProceso

Funcion comprobacion <- cajamagica ( matriz,tamano )
	Definir i,j,sumafila, sumacolumna,sumadiagonalp,sumadiagonals Como Entero
	Definir comprobacion Como Logico
	
	sumadiagonalp = 0
	sumadiagonals = 0
	sumacolumna = 0
	sumafila = 0
	
	///suma diagonal principal
	Para i = 0 Hasta tamano-1 Hacer
		sumadiagonalp = sumadiagonalp + matriz(i,i)
	FinPara
	Escribir "suma diagonal principal " sumadiagonalp
	
	//diagonal principal
	//Para i = 0 Hasta 3 Hacer
	//	Para j = 0 Hasta 3 Hacer
	//		si i = j Entonces
	//			matriz(i,j) = 0 diagonal principal
	//		SiNo
	//			matriz(i,j) = Aleatorio(0,100)
	//		FinSi
	//	FinPara
	//FinPara
	
	comprobacion = Verdadero
	
	///suma diagonal secundaria
	Para i = 0 Hasta tamano-1 Hacer
		sumadiagonals = sumadiagonals + matriz(i,tamano-1-i)
	FinPara
	Escribir "suma diagonal secundaria " sumadiagonals
	
	//diagonal secundaria
	//para i = 0 Hasta tamano-1 Hacer
	//para j = 0 hasta tamano-1 Hacer
	//    si i + j = 3 ( tamano-1) Entonces
	//    acciones diagonal secundaria
	//    SiNo
	//    acciones fuera de diagonal secundaria
	
	si sumadiagonalp = sumadiagonals Entonces
		comprobacion = comprobacion y Verdadero
	SiNo
		comprobacion = comprobacion y Falso
	FinSi
	
	///suma filas
	Para i = 0 Hasta tamano-1 Hacer
		sumafila = 0
		Para j = 0 Hasta tamano-1 Hacer
			sumafila = sumafila + matriz(i,j)
		FinPara
		Escribir " suma fila " i, " " sumafila
		si sumafila = sumadiagonalp Entonces
			comprobacion = comprobacion y Verdadero
		SiNo
			comprobacion = comprobacion y Falso
		FinSi
	FinPara
	
	///suma columnas
	Para i = 0 Hasta tamano-1 Hacer
		sumacolumna = 0
		Para j = 0 Hasta tamano-1 Hacer
			sumacolumna = sumacolumna + matriz(j,i)
		FinPara
		Escribir " suma columna " i, " " sumacolumna
		si sumacolumna = sumadiagonalp Entonces
			comprobacion = comprobacion y Verdadero
		SiNo
			comprobacion = comprobacion y Falso
		FinSi
	FinPara
	
Fin Funcion

