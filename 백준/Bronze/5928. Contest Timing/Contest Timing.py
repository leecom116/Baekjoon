import sys
input = sys.stdin.readline

# 입력
D, H, M = map(int, input().split())

# 시간 계산
time = (D-11)*60*24 + (H-11)*60 + (M-11)
print(time if time >= 0 else -1)