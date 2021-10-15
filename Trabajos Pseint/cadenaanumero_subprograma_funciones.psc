Algoritmo ej2extra32
	
	//Diseñar una función que reciba un numero en forma de cadena y lo devuelva como
    //numero entero. El programa podrá recibir números de hasta 3 dígitos. Nota: no poner
	//números con decimales
	
	Definir num Como Caracter
	
	Escribir "Ingrese numero de hasta 3 digitos: "
	Leer num
	
	si Longitud(num) <= 3 Entonces
		Escribir "Su frase convertida a entero es " convertiranum(num)
	SiNo
		Escribir "Error al ingresar su numero"
	FinSi
	
FinAlgoritmo

Funcion numeronuevo <- convertiranum ( num )
	Definir numeronuevo Como entero
	
	numeronuevo = ConvertirANumero(num)
Fin Funcion
