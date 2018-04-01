
@ConsistenciaParticipante
Feature: Consistência do participante
	Scenario: participante deve conter um nome, sendo ele diferente de vazio e com mais de uma letra.
	Given Ao criar um "<jogo>"
	When Eu digitar "<entrada>" no campo "para" ao criar um jogo antes de construí-lo
	Then a mensagem "<saida>" deve ser exibida para o usuário.
	Exemplo:
	
    | jogo           | entrada  | saida                                 |  
    | Bolão Ano Novo | ""    	| Nome não deve ser nulo ou vazio	|
    | Torneio Casual | "A"      | Nome deve ter mais de um dígitos      |
    | Copa da Jornada| "  "     | Nome não deve ser nulo ou vazio	|
	
