import cv2
import matplotlib.pyplot as plt

path1 = "C://Users//Dhruvik//Desktop//All Programs//Image Processing//Images//butterfly.jpg"
path2 = "C://Users//Dhruvik//Desktop//All Programs//Image Processing//Images//dandelion.jpg"

img1 = cv2.imread(path1)
img2 = cv2.imread(path2)

img1 = cv2.cvtColor(img1, cv2.COLOR_BGR2RGB)
img2 = cv2.cvtColor(img2, cv2.COLOR_BGR2RGB)

img2 = cv2.resize(img2,(img1.shape[1],img1.shape[0]))   # Resize img2 from img1

plt.subplot(1,2,1)              # Row , Column , Position of Image (Pos. Starting from 1)
plt.imshow(img1)
plt.title("First Image")
plt.xticks([])
plt.yticks([])

plt.subplot(1,2,2)
plt.imshow(img2)
plt.title("Second Image")
plt.xticks([])
plt.yticks([])

plt.show()

cv2.waitKey(0)
cv2.destroyAllWindows()