Algoritmo ej9extra2
	
	//Realice un programa que, dado un a�o, nos diga si es bisiesto o no. Un a�o es bisiesto
    //bajo las siguientes condiciones: Un a�o divisible por 4 es bisiesto y no debe ser divisible
	//por 100. Si un a�o es divisible por 100 y adem�s es divisible por 400, tambi�n resulta
	//bisiesto. Nota: recuerde la funci�n mod de PSeIn
	
	Definir anio Como Entero
	
	Escribir "Ingrese el a�o "
	Leer anio
	
	si (anio MOD 4 = 0) y (anio MOD 100 != 0) Entonces
		Escribir "El a�o ingresado es BISIESTO "
	SiNo
		si (anio MOD 100 = 0) y (anio MOD 400 = 0) Entonces
			Escribir "El a�o ingresado es BISIESTO "
		SiNo
			Escribir  "El a�o ingresado NO ES BISIESTO "
		FinSi
	FinSi
	
FinAlgoritmo
