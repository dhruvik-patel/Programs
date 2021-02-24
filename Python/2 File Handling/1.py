import os
pathname = os.path.join('folder1','folder2','name.png')
print(pathname)
print(os.sep)
print(os.getcwd())
# os.chdir('C:\\')      # change current  working directory
# print(os.getcwd())
print(os.path.abspath('spam.png'))
print(os.path.isabs('C:\\folder\\abc.txt'))
print(os.path.relpath('C:\\folder1\\folder2\\spam.png', 'C:\\folder1'))
print(os.path.dirname('C:\\folder\\abc.txt'))   # except last file/folder
print(os.path.basename('C:\\folder\\abc.txt'))  # last file/folder
print(os.path.exists('C:\\folder\\abc.txt'))
print(os.path.exists('C:\\windows\\system32\\calc.exe'))
print(os.path.isfile('C:\\windows\\system32\\calc.exe'))
print(os.path.isdir('C:\\windows\\system32\\calc.exe'))
print(os.path.isfile('C:\\windows\\system32'))
print(os.path.isdir('C:\\windows\\system32'))
print(os.path.getsize('C:\\windows\\system32\\calc.exe'))
print(os.listdir('C:\\windows'))
os.makedirs('C:\\Users\\Dhruvik\\Desktop\\All Programs\\Python\\File Handling\\make dirs\\dhruvik')
