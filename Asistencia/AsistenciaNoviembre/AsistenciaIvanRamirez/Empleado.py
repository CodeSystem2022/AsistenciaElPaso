class Empleado:  # Hereda solo de la clase object
    def __init__(self, nombre, sueldo, edad, antiguedad):
        self.nombre = nombre
        self.sueldo = sueldo
        self.edad = edad
        self.antiguedad = antiguedad

    def __str__(self):
        return f'Empleado: [Nombre: {self.nombre}, Sueldo: {self.sueldo}, Edad: {self.edad}, Antiguedad: {self.antiguedad}]'

    def mostrar_detalles(self):
        return self.__str__()