Algoritmo ej7extra22
	
	//Se debe realizar un programa que:
	//   1º) Pida por teclado un número (entero positivo).
	//   2º) Pregunte al usuario si desea introducir o no otro número.
	//	3º) Repita los pasos 1º y 2º mientras que el usuario no responda n/N (no).
	//	4º) Muestre por pantalla la suma de los números introducidos por el usuario
	
	Definir num, suma Como Entero
	Definir respuesta Como Caracter
	
	suma = 0
	
	//Escribir "Ingrese numero: "
	//Leer num
	
	Hacer
		Escribir "Ingrese numero: "
		Leer num
		Escribir "¿Desea ingresar otro numero? "
		Escribir "*** S = si     N = no *** "
		Leer respuesta
		suma = suma + num
		
	Mientras Que respuesta = "s" o respuesta = "S"
	
	Escribir "La suma de los numeroes es: " suma
	
FinAlgoritmo
