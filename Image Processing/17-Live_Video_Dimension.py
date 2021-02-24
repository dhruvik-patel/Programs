import cv2

def main():

    window = "Live Video"
    cv2.namedWindow(window)

    cap=cv2.VideoCapture(0)

    print("Width : " + str(cap.get(3)))
    print("Height : " + str(cap.get(4)))
    cap.set(3,1000)
    cap.set(4,720)
    print("Width : " + str(cap.get(3)))
    print("Height : " + str(cap.get(4)))

    if cap.isOpened():
        ret, img = cap.read()
    else:
        ret=False

    while ret:
        ret, img = cap.read()
        cv2.imshow(window,img)

#        gray = cv2.cvtColor(img , cv2.COLOR_BGR2GRAY)
#        cv2.imshow("GRAY LIVE" , gray)

        if cv2.waitKey(1)==27:
            break
    cv2.destroyAllWindows()
    cap.release()

main()