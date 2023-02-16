fh, fm, fs = map(int, input().split(':'))
lh, lm, ls = map(int, input().split(':'))
fsum = fh*60*60 + fm*60 + fs
lsum = lh*60*60 + lm*60 + ls
sum = lsum - fsum if lsum > fsum else lsum - fsum + 24 * 60 * 60
h = sum // 60 // 60
m = sum // 60 % 60
s = sum % 60
print("%02d:%02d:%02d" % (h, m, s))