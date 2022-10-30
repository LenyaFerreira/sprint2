1. Códigos MySQL usados para criação da tabela da questão número 1:
CREATE SCHEMA `questao1` ;


CREATE TABLE `questao1`.`tabela_itens` (
  `id` INT NOT NULL auto_increment,
  `nome` VARCHAR(100) NULL,
  `descricao` VARCHAR(200) NULL,
  `quantidade` INT,
  preco float not null,
  PRIMARY KEY (`id`));


2. Códigos MySQL usados para criação da tabela da questão número 2:
CREATE SCHEMA `filmes` ;

CREATE TABLE `filmes`.`tabela_filmes` (
  `id` INT NOT NULL,
  `nome` VARCHAR(100) NULL,
  `descricao` VARCHAR(200) NULL,
  `ano` INT NULL,
  PRIMARY KEY (`id`));

INSERT INTO tabela_filmes (id, nome, descricao, ano)
VALUES (1, "Bubble", "Este filme é ambientado em uma Tóquio abandonada, tomada por
bolhas e anomalias gravitacionais.", 2022);

INSERT INTO tabela_filmes (id, nome, descricao, ano)
VALUES (2,"Animais Fantásticos: Os Segredos de Dumbledore"," É o terceiro título da 
série de filmes Fantastic Beasts.", 2022);

INSERT INTO tabela_filmes (id, nome, descricao, ano)
VALUES (3, "Doutor Estranho no Multiverso da Loucura", "A MCU 
desbloqueia o Multiverso.", 2022);

INSERT INTO tabela_filmes (id, nome, descricao, ano)
VALUES (4, "Thor Amor e Trovão","É um filme estadunidense de super-herói
 de 2022 baseado no personagem Thor, da Marvel Comics.", 2022);

INSERT INTO tabela_filmes (id, nome, descricao, ano)
VALUES (5,"Uncharted: Fora do Mapa","Serve como uma prequela para os jogos, 
seguindo o jovem Nathan, antes de ser conhecido como um famoso explorador.", 2022);

INSERT INTO tabela_filmes (id, nome, descricao, ano)
VALUES (6,"Top Gun: Maverick", "um filme estadunidense de 2022, dos gêneros ação, 
aventura e drama", 2022);

INSERT INTO tabela_filmes (id, nome, descricao, ano)
VALUES (7,"Sonic 2 - O Filme","É uma sequência dos acontecimentos do primeiro live-action 
de Sonic.", 2022);

INSERT INTO tabela_filmes (id, nome, descricao, ano)
VALUES (8,"Red: Crescer é uma Fera","Em Red: Crescer É uma Fera, quando uma adolescente fica
 muito nervosa, ela se transforma em um grande panda vermelho.", 2022);

INSERT INTO tabela_filmes (id, nome, descricao, ano)
VALUES (9,"Tico e Teco: Defensores da Lei","Depois de fazerem sucesso na série Tico e Teco os 
Defensores da Lei, os protagonistas Tico e Teco foram esquecidos.", 2022);

INSERT INTO tabela_filmes (id, nome, descricao, ano)
VALUES (10,"Entergalactic","Esta vibrante história de amor acompanha dois artistas jovens
e ambiciosos.", 2022);

INSERT INTO tabela_filmes (id, nome, descricao, ano)
VALUES (11,"Os Piratas - Em Busca do Tesouro Perdido", "Um bando de piratas é atraído pelas promessas lendárias de tesouros escondidos em regiões remotas.", 2022);


INSERT INTO tabela_filmes (id, nome, descricao, ano)
VALUES (12,"Monster High: O Filme","Musical live-action", 2022);


INSERT INTO tabela_filmes (id, nome, descricao, ano)
VALUES (13,"Fullmetal Alchemist - A Vingança de Scar","Os irmãos Elric encontram o oponente mais difícil até agora: um serial killer", 2022);


INSERT INTO tabela_filmes (id, nome, descricao, ano)
VALUES (14,"Morbius","Baseado no personagem de mesmo nome da Marvel Comics.", 2022);


INSERT INTO tabela_filmes (id, nome, descricao, ano)
VALUES (15,"Samaritan","Sam Cleary, de 13 anos, suspeita que seu misterioso vizinho, o Sr. Smith, seja na verdade uma lenda escondida à vista de todos.", 2022);


INSERT INTO tabela_filmes (id, nome, descricao, ano)
VALUES (16,"Agente Oculto","O agente mais valioso da CIA, cuja identidade é desconhecida, descobre segredos da agência e desencadeia uma caçada global por assassinos libertados por seu ex-colega.", 2022);


INSERT INTO tabela_filmes (id, nome, descricao, ano)
VALUES (17,"Jurassic World: Domínio","Quatro anos após a destruição da Ilha Nublar, os dinossauros agora vivem e caçam ao lado de humanos em todo o mundo.", 2022);


INSERT INTO tabela_filmes (id, nome, descricao, ano)
VALUES (18,"Agente das Sombras","Travis Block trabalha para o FBI, mas não é um agente comum.", 2022);



insert INTO tabela_filmes (id, nome, descricao, ano)
VALUES (19,"Os Opostos Sempre se Atraem","Reunidos depois de uma década, dois policiai
s com personalidades opostas investigam um assassinato em uma cidade que é palco de uma grande conspiração.", 2022);

insert INTO tabela_filmes (id, nome, descricao, ano)
VALUES (20,"The Princess","Filme de ação e fantasia.", 2022);

ALTER TABLE tabela_filmes ADD pagina int;

update tabela_filmes set pagina = 1 where id < 11;
update tabela_filmes set pagina = 2 where id > 10;

