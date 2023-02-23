T = int(input())

for n in range(1, T+1):

    glist = list(map(int, input().split()))
    gsum = glist[0] + glist[1] * 2 + glist[2] * 3 + glist[3] * 3 + \
            glist[4] * 4 + glist[5] * 10


    slist = list(map(int, input().split()))
    ssum = slist[0] + slist[1] * 2 + slist[2] * 2 + slist[3] * 2 + \
           slist[4] * 3 + slist[5] * 5 + slist[6] * 10


    if gsum > ssum:
        print('Battle %d: Good triumphs over Evil' %n)
    elif gsum < ssum:
        print('Battle %d: Evil eradicates all trace of Good' %n)
    else:
        print('Battle %d: No victor on this battle field' %n)