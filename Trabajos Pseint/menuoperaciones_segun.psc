Algoritmo ej11guia2
	
	//Construir un programa que simule un menú de opciones para realizar las cuatro
	//operaciones aritméticas básicas (suma, resta, multiplicación y división) con dos valores
	//numéricos enteros. El usuario, además, debe especificar la operación con el primer
	//carácter de la operación que desea realizar: ?S' o ?s? para la suma, ?R? o ?r? para la resta, ?M?
	//o ?m? para la multiplicación y ?D? o ?d? para la división.
	
	Definir num1, num2 Como Real
	Definir operacion Como Caracter
	
	Escribir "**********************************************************"
	Escribir "**           Bienvenido, Ingrese su opcion              **"
	Escribir "** s = Sumar, r =Restar , m = Multiplicar , d = Dividir **"
	Escribir "**********************************************************"
	leer operacion
	Escribir "Ingrese los numeros a operar "
	Leer num1,num2
	
	Segun operacion Hacer
		"S" o "s":
			Escribir "La suma es" num1+num2
		"R" o "r":
			Escribir "La resta es" num1-num2
		"M" o "m":
			Escribir "La multiplicacion es" num1*num2
		"D" o "d":
			Escribir "La division es" num1/num2
		De Otro Modo:
			Escribir "Operacion incorrecta, vuelva a ingresar su letra "
	Fin Segun
	
	
	
	
FinAlgoritmo
