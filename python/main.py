from circulo import Circulo
from cuadrado import Cuadrado
from cubo import Cubo
from prisma import Prisma

circle = Circulo(4)
square = Cuadrado(8)

cube = Cubo(6)
prism = Prisma(5, 3, 8)

print("----- Figuras 2D-----")
print("Área del circulo:", circle.calcularArea())
print("Área del cuadrado:", square.calcularArea())
print("----- Figuras 3D-----")
print("Área del cubo:", cube.calcularVolumen())
print("Área del prisma:", prism.calcularVolumen())