Algoritmo ej12extra32
	
	//. Realice nuevamente un programa que calcule la función de Fibonacci pero esta vez de
	//manera recursiva.
	
	Definir num Como Entero
	Escribir "Ingrese numero "
	Leer num
	
	Escribir "El termino " num " de la serie fibonacci es : " fibonaccirecursivo(num)
	
FinAlgoritmo

Funcion suma <- fibonaccirecursivo ( num )
	Definir suma Como Entero
	
	Si num = 1 o num = 2 Entonces
		suma = 1
	SiNo
		suma = fibonaccirecursivo(num-1) + fibonaccirecursivo(num-2)
	Fin Si
Fin Funcion
