def get_minimum_connections(matrix):
    keys = {}
    groups = 0
    row = 0
    while row < len(matrix):
        col = row + 1
        while col < len(matrix[row]):
            if matrix[row][col]:
                if row in keys:
                    keys[col] = row
                elif col in keys:
                    keys[row] = keys[col]
                else:
                    groups += 1
                    keys[row] = row
                    keys[col] = row
            col += 1
        row += 1
    return groups - 1


def bfs(matrix):
    groups = set([])
    visited = [[False for i in range(len(matrix))] for i in range(len(matrix))]
    queue = []
    k = 0
    while k < len(matrix):
        queue.append((k, 0))
        while len(queue) > 0:
            cell = queue.pop(0)
            row = cell[0]
            col = cell[1]
            while col < len(matrix[row]):
                if matrix[row][col] and not visited[row][col]:
                    print(f"row: {row}, col: {col}")
                    groups.add(row)
                    queue.append((row, col))
                    queue.append((col, row))
                    visited[row][col] = True
                    visited[col][row] = True
                col += 1
        k += 1
        print("****")
    print(f"groups: {groups}")
    return len(groups) - 1


matrix = \
    [ 
        [False, True, False, False, True],
        [True, False, False, False, False],
        [False, False, False, True, False],
        [False, False, True, False, True],
        [True, False, False, True, False]
    ]
print(get_minimum_connections(matrix))  # should print 1

# מערך דו מימדי שמדמה שדות תעופה וטיסות מכל שדה תעופה
# כלומר יש 5 שדות תעופה
# לפי index השדה תעופה טס למקום מסויים במידה וכתוב True
# במידה וכתוב False הוא לא טס ליעד
# השאלה היא:
# כמה טיסות צריך להוסיף על מנת לחבר את כל שדות התעופה
# גם טיסה לא ישירה נחשבת חיבור.

# לרוץ על המטריצה באלכסון
# מגדיר מערך בגודל שדות התעופה