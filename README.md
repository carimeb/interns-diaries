# ESTAGS DIARIES

Com a exímia orientação de Ramon M Pacheco @ramonmpacheco
 
## PREMISSAS
O **NUBE** *(ESTÁGIOS ESTAGIÁRIOS APRENDIZES)* ESTÁ COM UM PROJETO CHAMADO **"ESTAGS DIARIES"**, QUE SERÁ UM DIÁRIO VIRTUAL DISPONIBILIZADO GRATUITAMENTE PARA OS ESTAGIÁRIOS . A IDEIA É FORNECER UMA VÁLVULA DE ESCAPE PARA ESSAS POBRES ALMAS.

## SUA MISSÃO
- DESENVOLVER UMA API REST ONDE SEJÁ POSSÍVEL:
  - POSTAR UM NOVA MEMÓRIA 
  - LISTAR TODAS AS SUAS MEMÓRIAS
 
 - DEVE-SE USAR O BANCO H2.
 - OS DADOS DEVEM CONTINUAR PERSISTIDOS NO H2 MESMO QUANDO A APLICAÇÃO FOR DESLIGADA.
 - DEVE-SE USAR O JPA REPOSITORY PARA TRANSAÇÕES COM O BANCO DE DADOS.
 - A PORTA DO SERVIDOR WEB DEVE SER MUDADA PARA 9090.

 ## CLASSES
 
|DIARY||
|--|--|
|-ID|LONG|
|-TEXTO|STRING|
|-SENTIMENTO|STRING|
--
|DIARY_CONTROLLER||
|--|--|
|-REPOSITORY|JPA_REPOSITORY|
|**MÉTODOS**|--|
|+NOVA_ENTRADA|STRING|
|+MINHAS_MEMORIAS|LISTA DE DIARY

 ## INTERFACES
|DIARY_REPOSITORY|EXTENDS: JPA_REPOSITORY|
|--|--|

