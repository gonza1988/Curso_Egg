Algoritmo ej10guia2
	
	//. Continuando el ejercicio anterior, ahora se pedirá una frase o palabra y se validara si la
	//primera letra de la frase es igual a la ultima letra de la frase. Se deberá de imprimir un
	//mensaje por pantalla que diga "CORRECTO", en caso contrario, se deberá imprimir
	//"INCORRECTO".
	
	Definir frase Como Caracter
	Definir cuentacadena Como Entero
	
	Escribir "Por favor ingrese su frase "
	Leer frase
	
	si Subcadena(frase, 0,0) == "A" Entonces
		Escribir "CORRECTO"
	SiNo
		Escribir "INCORRECTO"
	FinSi
	
	cuentacadena = Longitud(frase) -1 // o Subcadena(frase, cuentacadena, cuentacadena)
	si Subcadena(frase, 0,0) == Subcadena(frase, cuentacadena,Longitud(frase)) Entonces
		Escribir "La primera letra de su palabra es IGUAL a la ultima "
	SiNo
		Escribir "La primer letra de su palabra es DISTINTA a la ultima"
		
	FinSi
	
FinAlgoritmo
