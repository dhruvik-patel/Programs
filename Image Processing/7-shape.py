import cv2
import numpy as np
def main():
    img1= np.zeros((512,512,3),np.uint8)
    
    cv2.line(img1,(20,20),(300,300),(0,0,255),3)
    cv2.line(img1,(300,20),(20,300),(0,0,255),3)
    
    cv2.rectangle(img1,(20,20),(300,300),(255,0,0),3)
    
    cv2.circle(img1,(160,160),135,(0,255,0),3)
    
    cv2.ellipse(img1,(160,160),(155,100),0,0,360,(100,100,100),3)
    
    points = np.array([[400,400],[450,450],[435,500],[385,500],[350,450]],np.int32)
    points = points.reshape((-1,1,2))
    cv2.polylines(img1,[points],True,(0,255,255),2)
    
    text = "Welcome To The Shape World"
    cv2.putText(img1,text,(0,350),cv2.FONT_HERSHEY_SIMPLEX,1,(255,0,255))
    
    
    
    cv2.imshow('Shapes',img1)
    cv2.waitKey(0)
    cv2.destroyAllWindows()
    
main()