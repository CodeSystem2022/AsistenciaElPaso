# -*- coding: utf-8 -*-
"""
Created on Sat Dec 10 12:27:05 2022

@author: User
"""

import math # importamos la clase math para hacer uso de la función sqrt (raíz cuadrada)
# Dada la siguiente tupla
tupla = (13, 1, 8, 3, 2, 5, 8)
# Crear una lista que solo incluya los numeros menores a 5
# e imprima por consola [1, 3, 2]

lista = [] # Definimos la lista
# filtramos los elementos menores a 5 de la tupla
for elemento in tupla:
    if elemento < 5:
        lista.append(elemento)
print(lista)

# Fin clase 1

# Ejercicio de matemáticas
# Para sacar la raíz cuadrada de un número positivo
numero = int(input('Digite un número positivo '))
while numero < 0:
    print('Error -> Debería ser un número positivo')
    numero = int(input('Digite un número positivo: '))
print(f'\n Su raíz cuadrada es: {math.sqrt(numero):.2f}')