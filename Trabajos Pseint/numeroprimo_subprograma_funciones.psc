Algoritmo ej5guia32
	
	//Realizar una funci�n que reciba un numero ingresado por el usuario y averig�e si el
	//numero es primo o no. Un n�mero es primo cuando es divisible s�lo por 1 y por s�
    //mismo, por ejemplo: 2, 3, 5, 7, 11, 13, 17, etc. Nota: recordar el uso del MOD.
	
	Definir num Como Entero
	
	Escribir "Ingrese numero para ver si es primo: "
	Leer num
	
	Escribir num " es numero primo? " esprimo(num)
	
FinAlgoritmo

Funcion calculo <- esprimo ( num )
	Definir i, contador Como Entero
	Definir calculo Como Logico
	
	contador = 0
	
	Para i = 1 Hasta num Hacer
		si num mod i = 0 Entonces
			contador = contador + 1
		FinSi
	FinPara
	
	si contador = 2 Entonces
		calculo = Verdadero
	SiNo
		calculo = Falso
	FinSi
	
Fin Funcion
