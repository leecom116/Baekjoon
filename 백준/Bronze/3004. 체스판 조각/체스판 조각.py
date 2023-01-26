#1 2 3 4 5  6  7
#2 4 6 9 12 16 20
# 같은 레벨이 2번 반복되고 1씩 증가하는 규칙

n = int(input())
sum = 2
level = 2
reset = 0

for i in range(n-1):
    sum += level
    reset += 1

    if reset == 2:
        reset = 0
        level += 1

print(sum)