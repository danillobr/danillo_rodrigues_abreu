insert into game(id, name, objective_game) values (1, 'left 4 dead', 'Matar zumbis')
insert into video_game(id, release_date, type_console, game_id) values (1, '2008-11-18', 'pc e xbox', 1)

insert into game(id, name, objective_game) values (2, 'Resident Evil 4', 'Salvar a filha do presidente dos EUA')
insert into video_game(id, release_date, type_console, game_id) values (2, '2005-01-11', 'pc e playstation', 2)

insert into game(id, name, objective_game) values (3, 'Canastra', 'Fazer 2000 pontos antes do adversário')
insert into card_game(id, number_cards, type_card_game, rules,game_id) values (3, 52, 'baralho', 'cada jogador inicia o jogo com 11 cartas na mão. Só pode pegar 1 carta por vez do baralho, ao descer as 11 cartas o jogador pode pegar mais 11 cartas e se conseguir descer essas 11 a rodada acaba.', 3)

insert into game(id, name, objective_game) values (4, 'Desafios de Lógica', 'Resolver um problema mais rápido do que o Adversário ou antes que o tempo acabe.')
insert into logic_game(id, problem, respond, resolution_time, points, game_id) values (4, 'Qual a raiz cúbica 16?', '2', '30 segundos', 5, 4)

insert into game(id, name, objective_game) values (5, 'Dama', 'Pegar todas as peças do adversário!')
insert into board_game(id, number_parts, rules, game_id) values (5, 16, 'O jogo de damas é praticado em um tabuleiro de 64 casas, claras e escuras. A grande diagonal (escura), deve ficar sempre à esquerda de cada jogador. O objetivo do jogo é imobilizar ou capturar todas as peças do adversário.', 5)

insert into game(id, name, objective_game) values (6, 'Sinuca', 'Derrubar mais bolas do que o(s) outro(os) jogador(es).')
insert into table_game(id, number_players, rules, game_id) values (6, 'pode ser jogada sozinha ou com amigos', 'Deve-se usar o taco somente na bol braca , afim de rerrubar as demais bolas no buraco. Não pode derrubar a bola branca no buraco!', 6)

insert into game(id, name, objective_game) values (7, 'Advinhar cor', 'A partir das dicas, adivinhar qual a cor se trata.')
insert into quiz(id, tips, questions, points, rules, game_id) values (7, 'Dica 1: cor clara, Dica 2: Proxima de Azul, Dica 3:...', 'qual a cor da camisa do Pedrinho?...', 100, 'Só vale dar um dica por rodada e apenas tem uma chance de chutar a cor por rodada.', 7)

insert into game(id, name, objective_game) values (8, 'Adivinhar Pares', 'Encontrar todos os pares antes que o tempo de resolução acabe.')
insert into memory_game(id, number_pairs, resolution_time, game_id) values (8, 10, '50 segundos', 8)