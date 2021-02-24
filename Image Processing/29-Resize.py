import cv2


path = "C://Users//Dhruvik//Desktop//All Programs//Image Processing//Images//flower.jpg"

img = cv2.imread(path)

img = cv2.resize(img,None,fx=0.5,fy=0.5,interpolation=cv2.INTER_AREA)
img2 = cv2.resize(img , None , fx =1.5 , fy =1.5, interpolation=cv2.INTER_CUBIC)


cv2.imshow('Flower Beauty',img)
cv2.imshow('Flower',img2)
cv2.waitKey(0)
cv2.destroyAllWindows()