import cv2
import matplotlib.pyplot as plt

path = "C://Users//Dhruvik//Desktop//All Programs//Image Processing//Images//flower.jpg"

img = cv2.imread(path , 1)

img1 = cv2.cvtColor(img , cv2.COLOR_BGR2RGB)
img2 = cv2.cvtColor(img , cv2.COLOR_BGR2GRAY)

img3 = abs(255 - img1)
img4 = abs(255 - img2)

plt.subplot(2,2,1)
plt.imshow(img1)
plt.title("Original")
plt.xticks([])
plt.yticks([])

plt.subplot(2,2,2)
plt.imshow(img2,cmap='Greys')
plt.title("Gray")
plt.xticks([])
plt.yticks([])

plt.subplot(2,2,3)
plt.imshow(img3)
plt.title("Original Negative")
plt.xticks([])
plt.yticks([])

plt.subplot(2,2,4)
plt.imshow(img4,cmap='Greys')
plt.title("Gray Negative")
plt.xticks([])
plt.yticks([])

plt.show()

cv2.waitKey(0)
cv2.destroyAllWindows()