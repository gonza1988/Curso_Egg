Algoritmo ej1guia3
	
	//Realizar un procedimiento que permita intercambiar el valor de dos variables de tipo
	//entero. La variable A, debe terminar con el valor de la variable B.
	
	// 1-Intercambiar dos numeros, el primero con el segundo
	//   Dato de entrada: num1 y num2
	//   Dato de salida: num1 = num 2 y num2 = num1
	
	Definir num1, num2 Como Entero
	
	Escribir "Ingrese numeros a cambiar "
	Leer num1, num2
	Escribir num1
	Escribir num2
	cambio_num(num1,num2)
	Escribir "numero uno ahora vale " num1 " numero 2 ahora vale " num2
	
FinAlgoritmo

SubProceso cambio_num( num1 Por Referencia, num2 Por Referencia )
	Definir aux Como Entero
	aux = num1
	num1 = num2
	num2 = aux
Fin subproceso
