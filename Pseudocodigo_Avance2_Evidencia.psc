Proceso Pseudocodigo_Evidencia2
    Definir opcion, respuesta como Caracter
	
    Escribir "Inicio"
    Escribir "Ingrese credenciales: "
    Leer credenciales
	
    Si credenciales = "validas" Entonces
        Repetir
            Escribir "Men� Principal:"
            Escribir "1. Dar de alta doctores"
            Escribir "2. Dar de alta pacientes"
            Escribir "3. Programar citas"
			
            Escribir "Ingrese opci�n:"
            Leer opcion
			
            Segun opcion Hacer
                Caso "1":
                    Escribir "C�digo para dar de alta doctores"
                Caso "2":
                    Escribir "C�digo para dar de alta pacientes"
                Caso "3":
                    Escribir "C�digo para programar citas"
                De Otro Modo:
                    Escribir "Opci�n inv�lida"
            FinSegun
			
            Escribir "�Desea hacer algo m�s? (si/no):"
            Leer respuesta
			
        Hasta Que respuesta <> "si"
    Sino
        Escribir "Credenciales inv�lidas. Fin del programa."
    FinSi
FinProceso
