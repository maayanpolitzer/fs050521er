def distance(x,y):
    small, large = x, y
    if small > large:
       small, large = y,x
    result = 0
    while small + result < large:
        result += 1
    return result