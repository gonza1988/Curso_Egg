Algoritmo ej9guia22
	
	//Realizar un programa que lea un n�mero entero (tama�o del lado) y a partir de �l cree
	//un cuadrado de asteriscos de ese tama�o. Los asteriscos s�lo se ver�n en el borde del
    //cuadrado, no en el interior. Por ejemplo, si se ingresa el n�mero 4 se debe mostrar:
	//	* * * *
   //    *     *
	//  *     *
	//  * * * *
	
	//Nota: Recordar el uso del escribir sin saltar en Pseint.
	
	Definir Cubito, contador, caminador, i, lados Como Entero
	
	Escribir "Ingresar cantidad de asteriscos "
	leer Cubito
	contador <- 0
	caminador <- 1
	lados <- Cubito
	
	para i <- 0 Hasta (Cubito*(2*Cubito)) Hacer
		//lados
		si contador > Cubito y contador < (Cubito*Cubito+Cubito) Entonces
			
			
			//primer asterisco
			si caminador = 1 Entonces
				Escribir Sin Saltar " * "
			FinSi
			//
			si caminador > 1 Entonces
				Escribir Sin Saltar " * "
			FinSi
			//ultimo asterisco
			si caminador > lados-2 Entonces
				Escribir  " * "
				caminador <- 0
			FinSi
			caminador <- caminador +1
		FinSi
		contador <- contador +1
	FinPara
FinAlgoritmo
