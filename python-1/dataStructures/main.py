# List:
# index:     0    1    2    3    4
#students = ["A", "B", "C", "D", "E"]  # len(students) = 5

#print(students)

# WHILE LOOP:
# i = 0
# list_length = len(students)
# while i < list_length:
#     stu = students[i]
#     print(stu)
#     i += 1

# FOR IN LOOP: without using the list indexes, from start to end!!!
#for stu in students:
#    print(stu)

list = [2, 20, 2, 100]

def howManyOfNumber(x):
    times = 0
    # for number in list:
    #     if number == x:
    #         times += 1
    i = 0
    while i < len(list):
        if list[i] == x:
            times += 1
        i += 1
    return times

#print(howManyOfNumber(2))
list = [7,3,3,2,2,3,5,0]
# returns True if there is a value of 2 next to another 2. else return False.
def is2nextTo2():
    i = 0
    while i < len(list) - 1:
        if list[i] == 2:
            if list[i+1] == 2:
                return True
            else:
                i += 2
        else:
            i += 1
    return False


print(is2nextTo2())

list = [10, 2, 90, 7]
# returns the average of the lowest number and highest number in the list.
def average_of_min_and_max():
    return (2 + 90) / 2

print(average_of_min_and_max())

# return True if there is an even number in the list. else return False.
def is_there_even_number():
    return True

print(is_there_even_number())
#         0 1 2 3
list1 =  [3,6,2,9]
#         0 1 2
list2 =  [3,6,1]

# return the number of times that the two list has the same number at the same index.
def sameValues():
    return 2

print(sameValues())
