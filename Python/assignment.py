def grade_points(marks):
    if marks > 90:
        return 5
    elif marks > 80:
        return 4
    elif marks > 70:
        return 3
    elif marks > 60:
        return 2
    elif marks >= 50:
        return 1
    else:
        return 0

def sem_gpa(marks_credits):
    total_credits = sum(credits for _, credits in marks_credits)
    grade_points = sum(grade_points(marks) * credits for marks, credits in marks_credits)
    return grade_points / total_credits

def calculate_cgpa(semester_data, semester):
    cgpa = sum(sem_gpa(semester_data[i]) for i in range(semester)) / semester
    return cgpa

def main():
    num_semesters = int(input("Enter the number of semesters: "))
    semester_data = []

    for sem in range(1, num_semesters + 1):
        print(f"\nSemester {sem}:")
        marks_credits = []
        for subj in range(1, 6):
            marks = int(input(f"Enter marks for Subject {subj}: "))
            credits = int(input(f"Enter credits for Subject {subj}: "))
            marks_credits.append((marks, credits))
        semester_data.append(marks_credits)

    target_semester = int(input("\nEnter the semester number to calculate CGPA up to: "))
    if target_semester > num_semesters:
        print("Invalid semester number")
    else:
        cgpa = calculate_cgpa(semester_data, target_semester)
        print(f"\nCGPA up to Semester {target_semester}: {cgpa:.2f}")

if __name__ == "__main__":
    main()
