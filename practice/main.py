# in a LIST:
# every item/value has an index.
# index is a number from 0, and increment by 1 every next item.
# length => len(THE_LIST_NAME)
       #        0 1 2 3  4  5
morningHoursList = [6,7,8,9,10,11] # בוקר טוב
noonHoursList = [12,13,14,15,16,17,18] # צהריים טובים
eveningHoursList = [19,20,21] # ערב טוב
nightHoursList = [22,23,0,1,2,3,4,5] # לילה טוב



def get_greeting_from_hour(hour):
    if is_hour_in_list(morningHoursList, hour):
        return "בוקר טוב"
    elif is_hour_in_list(noonHoursList, hour):
        return "צהריים טובים"
    elif is_hour_in_list(eveningHoursList, hour):
        return "ערב טוב"
    elif is_hour_in_list(nightHoursList, hour):
        return "לילה טוב"
    else:
        return "איזה כיף שחזרת"
    # index = 0
    # while index < len(morningHours):
    #     if hour == morningHours[index]:
    #         return "בוקר טוב"
    #     index += 1
    # index = 0
    # while index < len(noonHours):
    #     if hour == noonHours[index]:
    #         return "צהריים טובים"
    #     index += 1
    # index = 0
    # while index < len(eveningHours):
    #     if hour == eveningHours[index]:
    #         return "ערב טוב"
    #     index += 1
    # index = 0
    # while index < len(nightHours):
    #     if hour == nightHours[index]:
    #         return "לילה טוב"
    #     index += 1
    # return "איזה כיף שחזרת"

def is_hour_in_list(list, hour):
    index = 0
    while index < len(list):
        if hour == list[index]:
            return True
        index += 1
    return False

name = "מעין פוליצר"
hour_as_string = input("please enter the hour (0 to 24):")
# transform string("13") to int (13)
hour = int(hour_as_string)
greeting = get_greeting_from_hour(hour)
print(greeting + " " + name)
