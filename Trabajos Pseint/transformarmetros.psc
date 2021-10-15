Algoritmo ej4
	//A partir de una conocida cantidad de metros que el usuario ingresa a través del teclado
	//se debe obtener su equivalente en centímetros, en milímetros y en pulgadas.
    //Ayuda: 1 pulgada equivale a 2.54 centímetros.
	
	Definir metros, centimetros, milimetros, pulgadas Como Real
	
	Escribir "Por favor ingrese la cantidad de metros que desea transformar :"
	Leer metros
	
	centimetros = metros * 100
	milimetros = metros * 1000
	pulgadas = centimetros / 2.54
	
	Escribir "Sus metros han sido transformados a centimetros: " centimetros ", milimetros: " milimetros " y pulgadas: " pulgadas

	
FinAlgoritmo
