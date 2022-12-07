
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


# LEONARDO FERNANDEZ


# Ejercicio Producto

class Producto:
    contador_productos = 0  # variable de clase

    def __init__(self, nombre, precio):
        Producto.contador_productos += 1  # Aumento para la variable de clase
        self._id_producto = Producto.contador_productos  # Asignación desde la variable de clase
        self._nombre = nombre
        self._precio = precio

    # Metodos setters and getters
    @property
    def nombre(self):
        return self._nombre

    @nombre.setter
    def nombre(self, nombre):
        self._nombre = nombre

    @property
    def precio(self):
        return self._precio

    @precio.setter
    def precio(self, precio):
        self._precio = precio

    # sobreescribimos el método str
    def __str__(self):
        return f'Id Preducto: {self._id_producto}, Nombre: {self._nombre}, Precio: {self._precio}'


if __name__ == '__main__':  # Solo será visible si la prueba se ejecuta desde aquí
    producto1 = Producto('Camiseta', 100.00)
    print(producto1)
    producto2 = Producto('Pantalon', 150.00)
    print(producto2)
