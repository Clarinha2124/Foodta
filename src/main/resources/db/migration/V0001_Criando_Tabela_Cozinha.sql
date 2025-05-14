Create Table tb_cozinhas(
    id bigint not null auto_increment,
    nome_cozinha varchar (70),
    primary key (id)
) engine=InnoDB default charset=utf8;

Create table  tb_restaurante(
    id bigint not null auto_increment,
    nome_restaurante varchar(100),
    taxa_frete Decimal
) engine=InnoDB default charset=utf8;

Create table tb_formadepagamento(
    id bigint not null auto_increment,
    nome_formadepagamento varchar(50)

)