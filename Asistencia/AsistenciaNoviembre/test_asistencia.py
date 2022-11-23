from Asistencia import*

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