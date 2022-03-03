#Multiplicação de dois números naturais, através de somas sucessivas (Ex.: 6 ∗ 4 = 4 + 4 + 4 + 4 + 4 + 4).


def multiply(counter, value):
    try:
        r = 0
        if(counter==0):
            return r
        else:
            r = value + multiply(counter-1, value)
            return r
    except:
        return "Deve-se passar apenas números como argumentos da função"
    

print(multiply(0,4))

