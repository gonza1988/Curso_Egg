Algoritmo ej17extra22
	
	//Escribir un programa que calcule los primeros 4 centros numéricos. Un centro numérico
	//es un número que separa una lista de números enteros (comenzando en 1) en dos
	//grupos de números, cuyas sumas son iguales. El primer centro numérico es el 6, el cual
    //separa la lista (1 a 8) en los grupos: (1, 2, 3, 4, 5) y (7, 8) cuyas sumas son ambas iguales
    //a 15. El segundo centro numérico es el 35, el cual separa la lista (1 a 49) en los grupos:
   //(1 a 34) y (36 a 49) cuyas sumas son ambas iguales a 595.
   //Nota: investigar que es un centro numérico en caso de no saber que es
	
	Definir i, suma_ac, suma_dc, num, contador Como Entero
	
	num = 5000
	suma_ac = 1
	suma_dc = 0
	contador = 1
	
	Hacer
		
	Para i = 0 Hasta contador Hacer
		suma_ac = suma_ac + i
	Fin Para
	Para i = contador Hasta contador * 2 Hacer
		si (suma_ac = suma_dc) Entonces
			Escribir contador " es un centro numerico "
			i = contador * 2 // salir del 2do ciclo cuando se cumpla la suma
		SiNo
			suma_dc = suma_dc + i
		FinSi
	FinPara
	contador = contador + 1
	suma_ac = 0
	suma_dc = 0
Mientras Que  contador <> num
FinAlgoritmo
