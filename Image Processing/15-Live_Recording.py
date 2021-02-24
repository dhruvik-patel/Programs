import cv2

def main():

    window = "Live Recording"
    cv2.namedWindow(window)

    cap = cv2.VideoCapture(0)

    filename = "C:\\Users\\Dhruvik\\Desktop\\All Programs\\Image Processing\\OpenCV\\Example.mp4"
    codec = cv2.VideoWriter_fourcc('X', 'V', 'I', 'D')
    frameRate = 30
    resolution = (640, 480)
    video = cv2.VideoWriter(filename, codec, frameRate, resolution)

    if cap.isOpened():
        ret, frame = cap.read()
    else:
        ret = False

    while ret:
        ret, frame = cap.read()

        video.write(frame)
        cv2.imshow(window,frame)

        if cv2.waitKey(1)==27:
            break

    cv2.destroyAllWindows()
    video.release()
    cap.release()

main()