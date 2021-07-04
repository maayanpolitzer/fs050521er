# pip install pytesseract - ocr library in python:
import pytesseract

# pip install image - image handling library in python(Python Image Library):
from PIL import Image

image = Image.open("image3.jpeg")
# data = pytesseract.image_to_string(image)   # for english
#data = pytesseract.image_to_string(image, config="-l heb")  # for hebrew
data = pytesseract.image_to_string(image,  config="--psm 10 --oem 3 -c tessedit_char_whitelist=0123456789")
sendSMS(data, "ברוך הבא לחניון")




