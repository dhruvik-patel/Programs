###########################    REGULAR EXPRESSION   ###########################

import re

pattern = re.compile(r'\d\d-\d\d-\d\d\d\d')     # for date
match = pattern.search("Birth Date : 01-01-2000")
print(match.group())    # returns first occurances

print(pattern.findall("01-01-2000 and 02-02-3000..."))  # returns list

pattern = re.compile(r'^hello')
match = pattern.search("hello world")
print(match.group())


agentName = "Agent Alice give it to Agent Bob."
pattern = re.compile(r'Agent (\w)\w*')      # first letter of name stored in group
print(pattern.sub(r'Agent \1', agentName))  # substitute firse group value

#################################################################################################################

# \d = digits
# \w = words (digit,letter,underscore)
# \s = spaces
# ? = 0 or 1 time
# * = 0 or more
# + = 1 or more
# {x} = exactly x times
# {x,y} = atleast x and atmost y times
# [a-zA-Z] = from a to z OR from A-Z
# [axgs] = a | x | g | s
# [0-9] = from 0 to 9
# [^ax] = everything except a and x
# [^a-z] = everything except a to z

#################################################################################################################

# r'^hello' : search for hello at beginning of string  ------->        "hello world"
# r'world$' : search for world at the end of string    ------->        "hello world"
# r'^hello$' : search for entire string hello -------------->          "hello"
# r'.at' : dot means any char except newline --------------->          "cat","rat","bat"
# r'(.*)' : means any pattern but stops at newline char     greedy
# r'(.*?)' : nongreedy
# re.compile(r'.*', re.DOTALL) : any pattern includeing newline
# re.compile(r'', re.I) or re.IGNORECASE
# re.compile(r'', re.VERBOSE) --->   write pattern in multiple line. It doesn't count white spaces in regex '''pattern'''

name = "First Name: Dhruvik Last Name: Patel"
nameRegex = re.compile(r'First Name: (.*) Last Name: (.*)')
print(nameRegex.findall(name))

####### GREEDY NonGreedy ######
serve = "<To serve humans> for dinner>"
patternGreedy = re.compile(r'<(.*)>')
patternNonGreedy = re.compile(r'<(.*?)>')
print(patternGreedy.findall(serve))
print(patternNonGreedy.findall(serve))


#################################################################################################################



#################################################################################################################
