@ValidacaoPagamento
	Feature: Validacao Pagamento
	Scenario: O valor do pagamento n�o deve ser negativo ou zerado.
	Given Ao comprar entrada para um "<jogo>"
	When Ao receber o "<valor>" ao efetuar um pagamento do jogo
	Then uma "<mensagem>" deve ser exibida para o usuário
	And um "<codigo>" deve ser retornado.
	Exemplo:
	
    | jogo  			    | valor	  		| mensagem                             	 |  codigo |
    | Bolão Ano Novo | 	0  	  		| Valor do pagamento não deve ser 0		 |		1		 |
    | Torneio Casual 	| 	-100.0   	| Valor do pagamento deve ser positivo   |		2		 |
    | Copa da Jornada	| 	50.0   		| 																			 |		0		 |
	
