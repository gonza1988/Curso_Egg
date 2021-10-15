Algoritmo ej1guia32
	
	//Realizar una función que calcule la suma de dos números. En el algoritmo principal le
	//pediremos al usuario los dos números para pasárselos a la función. Después la función
	//	calculará la suma y lo devolverá para imprimirlo en el algoritmo.
	
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
