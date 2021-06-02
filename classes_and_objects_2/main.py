from Course import Course
from person import Person

p1 = Person("")  # constructor/בנאי

c = Course("Flutter")

c.add_student(p1)
c.add_student(Person("Yossi"))
c.create_new_student_for_course("")
c.add_group([Person("Yossi"), Person("Eli"), Person("")])

print(len(c))

c.delete_student("Yossi")

print(len(c))

c.print_course_details()










