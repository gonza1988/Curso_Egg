Algoritmo ej4guia4
	
	//Realizar un programa que rellene un vector de tama�o N, con valores ingresados por el
	//usuario. A continuaci�n, se deber� crear una funci�n que reciba el vector y devuelva el
	//valor m�s grande del vector.
	
	Definir i, vector, tamano Como Entero
	
	Escribir "Ingrese el tama�o del vector: "
	Leer tamano
	
	Dimension vector(tamano)
	
	Para i = 0 Hasta (tamano -1) Hacer
		vector(i) = Aleatorio(1,50)
		Escribir " [ " vector(i) " ] " Sin Saltar
	FinPara
	
	Escribir ""
	Escribir "El numero mas grande del vector es: " masalto(vector,tamano)
	
FinAlgoritmo

Funcion buscador <- masalto ( vector,tamano)
	Definir buscador, i Como Entero
	
	
	buscador = 0
	
	Para i = 0 Hasta (tamano -1) Hacer
		si vector(i) >= buscador Entonces
			buscador = vector (i)
		FinSi
	FinPara
Fin Funcion
