t = (1,3,2,4,6,5)
l = list(t)
for i in range(0,4):
    if i%2==0 :
        l.pop(l[i])
    i += 1
    
print(l)