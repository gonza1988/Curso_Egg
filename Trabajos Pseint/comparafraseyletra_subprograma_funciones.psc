Algoritmo ej4guia32
	
	//Realizar un programa que pida al usuario una frase y una letra a buscar en esa frase. La
    //función debe devolver la cantidad de veces que encontró la letra. Nota: recordar el uso
    //de la función Subcadena().
	
	Definir frase, letra Como Caracter
	
	Escribir "Ingrese su frase: "
	Leer frase
	Escribir "Ahora ingrese la letra a contar las veces que se repite: "
	Leer letra
	
	Escribir "La letra " letra "fue encontrada " cuentaletra(frase,letra) " veces"
	
	
FinAlgoritmo

Funcion contador <- cuentaletra ( frase,letra )
	Definir contador, i Como Entero
	Definir frasetemp, letratemp Como Caracter
	
	letratemp = Mayusculas(letra)
	frasetemp = ""
	contador = 0
	
	Para i = 0 Hasta Longitud(frase) Hacer
		frasetemp = Mayusculas(Subcadena(frase,i,i))
		si frasetemp = letratemp Entonces
			contador = contador + 1
		FinSi
	FinPara
	
Fin Funcion
