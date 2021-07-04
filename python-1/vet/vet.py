from finance_action import FinanceAction


class Vet:

    def __init__(self, name, maximum_beds):
        self.__name = name
        self.__max_beds = maximum_beds
        self.__customers = []
        self.__beds = []
        self.__finance = {
            "income": [],
            "outcome": []
        }
        # self.add_finance_action(False, "crm software", 7500.00)
        # self.add_finance_action(True, "money from israel", 20000.00)
        the_file = open("finance_d2.txt", "r")  # r => read
        rows = the_file.readlines()


    def print_details(self):
        print(self.__name)

    def print_balance(self):
        balance = 0
        for income in self.__finance["income"]:
            balance += income.get_amount()
        for outcome in self.__finance["outcome"]:
            balance -= outcome.get_amount()
        # print("The vet: " + self.__name + " balance is " + str(balance))
        print(f"The vet: {self.__name} balance is {balance}")

    def add_finance_action(self, is_income, name, amount):
        if is_income:
            type = "income"
        else:
            type = "outcome"
        action = FinanceAction(name, amount)
        self.__finance[type].append(action)
        finance_file = open("finance_d2.txt", "a")  # a => append
        finance_file.writelines([f"{type},{name},{amount},{action.get_created_at()}\n"])
