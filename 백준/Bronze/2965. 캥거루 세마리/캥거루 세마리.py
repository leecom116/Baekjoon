A, B, C = map(int, input().split())

if C-B > B-A:
    print(C-B-1)
else:
    print(B-A-1)