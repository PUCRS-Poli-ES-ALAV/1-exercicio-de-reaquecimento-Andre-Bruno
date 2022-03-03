#Cálculo de 1 + 1/2 + 1/3 + 1/4 + ... + 1/N.

def calc(value):
    try:
        r = 0
        
        if(value == 1 or value == 0):
            return 1
        else:
            r += 1/value + calc(value-1)
            return r
    except:
        return "Deve-se passar apenas números naturais como argumentos da função"

print(calc(0))
print(calc(1))
print(calc(2))
print(calc(3))
print(calc(4))
print(calc(5))