import tkinter

# to make this project executable (exe) install: PyInstaller

def action():
    input_value = input.get()
    # l.config(text=input_value)
    tkinter.Label(text=input_value).pack()
    input.delete(0, len(input_value))

screen = tkinter.Tk(className="My first gui app")
tkinter.Label(text="My first label").pack()
l = tkinter.Label(screen, text="Welcome Guest")

l.pack()

input = tkinter.Entry()
input.pack()

tkinter.Button(text="Click me", command=action).pack()

screen.geometry("400x200")
screen.mainloop()

