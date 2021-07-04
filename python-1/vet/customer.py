class Customer:

    def __init__(self, name, phone, pet_type, pet_name):
        self.__name = name
        self.__phone = phone
        self.__pet_type = pet_type
        self.__pet_name = pet_name

    def get_name(self):
        return self.__name

    def get_phone(self):
        return self.__phone

    def get_pet_type(self):
        return self.__pet_type

    def get_pet_name(self):
        return self.__pet_name

    def set_phone(self, new_phone):
        self.__phone = new_phone

    def get_dictionary(self):
        return {
            "name": self.get_name(),
            "phone": self.get_phone(),
            "pet_type": self.get_pet_type(),
            "pet_name": self.get_pet_name()
        }

    def get_log_data(self):
        return f"{self.get_name()},{self.get_phone()},{self.get_pet_type()},{self.get_pet_name()}"
