import os

# walking through folder
# returns folder, subfolders inside this folder, files inside this folder

for folderName, subfolders, files in os.walk('make dirs'):
    print('Folder name : ' + folderName)
    print('Subfolders are : ' + str(subfolders))
    print('Files are : ' + str(files))
    print()
