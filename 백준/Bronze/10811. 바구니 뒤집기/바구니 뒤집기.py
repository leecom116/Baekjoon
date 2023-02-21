N, M = map(int, input().split())

li = []

for i in range(N+1):
    li.append(i)

for _ in range(M):
    i, j = map(int, input().split())
    li2 = []

    for a in range(j, i-1, -1):
        li2.append(li[a])

    index = 0
    for b in range(i, j+1):
        li[b] = li2[index]
        index += 1

for i in range(1, len(li)):
    print(li[i], end=' ')

