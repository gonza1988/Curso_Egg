Algoritmo ej7guia2
	
	//Realizar un programa que pida una frase o palabra y si la frase o palabra es de 4
	//caracteres de largo, el programa le concatenara un signo de exclamaci�n al final, y si no
	//	es de 4 caracteres el programa le concatenara un signo de interrogaci�n al final. El
	//programa mostrar� despu�s la frase final. Nota: investigar la funci�n Longitud() y
	//	Concatenar() de Pseint.
	
	Definir frase,frase2,frase3 Como Caracter
	Escribir "Por favor ingrese una frase "
	Leer frase
	
	si Longitud(frase) = 4 Entonces
		frase2 = Concatenar(frase,"!")
		Escribir frase2
	SiNo
		frase3 = Concatenar(frase,"?")
		Escribir frase3
	FinSi
	
	
FinAlgoritmo
