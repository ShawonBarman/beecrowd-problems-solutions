grenais = 0
inter = 0
gremio = 0
empates = 0

while(True):
    i, g = map(int, input().split(" "))
    grenais += 1
    if (i > g):
        inter += 1
    elif (i < g):
        gremio += 1
    else:
        empates += 1
    print("Novo grenal (1-sim 2-nao)")
    num = int(input())
    if (num == 2):
        break

print("%d grenais" % grenais)
print("Inter:%d" % inter)
print("Gremio:%d" % gremio)
print("Empates:%d" % empates)

if (inter > gremio):
    print("Inter venceu mais")
elif (inter < gremio):
    print("Gremio venceu mais")
else:
    print("Nao houve vencedor")