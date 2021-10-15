Algoritmo ej5extra32
	
	//Realizar una función que calcule la suma de los dígitos de un numero.
    //Ejemplo: 25 = 2 + 5 = 7
    //Nota: Para obtener el último numero de un digito de 2 cifras o más debemos pensar en
	//	el resto de una división entre 10. Recordar el uso de la función Mod y Trunc.
	
	Definir num Como Entero
	
	Escribir "Ingrese numero "
	Leer num
	
	Escribir "La suma de los digitos de su numero es igual a: " sumadigitos(num)
	
FinAlgoritmo

Funcion suma <- sumadigitos ( num )
	Definir suma,resto Como Entero
	
	suma = 0
	resto = 0
	
	Mientras num > 0
		resto = num mod 10
		suma = suma + resto
		num = trunc(num/10)
		
	FinMientras
Fin Funcion
