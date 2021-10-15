Algoritmo ej8extra4
	
	//Programe una función recursiva que calcule la suma de un arreglo de números enteros. 
	
	Definir vector, n Como Entero
	
	Dimension vector(5)
	vector(4) = 12
	vector(3) = 5
	vector(2) = 1
	vector(1) = 3
	vector(0) = 6
	n = 4
	
	Escribir sumavector(vector, n)
	
	
FinAlgoritmo

Funcion suma <- sumavector ( vector, n )
	Definir suma Como Entero
	
	si (n < 0) Entonces
		Escribir "Resultado suma recursiva: "
	SiNo
		suma = vector(n) + sumavector(vector,n-1)
		//Escribir vector(n) + sumavector(vector,n-1)
	FinSi
	
Fin Funcion
