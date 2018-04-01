Feature: Consistência do participante
	
	Scenario: participante deve conter um nome, sendo ele diferente de vazio e com mais de uma letra.
		
	Given Ao criar um "<jogo>"
	
	When Eu digitar "<input>" no campo "para" ao criar um jogo antes de construí-lo
	
	Then a mensagem "<output>" deve ser exibida para o usuário.
	
	Exemplo:
	
    | jogo           | input    | output                 				|  
    | Bolão Ano Novo | ""    	| Nome não deve ser nulo 				|
    | Torneio Casual | "A"      | Nome deve ter mais de dois dígitos    |
	
