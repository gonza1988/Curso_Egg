Algoritmo ej11extra22
	
	//Realizar un programa que muestre la cantidad de números que son múltiplos de 2 o de
	//3 comprendidos entre 1 y 100. 
	
	Definir i Como Entero
	
	Para i = 0 Hasta 100 Hacer
		
		si i mod 2 = 0 y i mod 3 = 0 Entonces
			Escribir "Multiplo de 2 y 3 ** " i
	SiNo
		
		si i mod 2 = 0 Entonces
			Escribir "multiplo de 2 ** " i
			
		SiNo
			
		si i mod 3 = 0 Entonces
			Escribir "multiplo de 3 ** " i
		FinSi
	FinSi
FinSi

	Fin Para
	
FinAlgoritmo
