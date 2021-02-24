import cv2
import numpy as np

window = 'Drawing'
img = np.zeros((512,512,3),np.uint8)
cv2.namedWindow(window)
def drawCircle(event, x, y, flags, param):
    if event==cv2.EVENT_LBUTTONDBLCLK:
        cv2.circle(img, (x,y), 40, (0,255,0),-1)        # Green on left double click
    if event==cv2.EVENT_MBUTTONDOWN:
        cv2.circle(img, (x,y), 40, (255,0,0), -1)       # Blue on Medium down
    if event==cv2.EVENT_LBUTTONDOWN:
        cv2.circle(img, (x,y), 40, (0,0,255), -1)       # Red on left down 
    
cv2.setMouseCallback(window, drawCircle)

def main():
    while(True):
        cv2.imshow(window,img)
        if cv2.waitKey(1)==27:
            break
    cv2.destroyAllWindows()

main()