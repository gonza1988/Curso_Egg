Algoritmo ej1guia32
	
	//Realizar una funci�n que calcule la suma de dos n�meros. En el algoritmo principal le
	//pediremos al usuario los dos n�meros para pas�rselos a la funci�n. Despu�s la funci�n
	//	calcular� la suma y lo devolver� para imprimirlo en el algoritmo.
	
	Definir num1,num2,resultado Como Real
	
	Escribir "Ingrese numeros a sumar: "
	Leer num1,num2
	
	
	resultado = suma(num1,num2)
	Escribir resultado
	
	
FinAlgoritmo

Funcion sum <- suma ( num1,num2 )
	Definir sum Como Real
	sum = num1 + num2
Fin Funcion
