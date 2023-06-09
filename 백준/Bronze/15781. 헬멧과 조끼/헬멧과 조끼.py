N, M = map(int, input().split())

hel = sorted(list(map(int, input().split())), reverse=True)
dep = sorted(list(map(int, input().split())), reverse=True)

print(hel[0] + dep[0])