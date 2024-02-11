def transform_string(s):
    result = ""
    for i in range(len(s)):
        if i % 2 == 0:  # even position
            result += s[i].lower()
        else:  # odd position
            result += s[i].upper()
    return result

user_input = input("Enter a string: ")
transformed_string = transform_string(user_input)
print("Transformed string:", transformed_string)
