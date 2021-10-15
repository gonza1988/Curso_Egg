Algoritmo ej6guia4
	
	//Disponemos de un vector unidimensional de 20 elementos de tipo carácter. Se pide
	//desarrollar un programa que:
	//a. Pida una frase al usuario y luego ingrese la frase dentro del arreglo letra por
	//letra. Tip: utilizar la función Subcadena de PSeInt.
	//b. Una vez completado lo anterior, pedirle al usuario un carácter cualquiera y una
	//posición dentro del arreglo, y el programa debe intentar ingresar el carácter
	//en la posición indicada, si es que hay lugar (es decir la posición está vacía o
	//es un espacio en blanco). De ser posible debe mostrar el vector con la frase y
	//el carácter ingresado, de lo contrario debe darle un mensaje al usuario de que
	//esa posición estaba ocupada.
	//Por ejemplo, suponiendo la siguiente frase y los subíndices del vector:
	
	//H o l a m u n d o c r u e l !
	//0 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19
	
	//Si se desea ingresar el carácter "%" en la posición 10, entonces el resultado sería:
	//H o l a m u n d o % c r u e l !
	//0 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19
	
     //1.Tip: Para ingresar la frase en el vector, debemos tener en cuenta que la Subcadena incluya una variable contador para la posición que queremos ubicar.

    Definir vector, frase, letra Como Caracter
	Definir i, contador, posicion Como Entero
	
	Dimension vector(20)
	contador = 0
	
	Escribir "Ingrese una frase "
	Leer frase
	
	Para i = 0 Hasta 19  Hacer
		//contador = contador + Subcadena(frase,i,i)
		vector(i) = Subcadena(frase,i,i)
		Escribir vector(i) Sin Saltar
	Fin Para
	
	Escribir ""
	
	Escribir "Ahora ingrese el caracter a agregar y la posicion deseada: "
	leer letra
	Leer posicion
	
	Para i = 0 Hasta 19 Hacer
		si ( i = posicion) y (vector(i) = " ") Entonces
			vector(i) = letra
			Escribir "Caracter ingresado exitosamente "
		SiNo
			si ( i = posicion) y (vector(i) <> " ") Entonces
			Escribir " Espacio lleno "
		FinSi
	FinSi
	
	FinPara
	
	Escribir "Su frase es: "
	
	Para i = 0 Hasta Longitud(frase) Hacer
		Escribir " [ " vector(i) " ] " Sin Saltar
	FinPara
	Escribir ""

	
FinAlgoritmo


