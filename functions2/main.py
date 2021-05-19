def first(text, n):
    x = 0
    result = ""
    while x < n:
        result += text
        x += 1
    return result


# print(first("Hello", 5))  # "HelloHelloHelloHelloHello"
# print(first("o", 3))  # "ooo"

# a1 = 4-2
# a2 = first("Yes", a1)
# print(a2)

# print(first("Yes", (4-2)))

def second(first, second):
    return first > second


#print(second(45, 23))

#print(second(50, 7))  # False

def third(x,y,z):
    # result = 0
    # if x % 2 == 0:
    #     result += x
    # if y % 2 == 0:
    #     result += y
    # if z % 2 == 0:
    #     result += z
    return helperToThird(x) + helperToThird(y) + helperToThird(z)

def helperToThird(number):
    if number % 2 == 0:
        return number
    return 0

# what is the sum of the even numbers.
#print(third(1,2,3)) # 2
#print(third(2,6,1)) # 8
#print(third(8,8,8)) # 24


def average(x,y):
    return (x + y) / 2

#print(average(90,70)) # 80

# return the sum of the arguments but don't add the number 7 and one param to the right
print(notSevenOrAfterSeven(5,8,12)) # 25
print(notSevenOrAfterSeven(5,7,12)) # 5
print(notSevenOrAfterSeven(7,8,2)) # 2
print(notSevenOrAfterSeven(1,8,7)) # 9

