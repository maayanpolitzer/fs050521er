from animal import Animal

a1 = Animal()
a1.name = "Rex"
#print(a1.name)

a2 = Animal()
a2.name = "Roky"
#print(a2.name)
#          0    1    2          3
animals = [a1, a2, Animal(), Animal()]

number = 0
while number < 400:
    animals.append(Animal())
    number += 1

index = 0
while index < len(animals):
    print(str(index) + ": " + animals[index].name)
    index += 1

# the same as while:
# for a in animals:
#     print(a.name)




