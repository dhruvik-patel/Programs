import cv2
import matplotlib.pyplot as plt

path1 = "C://Users//Dhruvik//Desktop//All Programs//Image Processing//Images//butterfly.jpg"
path2 = "C://Users//Dhruvik//Desktop//All Programs//Image Processing//Images//dandelion.jpg"

img1 = cv2.imread(path1)
img2 = cv2.imread(path2)

img1 = cv2.cvtColor(img1, cv2.COLOR_BGR2RGB)
img2 = cv2.cvtColor(img2, cv2.COLOR_BGR2RGB)
img2 = cv2.resize(img2 , (img1.shape[1],img1.shape[0]))

add = img1 + img2
sub1 = img1 - img2
sub2 = img2 - img1

titles = ['Image 1', 'Image 2', 'Addition', 'Img1-Img2','Img2-Img1']
images = [img1 , img2 , add , sub1 , sub2]

for i in range(5):
    plt.subplot(1,5,i+1)
    plt.imshow(images[i])
    plt.title(titles[i])
    plt.xticks([])
    plt.yticks([])
plt.show()
cv2.waitKey(0)
cv2.destroyAllWindows()
