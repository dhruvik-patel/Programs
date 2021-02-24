import cv2

image = cv2.imread("F:\D.jpg")
gray_image = cv2.cvtColor(image, cv2.COLOR_BGR2GRAY)
cv2.imshow("Flower", image)
cv2.imshow("Flower grey", gray_image)
cv2.waitKey(0)
cv2.destroyAllWindows()