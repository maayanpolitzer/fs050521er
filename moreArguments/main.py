# add default value to an argument (in function definition) makes this argument as optional!


def func(x, y=8):
    return x + y

def say_hi(name="Default name value"):
    print(f"hi {name}")


def calculate_vat(price_with_vat, vat_value=0.17):
    return price_with_vat / (1 + vat_value)

def greetings(greet, name="Unkown person", age=30):
    print(f"{greet} {name} you are {age} years old!")

print(func(x=5, y=3))

#say_hi("Maayan")

#print(calculate_vat(100))
#print(calculate_vat(100, 0.18))

greetings("Have a good day", "Maayan")
# using arguments not in definition order ( as named arguments):
greetings(age=27, name="Moshiko", greet="Have a nice weekend")

greetings("welcome")
greetings("Happy birthday", age=50)
greetings("Hello")

# arbitrary arguments:
def avg(*numbers):
    i = 0
    while i < len(numbers):
        print(f"index {i}: value={numbers[i]}")
        i += 1

print("*****")
print(avg(5))
print(avg(5, 10))
print(avg(5, 10, 12))
print(avg(*[5,67,8,456,34,356,457,56,58,3456,345,234,234]))
