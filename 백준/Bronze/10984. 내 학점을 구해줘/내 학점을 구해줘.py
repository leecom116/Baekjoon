T = int(input())

for _ in range(T):
    N = int(input())
    HAK = 0
    GPA = 0.0
    for _ in range(N):
        C, G = map(float, input().split())

        HAK += C
        GPA += C * G

    print("%d %.1f" %(HAK, GPA/HAK))

