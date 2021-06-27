import json

class CustomersFile:

    def __init__(self):
        self.__file_name = "customers.txt"
        self.__customers = []

    def __write_file(self):
        my_data = customer.get_dictionary()
        # convert dictionary to json:
        j = json.dumps(my_data)
        # insert this json object into the file:
        open(self.__file_name, "a").truncate()

    def __read_file(self):
        pass

    def add_customer(self, customer):
        self.__customers.append(customer)
        open("customer.log").write(customer.get_log_data())


    def search(self, search_value, key="name"):
        pass

'''
1. כשנפעיל את התוכנה, נשלוף את הנתונים מהקובץ לקוחות.
2. כשנסגור את התוכנה, נכתוב את רשימת הלקוחות לקובץ.
3. במהלך הפעילות של התוכנה, ננהל את הלקוחות בעזרת רשימה.
4. במקרה של הפסקת חשמל/קריסה של התוכנה, נשמור את הלקוחות כגיבוי על קובץ נוסף.
5. להוסיף כפתור ״export״ בשביל לאפשר החלפת מחשב.
'''
