from figuras3d import Figuras3D

class Cubo(Figuras3D):
    def __init__(self, arista):
        self.arista = arista
        
    def calcularVolumen(self):
        volumen = self.arista**3
        return volumen