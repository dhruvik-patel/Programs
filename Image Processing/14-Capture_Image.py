import cv2
import matplotlib.pyplot as plt

def main():
    cap = cv2.VideoCapture(0)

    if cap.isOpened():
        re, frame = cap.read()
        print(re)
    #    print(frame)
    else:
        re = False

    img = cv2.cvtColor(frame,cv2.COLOR_BGR2RGB)
    cv2.imwrite("F:\openCV1.jpg", img)                  # to save it in memory

    plt.imshow(img)
    plt.title("Captured from web cam")
    plt.xticks([])
    plt.yticks([])
    plt.show()

    cap.release()

main()