import functions # the file that we want to import.
from multiple_functions import sum, multiply

import math

first_number = 50
second_number_as_string = 40
# casting (transforming string to int).
second_number = int(second_number_as_string)

x = functions.distance(first_number, second_number)
#print(x)

y = multiply(first_number, second_number)
#print(y)

number = 4.425368734
print(round(number))
print(round(number, 2))

print(math.ceil(number))
