# return True if the number is between 0 to 10 and b is True.
# return True if the number is greater then 10 and b is False.
# otherwise return False.

# def x(number, b):
#     if number >= 0 and number <= 10 and b:  # (b == True)
#         return True
#     if number > 10 and not b:    # (b == False)
#         return True
#     return False
#
# x(5, False)

i = 0
while i < 100:
    if i % 2 == 0:
        print("grey")
    else:
        print("yellow")
    i += 1

# print(7 % 3) # 1
# print(7 % 4) # 3
# print(7 % 8) # 7
# print(7 % 7) # 0
# print(7 % 1) # 0
# print(7934659369392 % 2) # 0
# print(839485733 % 2) # 1




def v(number):
    return number % 10 == 0


    # SECOND WAY:
    # if number % 10 == 0:
    #     return True
    # return False

    # FIRST WAY:
    # if number % 10 == 0:
    #     return True
    # else:
    #     return False


print(v(6))    # False
print(v(10))   # True
print(v(60))   # True
print(v(99))   # False
print(v(100))   # True
print(v(3455670))   # True
print(v(3455671))  # False


# return the sum of then three variables, but if at least one of them is less then 18 return 4.
def k(a1,a2,a3):
    if a1 < 18 or a2 < 18 or a3 < 18:
        return 4
    return a1 + a2 + a3


print(k(5,89,12))
print(k(50,89,120))
print(k(50,8,102))
print(k(1,1,1))
print(k(5,89,10002))
print(k(500,89,102))
print(k(50,89,1))



def get_greeting_from_hour(hour):
    if hour >= 6 and hour <= 11:
        return "בוקר טוב"
    elif hour >= 12 and hour <= 15:
        return "צהריים טובים"
    elif hour >= 16 and hour <= 18:
        return "אחר הצהריים נעימים"
    elif hour >= 19 and hour <= 20:
        return "ערב טוב"
    else:
        return "לילה טוב"