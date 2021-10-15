Algoritmo sin_titulo
	Definir vector Como Caracter
	Definir caracter_usuario Como Caracter
	Definir subcadena_temporal Como Caracter
	Dimension vector(20)
	Definir posicion Como Entero
	vector[0] = "H"
	vector[1] = "o"
	vector[2] = "l"
	vector[3] = "a"
	vector[4] = " " //Espacio en posicion 4
	vector[5] = "e"
	vector[6] = "s"
	vector[7] = "t"
	vector[8] = "o"
	vector[9] = " " //Espacio en posicion 9
	vector[10] = "e"
	vector[11] = "s"
	vector[12] = " " //Espacio en posicion 12
	vector[13] = "u"
	vector[14] = "n"
	vector[15] = "a"
	vector[16] = " " //Espacio en posicion 16
	vector[17] = "f"
	vector[18] = "r"
	vector[19] = "a"
	
	//ACA COMIENZA EL EXTRA
	
	Escribir "Que caracter desea ingresar: "
	Leer caracter_usuario
	Escribir "En que posicion? (0 a 19)"
	Leer posicion
	
	/// UNA VEZ DEFINIDO PARA DONDE DEBEMOS REORDENAR (DERECHA O IZQUIERDA), EL 
	/// REORDENAMIENTO SE REALIZA CON TODO EL VECTOR, ES DECIR QUE SI ORDENAMOS HACIA
	/// LA DERECHA Y HABIA UN CARACTER EN LA ULTIMA POSICION, ESTE CARACTER SE PIERDE.
	/// (asi esta hecho en el ejemplo del enunciado)
	/// El reordenamiento se deberia poder realizar con la funcion subcadena pero pseint no lo permite =(
	/// Habra que hacerlo con un PARA recorriendo todo el vector
	Si vector(posicion) <> " " Entonces
		//Primero debemos encontra para donde esta el espacio " " mas cercano
		//Para esto, creamos una funcion
		Si para_donde(vector, posicion) Entonces
			//VERDADERO, hay que para la derecha
			Escribir "Para la derecha"
			
			
		SiNo
			//FALSO, hay que ir para la izquierda
			Escribir "Para la izquierda" 
		FinSi
		
	SiNo
		vector(posicion) = caracter_usuario
	FinSi
	
FinAlgoritmo

//Funcion que devuelve: VERDADERO si hay que ir para la derecha
//					  FALSO si hay que ir para la izquierda
Funcion direccion = para_donde(vector Por Referencia, posicion_usuario Por Valor)
	Definir direccion Como Logico //El valor que devuelve la funcion.
	Definir i Como Entero //Utilizado por el PARA
	Definir pos_derecha, pos_izquierda Como Entero
	
	Definir terminar_bucle Como Logico //Flag para indicar si el bucle debe finalizar , es decir
	// encontramos el espacio ya se para la derecha o la izquierda
	
	terminar_bucle = Falso
	i = 1 //Inicializamos i en 1 para que en la primera iteracion sume uno (para la derecha) y reste uno (para la izquierda)
	
	Mientras !terminar_bucle
		
		//Primero vamos a calcular cual es la proxima posicion DERECHA que vamos a chequear
		pos_derecha = posicion_usuario + i //Si sumamos, nos movemos a la derecha
		Si pos_derecha < 20 Entonces //20 es el tamaño maximo del vector. No podemos buscar valores mas alla de eso!
			Si vector(pos_derecha) == " " Entonces //Estamos SUMANDO, por ende nos movemos a la DERECHA
				terminar_bucle = Verdadero
				direccion = Verdadero // Habiamos dicho que si habia que ir para la DERECHA, devolviamos VERDADERO
			FinSi		
		FinSi
		
		//Ahora vamos a buscar si hay un espacio para la izquierda. Hay que RESTAR
		pos_izquierda = posicion_usuario-i
		Si pos_izquierda >= 0 Y !terminar_bucle Entonces //No podemos buscar valores en posiciones menores a cero!!!
			//Tambien verificamos el valor de terminar_bucle por si el espacio
			//Ya se habia encontrado hacia la derecha en el paso anterior.
			Si vector(pos_izquierda) == " " Entonces
				terminar_bucle = Verdadero	//Encontramos el espacio y terminamos.
				direccion = Falso	//habiamos dicho que si habia ir para la IZQUIERDA, devolviamos FALSO
			FinSi			
		FinSi
		
		//Debemos incrementar el valor de i para que la proxima vuelta sume 2 y reste 2 respectivamente
		i = i+1
		
		//Hay que verificar que i no llegue a 20, 
		Si i >= 20 Entonces
			//Si el bucle termina porque i llego a 20, significa que no habian espacios.
			terminar_bucle = Verdadero	//indicamos que termine el bucle
			//Aca podemos definir un valor por defecto para la variable que devuelve.
			//habria que avisar al programa principal de alguna forma, de que no habian espacios disponibles
			//Sino se va a romper todo. No lo voy a hacer eso.
			//Solo voy a escribir algo en pantalla y que el principal se las arregle (funcionara mal)
			Escribir "NO QUEDAN ESPACIOS!"
		FinSi
	FinMientras
FinAlgoritmo
