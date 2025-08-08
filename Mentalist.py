import time
print("Loading\n")
print(".......\n")
print(".......\n")
print(".......\n")
time.sleep(.2)
print(".......\n")
getname = input("Hello! What is your name?\n")
time.sleep(.1)
#Print the introduction to the game
print(f"\nNice to meet you, {getname}!")
time.sleep(.2)
print("Now, we'll perform some mind reading on you")
time.sleep(.2)
print("First think of a number between 1 and 10")
time.sleep(.2)
getnumber = input("Please input a number from 1-10\n")
result = int(getnumber) * 2
addtoresult = int(result) + 8
divideresult = int(addtoresult)/4
result = int(divideresult) - int(getnumber)
time.sleep(.2)
print(result)
