n = int(input())

for i in range(n):
    li = map(float, input().split())
    sum = 1

    for j in li:
        sum *= j
    # format 함수 "{형식 정의}" (인덱스 번호로 접근, 변수명으로 접근)
    print("${0:0.2f}".format(sum))