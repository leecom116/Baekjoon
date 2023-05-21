N, A, B = map(int, input().split())

'''
    N : 역까지 걸어 가는데 걸리는 시간
    A : 버스가 오는데 걸리는 시간
    B : 지하철이 오는데 걸리는 시간
'''

if A < B:
    print("Bus")
elif A > B:
    print("Subway")
else:
    print("Anything")