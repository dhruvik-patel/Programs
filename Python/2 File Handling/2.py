import os
helloFile = open(os.path.join(os.getcwd(),'files\\dhruvik.txt'))
fileText = helloFile.read()
fileLines = helloFile.readlines()
print(fileText)
print(fileLines)
helloFile.close()


# helloFile = open(os.path.join(os.getcwd(),'files\\dhruvik.txt'), 'w')   # write mode
helloFile = open(os.path.join(os.getcwd(),'files\\dhruvik.txt'), 'a')     # append mode
helloFile.write("Hey!! What's up??\n Long time No see??")               # return length of string passed to it
helloFile.close()

import shelve
shelfFile = shelve.open('mydata')
shelfFile['pets'] = ['dog','cat','lion','tiger']
shelfFile.close()

shelfFile = shelve.open('mydata')
print(shelfFile['pets'])
print(list(shelfFile.keys()))
print(list(shelfFile.values()))
shelfFile.close()
