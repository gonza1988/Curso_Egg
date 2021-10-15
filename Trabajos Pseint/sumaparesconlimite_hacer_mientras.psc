Algoritmo ej9extra22
	
	//Se pide escribir un programa que calcule la suma de los N primeros números pares. Es
	//decir, si ingresamos el número 5 como valor de N, el algoritmo nos debe realizar la suma
	//	de los siguientes valores: 2+4+6+8+10. 
	
	Definir suma, num, contador, cont_par Como Entero
	
	Escribir "Ingresar un numero "
	Leer num
	
	contador = 0
	suma = 0
	cont_par = 0
	
	Hacer
		cont_par = cont_par + 2
		contador = contador + 1
		suma = suma + cont_par
		
	Mientras Que contador <> num
	
	Escribir suma
	
FinAlgoritmo
