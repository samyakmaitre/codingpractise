class OperOverloadingDemo:
    def __init__(self,X):
        self.X = X

    def __add__ (self,other):
        print("The value of Obj1 =", self.X)
        print("The value of Obj2 =", other.X)
        print("The addition of two objects is:",end='')
        return ((self.X+other.X))
Obj1 = OperOverloadingDemo(20)
Obj2 = OperOverloadingDemo(30)
Obj3 = Obj1 + Obj2
print(Obj3)