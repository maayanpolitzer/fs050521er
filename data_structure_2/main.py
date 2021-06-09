from dog import Dog
# *************************
# LIST

print("******* LIST *******")

my_list = []    # empty list
my_full_list = [4, 7, 6, 7]  # list with 4 ints

print(my_full_list.count(7))
# get data from list => we will use index (starts from 0 and increment by 1)
print(my_full_list)  # prints 6

# add to the list:
my_list.append(3)
my_full_list[3] = "Oleg"

# print(4 in my_full_list)  # check if 4 is in the list (loop behind the scene) סיבוכיות = O(1)

print(my_full_list)

# determine the length of the list?
print(len(my_full_list))

# get the index from a value
print(my_full_list.index(4))

print("******* SET *******")
# *************************
# SET
# duplicates not allowed!
# not ordered by insert
# there is NO index!!!!
my_set = set()  # create empty set.
my_full_set = {"Maayan", "Irit", "Itay", "Ido"}
my_full_set_2 = {True, True, False, True}
i = 0

# add item to the set:
my_set.add("Ben")

print(my_set)

# for checking the type of the variable
print(type(my_set))

print(my_set.pop())  # removes the RANDOM value.

#my.set.clear()  # clears the set.

print("Irit" in my_full_set)  # ( not with loop ) סיבוכיות = O(1)


# for x in my_full_set:
#    print(x)

name = "m"
if name in my_full_set:
    my_full_set.remove(name)  # if i try to remove item that is not in the set => exception will be thrown(קריסה של התוכנה)

my_full_set.discard(name)  # not throwing exception(לא תקרה קריסה בכל מקרה)

print(my_full_set)

d1 = Dog("boni1")
d2 = Dog("boni2")

my_objects_set = {d1, d2}

print(len(my_objects_set))

# *************************
# TUPLE
print("******* TUPLE *******")


my_tuple = ("1", "2", "2", "2")  # tuple
weekdays = ("Sunday", "Monday", "...")
months = ("January", "")

# tuple is NOT changeable.
# it has indexes (ordered).

print(my_tuple[1])

# print(my_tuple.index("2"))

print(my_tuple.count("2"))

# *************************
# DICTIONARY
print("******* DICTIONARY *******")

# no index !
# ordered !
# no key duplicates!!!

# delete the old value if key updated...
# (key : value)
maayan = {
    "Address": "Tzur yitzhak",
    "age": 34,
    "birth_year": 1986
}

maayan["Address"] = "Tel aviv"

print(maayan)

d = {
    "a": ["apple", "action", "android"],
    "b": ["banana"],
    "c": ["circle"],
    "d": ["didi"],
    "e": {
        "a": "ea sports",
        "b": {
            "a"
        }
    }
}

# d["a"] = ["update"]
# d["bibi"] = True
# d[True] = False  # 0 is False, 1 is True
#
# d[3] = "Moshe"
# d["jlj"] = "Oleg"

n = "ro"
d[n] = n * 2
print(d)

# print(d.pop("b"))

#print(d["jkjkjkjkj"])   # crash(Exception)!!!  # סיבוכיות: O(1)
# print(d.get("jlj2"))



for key in d.keys():
     #print(f"{key}: {d[key]}")
    for s in d[key]:
        if "n" in s:
            # print(f"{key}: {s}")
            pass

# 1 - loop the dictionary

# 2 - get the value list from each key in the dictionary

# 3 - loop the list

# 4 - find the "n" in each string

print(8 // 5)