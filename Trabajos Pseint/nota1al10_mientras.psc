Algoritmo ej1guia22
	
	//Escriba un programa que valide si una nota está entre 0 y 10, sino está entre 0 y 10 la
	//nota se pedirá de nuevo hasta que la nota sea correcta.

	Definir nota Como Real
	
	Escribir "Ingrese nota del 1 al 10 "
	
	nota = 100
	
	Mientras nota <= 0 o nota > 10 Hacer
		
		Escribir "Ingrese la nota"
		Leer nota
		
		si nota <= 0 o nota > 10 Entonces
			Escribir "nota incorrecta, reingrese "
		FinSi
		
		
	FinMientras
	Escribir "nota correcta " nota
FinAlgoritmo
