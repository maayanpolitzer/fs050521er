from datetime import datetime


class FinanceAction:

    def __init__(self, name, amount):
        self.__name = name
        self.__amount = amount
        self.__created_at = datetime.now()

    def get_name(self):
        return self.__name

    def get_amount(self):
        return self.__amount

    def get_created_at(self):
        return self.__created_at
