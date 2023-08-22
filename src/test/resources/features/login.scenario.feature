
@regressao
Feature: Login da saucedemo
  como usuario
  quero preencher os dados do formulario de login
  para conseguir acessar a home da saucedemo

  @logValido @positivo
  Scenario: Informando dados validos para login
    Given que esteja em "https://www.saucedemo.com/"
    When preencher os campos username e password corretamente
    Then valido o login com sucesso
  
  @logProb @positivo
  Scenario: Logando com dados de um perfil com problemas
    Given que esteja em "https://www.saucedemo.com/"
    When preencher os campos username e password da conta com problema
    Then valido o login na pagina com problema
    
  
  @logInvalid @negativo
  Scenario Outline: Informando dados invalidos ou insuficientes para login
    Given que esteja em "https://www.saucedemo.com/"
    When preencher username <username>
    And preencher password <password> 
    Then valido a <mensagem>

    Examples: 
      | username  					 | password 			| mensagem  																																	|
      | "" 									 | "" 						| "Epic sadface: Username is required" 																				|
      | "standard_user" 		 | "" 						| "Epic sadface: Password is required" 																				|
      | "errado" 						 | "errado" 			| "Epic sadface: Username and password do not match any user in this service" |
      | "standard_user" 		 | "errado" 			| "Epic sadface: Username and password do not match any user in this service" |
      | "locked_out_user" 	 | "secret_sauce" | "Epic sadface: Sorry, this user has been locked out." 											|


  