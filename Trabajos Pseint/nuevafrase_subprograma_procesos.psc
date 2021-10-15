Algoritmo ej4guia3
	
	//Escribir un programa que procese una secuencia de caracteres ingresada por teclado
	//y terminada en punto, y luego codifique la palabra o frase ingresada de la siguiente
	//manera: cada vocal se reemplaza por el carácter que se indica en la tabla y el resto de
	//los caracteres (incluyendo a las vocales acentuadas) se mantienen sin cambios.
	//a = @
	//e = #
	//i = $
	//o = %
	//u = *
		
	//Realice un subprograma que reciba una secuencia de caracteres y retorne la
	//codificación correspondiente. Utilice la estructura "según" para la transformación.
	//Por ejemplo, si el usuario ingresa: Ayer, lunes, salimos a las once y 10.
	//La salida del programa debería ser: @y#r, l*n#s, s@l$m%s @ l@s %nc# y 10.
	//NOTA: investigue el uso de la función concatenar de PSeInt para armar la palabra/frase.
	//1.Se recomienda investigar la función Concatenar, y el uso de algún Bucle para recorrer la cadena.
	
	Definir frase, letra Como Caracter
	Definir long Como Entero
	
	frase = ""
	letra = ""
	
	Escribir "Ingrese frase, terminada en punto "
	
	Hacer 
		Leer letra
		frase = Concatenar(frase,letra)
		Escribir frase
	Mientras Que letra <> "."
	
	cambio(frase)
	Escribir "Su nueva frase ahora es " frase
	
FinAlgoritmo

SubProceso cambio(frase Por Referencia) 
	Definir i Como Entero
	Definir letra, nuevaoracion Como Caracter
	nuevaoracion = ""
	
	Para i = 0 Hasta Longitud(frase) -1 Hacer
		letra = Subcadena(frase, i,i)
		Segun letra Hacer
			"A","a":
				letra = "@"
			"E","e":
				letra = "#"
			"I","i":
				letra = "$"
			"O","o":
				letra = "%"
			"U","u":
				letra = "*"
		Fin Segun
		nuevaoracion = Concatenar(nuevaoracion,letra)
	FinPara
	frase = nuevaoracion
FinSubProceso
