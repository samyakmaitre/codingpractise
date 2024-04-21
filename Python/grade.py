class GradeCalculator:
    GRADE_POINTS = {'A': 5.0, 'B': 4.0, 'C': 3.0, 'D': 2.0, 'E': 1.0, 'F': 0.0}

    def __init__(self):
        self.num_semesters = 0
        self.semester_data = []

    def take_input(self):
        self.num_semesters = int(input("Enter the number of semesters completed: "))
        for semester in range(1, self.num_semesters + 1):
            semester_marks_credits = []
            print(f"Semester {semester}:")
            for _ in range(5):
                marks = int(input(f"Enter marks for subject {_+1}: "))
                credits = int(input(f"Enter credits for subject {_+1}: "))
                semester_marks_credits.append((marks, credits))
            self.semester_data.append(semester_marks_credits)

    def calculate_gpa(self):
        gpa_list = []
        for semester_data in self.semester_data:
            total_grade_points = 0
            total_credits = 0
            for marks, credits in semester_data:
                grade_point = self.calculate_grade_point(marks)
                total_grade_points += grade_point * credits
                total_credits += credits
            semester_gpa = (total_grade_points / (total_credits * 5)) * 10
            gpa_list.append(semester_gpa)
        return gpa_list

    def calculate_grade_point(self, marks):
        if marks > 90:
            return self.GRADE_POINTS['A']
        elif marks > 80:
            return self.GRADE_POINTS['B']
        elif marks > 70:
            return self.GRADE_POINTS['C']
        elif marks > 60:
            return self.GRADE_POINTS['D']
        elif marks > 50:
            return self.GRADE_POINTS['E']
        else:
            return self.GRADE_POINTS['F']

    def calculate_cgpa(self, gpa_list):
        return sum(gpa_list) / len(gpa_list)

    def get_semester_gpa_cgpa(self, semester_num):
        if semester_num <= self.num_semesters:
            gpa_list = self.calculate_gpa()
            cgpa = self.calculate_cgpa(gpa_list[:semester_num])
            print(f"Semester {semester_num} GPA: {gpa_list[semester_num - 1]:.2f}")
            print(f"CGPA upto Semester {semester_num}: {cgpa:.2f}")
        else:
            print("Invalid semester number.")
calculator = GradeCalculator()
calculator.take_input()

semester_number = int(input("Enter the semester number to display GPA and CGPA: "))
calculator.get_semester_gpa_cgpa(semester_number)
