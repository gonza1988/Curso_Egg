Algoritmo ej5extra22
	
	//Escribir un programa que calcule cuántos dígitos tiene un número entero positivo sin
    //convertirlo a cadena (pista: se puede hacer dividiendo varias veces entre 10). Nota:
    //	investigar la función trunc().
	
	Definir num, contador, truncar Como Real
	
	Escribir "Ingrese numero: "
	Leer num
	contador = 0
	
	
	Mientras trunc(num) != 0
		num = num / 10
		contador = contador +1
	FinMientras
	
	Escribir "Su numero tiene " contador " cifras "
FinAlgoritmo
