Algoritmo ej6extra22
	
	//Realizar un programa que solicite al usuario su c�digo de usuario (un n�mero entero
	//mayor que cero) y su contrase�a num�rica (otro n�mero entero positivo). El programa
	//no le debe permitir continuar hasta que introduzca como c�digo 1024 y como
	//contrase�a 4567. El programa finaliza cuando ingresa los datos correctos.
	
	Definir codigo, contrasena, contador Como Entero
	
	contador = 0
	
	Hacer
		Escribir "Ingrese codigo de usuario (numero positivo): "
		Leer codigo
		Escribir "Ingrese contrase�a (numero positivo)"
		Leer contrasena
		
		si (codigo < 0) o (contrasena < 0) Entonces
			Escribir "Su codigo o contrase�a no son positivos, REINTENTE "
		FinSi
		
	Mientras Que codigo <> 1024 o contrasena <> 4567
FinAlgoritmo
