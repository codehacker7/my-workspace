'''
c = "kavyansh"
print(len(c))
print(c.endswith("bnhtucbt"))
print(c.count("a"))
print(c.capitalize())
print(c.find("k"))
print(c.replace("a","v"))
'''
letter = ''' Hi your name is /NAME/ is selected
                finally for the indian idol 
                contest  on /DATE/
                '''
a = input("Enter your name")                
b= input("Enter the Date")
letter = letter.replace("/NAME/",a)
letter = letter.replace("/DATE/",b)
print(letter)