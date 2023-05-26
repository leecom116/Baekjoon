li1 = [int(input()) for _ in range(3)]
li2 = [int(input()) for _ in range(3)]
A = li1[0]*3 + li1[1]*2 + li1[2]
B = li2[0]*3 + li2[1]*2 + li2[2]
if A == B:
    print("T")
elif A > B:
    print("A")
else:
    print("B")