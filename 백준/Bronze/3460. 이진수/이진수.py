T = int(input())

for _ in range(T):
    n = bin(int(input()))[2:]

    for i in range(len(n)):
        # 인덱스가 -일 경우, 뒤에서 부터 인덱스 탐색
        if n[-i-1] == '1':
            print(i, end=' ')

