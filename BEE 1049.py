a = input()

if a == "vertebrado":
    b = input()
    if b =="ave":
        c = input()
        if c =="carnivoro":
            print("aguia")
        elif c == "onivoro":
            print("pomba")

    elif b == "mamifero":
        c = input()
        if c == "onivoro":
            print("homem")
        elif c == "herbivoro":
            print("vaca")

elif a == "invertebrado":
    b = input()
    if b == "inseto":
        c = input()
        if c == "hematofago":
            print("pulga")
        elif c == "herbivoro":
            print("lagarta")
    elif b == "anelideo":
        c = input()
        if c == "hematofago":
            print("sanguessuga")
        elif c == "onivoro":
            print("minhoca")