# Selenium WebDriver 
Página de refeferência para o selenium webdriver com as principais dúvidas levantadas no grupo [Selenium Brasil](https://groups.google.com/forum/m/#!forum/selenium-brasil)

# Como usar Interface para parametrização de dados
Interface é um recurso da orientação a objeto utilizado em Java que define ações que devem ser obrigatoriamente executadas, mas que cada classe pode executar de forma diferente. Interfaces contém valores constantes ou assinaturas de métodos que devem ser implementados dentro de uma classe. Por que não usar para parametrização dos dados? Segue um exemplo em dois arquivos

Classe de teste [Util.java](https://github.com/andreddias/selenium-WebDriver/blob/master/Util.java)

Parametrização [UtilMap.java](https://github.com/andreddias/selenium-WebDriver/blob/master/UtilMap.java)

# Pressione as teclas do teclado no selenium
Durante a automação, muitas vezes somos obrigados a pressionar enter, control, tab, setas e outras teclas que não sejam de texto, além do teclado.

Exemplo: driver.findElement(By.id("Value")).sendKeys(Keys.ENTER);

Outras teclas de atalho em: [Keyboard keys](https://github.com/andreddias/selenium-WebDriver/blob/master/Keyboard%20keys)

# Marionette
Depois da versão 47 do Firefox é necessário a engine Gekco, o Marionette. As execuções de teste com o Firefox e Selenium devem utilizar este novo driver.

Exemplo em: [Marionette.java](https://github.com/andreddias/selenium-WebDriver/blob/master/Marionette.java)

# Select Item
Selecionar um elemento de uma arraylist

Exemplo em: [SelectItem.java](https://github.com/andreddias/selenium-WebDriver/blob/master/SelectItem.java)

# Viagem
Faça uma pesquisa do melhor preço nos sites de passagem aérea, copie e cole a url nesse código que retorna os valores em um arquivo txt.

Exemplo em: [Viagem.java](https://github.com/andreddias/selenium-WebDriver/blob/master/Viagem.java)
