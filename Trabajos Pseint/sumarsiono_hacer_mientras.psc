Algoritmo ej7extra22
	
	//Se debe realizar un programa que:
	//   1�) Pida por teclado un n�mero (entero positivo).
	//   2�) Pregunte al usuario si desea introducir o no otro n�mero.
	//	3�) Repita los pasos 1� y 2� mientras que el usuario no responda n/N (no).
	//	4�) Muestre por pantalla la suma de los n�meros introducidos por el usuario
	
	Definir num, suma Como Entero
	Definir respuesta Como Caracter
	
	suma = 0
	
	//Escribir "Ingrese numero: "
	//Leer num
	
	Hacer
		Escribir "Ingrese numero: "
		Leer num
		Escribir "�Desea ingresar otro numero? "
		Escribir "*** S = si     N = no *** "
		Leer respuesta
		suma = suma + num
		
	Mientras Que respuesta = "s" o respuesta = "S"
	
	Escribir "La suma de los numeroes es: " suma
	
FinAlgoritmo
