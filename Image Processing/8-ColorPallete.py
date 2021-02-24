import cv2
import numpy as np
def empty():
    pass

def main():
    img = np.zeros((512,512,3),np.uint8)
    window = "COLOR PALLETE"
    cv2.namedWindow(window)
    
    cv2.createTrackbar('B',window,0,255,empty)      # create TrackBar with name B and values from 0 to 255
    cv2.createTrackbar('G',window,0,255,empty)
    cv2.createTrackbar('R',window,0,255,empty)
    
    while(True):
        cv2.imshow(window , img)
        
        if(cv2.waitKey(1)==27):              # To close press escape key
            break;
        blue = cv2.getTrackbarPos('B',window)       # Gives value of track bar
        green = cv2.getTrackbarPos('G',window)
        red = cv2.getTrackbarPos('R',window)
        
        img[:] = [blue,green,red]       # Generates composite image from given values
      #  print(blue , green , red)      To print matrix values
        
    cv2.destroyAllWindows()
    
main()
            