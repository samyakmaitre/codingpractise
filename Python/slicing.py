word = "SAMYAK"
l = len(word)
r=0
new = ""
while r<=l-2:
    new = new + word[r+1] + word[r]
    r=r+2
if l%2!=0:
    new = new + word[-1]
print(new)