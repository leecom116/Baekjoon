A, B, C, D = map(int, input().split())
delist = map(int, input().split())

for i in delist:
    attack = 0

    # 아침 시간 이후 부터 개가 짖는 시간에 속할 경우 
    if 0 < i % (A+B) <= A:
        attack += 1
    if 0 < i % (C+D) <= C:
        attack += 1

    print(attack)