Algoritmo ej3guia32
	
	//Crea una función EsMultiplo que reciba los dos números pasados por el usuario,
	//validando que el primer numero múltiplo del segundo y devuelva verdadero si el
	//	primer numero es múltiplo del segundo, sino es múltiplo que devuelva falso.
	
	Definir num1,num2 Como real
	
	Escribir "Ingrese numeros a evaluar: "
	Leer num1,num2
	
	Escribir "¿Su primer numero es multiplo del segundo? " EsMultiplo(num1,num2)
	
FinAlgoritmo

Funcion evalua <- EsMultiplo ( num1,num2 )
	Definir evalua Como Logico
	
	si num1 mod num2 = 0 Entonces
		evalua = Verdadero
	SiNo
		evalua = Falso
	FinSi
	
Fin Funcion
