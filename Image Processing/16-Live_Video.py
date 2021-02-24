import cv2

def main():

    window = "Live Video"
    cv2.namedWindow(window)

    cap=cv2.VideoCapture(0)
    if cap.isOpened():
        ret, img = cap.read()
    else:
        ret=False

    while ret:
        ret, img = cap.read()
        cv2.imshow(window,img)

        gray = cv2.cvtColor(img , cv2.COLOR_BGR2GRAY)
        cv2.imshow("GRAY LIVE" , gray)

        rgb = cv2.cvtColor(img, cv2.COLOR_BGR2RGB)
        cv2.imshow("RGB LIVE", rgb)

        hsv = cv2.cvtColor(img, cv2.COLOR_BGR2HSV)
        cv2.imshow("HSV LIVE", hsv)

        if cv2.waitKey(1)==27:
            break
    cv2.destroyAllWindows()
    cap.release()

main()