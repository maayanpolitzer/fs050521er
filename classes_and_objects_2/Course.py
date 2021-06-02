from person import Person


class Course:

    def __init__(self, name):
        self.__course_name = name
        self.__students = []

    def add_student(self, new_student):
        if len(new_student.get_name()) > 0:
            self.__students.append(new_student)

    def create_new_student_for_course(self, name):
        self.add_student(Person(name))  # DRY

    # delete all students with this name.
    # return True if a student was deleted, False if not.
    def delete_student(self, name):
        i = 0
        while i < len(self.__students):
            if self.__students[i].get_name() == name:
                self.__students.pop(i)
            else:
                i += 1
        # new_list = []
        # for student in self.__students:
        #     if student.get_name() != name:
        #         new_list.append(student)
        # self.__students = new_list

    def add_group(self, students):
        for s in students:
            self.add_student(s)  # DRY

    def __len__(self):
        return len(self.__students)

    def print_course_details(self):
        print(f"Course name is: {self.__course_name}")
        for student in self.__students:
            student.print_person_details()
