import cv2

image = cv2.imread("F:\D.jpg")
cv2.imshow("Flower", image)
print(type(image))      # type of image(n dimensional array)
print(image.dtype)      # type of data(unsigned int 8 bit)
cv2.waitKey(0)
cv2.destroyAllWindows()