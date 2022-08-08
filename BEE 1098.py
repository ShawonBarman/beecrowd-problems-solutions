i = 0
while(i <= 2):
    for j in range(1, 4):
        if (i == 0 or i == 1 or i >= 1.98):
            print("I={:.0f} J={:.0f}".format(i, j+i))
        else:
            print("I={:.1f} J={:.1f}".format(i, j+i))
    i += 0.2