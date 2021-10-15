Algoritmo ej3guia22
	
	//Dada una secuencia de números ingresados por teclado que finaliza con un -1, por
	//ejemplo: 5,3,0,2,4,4,0,0,2,3,6, 0; -1 realizar un programa que calcule el promedio de los
    //números ingresados. Suponemos que el usuario no insertará número negativos
	
	Definir num, suma, promedio Como Real
	Definir contador Como Entero
	
	suma = 0
	num = 0
	contador = 0
	
	Mientras num != -1 Hacer
		Escribir "Ingrese un numero :"
		Leer num
		suma = suma + num
		contador = contador + 1
	FinMientras
	promedio = suma / contador
	Escribir "El promedio al llegar a " contador " numeros, es " promedio
FinAlgoritmo
