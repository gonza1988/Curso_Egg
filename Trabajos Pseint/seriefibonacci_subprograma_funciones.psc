Algoritmo ej7extra32
	
	//Realizar una función que permita obtener el término n de la sucesión de Fibonacci. La
    //sucesión de Fibonacci es la sucesión de los siguientes números:
    //	1, 1, 2, 3, 5, 8, 13, 21, 34, ...
    //Donde cada uno de los números se calcula sumando los dos anteriores a él. Por
   //ejemplo:
   //La sucesión del número 2 se calcula sumando (1+1)
   //Análogamente, la sucesión del número 3 es (1+2),
   //Y la del 5 es (2+3),
   //Y así sucesivamente?
   //La sucesión de Fibonacci se puede formalizar de acuerdo a la siguiente fórmula:
   //Fibonacci (n) = Fibonacci (n-1) + Fibonacci (n-2) para todo n > 1
   //	Fibonacci (n) = 1 para todo n <= 1
  //		Por lo tanto, si queremos calcular el término "n" debemos escribir una función que
  //			reciba como argumento el valor de "n" y que calcule la serie hasta llegar a ese valor.
  //		Para conocer más acerca de la serie de Fibonacci consultar el siguiente link:
	//			https://quantdare.com/numeros-de-fibonacci/
	
	Definir num Como Entero
	
	Escribir "Ingresar numero "
	Leer num
		
	Escribir "Serie fibonacci de " fibonacci(num)
	
FinAlgoritmo

Funcion suma <- fibonacci ( num  )
	Definir suma, i,a,b,c Como Entero
	
	a = 0
	b = 1
	
	para i = 1 Hasta num Hacer
		Escribir a
		c = a+b
		a = b
		b = c
	FinPara
Fin Funcion
