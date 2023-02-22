while True:
    a, b = map(int, input().split())

    if a == 0 and b == 0:
        break

    tA = str(a)
    tB = str(b)

    tSize = max(len(tA), len(tB)) - min(len(tA), len(tB))

    for _ in range(tSize):
        if len(tA) > len(tB):
            tB = '0' + tB
        elif len(tA) < len(tB):
            tA = '0' + tA

    carry = 0
    count = 0

    for i in range(len(tA)-1, -1, -1):
        carry = len(str(int(tA[i]) + int(tB[i]) + carry)) -1

        if carry == 1:
            count += 1

    print(count)