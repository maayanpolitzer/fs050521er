name = "Maayan"
age = 34
children = ["Itay", "Ido"]

name2 = "Oleg"
age2 = 29
children2 = ["Aharon", "Daria"]

names = ["Ron", "Or", "Awny"]

people = [
    ["Maayan", 34, ["Itay", "Ido"], ""],
    ["Oleg", 29, ["Aharon", "Daria"], ""],
    []
]

people[0][2].append("Moshe")
print(people)

# don't copy yet...

#object oriented programming => תכנות מונחה עצמים
# מופע
# Object
# אוביקט
# instance

# we will create objects from classes:
#מחלקה

# start copy from here!


# define class:
class Vehicle:
    wheels = 4
    color = "white"
    km = 0
    doors = 4
    fuel_tank_capacity = 50

v = Vehicle()

maayans_car = Vehicle() # define object.
print("maayan")
print(maayans_car)
print(maayans_car.fuel_tank_capacity)

olegs_car = Vehicle()
print("oleg")
print(olegs_car)
print(olegs_car.fuel_tank_capacity)

print(maayans_car == olegs_car)

#maayans_car.set_color("Grey")
#maayans_car.set_wheels(4)
