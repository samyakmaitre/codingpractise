import sqlite3

conn = sqlite3.connect('example.db')

cur = conn.cursor()

cur.execute('''CREATE TABLE IF NOT EXISTS example_table (
                id INTEGER PRIMARY KEY,
                name TEXT,
                age INTEGER)''')

cur.execute("INSERT INTO example_table (name, age) VALUES (?, ?)", ('John', 30))
cur.execute("INSERT INTO example_table (name, age) VALUES (?, ?)", ('Alice', 25))

conn.commit()

cur.execute("SELECT * FROM example_table")
rows = cur.fetchall()

for row in rows:
    print(row)

cur.close()
conn.close()
