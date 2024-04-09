Proceso Pseudocodigo_Evidencia2
    Definir opcion, respuesta como Caracter
	
    Escribir "Inicio"
    Escribir "Ingrese credenciales: "
    Leer credenciales
	
    Si credenciales = "validas" Entonces
        Repetir
            Escribir "Menú Principal:"
            Escribir "1. Dar de alta doctores"
            Escribir "2. Dar de alta pacientes"
            Escribir "3. Programar citas"
			
            Escribir "Ingrese opción:"
            Leer opcion
			
            Segun opcion Hacer
                Caso "1":
                    Escribir "Código para dar de alta doctores"
                Caso "2":
                    Escribir "Código para dar de alta pacientes"
                Caso "3":
                    Escribir "Código para programar citas"
                De Otro Modo:
                    Escribir "Opción inválida"
            FinSegun
			
            Escribir "¿Desea hacer algo más? (si/no):"
            Leer respuesta
			
        Hasta Que respuesta <> "si"
    Sino
        Escribir "Credenciales inválidas. Fin del programa."
    FinSi
FinProceso
