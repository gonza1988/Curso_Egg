Algoritmo ej6extra22
	
	//Realizar un programa que solicite al usuario su código de usuario (un número entero
	//mayor que cero) y su contraseña numérica (otro número entero positivo). El programa
	//no le debe permitir continuar hasta que introduzca como código 1024 y como
	//contraseña 4567. El programa finaliza cuando ingresa los datos correctos.
	
	Definir codigo, contrasena, contador Como Entero
	
	contador = 0
	
	Hacer
		Escribir "Ingrese codigo de usuario (numero positivo): "
		Leer codigo
		Escribir "Ingrese contraseña (numero positivo)"
		Leer contrasena
		
		si (codigo < 0) o (contrasena < 0) Entonces
			Escribir "Su codigo o contraseña no son positivos, REINTENTE "
		FinSi
		
	Mientras Que codigo <> 1024 o contrasena <> 4567
FinAlgoritmo
