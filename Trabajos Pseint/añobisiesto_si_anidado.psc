Algoritmo ej9extra2
	
	//Realice un programa que, dado un año, nos diga si es bisiesto o no. Un año es bisiesto
    //bajo las siguientes condiciones: Un año divisible por 4 es bisiesto y no debe ser divisible
	//por 100. Si un año es divisible por 100 y además es divisible por 400, también resulta
	//bisiesto. Nota: recuerde la función mod de PSeIn
	
	Definir anio Como Entero
	
	Escribir "Ingrese el año "
	Leer anio
	
	si (anio MOD 4 = 0) y (anio MOD 100 != 0) Entonces
		Escribir "El año ingresado es BISIESTO "
	SiNo
		si (anio MOD 100 = 0) y (anio MOD 400 = 0) Entonces
			Escribir "El año ingresado es BISIESTO "
		SiNo
			Escribir  "El año ingresado NO ES BISIESTO "
		FinSi
	FinSi
	
FinAlgoritmo
