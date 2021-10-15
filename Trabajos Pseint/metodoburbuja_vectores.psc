Algoritmo ej7extra4
	
	//Crear un programa que ordene un vector lleno de números enteros aleatorios, de menor
	//a mayor.
     //Nota: investigar el ordenamiento burbuja en el siguiente link: Ordenamiento Burbuja.
	
	Definir i, j, vector, temp Como Entero
	
	Dimension vector(5)
	
	Para i = 0 Hasta 4 Hacer
		vector(i) = Aleatorio(1,50)
		Escribir " [ " vector(i) " ] " Sin Saltar
	FinPara
	
	Para i= 0 Hasta 3 Hacer
		Para j = 0 Hasta 3 Hacer
			si vector(j) > vector(j+1) Entonces
				temp = vector(j)
				vector(j) = vector(j+1)
				vector(j+1) = temp
			FinSi
		FinPara
	FinPara
	
	Escribir ""
	Escribir " *** METODO BURBUJA *** "
	Escribir "  Vector ordenado: "
	Para i = 0 Hasta 4 Hacer
		Escribir " [ " vector(i) " ] " Sin Saltar
	FinPara
	
FinAlgoritmo
