Algoritmo ej6extra32
	
	//Realizar una funci�n que reciba un numero ingresado por el usuario y averig�e si el
    //n�mero tiene todos sus d�gitos impares (ejemplo: 333, 55, etc.). Para esto vamos a tener
	//	que separar el numero en partes (si es un numero de m�s de un digito) y ver si cada
	//	numero es par o impar. Nota: recordar el uso de la funci�n Mod y Trunc(). No podemos
	//		pasar el numero a cadena para realizar el ejercicio.
	
	Definir num Como Entero
	
	Escribir "Ingresar numero"
	Leer num
	
	Escribir " Su numero tiene " cuentaimpar(num) " numeros impares"
	
FinAlgoritmo

Funcion contador <- cuentaimpar ( num )
	Definir contador,resto Como Entero
	
	contador = 0
	resto = 0
	
	Mientras num > 0
		resto = num mod 10
		si resto mod 2 <> 0 Entonces
			contador = contador + 1
		FinSi
		num = trunc(num/10)
		
	FinMientras
	
Fin Funcion
