#language: pt
#enconding: utf-8

Funcionalidade: Testar o alto nivel de funcionamento do site de teste zoo

Fundo: 
Dado que eu estou no site zoo

Cenario: Preencher o formulario de contato
Quando eu clicar em "contact"
E eu vou preencher o formulario inteiro
E eu envio o formulario de contato
Então eu devo estar na pagina de confirmacao
E eu fecho o navegador



