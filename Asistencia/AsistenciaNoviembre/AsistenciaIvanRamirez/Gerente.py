from Empleado import Empleado


class Gerente(Empleado):
    def __init__(self, nombre, sueldo, departamento, edad, antiguedad):
        super().__init__(nombre, sueldo, edad, antiguedad)
        self.departamento = departamento

    def __str__(self):
        return f'Gerente [ Departamento: {self.departamento}] {super().__str__()}'