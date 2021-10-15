Algoritmo ej13exrta22
	
	//Siguiendo el ejercicio 7 de los ejercicios principales, ahora deberemos hacer lo mismo
     //pero que la cadena se muestre al revés. Por ejemplo, si tenemos la cadena: Hola,
	//	deberemos mostrar a l o H.
	
	Definir i, cantidad  Como Entero
	Definir frase Como Caracter
	
	Escribir "Ingrese su frase "
	Leer frase
	cantidad = Longitud(frase) 
	
	Para  i = cantidad Hasta 0 Con Paso -1  Hacer
		Escribir Sin Saltar Subcadena(frase i, i) " "
	FinPara
	
FinAlgoritmo
