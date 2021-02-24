import cv2
def main():
    
    events = [i for i in dir(cv2) if 'EVENT' in i]
    print(events)
main()
    