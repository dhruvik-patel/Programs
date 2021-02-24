'''
*****************
*               *
*               *
*               *
*****************
'''

def printBox(symbol, width, height):
    if len(symbol) != 1:
        raise Exception('"Symbol" length must be 1.')
    if (width<2) or (height<2):
        raise Exception('Width and Height must be greater than 1.')
    print(symbol * width)                               ## '@' * 5  ->  @@@@@

    for i in range(height-2):
        print(symbol+ ' '*(width-2) + symbol)

    print(symbol * width)
#
# printBox('*',10,7)
# print()
# printBox('##',20,5)

###########################################################################################################################################################

# import traceback
# try:
#     raise Exception('This is error message...')
# except :
#     erroFile = open('error_file.txt','a')
#     erroFile.write(traceback.format_exc())
#     erroFile.close()
#     print('Error info saved successfully in error_file.txt')


###########################################################################################################################################################

## assert statements : syntax = assert condition, 'message'     -> prints message if condition returns False

val = 4
assert val>5,'Value must be greater than 5.'
