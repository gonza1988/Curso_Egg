Algoritmo ej2guia4
	
	//Realizar un programa que lea 10 números reales por teclado, los almacene en un arreglo
	//y muestre por pantalla la suma, resta y multiplicación de todos los números ingresados
	//al arreglo
	
	Definir vector, i , suma, resta, multiplica Como Entero
	
	Dimension vector(10)
	
	suma = 0
	resta = 0
	multiplica = 1
	
	Para i = 0 Hasta 9 Hacer
		Escribir "Ingrese numeros al vector " i
		Leer vector(i)
	FinPara
	
	Para i = 0 Hasta 9 Hacer
		suma = suma + vector(i)
		resta = (resta) - (vector(i))
		multiplica = multiplica * vector(i)
	finPara
	
	Escribir "LA suma del vector es " suma
	Escribir "LA resta del vector es " resta
	Escribir "LA multiplicacion del vector es " multiplica
FinAlgoritmo
