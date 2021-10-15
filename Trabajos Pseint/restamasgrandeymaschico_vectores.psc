Algoritmo ej6extra4
	
	//Crear una función que devuelva la diferencia que hay entre el valor más chico de un
	//arreglo y su valor más grande
	
	Definir i, vector, tamano Como Entero
	
	Escribir "Ingrese el tamaño del vector: "
	Leer tamano
	
	Dimension vector(tamano)
	
	Para i = 0 Hasta (tamano -1) Hacer
		vector(i) = Aleatorio(1,50)
		Escribir " [ " vector(i) " ] " Sin Saltar
	FinPara
	
	Escribir ""
	Escribir diferencia(vector,tamano)
	
	
FinAlgoritmo

Funcion resta <- diferencia ( vector,tamano)
	Definir masalto, i ,masbajo Como Entero
	
	
	masalto = 0
	masbajo = 50
	
	Para i = 0 Hasta (tamano -1) Hacer
		si vector(i) >= masalto Entonces
			masalto = vector (i)
			
		FinSi
		si vector(i) <= masbajo Entonces
			masbajo = vector(i)
		FinSi
	FinPara
	
	Escribir "Numero mas alto: " masalto
	Escribir "Numero mas bajo: " masbajo
	Escribir "La diferencia entre el numero mas alto y el mas bajo del vector es: " masalto - masbajo
Fin Funcion

	

