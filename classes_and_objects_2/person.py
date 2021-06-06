class Person:

    # constructor.
    def __init__(self, name):
        self.__person_name = name
        self.__grades = []

    def set_id(self, id):
        self.__id = id

    # method / מתודה / שיטה
    def get_name(self):
        return self.__person_name

    def set_name(self, name):
        self.__person_name = name

    def print_person_details(self):
        # print("Person name is " + self.__person_name)
        print(f"Person name is {self.__person_name}")
        print(f"{self.__person_name} grades are: {self.__grades}")

    def add_grade(self, grade):
        self.__grades.append(grade)

    def get_grades(self):
        return self.__grades

    def get_average(self):
        i = 0
        sum = 0
        while i < len(self.__grades):
            sum += self.__grades[i]
            i += 1
        return sum / len(self.__grades)
