while(True):
    x = int(input())
    if (x == 0):
        break
    else:
        for i in range(1, x):
            print(i, end=" ")
        print(x)