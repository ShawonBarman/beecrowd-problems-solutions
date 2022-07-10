code, items = map(int, input().split())

if code == 1:
    print("Total: R$ {:.2f}".format(4.0 * items))
elif code == 2:
    print("Total: R$ {:.2f}".format(4.5 * items))
elif code == 3:
    print("Total: R$ {:.2f}".format(5.0 * items))
elif code == 4:
    print("Total: R$ {:.2f}".format(2.0 * items))
elif code == 5:
    print("Total: R$ {:.2f}".format(1.5 * items))