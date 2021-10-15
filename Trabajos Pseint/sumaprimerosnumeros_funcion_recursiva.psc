Algoritmo ej6guia32
	
	//Escribir una función recursiva que devuelva la suma de los primeros N enteros
	
	Definir num Como Entero
	
	Escribir "Ingrese numero equivalente a la suma de sus primeros numeros naturales: "
	Leer num
	
	Escribir "La suma de los primeros " num " es " suma(num)
	
FinAlgoritmo

Funcion val <- suma ( num )
	Definir val Como Entero
	si num = 0 o num = 1 Entonces
		val = num
	SiNo
		val = suma (num -1) + num
	FinSi
	
Fin Funcion
