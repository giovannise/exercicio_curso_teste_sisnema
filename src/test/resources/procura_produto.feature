#language: pt
Funcionalidade: Listar Produtos
  Como um usuário não logado
  Eu quero visualizar os produtos disponíveis
  Para poder escolher qual produto quero comprar

  Cenário: Mostra produtos com descrição e preço
    Dado que estou na página inicial
    Quando não estou logado
    Então visualizo pelo menos um produto com descrição e preço