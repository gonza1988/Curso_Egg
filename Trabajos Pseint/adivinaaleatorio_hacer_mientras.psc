Algoritmo ej10extra22
	
	//Programar un juego donde la computadora elige un n�mero al azar entre 1 y 10, y a
    //continuaci�n el jugador tiene que adivinarlo. La estructura del programa es la siguiente:
    //   1�) El programa elige al azar un n�mero n entre 1 y 10.
	//  2�) El usuario ingresa un n�mero x.
	//  3�) Si x no es el n�mero exacto, el programa indica si n es m�s grande o m�s peque�o
	//		que el n�mero ingresado.
	//		4�) Repetimos desde 2) hasta que x sea igual a n.
	//		El programa tiene que imprimir los mensajes adecuados para informarle al usuario qu�
	//			hacer y qu� pas� hasta que adivine el n�mero.
	//			NOTA: Para generar un n�mero aleatorio entre 1 y 10 se puede utilizar la funci�n
	//					Aleatorio(limite_inferior, limite_superior) de PSeInt.
	
	Definir num, alea Como Entero
	alea = Aleatorio(1,10)
	
	Hacer
		Escribir "Ingrese numero entre el 1 y el 10 "
		Leer num
		
		si num < alea Entonces
			Escribir "Su numero " num " es menor al numero a adivinar "
		SiNo
			si num > alea Entonces
			Escribir "Su numero " num " es mayor al numero a adivinar "
		FinSi
	FinSi
	
		
	Mientras Que num <> alea
	Escribir "Su numero " num " es igual al seleccionado "
	Escribir "Aleatorio igual a " alea
	
FinAlgoritmo
