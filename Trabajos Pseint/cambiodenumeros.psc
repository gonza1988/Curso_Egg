Algoritmo ej6
	//Escriba un programa que permita al usuario ingresar el valor de dos variables numéricas
	//de tipo entero. Posteriormente, el programa debe intercambiar los valores de ambas
    //variables y mostrar el resultado final por pantalla.
	//Por ejemplo, si el usuario ingresa los valores num1 = 9 y num2 = 3, la salida a del
	//programa deberá mostrar: num1 = 3 y num2 = 9
	//Ayuda: Para intercambiar los valores de dos variables se debe utilizar una variable
	//		auxiliar.
	
	Definir num1, num2, cambio Como Entero
	
	Escribir "Ingresar primer numero a intercambiar :"
	Leer  num1
	Escribir " Ahora ingresar el segundo numero: "
	Leer num2
	
	cambio = num1
	num1 = num2
	num2 = cambio
	
	Escribir "Sus numero uno  fue cambiado por " num1 ", y su numero dos fue cambiado por " num2 
	
FinAlgoritmo
