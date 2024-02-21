sales = int(input("Enter sales: "))

if sales >= 100000:
    basic = int(4000)
    convey = int(500)
    bonus = int(1000)
    hra = 0.2 * basic
    da = 1.1 * basic
    incent = 0.1 * sales

    salary = float(basic + convey + bonus + hra + da + incent)

    print("basic: " + str(basic) + "\n" + "convey: " + str(convey) + "\n" + "bonus: " + str(bonus) + "\n" + "hra: " + str(hra) + "\n" + "da: " + str(da) + "\n" + "incent: " + str(incent) + "\n" + "salary: " + str(salary) + "\n")

else:
    basic = int(4000)
    convey = int(500)
    bonus = int(500)
    hra = 0.1 * basic
    da = 1.1 * basic
    incent = 0.04 * sales

    salary = float(basic + convey + bonus + hra + da + incent)

    print("basic: " + str(basic) + "\n" + "convey: " + str(convey) + "\n" + "bonus: " + str(bonus) + "\n" + "hra: " + str(hra) + "\n" + "da: " + str(da) + "\n" + "incent: " + str(incent) + "\n" + "salary: " + str(salary) + "\n")
