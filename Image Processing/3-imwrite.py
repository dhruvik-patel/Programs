import cv2

img = cv2.imread("F:\D.jpg")
cv2.imwrite("F:\openCV.jpg",img)
i = cv2.imread("F:\openCV.jpg")
cv2.imshow("Copied from cv2",i)
cv2.waitKey(0)
cv2.destroyAllWindows()
