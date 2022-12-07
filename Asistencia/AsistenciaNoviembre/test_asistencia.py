from AsistenciaDenisMembrive import*

'''
ESTA ES LA ASISTENCIA DEL GRUPO EL PASO

'''

'''
ASISTENCIA MES NOVIEMBRE

'''

# DENIS MEMBRIVE

# Test contador

persona1 = PersonaDenis('Denis', 32)
print(persona1)
persona2 = PersonaDenis('Sofia', 29)
print(persona2)
persona3 = PersonaDenis('Camilo', 29)
print(persona3)

PersonaDenis.generar_siguiente_valor()
persona4 = PersonaDenis('Valentin', 28)
print(persona4)
print(f'Valor contador de personas: {PersonaDenis.contador_personas}')

#Test Producto y orden - LEONARDO FERNANDEZ

from Orden import Orden
from Producto import Producto

producto1 = Producto('Camiseta', 100.00)
producto2 = Producto('Pantalon', 150.00)
producto3 = Producto('Campera', 300.00)
producto4 = Producto('Zapatillas', 400.00)
producto5 = Producto('Buzo', 200.00)
productos1 = [producto1, producto2]  # Lista de productos
orden1 = Orden(productos1)  # Primer obejto orden pasando la lista de productos
orden1.agregar_producto(producto5)
orden1.agregar_producto(producto3)
print(orden1)
print(f'Total de la orden1: {orden1.calcular_total()}')
productos2 = [producto3, producto4]
orden2 = Orden(productos2)
orden2.agregar_producto(producto5)
orden2.agregar_producto(producto3)
print(orden2)
print(f'Total de la orden2: {orden2.calcular_total()}')
