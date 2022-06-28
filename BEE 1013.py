import  math
a, b, c = map(int, input().split())
maiorAB = (a+b+abs(a-b))/2
greatest_number = (int(maiorAB)+c+abs(maiorAB-c))/2
print("{} eh o maior".format(int(greatest_number)))