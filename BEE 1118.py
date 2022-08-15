while(True):
    sum = 0
    cnt = 0

    while(cnt != 2):
        num = float(input())
        if (num >= 0 and num <= 10):
            sum += num
            cnt += 1
        else:
            print("nota invalida")

    print("media = {:.2f}".format(sum / cnt))
    newNum = 0
    while(True):
        print("novo calculo (1-sim 2-nao)")
        newNum = int(input())
        if (newNum == 1 or newNum == 2):
            break

    if (newNum == 2):
        break