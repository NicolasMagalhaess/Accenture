#Author: nickf.mag@hotmail.com

@tag
Feature: Solicitacao de seguro
  Eu como usuario quero preencher os dados para solicitar seguro
  
  Background: Acessar o site
  Given eu acesse o site "http://sampleapp.tricentis.com/"

  @tag1
  Scenario: Seguro para camper
    And clico no menu "camper"
    When preencho Enter Vehicle Data
    And preencho Enter Insurant Data
    And preencho Enter Product Data
    And preencho Select Price Option
    And clico Send Quote
    Then envio uma proposta
   

  
