T = int(input())

for _ in range(T):
    li = list(map(int, input().split()))

    HP = li[0] + li[4]
    MP = li[1] + li[5]
    AT = li[2] + li[6]
    DF = li[3] + li[7]

    if HP < 1:
        HP = 1
    if MP < 1:
        MP = 1
    if AT < 0:
        AT = 0

    CB = HP + 5 * MP + 2 * AT + 2 * DF

    print(CB)
