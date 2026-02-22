from figuras3d import Figuras3D

class Prisma(Figuras3D):
    def __init__(self, largo, ancho, alto):
        self.largo = largo
        self.ancho = ancho
        self.alto = alto
        
    def calcularVolumen(self):
        volumen = self.largo * self.ancho * self.largo
        return volumen