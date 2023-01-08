a, b = map(int, input().split())
c, d = map(int, input().split())

li=[]

li.append(a / c + b / d)
li.append(c / d + a / b)
li.append(d / b + c / a)
li.append(b / a + d / c)

li_max= max(li)
print(li.index(li_max))

