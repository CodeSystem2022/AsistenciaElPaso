
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

    
# PABLO PEREZ
# EJERCICIO CLASE PADRE, CLASE RATON.

# Creamos clase Padre
class DispositivoEntrada:
    def __init__(self, marca, tipo_entrada):
        self._marca = marca
        self._tipo_entrada = tipo_entrada

# Creamos clase Raton
class Raton(DispositivoEntrada):
# Creamos variable para contabilizar.
    contador_ratones = 0
# Creamos metodo dunder init
    def __init__(self, marca, tipo_entrada):
        Raton.contador_ratones += 1
        self._id_raton = Raton.contador_ratones
        super().__init__(marca, tipo_entrada)
# Creamos metodo str
    def __str__(self):
        return f'ID: {self._id_raton}, Marca: {self._marca}, Tipo Entrada: {self._tipo_entrada}'

# Hacemos pruebas
if __name__ == '__main__':
    raton1 = Raton('HP', 'USB')
    print(raton1)
    raton2 = Raton('Acer', 'Bluetooth')
    print(raton2)
