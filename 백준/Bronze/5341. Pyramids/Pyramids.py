
while True:
    i = int(input())
    sum = 0
    if i == 0:
        break

    for i in range(1, i+1):
        sum += i

    print(sum)