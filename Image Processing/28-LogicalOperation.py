import cv2
import matplotlib.pyplot as plt

path1 = "C://Users//Dhruvik//Desktop//All Programs//Image Processing//Images//butterfly.jpg"
path2 = "C://Users//Dhruvik//Desktop//All Programs//Image Processing//Images//pasqueflower.jpg"

img1 = cv2.imread(path1 , 1)
img2 = cv2.imread(path2 , 1)

img1 = cv2.cvtColor(img1 , cv2.COLOR_BGR2RGB)
img2 = cv2.cvtColor(img2 , cv2.COLOR_BGR2RGB)


Not = cv2.bitwise_not(img1)
And = cv2.bitwise_and(img1, img2)
Or = cv2.bitwise_or(img1 , img2)
Xor = cv2.bitwise_xor(img1 , img2)

images = [img1 ,img2 , Not , And , Or , Xor]
titles = ['Original 1','Original 2','Not 1', 'AND', 'OR', 'XOR']

for i in range(6):
    plt.subplot(2,3,i+1)
    plt.imshow(images[i])
    plt.title(titles[i])
    plt.xticks([])
    plt.yticks([])

plt.show()
