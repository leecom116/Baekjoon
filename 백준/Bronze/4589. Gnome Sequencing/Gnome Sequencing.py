num = int(input())
    
print("Gnomes:")
for i in range(num):
    a, b, c = map(int, input().split())
    li = []; li.append(a); li.append(b); li.append(c);
    
    if sorted(li, reverse=True) == li or sorted(li, reverse=False) == li:
        print("Ordered")
    else:
        print("Unordered")