Algoritmo ej3extra3
	
	//Crear un programa que dibuje una escalera de n�meros, donde cada l�nea de n�meros
	//comience en uno y termine en el n�mero de la l�nea. Solicitar la altura de la escalera al
    //usuario al comenzar. Ejemplo: si se ingresa el n�mero 3:
	//1
    //12
    //123
	
	Definir altura Como Entero
	
	
	Escribir "Ingrese altura de la escalera "
	Leer altura
	
	escalera(altura)
	
FinAlgoritmo

SubProceso escalera(altura)
	Definir i,j Como Entero
	Definir caden Como Caracter
	
	Para i = 1 Hasta altura
		Para j = 1 Hasta i
			
			escribir  Sin Saltar j
			
		FinPara
		Escribir  ""
	FinPara
	
	
FinSubProceso
