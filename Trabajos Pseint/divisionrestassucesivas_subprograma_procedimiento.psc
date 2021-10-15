Algoritmo ej3guia3
	
	//Realizar un procedimiento que permita realizar la división entre dos números y muestre
	//el cociente y el resto utilizando el método de restas sucesivas.
	//El método de división por restas sucesivas consiste en restar el dividendo con el
	//divisor hasta obtener un resultado menor que el divisor, este resultado es el residuo, y
    //el número de restas realizadas es el cociente. Por ejemplo: 50 / 13:
    //	50 ? 13 = 37 una resta realizada
   //	37 ? 13 = 24 dos restas realizadas
   //	24 ? 13 = 11 tres restas realizadas
	//dado que 11 es menor que 13, entonces: el residuo es 11 y el cociente es 3.
	
	Definir dividendo, divisor, cociente, resto Como Entero
	
	cociente = 0
	resto = 0
	
	Escribir "Ingrese el dividendo y el divisor "
	Leer dividendo, divisor
	division(dividendo,divisor,cociente,resto)
	Escribir "Para su division de " dividendo "/" divisor
	Escribir "cociente = " cociente, " Resto = " resto
	
FinAlgoritmo

SubProceso division(dividendo Por Valor,divisor Por Valor,cociente Por Referencia,resto Por Referencia)
	Definir contador Como Entero
	contador = 0
	resto = dividendo
	Hacer
		resto = resto - divisor
		
		contador = contador + 1
	Mientras Que resto >= divisor
	cociente = contador
FinSubProceso
