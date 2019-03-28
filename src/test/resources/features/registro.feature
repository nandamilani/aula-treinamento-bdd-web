#language: pt

Funcionalidade: Registro


@Sprint1
Cenário: Realizar Registro
Dado que eu esteja na tela de Registro
Quando faço o preenchimento das informações da tela de Register 
| First Name| Last Name| Phone			| Email					 | Address	 | Address Complement| City 			| State Province| Postal Code| Country | User Name | Password | Confirm Password| 
|Celso			| Ricardo	 | 11986591773| celso@teste.com| Rua Cesare| Casa							 |	Sao Paulo | SP						| 05181489   | BRAZIL	 |	teste		 |	teste2	| teste2					|
Então sou registrado com sucesso 