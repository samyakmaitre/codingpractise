class Rectangle:
    length = 0
    breadth = 0
R1 = Rectangle()
print('Initial values of Attribute')
print('Length = ',R1.length)
#Access attribute length
print('Breadth = ',R1.breadth)
#Access attribute breadth
print('Area of Rectangle = ',R1.length * R1.breadth )
R1.length = 20 #Assign value to attribute length
R1.breadth = 30 #Assign value to attribute breadth
print('After reassigning the value of attributes')
print('Length = ',R1.length)
print('Breadth = ', R1.breadth )
print('Area of Rectangle is ', R1.length * R1.breadth)