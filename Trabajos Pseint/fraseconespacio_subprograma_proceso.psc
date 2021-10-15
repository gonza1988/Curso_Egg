Algoritmo ej1extra3
	
	//Crea un procedimiento "convertirEspaciado", que reciba como argumento un texto y
	//muestra una cadena con un espacio adicional tras cada letra.
	//Por ejemplo, "Hola, tú" devolverá "H o l a , t ú ". Crea un programa principal donde se
	//use dicho procedimiento.
	
	Definir frase Como Caracter
	
	Escribir "Ingrese frase a espaciar: "
	Leer frase
	
	Escribir "frase actual " frase
	
	convertirespaciado(frase)
	
	Escribir "frase convertida " frase
	
FinAlgoritmo

SubProceso convertirespaciado(frase Por Referencia)
	Definir i Como entero
	Definir letra, nuevaoracion Como Caracter
	nuevaoracion = ""
	
	Para i=0 Hasta Longitud(frase) Hacer
		letra = Subcadena(frase,i,i)
		nuevaoracion = Concatenar(nuevaoracion,letra + "   ")
	FinPara
	
	frase = nuevaoracion
	
FinSubProceso
	