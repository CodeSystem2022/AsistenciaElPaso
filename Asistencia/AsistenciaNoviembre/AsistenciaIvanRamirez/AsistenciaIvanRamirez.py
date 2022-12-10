from Empleado import Empleado
from Gerente import Gerente


def imprimir_detalles(objeto):  # Método para aprender lo que es polimorfismo
    # print(objeto)  # De manera indirecta llama al str de la clase Empleado o Gerente
    print(type(objeto))  # Esto es para saber el tipo de dato que recibe
    print(objeto.mostrar_detalles())



empleado1 = Empleado('Ariel', 50000, 40, 15)
empleado2 = Empleado('Ivan', 40000, 31, 2)
print('-----------------------*------------------------')
imprimir_detalles(empleado1)
print('-----------------------*------------------------')
imprimir_detalles(empleado2)
print('-----------------------*------------------------')
gerente = Gerente('Natalia', 60000, 'Sistemas', 33, 20)
imprimir_detalles(gerente)
print('-----------------------*------------------------')