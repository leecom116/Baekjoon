n = int(input())

for _ in range(n):
    c, v = map(int, input().split())

    print('You get %d piece(s) and your dad gets %d piece(s).' %(c//v, c%v))