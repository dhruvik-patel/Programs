import cv2

image = cv2.imread("F:\D.jpg")

dimension = image.shape
height = image.shape[0]
width=image.shape[1]
channel=image.shape[2]
size1=image.size

print("Dimension : ",dimension)
print("Height : ",height)
print("Width : ",width)
print("Channels : ",channel)
print("Image size",size1)