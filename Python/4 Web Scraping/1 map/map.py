import webbrowser, pyperclip, sys
sys.argv

# Check if arg are passed
if len(sys.argv)>1:
    address = ' '.join(sys.argv[1:])
else:
    address = pyperclip.paste()

webbrowser.open('https://www.google.com/maps/search/' + address)
