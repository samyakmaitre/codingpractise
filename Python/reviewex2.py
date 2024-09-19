def is_Lst_Palindrome(Lst):
    left = 0
    right = len(Lst) - 1

    while left < right:
        if Lst[left] != Lst[right]:
            return False  # If not equal, Lst is not a palindrome
        left += 1
        right -= 1

    return True
print(is_Lst_Palindrome([1, 3, 5, 5, 3, 1]))  # True
print(is_Lst_Palindrome([1, 2, 3, 4, 5]))     # False
print(is_Lst_Palindrome([1, 2, 3, 2, 1]))     # True
