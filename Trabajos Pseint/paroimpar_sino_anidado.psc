Algoritmo ej12guia2
	
	//Realizar un programa que, dado un número entero, visualice en pantalla si es par o impar.
	//En caso de que el valor ingresado sea 0, se debe mostrar "el número no es par ni impar".
    //Nota: investigar la función mod de PSeInt 
	
	Definir num, calculo Como Real
	
	Escribir "Para saber si su numero es par o impar, ingrese un numero: "
	Leer num
	
	calculo = num Mod 2 
	si num = 0 Entonces
		Escribir "El numero no es par, ni impar "
	SiNo
		
		si calculo = 0 Entonces
			escribir"¡SU NUMERO ES PAR!"
		SiNo
			Escribir "¡SU NUMERO ES IMPAR!"
		FinSi
	FinSi
	
FinAlgoritmo
