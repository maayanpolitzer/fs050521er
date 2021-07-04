def distance(x, y):
    small, large = x, y
    if small > large:
        small, large = y, x
    result = 0
    while result + small < large:
        result += 1
    return result