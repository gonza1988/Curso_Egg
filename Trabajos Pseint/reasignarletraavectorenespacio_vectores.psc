Algoritmo ej5extra4
	
	//Tomando en cuenta el ejercicio 6, mejore el mecanismo de inserción del carácter,
	//facilitando un potencial reordenamiento del vector. Digamos que se pide ingresar el
	//carácter en la posición X y la misma está ocupada, entonces de existir un espacio en
	//cualquier posición X-n o X+n, desplazar los caracteres hacia la izq o hacia la derecha para
	//	poder ingresar el carácter en cuestión en el lugar deseado. El procedimiento de
	//	reordenamiento debe ubicar el espacio más cercano.
	//Por ejemplo, suponiendo la siguiente frase y los subíndices del vector:
	//	H o l a m u n d o c r u e l !
	//	0 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19
	//	Si se desea ingresar el carácter "%" en la posición 8, entonces el resultado con
	//	desplazamiento sería:
	//		7
	//		h o l a m u n % d o c r u e l !
	//		0 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19
			
	//		Notar que el desplazamiento se hizo hacia la izquierda porque el espacio de la posición
	//		10 estaba más cerca de la posición 8 que el espacio de la posición 4.
	
	Definir vector, frase, letra, temp Como Caracter
	Definir i, j, contadorespacio, contadorletra, posicion Como Entero
	
	Dimension vector(20)
	contadorespacio = 0
	contadorletra = 0
	temp = ""
	
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
		si vector(i) = " " Entonces
			contadorespacio = contadorespacio + 1
			contadorletra = 0
		SiNo
			si vector(i) <> "" Entonces
				
			contadorletra = contadorletra + 1
		FinSi
	FinSi
	
		si ( i = posicion) y (vector(i) = " ") Entonces
			vector(i) = letra
			Escribir "Caracter ingresado exitosamente "
		SiNo
			si ( i = posicion)  Entonces
				Para j = 18 Hasta posicion Con Paso -1 Hacer
					vector(j+1) = vector(j)
				Fin Para
				vector(posicion) = letra
		FinSi
	FinSi
		
	FinPara
	
	Escribir "Su frase es: "
	
	Para i = 0 Hasta Longitud(frase) Hacer
		Escribir " [ " vector(i) " ] " Sin Saltar
	FinPara
	Escribir ""
	Escribir "Espacios " contadorespacio
	Escribir "Letras " contadorletra
FinAlgoritmo
