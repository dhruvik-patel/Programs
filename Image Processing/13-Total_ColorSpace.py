import cv2

def main():
    i=0
    for name in dir(cv2):
        if name.startswith("COLOR_"):
            print(name)
            i=i+1
    print("Total Color Spaces : " + str(i))

main()