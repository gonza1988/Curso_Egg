Algoritmo ej2guia3
	
	//Crear una procedimiento que calcule la temperatura media de un d�a a partir de la
	//temperatura m�xima y m�nima. Crear un programa principal, que utilizando un
	//procedimiento, vaya pidiendo la temperatura m�xima y m�nima de n d�as y vaya
	//mostrando la media de cada d�a. El programa pedir� el n�mero de d�as que se van a
	//introducir.
	
	// 1- Programa pide numero de dias a calcular temperatura
	// 2-Procedimiento calcula la media de la temperatura por dia 
	
	Definir dias, i, max, min  Como Entero
	Definir medio Como Real
	Escribir "Ingresar cantidad de dias a calcular la temperatura "
	Leer dias
	
	Para i = 1 Hasta dias Hacer
		Escribir "ingrese temperatura maxima y minima "
		Leer max, min
		media(max,min,medio)
		Escribir "Para dia " i " temperatura media es " medio
	FinPara
	
	
	
FinAlgoritmo

SubProceso media(max,min, medio Por Referencia ) 
	medio = (max + min ) / 2
Fin subproceso
