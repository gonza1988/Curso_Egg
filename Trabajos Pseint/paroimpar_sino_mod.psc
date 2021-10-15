Algoritmo ej5guia2
	
	//Realizar un programa que pida un numero y determine si ese numero es par o impar.
	//Mostrar en pantalla un mensaje que indique si el numero es par o impar. (para que un
     //número sea par, se debe dividir entre dos y su resto debe ser igual a 0). Nota: investigar
	//la función mod de Pseint.
	Definir num, calculo Como Real
	
	Escribir "Por favor ingrese el numero a calcular: "
	Leer num
	
	calculo = num Mod 2 
	si calculo = 0 Entonces
		escribir"¡SU NUMERO ES PAR!"
	SiNo
		Escribir "¡SU NUMERO ES IMPAR!"
	FinSi
FinAlgoritmo
