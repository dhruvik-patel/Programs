import cv2
import matplotlib.pyplot as plt

path1 = "C://Users//Dhruvik//Desktop//All Programs//Image Processing//Images//butterfly.jpg"
path2 = "C://Users//Dhruvik//Desktop//All Programs//Image Processing//Images//dandelion.jpg"

img1 = cv2.imread(path1)
img2 = cv2.imread(path2)

img1 = cv2.cvtColor(img1, cv2.COLOR_BGR2RGB)
img2 = cv2.cvtColor(img2, cv2.COLOR_BGR2RGB)
img2 = cv2.resize(img2 , (img1.shape[1],img1.shape[0]))

titles = ["Flower 1","Flower 2"]
images = [img1, img2]

for i in range(2):
    plt.subplot(1,2, i+1)               # position starts from 1 & i starts from 0
    plt.imshow(images[i])
    plt.title(titles[i])
    plt.xticks([])
    plt.yticks([])

plt.show()
cv2.waitKey(0)
cv2.destroyAllWindows()