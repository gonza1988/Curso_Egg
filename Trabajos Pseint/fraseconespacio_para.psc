Algoritmo ej7guia22
	
	//Realizar un programa que pida una frase y el programa deber� mostrar la frase con un
    //espacio entre cada letra. La frase se mostrara as�: H o l a. Nota: recordar el
	//funcionamiento de la funci�n Subcadena().
    //NOTA:. En PSeInt, si queremos escribir sin que haya saltos de l�nea, al final de la
	//operaci�n "escribir" escribimos "sin saltar". Por ejemplo:
	//	Escribir sin saltar "Hola, "
	//	Escribir sin saltar "c�mo est�s?"
	//Imprimir� por pantalla: Hola, c�mo est�s?
	
	Definir i, cantidad  Como Entero
	Definir frase Como Caracter
	
	Escribir "Ingrese su frase "
	Leer frase
	cantidad = Longitud(frase)
	
	
	Para i=0 Hasta cantidad  Hacer
		Escribir Sin Saltar Subcadena(frase i, i) " "
	FinPara
	
	
FinAlgoritmo
