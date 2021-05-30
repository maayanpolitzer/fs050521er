class Animal:
    def __init__(self, name):
        self._name = name
        print("created")

    def say_hello(self):
        print(f"Hello, i am {self._name}")