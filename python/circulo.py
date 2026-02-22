import math
from figuras2d import Figuras2D

class Circulo(Figuras2D):
    def __init__(self, radio):
        self.radio = radio
        
    def calcularArea(self):
        area = (math.pi * (self.radio)**2)
        return area