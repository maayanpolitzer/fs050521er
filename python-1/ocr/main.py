from PIL import Image
import pytesseract

image = Image.open("lp.png")
print("start")
# data = pytesseract.image_to_string(image)   # for english
# data = pytesseract.image_to_string(image, config="-l heb")
data = pytesseract.image_to_string(image, lang='eng', config='--psm 10 --oem 3 -c tessedit_char_whitelist=0123456789')
print("done")
print(data)


