Algoritmo ej3guia4
	
	//Realizar un programa que rellene un vector de tama�o N, con valores ingresados por el
	//usuario. A continuaci�n, se debe buscar un elemento dentro del arreglo (el n�mero a
	//buscar tambi�n debe ser ingresado por el usuario). El programa debe indicar la posici�n
	//donde se encuentra el valor. En caso que el n�mero se encuentre repetido dentro del
	//arreglo se deben imprimir todas las posiciones donde se encuentra ese valor.
	//Finalmente, en caso que el n�mero a buscar no est� adentro del arreglo se debe mostrar
	//un mensaje.
	
	Definir vector, i, tamano, buscado Como Entero
	
	Escribir "Ingrese el tama�o de su vector "
	Leer tamano
	
	Dimension vector(tamano)
	
	Escribir "Ahora ingrese el numero a encontrar: "
	Leer buscado
	
	Para i = 0 Hasta (tamano - 1) Hacer
		Escribir  "Ingrese numero " i
		Leer vector(i)
	FinPara
	
	Para i = 0 Hasta (tamano -1) Hacer
		si vector(i) = buscado Entonces
			Escribir "La posicion de su numero buscado y encontrado es : [ " i " ] " Sin Saltar
			Escribir ""
		SiNo
			Escribir "Valor no encontrado en:  [ " i " ] "
		FinSi
	FinPara
	
FinAlgoritmo
