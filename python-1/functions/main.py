# function definition:
def print_your_name(name):
    print("welcome " + name)


# this command will execute a function.
#username = input("Please enter your name:")
#print_your_name(username)

# function can:
# 1. execute whenever we want. after it was defined.
# 2. to get some data inside.
# 3. return some data.

def getSpaceBetweenTwoNumbers(x,y):
    small, large = x, y
    if small > large:
        small, large = y, x
    result = 0
    while result + small < large:
        result += 1
    return result


x = 400
i = 0
while i < x:
    k = getSpaceBetweenTwoNumbers(i, x)
#   print(k)
    i += 1
    x -= 1

def sendSmsToClass(className, content):
    # loop over all students.
    # get each student phone number.
    # send sms to each phone.
    sendSmsToNumber("052......", content)

def sendSmsToNumber(phone, content):
    print("sms with content: " + content + " =>sent successfully to " + phone + "!")


#sendSmsToClass("fs050521er", "Maayan is sick, the lecture is canceled")

myAge = 34
goInElevatorAloneAge = 14

if myAge > goInElevatorAloneAge:
    print("You can enter alone")
elif myAge == goInElevatorAloneAge:
    print("HOO HOO welcome there is a balloon for your first ride!!!")
else:
    print("Please enter with an adult")

myCondition = myAge > goInElevatorAloneAge

if myCondition:
    print("Always will enter")