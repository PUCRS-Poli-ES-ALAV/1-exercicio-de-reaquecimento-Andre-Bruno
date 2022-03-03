#Soma de dois números naturais, através de incrementos sucessivos (Ex.: 3 + 2 = + + (+ + + 1))

def sussecive_sum(value1, value2):
    try:
        r=0
        if(value1 == 0 and value2==0):
            return r
        elif(value1==0):
            r += 1 + sussecive_sum(value1, value2-1)
            return r
        elif(value2==0):
            r+= 1+sussecive_sum(value1-1, value2)
            return r
        else:
            r += 1 + 1 + sussecive_sum(value1-1, value2-1)
            return r
    except:
        return "Deve-se passar apenas números naturais como argumentos da função"


print(sussecive_sum(1,2))
    

