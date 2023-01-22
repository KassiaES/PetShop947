### PetShop947
#### trabalho de POO em Java no curso de Testes Automatizados da ADA

Um projeto da disciplina de POO, onde a proposta é construir o back-end de um software para um PetShop.
Os pontos a serem observados na construção do código são as classes e objetos necessários, respeitando os padrões de projeto;
utilizando os tópicos estudados no módulo, como encapsulamento, herança, polimorfismo, interfaces; 
seguindo a linha do clean code e os princípios do SOLID.

nome: Petshop 947

##### registros: 	
              veterinários
	    	  clientes animal
		  tosador
		  atendente
		
##### produtos e serviços:
              banho e tosa
	          atendimento clínico
		 vacinação
		 medicamentos
	         alimentos
		 

##### centro financeiro:
            fluxo de compra
		fluxo de venda
		fluxo de pagamento


Main -> será a nossa classe de testes

Projeto final:
	Após ter construído o nosso projeto se baseando no diagrama de classe feito em aula, é hora de testá-lo, na sua classe main, que aqui, utilizaremos ela para validar os retornos dos métodos, faça o seguinte:
		Crie o objeto Petshop
		Crie no mínimo dois cliente, com pelo menos um deles tendo mais do que um pet
		
		Testes com o cliente que tem apenas um pet:
- Chame o método atendimentoClinico do petshop, e faça-o retornar no campo observações o pedido do médico para o pet tomar a vacina_X
- Valide se o retorno do método atendimentoClinico possui o id do serviço, o serviço prestado, o valor e valide principalmente, se há no campo observação do animal, o pedido do médico para a vacina
- Chame o método vacinação do pet shop, e faça o pet tomar a vacina pedido no retorno do atendimentoClinico
- Valide se o retorno do método vacinação possui o esquemaVacinal do pet preenchido com o vacina que foi pedida, o id, o serviço prestado e o valor 
- Chame o método higienizar do petshop, e faça-o retornar no campo estado do animal, um valor referente ao serviço prestado ex: se chamou o método apenas pedindo para dar banho, o animal deverá estar limpo no retorno do método
- Valide se o retorno do método higienizar possui id, serviço, preço e se o estado do animal está equivalente ao serviço pedido
- Chame os métodos verRemedio e verAlimentos
- Por último, passe para o método pagamentos, a lista de todos os ids do serviços utilizados mais pelo menos 1 remédio e 1 alimento e valide se a soma dos valores do pedido do cliente está correta

		Testes com o cliente que tem dois ou mais pets:
- Repita o todos os fluxos feitos para o cliente com apenas um pet para o que tenha dois, fazendo a seguinte alterações:
no método atendimentoClinico coloque uma observação diferente para cada animal do cliente (cada animal do cliente deve receber uma vacina diferente para esse caso de testes)
- No método vacinação, vc deve vacinar cada animal conforme pedido no atendimentoClinico e deve checar no retorno o esquemaVacinal de cada animal e constatar a vacina correta em cada um
- Chame os métodos verRemedio e verAlimentos
- Por último, faça  a mesma validação para o método pagamentos ( a lista de todos os ids do serviços utilizados mais pelo menos 2 remédio e 2 alimento e valide se a soma dos valores do pedido do cliente está correta ) lembre se que se foi enviado dois animais para qualquer serviço, o valor será o dobro do serviço feito apenas para um animal
