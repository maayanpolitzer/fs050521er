def get_minimum_connections(matrix):
    index = 0
    rows_already_checked = []
    while index < len(matrix):

        index += 1

def check(matrix, i, j):



matrix = \
    [ 
        [False, True, False, False, True], 
        [True, False, False, False, False], 
        [False, False, False, True, False], 
        [False, False, True, False, False], 
        [True, False, False, False, False] 
    ]
print(get_minimum_connections(matrix)) # should print 1

#מערך דו מימדי שמדמה שדות תעופה וטיסות מכל שדה תעופה
# כלומר יש 5 שדות תעופה
# לפי index השדה תעופה טס למקום מסויים במידה וכתוב True
# במידה וכתוב False הוא לא טס ליעד
# השאלה היא:
# כמה טיסות צריך להוסיף על מנת לחבר את כל שדות התעופה
# גם טיסה לא ישירה נחשבת חיבור.