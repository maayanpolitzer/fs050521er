class Person:

    # constructor.
    def __init__(self, name):
        self.__person_name = name
        self.__grades = []

    # method / מתודה / שיטה
    def get_name(self):
        return self.__person_name

    def set_name(self, name):
        self.__person_name = name

    def print_person_details(self):
        # print("Person name is " + self.person_name)
        print(f"Person name is {self.__person_name}")

