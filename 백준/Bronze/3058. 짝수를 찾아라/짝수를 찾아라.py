T = int(input())

for i in range(T):
    li = []
    sum = 0

    list = map(int, input().split())
    for n in list:
        if n % 2 == 0:
            sum += n
            li.append(n)

    li.sort()
    print(sum, li[0])

