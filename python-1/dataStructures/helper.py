while True:
    new_username = input("Enter your name:")
    if len(new_username) > 3:
        students.append(new_username)
        break
    print("Your name is NOT OK!!!!! please write it again....")


def print_my_name(x):
    print("hello " + x)


print_my_name("Oleg")


# This code is ugly!!!
while True:
    name = input("Your name (or exit):")
    if name == "exit":
        break
    r = 0
    name_is_free = True
    while r < len(students):
        if students[r] == name:
            name_is_free = False
            print("This name is already taken")
            break
        r += 1
    if name_is_free:
        students.append(name)
        print(name + " added successfully")

print(students)
print("********")
# print every name in the list in new line:



# print(students)
# num_of_students = len(students)
# print(num_of_students)
#
# print("*******")
#
# print(my_animals)
# num_of_animals = len(my_animals)
# print(num_of_animals)


# REVERSE A LIST: students.reverse()
# i = 0
# tempList = []
# while i < len(students):
#     tempList.insert(0, students[i])
#     i += 1
# students = tempList



# i = 0
# while i < len(students):
#     if students[i] == "Adam":
#         students.pop(i)
#         continue
#     i += 1

#students.remove("Adam")

#students.clear()
