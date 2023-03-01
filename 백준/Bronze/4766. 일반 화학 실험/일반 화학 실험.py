li = []

while True:
    a = float(input())

    if a == 999:
        break

    li.append(a)

for i in range(len(li)-1):
    print("%.2f" %(li[i+1] - li[i]))

