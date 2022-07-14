x, y, z = map(float, input().split(" "))

if (x + y > z and y + z > x and x + z > y):
    print("Perimetro = {:.1f}".format(x + y + z))
else:
    print("Area = {:.1f}".format((1.0/2) * (x + y) * z))