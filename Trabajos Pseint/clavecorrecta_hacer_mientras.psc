Algoritmo ej4guia22
	
	//Teniendo en cuenta que la clave es "eureka", escribir un programa que nos pida ingresar
	//una clave. Sólo se cuenta con 3 intentos para acertar, si fallamos los 3 intentos se deberá
    //mostrar un mensaje indicándonos que hemos agotado esos 3 intentos. Si acertamos la
	//clave se deberá mostrar un mensaje que indique que se ha ingresado al sistema
	//correctamente.
	
	Definir clave Como Caracter
	Definir contador Como Entero
	
	contador = 0
	
	Hacer
		Escribir "Ingrese la clave por favor "
		Leer clave	
		contador = contador + 1
		
		si contador = 3 Entonces
			Escribir "Ya ha agotado sus 3 intentos "
		FinSi
		
	Mientras Que clave <> "eureka" 
	Escribir "Clave ingresada correctamente "
FinAlgoritmo
