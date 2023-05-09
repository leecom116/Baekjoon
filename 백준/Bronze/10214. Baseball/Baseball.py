T = int(input())

for _ in range(T):

    YS = KS = 0

    for _ in range(9):
        Y, K = map(int, input().split())

        YS += Y
        KS += K

    if YS > KS:
        print( "Yonsei")
    elif KS < YS:
        print("Korea")
    else:
        print("Draw")
    