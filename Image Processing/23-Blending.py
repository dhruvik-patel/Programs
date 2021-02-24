import cv2
import matplotlib.pyplot as plt

path1 = "C://Users//Dhruvik//Desktop//All Programs//Image Processing//Images//butterfly.jpg"
path2 = "C://Users//Dhruvik//Desktop//All Programs//Image Processing//Images//dandelion.jpg"

img1 = cv2.imread(path1)
img2 = cv2.imread(path2)

#img1 = cv2.cvtColor(img1, cv2.COLOR_BGR2RGB)
#img2 = cv2.cvtColor(img2, cv2.COLOR_BGR2RGB)
img1 = cv2.resize(img1 , ( 1280,720 ))
img2 = cv2.resize(img2 , ( 1280,720 ))

output = cv2.addWeighted(img1,0.5,img2,0.5,0)

cv2.imshow("Blending Images",output)

cv2.waitKey(0)
cv2.destroyAllWindows()