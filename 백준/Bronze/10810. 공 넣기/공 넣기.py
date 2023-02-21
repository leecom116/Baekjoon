N, M = map(int, input().split())

arr = []
for i in range(N+1):
    arr.append(0)

for _ in range(M):
    i, j, k = map(int, input().split())

    for a in range(i, j+1):
        arr[a] = k

for i in range(1, len(arr)):
    print(arr[i], end=' ')

