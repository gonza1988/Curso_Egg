Algoritmo viborita
	
	//Definir dimensiones Como Entero
	
	viborita1
	
FinAlgoritmo

SubProceso viborita1
	
	Definir dimensiones, estaX,estaY,lineax,lineay,personajex,personajey,frutax,frutay,tamaniocola,puntos,jugando,contador Como Entero
	Definir cuadrado Como Caracter
	
	Escribir "dimensiones del cuadrado"
	
	Dimensiones<-10
	
	estaX<-dimensiones
	
	estaY<-dimensiones
	
	Dimension cuadrado(estaX,estaY)
	
	lineax<-0
	lineay<-0
	personajex<-5
	personajey<-6
	tamaniocola<-0
	
	frutax<-Aleatorio(1,10)
	frutay<-Aleatorio(1,10)
	
	puntos<-0
	
	Para jugando<-1 Hasta 10000 Con Paso 1 Hacer
		
		Escribir "Puntaje : " puntos
		
		para contador<-0 Hasta ((estaX*estaY)+estaX-1) Con Paso 1 Hacer
			
			si lineax < (estaX+1) Entonces
				
				si lineax=personajex y lineay=personajey Entonces
					
					cuadrado(lineax,lineay)<-"@"
					
				SiNo
					
					si lineax=frutax y lineay=frutay Entonces
						
						cuadrado(lineax,lineay)<-"?"
					SiNo
						cuadrado(lineax,lineay)<-"."
						
					FinSi
					
				FinSi
				
			SiNo
				
				lineax<-0
				lineay<-lineay+1
				
			FinSi
			
			lineax <-lineax+1
			
		FinPara
		
		si personajex = frutax y personajey=frutay Entonces
			
			frutax<-Aleatorio(1,10)
			
			frutay<-Aleatorio(1,10)
			
			puntos<-puntos+1
			
		FinSi
		
		lineax<-1
		
		lineay<-1
		
		para contador<-0 Hasta ((estaX*estaY)+estaX-1) Con Paso 1 Hacer
			
			si lineax < (dimensiones+1) Entonces
				
				Escribir Sin Saltar " " cuadrado(lineax,lineay)
				
				lineax<-lineax+1
				
			sino
				
				Escribir ""
				
				lineay<-lineay+1
				
				lineax<-1
				
			FinSi
			
		FinPara
		
		lineax<-1
		lineay<-1
		
		Leer movimientito
		
		numerodemovimientos<-Longitud(movimientito)
		
		Para nuevo<-1 Hasta numerodemovimientos Con Paso 1 Hacer
			
			movimiento<-SubCadena(movimientito,nuevo,nuevo)
			
			Segun movimiento Hacer
				
				"a","A": personajex<-personajex-1
					
				"d","D": personajex<-personajex+1
					
				"w","W": personajey<-personajey-1
					
				"s","S": personajey<-personajey+1
					
			FinSegun	
			
		FinPara
		
	FinPara
	
FinSubProceso