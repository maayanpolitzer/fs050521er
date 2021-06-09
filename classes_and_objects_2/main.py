from course import Course
from person import Person


c = Course("Flutter")  # constructor/בנאי

c.add_student(Person("Oleg"))
c.add_student(Person("Irit"))
c.add_student(Person("Itay"))
c.add_student(Person("Ido"))
c.add_student(Person("Bree"))
c.add_student(Person("Segoli"))

# c.create_new_student_for_course("Ido")
# c.add_group([Person("Bree"), Person("Segoli")])

# print(len(c))

c.delete_student("Yossi")

c.cancel_lesson()

# print(len(c))

# c.print_course_details()

# להכניס לכל תלמיד את הציון המתאים לו (grades)
c.make_test([80, 100, 75, 50, 40, 80])
c.make_test([40, 60, 50, 46, 41, 64])

# only for testing!!!
# c.get_students()[5].print_person_details()
# להחזיר את שם התלמיד הטוב ביותר לפי ממוצע הציונים שלו
print(c.get_best_student_name())

# add to the first(0) test 25 points for all students, but 100 is the MAX!
#c.make_factor(0, 25)

#print(c.get_best_student_name())











