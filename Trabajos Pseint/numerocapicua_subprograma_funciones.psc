Algoritmo ej8extra32
	
	//Realizar una función que reciba un numero ingresado por el usuario y averigüe si el
    //numero es capicúa o no (Por ejemplo: 12321). Nota: recordar el uso del MOD y el Trunc.
    //	No podemos transformar el numero a cadena para realizar el ejercicio.
	
	Definir num Como Entero
	
	Escribir "Ingrese su numero"
	Leer num
	
	Escribir escapicua(num)
	
	
FinAlgoritmo

Funcion capicua <- escapicua ( num )
	Definir aux, num_inv Como Entero
	
	aux = num
	num_inv = 0
	
	Mientras aux > 0 Hacer
		num_inv = num_inv + aux mod 10
		num_inv = num_inv * 10
		aux = trunc(aux/10)
	FinMientras
	num_inv = num_inv / 10
	
	si num = num_inv Entonces
		Escribir "El numero ingresado es capicua "
	SiNo
		Escribir "El numero ingresado no es capicua "
	FinSi
	
	
Fin Funcion
