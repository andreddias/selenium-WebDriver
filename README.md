# selenium-WebDriver 
Página de refeferência para o selenium webdriver 

# Como usar Interface para parametrização de dados para automação de teste
Interface é um recurso da orientação a objeto utilizado em Java que define ações que devem ser obrigatoriamente executadas, mas que cada classe pode executar de forma diferente. Interfaces contém valores constantes ou assinaturas de métodos que devem ser implementados dentro de uma classe. Por que não usar para parametrização dos dados? Segue um exemplo em dois arquivos

Classe de teste [Util.java](https://github.com/andreddias/selenium-WebDriver/blob/master/Util.java)

Parametrização [UtilMap.java](https://github.com/andreddias/selenium-WebDriver/blob/master/UtilMap.java)

# Pressione as teclas do teclado no selenium
Durante a automação, muitas vezes somos obrigados a pressionar enter, control, tab, setas e outras teclas que não sejam de texto, além do teclado.

Examplo: driver.findElement(By.id("Value")).sendKeys(Keys.ENTER);

[Keyboard keys](https://github.com/andreddias/selenium-WebDriver/blob/master/Keyboard%20keys)

# Driver Gekco
Depois da versão 47 do Firefox é necessário a engine Gekco, o Marionette. As execuções de teste com o Firefox e Selenium devem utilizar este novo driver.

[Marionette.java](https://github.com/andreddias/selenium-WebDriver/blob/master/Marionette.java)

# Select Item
Selecionar um elemento de uma arraylist

[SelectItem](SelectItem)
