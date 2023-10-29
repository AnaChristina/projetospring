drop schema if exists spring;

drop user if exists 'user'@'localhost';

create schema spring;

create user 'user'@'localhost' identified by 'pass123';

grant select, insert, delete, update on spring.* to user@'localhost';

use spring;

create table trm_turma (
  trm_id bigint primary key auto_increment,
  trm_data_hora_cadastro datetime not null,
  trm_ano int not null,
  trm_semestre int not null,
  trm_tamanho int
);


insert into trm_turma (trm_data_hora_cadastro, trm_ano, trm_semestre, trm_tamanho)
  values ('2023-10-24 10:00', 2023, 1, 35), ('2023-10-24 11:00', 2023, 2, null);

  
