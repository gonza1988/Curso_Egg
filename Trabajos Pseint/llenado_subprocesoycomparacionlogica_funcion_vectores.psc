Algoritmo ej7guia4
	
	//Crear un subproceso que rellene dos arreglos de tamaño n, con números aleatorios.
	//Después, hacer una función que reciba los dos arreglos y diga si todos sus valores son
	//iguales o no. La función debe devolver el resultado de está validación, para mostrar el
	//mensaje en el algoritmo. Nota: recordar el uso de las variables de tipo lógico.
	
	Definir vectorA, vectorB, tamano Como Entero
	
	Escribir "Por favor ingrese el tamaño de los vectores: "
	Leer tamano
	
	Dimension vectorA(tamano)
	Dimension vectorB(tamano)
	
	llenado(vectorA,vectorB,tamano)
	
	Escribir resultado(vectorA,vectorB,tamano)	
	si resultado(vectorA,vectorB,tamano) = Verdadero Entonces
		Escribir " Todos los elementos de los vectores son IGUALES "
	SiNo
		Escribir " Los elementos de los vectores son DIFERENTES "
	FinSi
	
FinAlgoritmo

SubProceso llenado(vectorA,vectorB,tamano)
	Definir i, num Como Entero
	
	Escribir " Vector A: "
	
	Para i = 0 Hasta (tamano-1) Hacer
		Escribir "Ingrese numero "
		Leer num
		vectorA(i) = num
		//vectorA(i) = Aleatorio(1,50)
		Escribir " [ " vectorA(i) " ] " Sin Saltar
	FinPara
	
	Escribir ""
	
	Escribir " Vector B: "
	
	Para i = 0 Hasta (tamano-1) Hacer
		Escribir "Ingrese numero "
		Leer num
		vectorB(i) = num
		//vectorB(i) = Aleatorio(1,50)
		Escribir " [ " vectorB(i) " ] " Sin Saltar
	FinPara
	
	Escribir ""
	
FinSubProceso

Funcion resulogico <- resultado ( vectorA,vectorB,tamano )
	Definir resulogico Como Logico
	Definir i Como Entero
	
	resulogico = Verdadero
	
	Para i = 0 Hasta (tamano-1) Hacer
		si vectorA(i) = vectorB(i) Entonces
			resulogico = resulogico y Verdadero
		SiNo
			resulogico = resulogico y Falso
		FinSi
	FinPara
	
Fin Funcion


