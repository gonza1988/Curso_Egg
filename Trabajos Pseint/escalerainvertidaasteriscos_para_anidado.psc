Algoritmo ej14extra22
	
	//Escriba un programa que lea un número entero y a partir de él cree una escalera invertida
    //de asteriscos con esa altura. Por ejemplo, si ingresamos una altura de 5 mostrara:
	//	*****
	//	****
	//	***
	//	**
    //  * 
	
	Definir i, num, j Como Entero
	
	Escribir "Ingrese numero: "
	Leer num
	
	Para i = num hasta 0 Con Paso -1 Hacer
		Para j = i hasta 0 Con Paso -1 Hacer
			Escribir Sin Saltar "*"
		FinPara
		Escribir  ""
	FinPara
		
FinAlgoritmo
