INSERT INTO tb_fabricante(nome) VALUES('Fiat');
INSERT INTO tb_fabricante(nome) VALUES('Ford');
INSERT INTO tb_fabricante(nome) VALUES('Toyota');

INSERT INTO tb_modelo_carro(descricao, categoria, fabricante_id) VALUES('Uno', 'HATCH_COMPACTO', 1);
INSERT INTO tb_modelo_carro(descricao, categoria, fabricante_id) VALUES('Corola', 'SEDAN_GRANDE', 3);
INSERT INTO tb_modelo_carro(descricao, categoria, fabricante_id) VALUES('Pulse', 'HATCH_MEDIO', 1);

INSERT INTO tb_carro(placa, chassi, cor, valor_total, modelo_carro_id) VALUES ('aaa-2222', 'chaAAAAA', 'preto', 80000.00, 1);
INSERT INTO tb_carro(placa, chassi, cor, valor_total, modelo_carro_id) VALUES ('bbb-2222', 'chaBBBBB', 'verde', 120000.00, 2);
INSERT INTO tb_carro(placa, chassi, cor, valor_total, modelo_carro_id) VALUES ('ccc-2222', 'chaCCCCC', 'azul', 90000.00, 3);

INSERT INTO tb_acessorio(descricao) VALUES ('ar condicionado forte');
INSERT INTO tb_acessorio(descricao) VALUES ('carro hibrido');
INSERT INTO tb_acessorio(descricao) VALUES ('air bag');


INSERT INTO tb_carro_acessorio(carro_id, acessorio_id) VALUES (1,1);
INSERT INTO tb_carro_acessorio(carro_id, acessorio_id) VALUES (2,1);
INSERT INTO tb_carro_acessorio(carro_id, acessorio_id) VALUES (2,2);
INSERT INTO tb_carro_acessorio(carro_id, acessorio_id) VALUES (2,3);
INSERT INTO tb_carro_acessorio(carro_id, acessorio_id) VALUES (3,1);
INSERT INTO tb_carro_acessorio(carro_id, acessorio_id) VALUES (3,3);



INSERT INTO tb_pessoa(nome, data_nascimento, cpf, sexo) VALUES ('João', '1980-05-19', '00078945612', 'MASCULINO');
INSERT INTO tb_pessoa(nome, data_nascimento, cpf, sexo) VALUES ('Pedro', '1985-07-10', '00012365410', 'MASCULINO');
INSERT INTO tb_pessoa(nome, data_nascimento, cpf, sexo) VALUES ('Maria', '1990-11-13', '33378945699', 'FEMININO');	
INSERT INTO tb_funcionario(id, matricula) VALUES (1, '1001');
INSERT INTO tb_motorista(id, numero_cnh) VALUES (1, '2024-12345');
INSERT INTO tb_funcionario(id, matricula) VALUES (2, '1002');
INSERT INTO tb_funcionario(id, matricula) VALUES (3, '1003');

INSERT INTO tb_aluguel (data_pedido, data_entrega, data_devolucao, valor_total, carro_id, motorista_id) VALUES ('2024-01-01', '2024-03-01', '2024-03-01', 1500.00, 1, 1);
INSERT INTO tb_aluguel (data_pedido, data_entrega, data_devolucao, valor_total, carro_id, motorista_id) VALUES ('2024-01-01', '2024-04-01', '2024-04-01', 1600.00, 1, 1);
INSERT INTO tb_aluguel (data_pedido, data_entrega, data_devolucao, valor_total, carro_id, motorista_id) VALUES ('2024-01-01', '2024-05-01', '2024-05-01', 1700.00, 3, 1);


INSERT INTO tb_apolice_seguro (valor_franquia, protecao_terceiro, protecao_causas_naturais, protecao_roubo, aluguel_id) VALUES (8000.00, 1, 0, 1, 2);
INSERT INTO tb_apolice_seguro (valor_franquia, protecao_terceiro, protecao_causas_naturais, protecao_roubo, aluguel_id) VALUES (6000.00, 1, 0, 0, 1);
INSERT INTO tb_apolice_seguro (valor_franquia, protecao_terceiro, protecao_causas_naturais, protecao_roubo, aluguel_id) VALUES (10000.00, 1, 1, 1, 3);


