class Persona2:
    def __init__(self, nombre, apellido, edad,):
        self._nombre = nombre
        self._apellido = apellido
        self._edad = edad
        
    def mostrar_detalles(self):
        print(f'Los datos a mostrar son los siguientes: {self._nombre} {self._apellido} {self._edad}')
    
    @property # Decorador
    def nombre(self): # Método Getter
        print('Estamos usando el método get')
        return self._nombre
    
    @nombre.setter
    def nombre(self, nombre): # Método Setter
        print('Estamos usando el método set')
        self._nombre = nombre
        
    @property # Decorador
    def apellido(self): # Método Getter
        print('Estamos usando el método get')
        return self._apellido
    
    @apellido.setter
    def apellido(self, apellido): # Método Setter
        print('Estamos usando el método set')
        self._apellido = apellido
        
    @property # Decorador
    def edad(self): # Método Getter
        print('Estamos usando el método get')
        return self._edad
    
    @edad.setter
    def edad(self, edad): # Método Setter
        print('Estamos usando el método set')
        self._edad = edad
        

persona1 = Persona2 ('Javier', 'Reyes', 29)
print(persona1.edad) # Llamanos al método getter
persona1.nombre = 'juan Pedro' # Llamamos al método setter
print(persona1.nombre) # Otra vez el método getter
print(persona1.mostrar_detalles()) # Llamamos al método mostrar detalles