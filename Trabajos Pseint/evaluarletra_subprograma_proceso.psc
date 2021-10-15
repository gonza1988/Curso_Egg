Algoritmo ej2extra3
	
	//Realizar un subproceso que reciba una letra y muestre un mensaje si esa letra esta
	//entre las letras "M" y "T". Recordar que Pseint le da un valor numérico a cada letra a
	//través del Código Ascii.
	
	Definir letra Como Caracter 
	Definir mensaje como logico
	
	Escribir "Ingrese letra a evaluar "
	Leer letra
	
	evalua(letra,mensaje)
	Escribir "Su letra se encuentra entre la letra M y la T ? " mensaje
	
	
FinAlgoritmo

SubProceso evalua(letra, mensaje Por Referencia)
	Definir letra2 Como Caracter
	
	letra2 = Mayusculas(letra)
	
	si letra2 >= "M"  y letra2 <= "T"  Entonces
		mensaje = Verdadero
	SiNo
		mensaje = Falso
	FinSi
	
FinSubProceso
	