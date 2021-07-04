# from vet import Vet
# from tkinter import *
#
# user_details = {
#     "name": "maayan",
#     "password": "123"
# }
#
# # vet = Vet("Dr. dulitel", 5)
#
# # vet.print_details()
# # vet.print_balance()
#
# def display_error(text):
#     error_label["text"] = text
#
# def login():
#     display_error("")
#     username = username_input.get()
#     password = password_input.get()
#     # input validation:
#     if len(username) == 0:
#         # import error
#         display_error("username is empty")
#         return
#     if len(password) == 0:
#         display_error("password is empty")
#         return
#     if username == user_details["name"] and password == user_details["password"]:
#         welcome_screen.destroy()
#         import mainscreen
#     else:
#         display_error("not such user")
#
# welcome_screen = Tk()
# welcome_screen.geometry("400x300")
# welcome_screen.title("Vet management system")
# Label(text="Username:").pack()
# username_input = Entry()
# username_input.pack()
# Label(text="Password:").pack()
# password_input = Entry(show="*")
# password_input.pack()
# error_label = Label()
# # fg => foreground - text color
# # bg => background - background color.
# error_label["fg"] = "#ff0000"
# error_label.pack()
# Button(welcome_screen, text="login", command=login).pack()
#
# welcome_screen.mainloop()
from customer import Customer
from customer_file import CustomersFile

c1 = Customer("Maayan Politzer", "052-7777777", "Fish", "Segoly")
CustomersFile().write_to_file(c1)