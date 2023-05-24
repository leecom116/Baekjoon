T = int(input())

for _ in range(T):
    a, b = map(int, input().split())

    print("%d %d" %(b*2-a, a-b))