i = 70
x = 67

# temp = i
# i = x
# x = temp

i,x = x, i

# print(i)
# print(x)


# if i > x:
#     print("1")
#     print("2")
#     print("3")
#     print("4")
# else:
#     print("5")
#
#
a = 4
#
# while a < 10:
#     print("sdfknsdf")
#     a = a + 300
# print("the loop has ended")


# the variables must be integers and greater than 0
x = 6
y = 3
# DONT use -
result = 0
# first solution:
# if x > y:
#     while y + result < x:
#         result = result + 1
# else:
#     while x + result < y:
#         result = result + 1

# Maayan solution:
small, large = x, y
if small > large:
    small, large = y, x
while small + result < large:
    result += 1
# print(result)

#print(x * y)
# 3 + 3 + 3 + 3 + 3 + 3 + 3 + 3 + 3 + 3 + 3 + 3 + 3 + 3 + 3 ... = 3000000   // 10000000 seconds.
# 1000000 + 1000000 + 1000000 = 3000000 // 10 seconds

x = 20000
y = 30000

multi = 1
k = 0
small, large = x, y
if small > large:
    small, large = y, x
while multi <= small:
    k += large
    multi += 1
print(k)

print(10 // 3) # without the //

print(10 % 3) # without the %






