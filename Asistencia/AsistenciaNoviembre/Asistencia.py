
'''
ESTA ES LA ASISTENCIA DEL GRUPO EL PASO

'''

'''
ASISTENCIA MES NOVIEMBRE

'''

# DENIS MEMBRIVE

# Ejercicio Contador

class PersonaDenis:
    contador_personas = 0  # Variable de clase

    # Mejoramos en el ejercicio Contador

    @classmethod
    def generar_siguiente_valor(cls):
        cls.contador_personas += 1
        return cls.contador_personas

    def __init__(self, nombre, edad):
        self.id_persona = PersonaDenis.generar_siguiente_valor()  # Cada objeto que se cree dara un id distinto
        self.nombre = nombre
        self.edad = edad

    def __str__(self):
        return f'Persona [{self.id_persona} = {self.nombre} {self.edad}]'  # Sobreescribimos nuestro metodo dunder str