# 세븐25의 삼각 김밥 가격정보
x, y = map(int, input().split())
sum1 = (x / y) * 1000

n = int(input()) # 다른 편의점의 개수

for i in range(n):
    a, b = map(int, input().split())
    sum2 = (a / b) * 1000

    sum1 = min(sum1, sum2)

print(round(sum1, 2))