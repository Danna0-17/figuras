from figuras2d import Figuras2D

class Cuadrado(Figuras2D):
    def __init__(self, lado):
        self.lado = lado
        
    def calcularArea(self):
        area = self.lado**2
        return area