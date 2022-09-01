Algoritmo Identificarunnprimo 
	num1<-0
	num2<-4
	
	Mientras num2 == 4 Hacer
		Escribir 'Ingresa un numero'
		leer num1 
		si num1 Mod 2 = 0 entonces 
			Escribir 'No es un numero primo'
			sino

				SI num1 MOD 3 = 0 Entonces
					Escribir 'No es un numero primo'
				sino
					si num1 mod 5 = 0 Entonces
						Escribir 'No es un numero primo'
					sino
						si num1 mod 7 = 0 
							Escribir 'No es un numero primo'
						SiNo
							Escribir 'si es un numero primo'
						FinSi
					fin si 
				fin si 
			fin si
		
		
	Fin Mientras
	
	
FinAlgoritmo
