Algoritmo ej5extra32
	
	//Realizar una funci�n que calcule la suma de los d�gitos de un numero.
    //Ejemplo: 25 = 2 + 5 = 7
    //Nota: Para obtener el �ltimo numero de un digito de 2 cifras o m�s debemos pensar en
	//	el resto de una divisi�n entre 10. Recordar el uso de la funci�n Mod y Trunc.
	
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
