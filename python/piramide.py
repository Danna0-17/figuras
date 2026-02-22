from figuras3d import Figuras3D

class Piramide(Figuras3D):
    def __init__(self, base, altura):
        self.base = base
        self.altura = altura
        
    def calcularVolumen(self):
        areaBase = self.base**2
        volumen = (areaBase * self.altura)/3
        return volumen