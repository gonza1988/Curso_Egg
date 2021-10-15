Algoritmo ej9extra4
	
	//Programe una función que calcule el producto de un arreglo de números enteros. Para
	//esto imagine, por ejemplo, que para un vector V de tamaño 4, el producto de todos los
	//	valores es igual a (V[1]*V[2]*V[3]*V[4]).
	
	Definir vector, tamano, i Como Entero
	
	Escribir "Ingrese el tamaño del vector: "
	Leer tamano
	
	Dimension vector(tamano)
	
	Para i = 0 Hasta tamano-1 Hacer
		vector(i) = Aleatorio(1,100)
		Escribir " [ " vector(i) " ] " Sin Saltar
	FinPara
	
	
	
	Escribir multiplicavector(vector,tamano)
	
FinAlgoritmo

Funcion multiplicacion <- multiplicavector ( vector,tamano )
	Definir i, multiplicacion Como Entero
	
	multiplicacion = 1
	
	Para i = 0 Hasta (tamano-1) Hacer
		multiplicacion = multiplicacion * vector(i)
	FinPara
	
	Escribir ""
	Escribir "El resultado de la multiplicacion del vector es: "
	
Fin Funcion
