Algoritmo ej3extra4
	
	//Crear dos vectores que tengan el mismo tamaño (el tamaño se pedirá por teclado) y
	//almacenar en uno de ellos nombres de personas como cadenas. En el segundo vector
	//se debe almacenar la longitud de cada uno de los nombres (para ello puedes usar la
	//	función Longitud() de PseInt). Mostrar por pantalla cada uno de los nombres junto con su
	//	longitud.
	
	Definir i, j, tamano, vectorB, contador Como Entero
	Definir vectorA, nombre Como Caracter
	
	Escribir "Ingrese el tamaño de los vectores: "
	Leer tamano
	
	Dimension vectorA(tamano)
	Dimension vectorB(tamano)
	
	
	Para i = 0 Hasta (tamano-1) Hacer
		Escribir "Ingrese nombre: "
		Leer nombre
		vectorA(i) = nombre
		contador = 0
		Para j = 0 hasta Longitud(vectorA(i))-1
			contador = contador +1
			vectorB(i) = contador
		FinPara
	FinPara
	
	Para i = 0 Hasta (tamano-1) Hacer
		Escribir "Nombre: " vectorA(i) , ". Longitud del nombre: [ " vectorB(i) " ] "
	FinPara
	
	
FinAlgoritmo
