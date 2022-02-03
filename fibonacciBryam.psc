Algoritmo fibonacciBryam
	Definir j,i,k,mayorA,n1,n2,n3,mayorB Como Real
	n1<-0;n2<-1;n3<-0;mayorA<-0;mayorB<-0
	Dimension A[4,6]
	Dimension B[4,6]
	Dimension fib[100]
	
	Para k<-1 Hasta 100 Con Paso 1 Hacer
		n3=n1+n2 
		fib[k] = n3
		n1=n2    
		n2=n3
	FinPara
	
	Escribir "Ingresar datos de la matriz A"
	Para i<-1 Hasta 4 Con Paso 1 Hacer
		Para j<-1 Hasta 6 Con Paso 1 Hacer
			Escribir "A[",+i,+"][",+j,+"] = "
			Leer A[i,j]
		FinPara
	FinPara
	Escribir "Ingresar datos de la matriz B"
	Para i<-1 Hasta 4 Con Paso 1 Hacer
		Para j<-1 Hasta 6 Con Paso 1 Hacer
			Escribir "B[",+i,+"][",+j,+"] = "
			Leer B[i,j]
		FinPara
	FinPara
	
	
	Escribir "matriz A"
	Para i<-1 Hasta 4 Con Paso 1 Hacer
		Para j<-1 Hasta 6 Con Paso 1 Hacer
			Escribir Sin Saltar A[i,j] ,+ "  "
		FinPara
		Escribir " "
	FinPara
	Escribir "matriz B"
	Para i<-1 Hasta 4 Con Paso 1 Hacer
		Para j<-1 Hasta 6 Con Paso 1 Hacer
			Escribir Sin Saltar B[i,j] ,+ "  "
		FinPara
		Escribir " "
	FinPara
	// Comprobar vector A
	Para i<-1 Hasta 4 Con Paso 1 Hacer
		Para j<-1 Hasta 6 Con Paso 1 Hacer
			Para k<-1 Hasta 100 Con Paso 1 Hacer
				
				Si (A[i,j] == fib[k]) Y (mayorA < A[i,j])  Entonces
					mayorA = A[i,j]
				FinSi
				
			FinPara
				
		FinPara
	FinPara
	Escribir "El mayor de  matriz A es: ",+mayorA
	//Comprobar vector B
	Para i<-1 Hasta 4 Con Paso 1 Hacer
		Para j<-1 Hasta 6 Con Paso 1 Hacer
			Para k<-1 Hasta 100 Con Paso 1 Hacer
				
				Si (B[i,j] == fib[k]) Y (mayorB < B[i,j])  Entonces
					mayorB = B[i,j]
				FinSi
				
			FinPara
			
		FinPara
	FinPara
	Escribir "El mayor de  matriz B es: ",+mayorB
	
	Si(mayorA == mayorB) Entonces
		Escribir "Las 2 matrices tienen el mismo número mayor perteneciente a la serie Fibonacci"
	SiNo
		Escribir "Las 2 matrices no tienen el mismo número mayor perteneciente a la serie Fibonacci"
		Escribir "Mayor matriz A = ",+mayorA
		Escribir "Mayor matriz A = ",+mayorB
	FinSi
	
	
	
FinAlgoritmo
