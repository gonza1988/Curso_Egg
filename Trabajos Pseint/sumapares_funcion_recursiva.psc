Algoritmo ej10extra
	
	//Crear un programa que calcule la suma de los enteros positivos pares desde N hasta 2.
	//Chequear que si N es impar se muestre un mensaje de error.
	
	Definir num Como Entero
	
	Escribir "Ingrese numero: "
	Leer num
	
	si num mod 2 <> 0 Entonces
		Escribir "Error, numero impar ingresado, Reintente "
	SiNo	
	Escribir sumaparesrecursiva(num)
FinSi

	
	
FinAlgoritmo

Funcion suma <- sumaparesrecursiva ( num )
	Definir suma Como Entero
	
	si num = 1 Entonces
		suma = 2
	SiNo
		suma = 2 * num + sumaparesrecursiva(num -1)
	FinSi

Fin Funcion
