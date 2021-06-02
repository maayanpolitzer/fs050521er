import functions
import tkinter
from animal import Animal

# button_text = "submit"
#
# def x():
#     button["text"] = "Thanks!"

# m = tkinter.Tk()
# m.geometry('400x400')
# m.title('Title')
# button = tkinter.Button(m, text=button_text, command=x)
# button.pack()
#
# m.mainloop()

a = Animal("simba")
print(a.say_hello())
print(len(a))