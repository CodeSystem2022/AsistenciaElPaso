# ASISTENCIA NOVIEMBRE
# CABALLERO GABRIEL GRUPO EL PASO

class Persona:
    def __init__(self, nombre, edad):
        self.nombre = nombre
        self.edad = edad

    def __add__(self, other):  # Other = otro
        return f'{self.nombre} {other.nombre}'

    def __sub__(self, otro):  # Sub = substraction (resta)
        return self.edad - otro.edad


persona1 = Persona('Gabriel', 38)
persona2 = Persona('Caballero', 5)

# persona1.__add__(persona2) sintaxis interna y automatica

print(persona1 + persona2)
print(persona1 - persona2)

class Color:
    def __init__(self, color):
        self._color = color

    @property
    def color(self):
        return self._color

    @color.setter
    def color(self,color):
        self._color = color

    def __str__(self):
        return f'Color [color: {self._color}]'