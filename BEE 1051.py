num = float(input())

if (num >= 0 and num <= 2000):
    print("Isento")
elif (num > 2000 and num <= 3000):
    ans = (num - 2000) * (8.0 / 100)
    print("R$ {:.2f}".format(ans))
elif (num > 3000 and num <= 4500):
    ans = (1000 * (8.0 / 100)) + ((num - 3000) * (18.0 / 100))
    print("R$ {:.2f}".format(ans))
else:
    ans = (1000 * (8.0 / 100)) + (1500 * (18.0 / 100)) + ((num - 4500) * (28.0 / 100))
    print("R$ {:.2f}".format(ans))