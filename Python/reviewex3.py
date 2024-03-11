def check_duplicate(Lst):
    unique_elements = set()
    for elem in Lst:
        if elem in unique_elements:
            return True
        else:
            unique_elements.add(elem)
    return False

print(check_duplicate([4, 6, 2, 1, 6, 7, 4]))  # True
print(check_duplicate([1, 2, 3, 12, 4]))       # False
