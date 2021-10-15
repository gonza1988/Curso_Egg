Algoritmo ej1extra4
	
	//Realizar un programa que rellene dos vectores al mismo tiempo, con 5 valores aleatorios
	//y los muestre por pantalla.
	
	Definir vectorA, vectorB, i Como Entero
	
	Dimension vectorA(5)
	Dimension vectorB(5)
	
	Para i= 0 hasta 4 Hacer
		vectorA(i) = Aleatorio(1,100)
		vectorB(i) = Aleatorio(1,100)
	FinPara
	
	Escribir " Vector A "
	Para i = 0 Hasta 4 Hacer
		Escribir " [ " vectorA(i) " ] " Sin Saltar
	FinPara
	
	Escribir ""
	Escribir " Vector B "
	Para i = 0 Hasta 4 Hacer
		Escribir " [ " vectorB(i) " ] " Sin Saltar
	FinPara
	
	Escribir ""
FinAlgoritmo
