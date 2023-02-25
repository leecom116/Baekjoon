t = int(input())

for _ in range(t):
    n = int(input())
    vs = 0
    for _ in range(n):
        a, b = input().split()

        if a == 'R':
            if b == 'P':
                vs += 1
            elif b == 'S':
                vs -= 1
        if a == 'P':
            if b == 'R':
                vs -= 1
            elif b == 'S':
                vs += 1
        if a == 'S':
            if b == 'P':
                vs -= 1
            elif b == 'R':
                vs += 1

    if vs < 0:
        print('Player 1')
    elif vs > 0:
        print('Player 2')
    else:
        print('TIE')