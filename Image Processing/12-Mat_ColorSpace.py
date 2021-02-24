import cv2
import matplotlib.pyplot as plt

def main():
    
    path = "F:\D.jpg"
    img = cv2.imread(path,1)
    img1 = cv2.cvtColor(img , cv2.COLOR_BGR2RGB)
    
    plt.imshow(img)        # BGR Color
    plt.title("MATPLOTLIB Effect")
    plt.xticks([])
    plt.yticks([])
    plt.show()
    
    plt.imshow(img1)         # RGB color
    plt.title("AS ORIGINAL")
    plt.xticks([])
    plt.yticks([])
    plt.show()
    
main()