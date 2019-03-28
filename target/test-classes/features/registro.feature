# language: pt
Funcionalidade: Registro

  Cenario: Realizar Registro
    Dado que eu esteja na tela de Registro
    Quando faco o preenchimento das informacoes da tela  de Register
      | First Name | Last Name | ​ Phone      | Email              | Address    | Address Complement | City      | State Province | Postal Code | Country | User Name | Password | Confirm Password |
      | Aline      | Ferreira  | 551187654567 | teste@teste.com.br | Rua Cesare | JC Pirituba        | São Paulo | SP             |    03456040 | BRAZIL  | capaline  |   123456 |           123456 |
    Então sou registrado com sucesso
