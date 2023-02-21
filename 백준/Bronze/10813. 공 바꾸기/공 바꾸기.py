N, M = map(int, input().split())

li = []

for i in range(N+1):
    li.append(i)

for _ in range(M):
    i, j = map(int, input().split())

    temp = li[i]
    li[i] = li[j]
    li[j] = temp

for i in range(1, len(li)):
    print(li[i], end=' ')
