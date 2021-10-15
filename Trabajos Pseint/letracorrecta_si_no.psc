Algoritmo ej4guia2
	//Realiza un programa que sólo permita introducir los caracteres ?S? y ?N?. Si el usuario
	//ingresa alguno de esos dos caracteres se deberá de imprimir un mensaje por pantalla que diga "CORRECTO", en caso contrario, se deberá imprimir "INCORRECTO".
	Definir letra Como Caracter
	
	Escribir "Por favor ingrese solamente la letra S o N "
	Leer letra
	
	si letra =="s" o letra == "S" o letra == "N" o letra == "n" Entonces
		Escribir "Su letra fue introducida correctamente "
	SiNo
		Escribir "Error al ingresar su letra"
		
	FinSi
FinAlgoritmo
