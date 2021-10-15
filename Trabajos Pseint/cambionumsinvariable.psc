Algoritmo ejextra
	
	//Escriba un programa que permita al usuario ingresar el valor de dos variables numéricas
	//de tipo entero. Posteriormente, el programa debe intercambiar los valores de ambas
	//variables y mostrar el resultado final por pantalla.
	//Por ejemplo, si el usuario ingresa los valores num1 = 9 y num2 = 3, la salida a del
	//programa deberá mostrar: num1 = 3 y num2 = 9
	//Nota: no utilizar variables auxiliares, ni hacer trampa al hacer la llamada
	
	Definir num1, num2 Como Entero
	Escribir "Por favor ingrese el primer y segundo numero: "
	Leer num1, num2
	
	num1 = num1 +num2
	num2 = num1 - num2
	num1 = num1 - num2
	
	Escribir "num1 es igual a: " num1 " Y num2 es igual a: " num2
FinAlgoritmo
