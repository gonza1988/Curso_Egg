Algoritmo ej3extra2
	
	//Solicitar al usuario que ingrese dos números enteros y determinar si ambos son pares o
	//impares. Mostrar en pantalla un mensaje que indique "Ambos números son pares"
	//siempre y cuando cumplan con la condición. En caso contrario se deberá imprimir el
	//siguiente mensaje "Los números no son pares, o uno de ellos no es par".
	//Nota: investigar la función mod de Pseint. 

	Definir num1, num2, calculo, calculo2 Como Entero
	
	Escribir "Ingrese los numeros a calcular "
	Leer num1, num2
	
	calculo = num1 Mod 2
	calculo2 = num2 Mod 2
	si calculo = 0 y calculo2 = 0 Entonces
		escribir"¡AMBOS NUMEROS SON PARES!"
	SiNo
		Escribir "¡LOS NUMEROS NO SON PARES O ALGUNO DE ELLOS NO LO ES!"
	FinSi
FinAlgoritmo
