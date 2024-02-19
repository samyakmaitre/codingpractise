p = float(input("Enter cost: "))
c = (float(input("Enter %CGST: "))/100)*p
s = (float(input("Enter %SGST: "))/100)*p
n = int(input("Enter no. of units: "))
amt = n*(p+c+s)
print("total amt is: ",amt)