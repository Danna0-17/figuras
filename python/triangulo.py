from figuras2d import Figuras2D

class Triangulo(Figuras2D):
    def __init__(self, base, altura):
        self.base = base
        self.altura = altura
        
    def calcularArea(self):
        area = (self.base * self.altura)/2
        return area
        