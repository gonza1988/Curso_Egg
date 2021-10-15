Algoritmo ej5guia22
	
	//Escribir un programa que lea números enteros hasta teclear 0 (cero). Al finalizar el
	//programa se debe mostrar el máximo número ingresado, el mínimo, y el promedio de
	//todos ellos.
	
	Definir num, contador, max, min, suma Como Entero
	Definir promedio Como Real
	Escribir "Ingrese numero: "
	Leer  num
	contador = 0
	suma = 0
	max = num
	min = num
	suma = suma + num
	
	Hacer
		Escribir "ingrese numero: "
		Leer num
		suma = suma + num
		contador = contador + 1
		
		si num > max y num <> 0 Entonces
			
			max = num
			
			si num < min y num <> 0
				
				min = num
				
			FinSi
		FinSi
		
		
	Mientras Que num  != 0
	
	Escribir "El promedio de numeros es " suma / (contador)
	Escribir "El maximo es " max " Y el minimo es " min
	Escribir "Suma " suma
	Escribir "Contador " contador
	
FinAlgoritmo
