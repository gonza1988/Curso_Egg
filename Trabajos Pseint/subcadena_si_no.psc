Algoritmo ej9guia2
	
	//Escriba un programa que pida una frase o palabra y valide si la primera letra de esa frase
	//es una ?A?. Si la primera letra es una ?A?, se deber� de imprimir un mensaje por pantalla
	//que diga "CORRECTO", en caso contrario, se deber� imprimir "INCORRECTO". Nota:
	//investigar la funci�n Subcadena de Pseint. 

	Definir frase Como Caracter
	
	Escribir "Por favor ingrese su frase "
	Leer frase
	
	si Subcadena(frase, 0,0) == "A" Entonces
		Escribir "CORRECTO"
	SiNo
		Escribir "INCORRECTO"
	FinSi
FinAlgoritmo
