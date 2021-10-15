Algoritmo ej2guia22
	
	//Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación
	//solicite números al usuario hasta que la suma de los números introducidos supere el
	//límite inicia
	
	Definir limite, suma1, suma2 Como real
	
	Escribir "ingrese limnite"
	Leer limite
	
	suma1 = 0
	
	Mientras limite > suma1 y limite >= 0 Hacer
		Escribir "Ingrese el numero a sumar "
		Leer suma2
		suma1 = suma1 + suma2
		Escribir suma1
		
	FinMientras
FinAlgoritmo
