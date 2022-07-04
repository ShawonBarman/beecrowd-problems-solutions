num = int(input())

hour = int(num / 3600)
minute = int((num % 3600) / 60)
second = (num % 3600) % 60

print(f"{hour}:{minute}:{second}")