create database frango_express;
use frango_express;


create table tb_clientes (
id_cli int primary key auto_increment,
nome_cli varchar(50) not null,
end_cli varchar(80) not null,
fone_cli varchar(20) not null,
email_cli varchar(40)
);

create table tb_usuarios (
id_usu int primary key auto_increment,
login varchar(12) not null,
senha varchar(10) not null,
nome_usu varchar(50) not null,
end_usu varchar(80),
fone_usu varchar(20) not null
);

create table tb_produtos (
id_prod int primary key auto_increment,
nome_prod varchar(20) not null,
valor_prod int(4.2) not null
);

create table tb_entregadores (
id_ent int primary key auto_increment,
nome_ent varchar(50) not null,
end_ent varchar(80) not null,
fone_ent varchar(20) not null,
email_ent varchar(40)
);

create table tb_pedidos (
id_ped int primary key auto_increment,
data_ped timestamp default current_timestamp,
info_ped varchar(150),
valor_ped int not null,
id_cli int not null,
foreign key(id_cli) references tb_clientes(id_cli)
);

alter table tb_usuarios add column perfil varchar(8);
INSERT INTO tb_usuarios (id_usu,login,senha,nome_usu,end_usu,fone_usu, perfil) 
values(null,"admin","admin","Administrador", "","", "admin");
INSERT INTO tb_usuarios (id_usu,login,senha,nome_usu,end_usu,fone_usu, perfil) 
values(null,"ana","admin","Ana", "","", "user");