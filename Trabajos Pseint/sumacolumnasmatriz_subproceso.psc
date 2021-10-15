Algoritmo ej5extra42
	
	//Crear una matriz que contenga 3 columnas y la cantidad filas que decida el usuario. Las
	//dos primeras columnas contendrán valores enteros ingresados por el usuario y en la 3
	//columna se deberá almacenar el resultado de sumar el número de la primera y segunda
    //columna. Mostrar la matriz de la siguiente forma:
	//3 + 5 = 8
	//4 + 3 = 7
    //1 + 4 = 5 
	
	Definir matriz, tamanofila Como Entero
	
	Escribir "Ingrese el tamaño de filas deseado en su matriz: "
	Leer tamanofila
	
	Dimension matriz(tamanofila,3)
	
	llenadomatriz(matriz,tamanofila)
	muestramatriz(matriz,tamanofila)
	muestramacolumnas(matriz,tamanofila)		
	
FinAlgoritmo

SubProceso llenadomatriz(matriz,tamanofila)
	Definir i,j, num Como Entero
	
	Escribir "Subproceso llenado de matriz: "
	
	Para i = 0 Hasta tamanofila-1 Hacer
		Para j = 0 Hasta 2 Hacer
			si j = 2 Entonces
				matriz(i,j) = matriz(i,j-1) + matriz(i,j-2)
			SiNo
				Escribir "Ingrese numeros a la matriz: "
				Leer num
				matriz(i,j) = num
			FinSi
		FinPara
	FinPara
FinSubProceso

SubProceso muestramatriz(matriz,tamanofila)
	Definir i, j Como Entero
	
	Escribir "Subproceso muestra matriz: "
	
	Para i=0 Hasta tamanofila-1 Hacer
		Para j=0 Hasta 2 Hacer
			Escribir Sin Saltar " [ " matriz(i,j) " ] "
		Fin Para
		Escribir " "
	Fin Para
FinSubProceso

SubProceso muestramacolumnas(matriz,tamanofila)
	Definir i,j Como Entero
	
	Escribir "Subproceso llenado de matriz: "
	
	Para i = 0 Hasta tamanofila-1 Hacer
		Para j = 0 Hasta 2 Hacer
			si j = 2 Entonces
				Escribir matriz(i,j-1) " + " matriz(i,j-2) " = " matriz(i,j)  Sin Saltar
			SiNo
				//Escribir matriz(i,j) Sin Saltar
			FinSi
		FinPara
		Escribir " "
	FinPara
FinSubProceso
