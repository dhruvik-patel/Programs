import cv2

def main():

    window = 'Play Video'
    cv2.namedWindow(window)

    file = "C:\\Users\\Dhruvik\\Desktop\\All Programs\\Image Processing\\OpenCV\\Example.mp4"
    cap=cv2.VideoCapture(file)

#    cap.set(3,1000)
#    cap.set(4,720)

    while(cap.isOpened()):
        ret,frame = cap.read()
#       print(ret)
        if ret:
            cv2.imshow(window,frame)
            if cv2.waitKey(33)==27 :
                break
        else:
            break

    cv2.destroyAllWindows()
    cap.release()

main()