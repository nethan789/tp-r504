print("Hello, world")

import fonctions as f

while True:
    a = int(input("Entrer a : "))
    b = int(input("Entrer b : "))
    res = f.puissance(a, b)
    print(f"{a}^{b} = {res}")
