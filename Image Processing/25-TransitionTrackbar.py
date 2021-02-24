import cv2

def empty():
    pass

path1 = "C://Users//Dhruvik//Desktop//All Programs//Image Processing//Images//butterfly.jpg"
path2 = "C://Users//Dhruvik//Desktop//All Programs//Image Processing//Images//dandelion.jpg"

img1 = cv2.imread(path1,1)
img2 = cv2.imread(path2,1)
img1 = cv2.resize(img1,(1024,720))
img2 = cv2.resize(img2,(1024,720))

output = cv2.addWeighted(img1 , 0.5 , img2 , 0.5 , 0)   # for blending : alpha + beta = 1

window = "Transition"
cv2.namedWindow(window)

cv2.createTrackbar('Alpha',window, 0, 1000 , empty)

while(True):
    cv2.imshow(window,output)

    if cv2.waitKey(1)==27:
        break
    alpha = cv2.getTrackbarPos('Alpha',window) / 1000
    beta = 1-alpha
    output = cv2.addWeighted(img1 , alpha , img2, beta , 0)

cv2.destroyAllWindows()