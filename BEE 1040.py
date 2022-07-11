n1, n2, n3, n4 = map(float, input().split(" "))

avg = ((n1 * 2) + (n2 * 3) + (n3 * 4) + (n4 * 1)) / (2 + 3 + 4 + 1)

print("Media: {:.1f}".format(avg))

if (avg >= 7):
    print("Aluno aprovado.")
elif (avg < 5):
    print("Aluno reprovado.")
else:
    print("Aluno em exame.")
    score = float(input())
    print("Nota do exame: {:.1f}".format(score))
    new_avg = (avg + score) / 2
    if (new_avg >= 5):
        print("Aluno aprovado.")
    else:
        print("Aluno reprovado.")
    print("Media final: {:.1f}".format(new_avg))