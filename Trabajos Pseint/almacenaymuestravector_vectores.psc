Algoritmo ej1guia4
	
	//Realizar un programa que rellene un vector con 5 valores ingresados por el usuario y los
	//muestre por pantalla.
	
	Definir vector, i Como Entero
	
	Dimension vector(5)
	
	Para i = 0 Hasta 4 Hacer
		Escribir "Ingrese subindice del vector " i
		Leer vector(i)
	FinPara
	
	Para i = 0 Hasta 4 Hacer
		Escribir "[ " vector(i) " ]" Sin Saltar
	FinPara
	
FinAlgoritmo
