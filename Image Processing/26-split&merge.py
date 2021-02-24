import cv2
import matplotlib.pyplot as plt

path = "C://Users//Dhruvik//Desktop//All Programs//Image Processing//Images//flower.jpg"

img = cv2.imread(path,1)
img = cv2.cvtColor(img , cv2.COLOR_BGR2RGB)

r , g , b = cv2.split(img)          # return color channels

titles = ['Original' , 'Red','Green', 'Blue']
images = [cv2.merge((r,g,b)), r, g, b]          # merge color channels

plt.subplot(2,2,1)
plt.imshow(images[0])
plt.title(titles[0])
plt.xticks([])
plt.yticks([])

plt.subplot(2,2,2)
plt.imshow(images[1],cmap='Reds')       # Shows intensity values
plt.title(titles[1])
plt.xticks([])
plt.yticks([])

plt.subplot(2,2,3)
plt.imshow(images[2],cmap='Greens')
plt.title(titles[2])
plt.xticks([])
plt.yticks([])

plt.subplot(2,2,4)
plt.imshow(images[3],cmap='Blues')
plt.title(titles[3])
plt.xticks([])
plt.yticks([])

plt.show()
cv2.waitKey(0)
cv2.destroyAllWindows()