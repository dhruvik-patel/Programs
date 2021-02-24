import cv2
import matplotlib.pyplot as plt

def main():
    
    path = "F:\D.jpg"
    img = cv2.imread(path,0)
    
    plt.imshow(img, cmap="gray")        # Gray Color
    plt.title("Flower")
    plt.xticks([])
    plt.yticks([])
    plt.show()
    
    plt.imshow(img)         # Default color
    plt.title("Default Colors")
    plt.xticks([])
    plt.yticks([])
    plt.show()
    
main()