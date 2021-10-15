Algoritmo ej3extra3
	
	//Crear un programa que dibuje una escalera de números, donde cada línea de números
	//comience en uno y termine en el número de la línea. Solicitar la altura de la escalera al
    //usuario al comenzar. Ejemplo: si se ingresa el número 3:
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
