Algoritmo ej2guia32
	
	//Realizar una función que valide si un numero es impar o no. Si es impar la función debe
    //devolver un verdadero, si no es impar debe devolver falso. Nota: la función no debe
    //	tener mensajes que digan si es par o no, eso debe pasar en el Algoritmo.
	
	Definir num Como Entero
	Definir resultado Como Logico
	
	Escribir "Ingrese numero a evaluar: "
	Leer num
	
	Escribir "Su numero es impar ? " impar(num)
	
	
FinAlgoritmo

Funcion evalua <- impar ( num )
	Definir evalua Como Logico
	
	si num mod 2 = 0
		evalua = Falso
	SiNo
		evalua = Verdadero
	FinSi
	
Fin Funcion
