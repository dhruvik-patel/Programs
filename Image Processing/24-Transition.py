import cv2
import matplotlib.pyplot as plt
import numpy as np
import time

path1 = "C://Users//Dhruvik//Desktop//All Programs//Image Processing//Images//butterfly.jpg"
path2 = "C://Users//Dhruvik//Desktop//All Programs//Image Processing//Images//dandelion.jpg"

img1 = cv2.imread(path1)
img2 = cv2.imread(path2)

img1 = cv2.resize(img1 , ( 1280,720 ))
img2 = cv2.resize(img2 , ( 1280,720 ))

for i in np.linspace(0,1,100):
    alpha=i
    beta = 1 - alpha
    output = cv2.addWeighted(img1,alpha,img2,beta,0)
    cv2.imshow("Transition Image",output)
    time.sleep(0.04)
    if cv2.waitKey(1)==27:
        break

cv2.destroyAllWindows()