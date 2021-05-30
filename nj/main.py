from animal import Animal
from helper import distance
import math
import wow.s

print("""multi
line \"wow\"
string""")

str = "Maayan"
print(str[0])
print(len(str))
for char in str:
    print(char)

txt = "The best things in life are free!"
print("free" in txt)

print(txt[2:5])
print(txt[:5])
print(txt[2:])

a = "Maayan"
print(a.upper())
print(a.lower())

lion = Animal("Moshe")
lion.say_hello()

l2 = Animal("Eli")
l2.say_hello()

print(l2._name)



lions = [lion, l2]
for x in lions:
    x.say_hello()

print(math.floor(3.3))
print(math.ceil(3.3))

print(helper.distance(5, 90))

