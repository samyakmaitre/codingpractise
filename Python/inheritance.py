class A: #base class
    i = 0
    j = 0
    def Showij (self):
        print('i = ',self.i,'j = ',self.j)
    class B(A) : #Class B inherits attributes and methods of class A
        k = 0
