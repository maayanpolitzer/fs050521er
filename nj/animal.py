class Animal:
    def __init__(self, name):
        self.__name = name
        print("created")

    def say_hello(self):
        print(f"Hello, i am {self.__name}")

    def __len__(self):
        return len(self.__name)
