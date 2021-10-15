Algoritmo ej1extra32
	
	//Realizar una función que calcule y retorne la suma de todos los divisores del número n
	//distintos de n. El valor de n debe ser ingresado por el usuario.
	
	Definir num Como Entero
	
	Escribir "Ingrse numero: "
	Leer num
	Escribir "La suma de los divisores de su numero es igual a: " sumadivisores(num)
	
	
FinAlgoritmo

Funcion cuentadiv <- sumadivisores ( num )
	Definir i, cuentadiv Como Entero
	cuentadiv = 0
	
	Para i = 1 Hasta num -1 Hacer
		si num mod i = 0 Entonces
			cuentadiv = cuentadiv + i
		FinSi
	FinPara
	
Fin Funcion
