Algoritmo ej5guia42
	
	//Rellenar una matriz, de 3 x 3, con una palabra de 9 de longitud, pedida por el usuario,
	//encontrando la manera de que la frase se muestre de manera continua en la matriz.
	//Por ejemplo, si tenemos la palabra habilidad, nuestra matriz se debería ver así:
	//	H A B
	//	I L I
	//	D A D
	//1.Recordar el uso de la función Subcadena(). Recuerda agregar una variable que incremente la posición en la función Subcadena.

	Definir matriz, palabra Como Caracter
	Escribir "Ingrese palabra "
	Leer palabra
	
	Dimension matriz(3,3)
	
	asegurapalabra(palabra)
	llenamatriz(matriz,palabra)
	muestramatriz(matriz,palabra)
	
	
FinAlgoritmo

SubProceso asegurapalabra(palabra Por Referencia)
	
	Mientras Longitud(palabra) <> 9 Hacer
		Escribir "Su palabra no contiene 9 caracteres, REINTENTE "
		Leer palabra
	FinMientras
	
FinSubProceso

SubProceso llenamatriz(matriz,palabra)
	Definir i,j, posicion Como Entero
	
	posicion = 0
	Para i = 0 Hasta 2 Hacer
		Escribir Sin Saltar ""
		Para j = 0 Hasta 2 Hacer
			
			matriz(i,j) = Subcadena(palabra, posicion,posicion)
			posicion = posicion + 1
			
		Fin Para
	FinPara
	
FinSubProceso

SubProceso muestramatriz(matriz,palabra)
	Definir i, j Como Entero
	
	Escribir "Subproceso muestra matriz: "
	
	Para i=0 Hasta 2 Hacer
		Para j=0 Hasta 2 Hacer
			Escribir Sin Saltar " [ " matriz(i,j) " ] "
		Fin Para
		Escribir " "
	Fin Para
FinSubProceso

	