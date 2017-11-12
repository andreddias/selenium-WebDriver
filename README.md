# selenium-WebDriver code help
This help page references the selenium webdriver has codes on a variety of topics

# Press keyboard keys in selenium

During automation, we are often required to press enter, control, tab, arrow keys, function keys and other non-text keys as well from keyboard.

Example:
driver.findElement(By.id("Value")).sendKeys(Keys.ENTER);

We can use Keys enum for different non-text keys and pass them to the sendKeys method. Bellow has an entry for each of the non-text key present in a keyboard.

Keyboard's Key	  Keys enum's value 

Arrow Key - Down	Keys.ARROW_DOWN

Arrow Key - Up	  Keys.ARROW_LEFT

Arrow Key - Left	Keys.ARROW_RIGHT

Arrow Key - Right	Keys.ARROW_UP

Backspace	        Keys.BACK_SPACE

Ctrl Key	        Keys.CONTROL

Alt key	          Keys.ALT

DELETE	          Keys.DELETE

Enter Key	        Keys.ENTER

Shift Key	        Keys.SHIFT

Spacebar	        Keys.SPACE

Tab Key	          Keys.TAB

Equals Key	      Keys.EQUALS

Esc Key	          Keys.ESCAPE

Home Key	        Keys.HOME

Insert Key	      Keys.INSERT

PgUp Key	        Keys.PAGE_UP

PgDn Key	        Keys.PAGE_DOWN

Function Key F1	  Keys.F1
.
.
.
Function Key F12	Keys.F12

