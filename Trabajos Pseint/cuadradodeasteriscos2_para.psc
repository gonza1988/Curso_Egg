Algoritmo ej9guia22
	
	//Realizar un programa que lea un n�mero entero (tama�o del lado) y a partir de �l cree
	//un cuadrado de asteriscos de ese tama�o. Los asteriscos s�lo se ver�n en el borde del
    //cuadrado, no en el interior. Por ejemplo, si se ingresa el n�mero 4 se debe mostrar:
	//	* * * *
	//    *     *
	//  *     *
	//  * * * *
	
	//Nota: Recordar el uso del escribir sin saltar en Pseint.
	
	Definir i, j, num Como Entero
	
	Escribir "Ingrese numero de lados "
	Leer num
	
	Para i = 1 hasta num Hacer
		Para j = 1 Hasta num Hacer
			si i > 1 y i < num y j > 1 y j < num Entonces
				Escribir  "  " Sin Saltar
			SiNo
				Escribir "* " Sin Saltar
			FinSi
		FinPara
		Escribir " "
	FinPara
	
	
FinAlgoritmo
