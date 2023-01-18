try:
    n = int(input())

    if n == 0:
        print('divide by zero')

    arr = map(int, input().split())

    ave = 0
    gi = 0
    for i in arr:
        # 평균
        ave += i

        # 기댓값
        temp = i * (1 / n)
        gi += temp

    ave /= n

    if gi == 0:
        print('divide by zero')
    else:
        result = ave / gi
        print("{:.2f}".format(result))
except EOFError:
    exit()
