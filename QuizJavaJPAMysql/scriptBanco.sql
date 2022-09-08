create database pb_quiz;
use pb_quiz;


INSERT INTO `pb_quiz`.`questoes` (`ativa`,`pergunta`,`verdadeira`) VALUES ( true,"Pergunta: Nossos produtos são todos originais de fábrica?",true);
INSERT INTO `pb_quiz`.`questoes` (`ativa`,`pergunta`,`verdadeira`) VALUES ( true,"Pergunta: Nossos produtos possuem garantia?",true);
INSERT INTO `pb_quiz`.`questoes` (`ativa`,`pergunta`,`verdadeira`) VALUES ( true,"Pergunta: A garantia dos nossos produtos é de 180 dias após a entrega?",false);
INSERT INTO `pb_quiz`.`questoes` (`ativa`,`pergunta`,`verdadeira`) VALUES ( true,"Pergunta: Nossos produtos possuem a melhor qualidade do mercado?",true);
INSERT INTO `pb_quiz`.`questoes` (`ativa`,`pergunta`,`verdadeira`) VALUES ( true,"Pergunta: É verdade que nossos produtos não são seguros?",false);
INSERT INTO `pb_quiz`.`questoes` (`ativa`,`pergunta`,`verdadeira`) VALUES ( true,"Pergunta: A linha de produtos HighQuality foi lançada em 2022?",false);
INSERT INTO `pb_quiz`.`questoes` (`ativa`,`pergunta`,`verdadeira`) VALUES ( true,"Pergunta: É verdade que a garantia é de 1 ano para qualquer produto da nossa loja?",true);
INSERT INTO `pb_quiz`.`questoes` (`ativa`,`pergunta`,`verdadeira`) VALUES ( true,"Pergunta: Temos frete gratuito para todo Brasil?",true);
INSERT INTO `pb_quiz`.`questoes` (`ativa`,`pergunta`,`verdadeira`) VALUES ( true,"Pergunta: È verdade que todo mês tem promoção de produtos diversos?",true);
INSERT INTO `pb_quiz`.`questoes` (`ativa`,`pergunta`,`verdadeira`) VALUES ( true,"Pergunta: O frete gratuito é acima de R$ 200,00 em produtos?",false);


UPDATE `pb_quiz`.`questoes` SET `ativa` = false  WHERE `id` = 1;
UPDATE `pb_quiz`.`questoes` SET `ativa` = false  WHERE `id` = 5;
UPDATE `pb_quiz`.`questoes` SET `ativa` = false  WHERE `id` = 7;