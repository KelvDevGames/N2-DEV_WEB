DROP TABLE IF EXISTS sprite;

CREATE TABLE sprite(
id_sprite BIGINT AUTO_INCREMENT,
nome VARCHAR(100) NOT NULL,
tamanho long NOT NULL,
valor double NOT NULL,
PRIMARY KEY (id_sprite));
