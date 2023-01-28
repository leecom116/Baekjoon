import math

# 성냥의 개수 N, 박스의 가로 크기 W, 세로 크기 H
N, W, H = map(int, input().split())

# pow() : 지수(제곱) W**2
# sqrt() : 제곱근
max = math.sqrt(math.pow(W, 2) + math.pow(H, 2))

for i in range(N):
    match = int(input())

    if match <= max:
        print('DA')
    else:
        print('NE')