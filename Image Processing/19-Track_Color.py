import cv2
import numpy as np

def main():

    cap = cv2.VideoCapture(0)
    if cap.isOpened():
        ret , frame = cap.read()
    else:
        ret = False

    while cap.isOpened():

        ret , frame =cap.read()

        low = np.array([30,103,255])
        high = np.array([100,150,255])
        hsv = cv2.cvtColor(frame, cv2.COLOR_BGR2HSV)
        img_mask = cv2.inRange(hsv, low, high)
        final = cv2.bitwise_and(frame, frame, mask=img_mask)

        cv2.imshow("ORIGINAL", frame)
        cv2.imshow("For The White",final)

        if cv2.waitKey(1)==27:
            break

main()