from Producto import Producto


class Orden:
    contador_ordenes = 0

    def __init__(self, productos):
        Orden.contador_ordenes += 1
        self.id_orden = Orden.contador_ordenes
        self._productos = list(productos)

    def agregar_producto(self, producto):
        self._productos.append(producto)  # esto es para agregar un nuevo producto

    def calcular_total(self):
        total = 0  # Variable temporal para almacenar el total temporal
        for producto in self._productos:
            total += producto.precio
        return total

    def __str__(self):
        productos_str = ''
        for producto in self._productos:
            productos_str += producto.__str__() + '|'  # Se va a ir concatenando cada producto llamando al str de la clase producto
        return f'Orden: {self.id_orden}, \nProducto: {productos_str}'


if __name__ == '__main__':
    producto1 = Producto('Camiseta', 100.00)
    producto2 = Producto('Pantalon', 150.00)
    productos1 = [producto1, producto2]  # Lista de productos
    orden1 = Orden(productos1)  # Primer obejto orden pasando la lista de productos
    print(orden1)
    print(f'Total de la orden1: {orden1.calcular_total()}')
    producto3 = Producto('Campera', 300.00)
    producto4 = Producto('Zapatillas', 400.00)
    producto5 = Producto('Buzo', 200.00)
    productos2 = [producto3, producto4]
    orden2 = Orden(productos2)
    print(orden2)
# Tarea: modificar la orden2 ingresando nuevos productos con sus nombres y precios
# crear una nueva lista de productos y agregarla a la orden2
