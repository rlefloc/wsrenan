-- Sintaxe para criação do database
create database itau;

-- Sintaxe para por em uso o Database
use itau;

-- Sintaxe utilizada para construição de tabela
create table itau.clientes(
cod_cliente integer not null primary key,
nome_cliente varchar(50) not null,
idade_cliente integer not null,
email_cliente varchar(80) not null);

-- Sintaxe utilizada para ver a estrutura da nossa database
describe itau.clientes;

-- Sintaxe utilizada para insercao de registros na tabela
insert into itau.clientes
(cod_cliente,nome_cliente,idade_cliente,email_cliente)
values
(1, "Monica", 20, "monica@unibanco.com.br"),
(2, "Ricardo Sergio", 22, "ricardo@unibanco.com.br"),
(3, "Ronaldo Oliveira", 19, "ronaldo.o@unibanco.com.br"),
(4, "Regiane Silva", 19, "regiane.s@unibanco.com.br");

-- Sintaxe para visualizar os registros da tabela
Select * from itau.clientes;

use itau;
INSERT INTO `clientes` (`cod_cliente`,`nome_cliente`,`idade_cliente`,`email_cliente`) VALUES (5,"Hamish U. Monroe",27,"Cum@lacuspede.co.uk"),(6,"Hedda M. Tucker",77,"erat@fringilla.edu"),(7,"Brock O. Reese",36,"mollis@semper.co.uk"),(8,"Cairo B. Roy",83,"porttitor@tacitisociosqu.org"),(9,"Shelly Crane",70,"ornare.tortor.at@CurabiturmassaVestibulum.ca"),(10,"Maite H. Young",53,"accumsan.sed.facilisis@imperdietnec.org"),(11,"Chloe Kidd",18,"ipsum.primis@Quisque.com"),(12,"Hedwig S. Scott",56,"vestibulum.nec@libero.com"),(13,"Darrel Y. Mcconnell",88,"Maecenas.iaculis.aliquet@acmetusvitae.ca"),(14,"Ronan B. Hayden",98,"ac.eleifend@nullamagnamalesuada.co.uk");
INSERT INTO `clientes` (`cod_cliente`,`nome_cliente`,`idade_cliente`,`email_cliente`) VALUES (15,"Tate P. Hayden",44,"vitae.semper@egestasa.net"),(16,"Hyacinth Dixon",66,"et.arcu.imperdiet@eu.org"),(17,"Karina Adams",49,"et.commodo.at@Duisvolutpatnunc.net"),(18,"Maisie L. Humphrey",86,"eleifend.Cras.sed@ut.ca"),(19,"Pascale Z. Noel",18,"venenatis.a.magna@tristiqueac.ca"),(20,"Hadassah Hodge",74,"fringilla.mi@nequevenenatislacus.ca"),(21,"Martina Vang",67,"consectetuer@Etiamgravidamolestie.edu"),(22,"Carl York",22,"id@dignissimlacusAliquam.co.uk"),(23,"Dean Mccormick",62,"hymenaeos@eu.com"),(24,"Brianna L. Salas",91,"penatibus.et.magnis@enimEtiam.com");
INSERT INTO `clientes` (`cod_cliente`,`nome_cliente`,`idade_cliente`,`email_cliente`) VALUES (25,"Robert W. Hubbard",88,"aliquet.metus@ligula.net"),(26,"Quintessa M. Mccormick",56,"adipiscing.fringilla@antelectusconvallis.ca"),(27,"Rama Rosales",26,"nonummy.ultricies@nectempus.edu"),(28,"Kenneth L. Knowles",19,"semper@consequat.com"),(29,"Aidan Delacruz",76,"elit.a.feugiat@Duiselementum.edu"),(30,"Jeanette M. Hess",73,"interdum.feugiat@ultriciesdignissimlacus.ca"),(31,"Stacy Moore",83,"risus.odio.auctor@blandit.com"),(32,"Nevada Mccray",64,"fringilla.est@sagittis.net"),(33,"Serena J. Valencia",100,"mauris@fringilla.edu"),(34,"Erich Byrd",61,"ultrices@miDuisrisus.com");
INSERT INTO `clientes` (`cod_cliente`,`nome_cliente`,`idade_cliente`,`email_cliente`) VALUES (35,"Peter A. Cobb",51,"Sed@tellus.co.uk"),(36,"Kuame B. Cochran",53,"lacus.pede@eget.org"),(37,"Xanthus P. Bernard",58,"nec@faucibusidlibero.org"),(38,"Serina Montoya",33,"Morbi@non.edu"),(39,"Wyoming Cantrell",77,"adipiscing.fringilla@amet.edu"),(40,"Aurora P. Wilcox",91,"ut.pharetra@Sed.edu"),(41,"Jolie Whitley",78,"nec.tempus@elit.ca"),(42,"Madeson O. Underwood",37,"cursus.diam.at@lobortis.ca"),(43,"Oleg D. Evans",53,"a.ultricies.adipiscing@nostraper.org"),(44,"Pearl I. Suarez",84,"mauris.ipsum@ut.net");
INSERT INTO `clientes` (`cod_cliente`,`nome_cliente`,`idade_cliente`,`email_cliente`) VALUES (45,"Katell Leon",61,"lobortis.nisi.nibh@lorem.edu"),(46,"Lareina Bauer",76,"enim.Nunc.ut@etmagnisdis.edu"),(47,"Adele N. Tate",63,"dui@mattissemperdui.com"),(48,"Leo Molina",95,"tellus.id.nunc@enimgravidasit.com"),(49,"Claudia Snow",54,"nec.tempus.scelerisque@sedsemegestas.ca"),(50,"Brady Galloway",21,"Maecenas@viverra.com"),(51,"Ulric Cruz",35,"ultricies@aarcuSed.org"),(52,"Hope Dunlap",32,"In@faucibusut.edu"),(53,"Lyle Burris",90,"In.at@anuncIn.net"),(54,"Austin Joyner",73,"sagittis@cursus.edu");
INSERT INTO `clientes` (`cod_cliente`,`nome_cliente`,`idade_cliente`,`email_cliente`) VALUES (55,"Neville Dunn",82,"consectetuer@nec.org"),(56,"Hiram F. Herrera",56,"Donec.sollicitudin@odioapurus.org"),(57,"Daria Valencia",36,"nec@egetlacus.ca"),(58,"Ginger P. Nixon",18,"Nunc.pulvinar.arcu@velitegestaslacinia.co.uk"),(59,"Amity W. Parker",92,"Fusce@orcisem.org"),(60,"Bryar Dennis",88,"imperdiet.nec.leo@liberoProinmi.org"),(61,"Latifah Gordon",52,"ultrices.sit@dui.com"),(62,"Noelani Hayden",93,"magna@vulputatevelit.com"),(63,"Tanek S. King",98,"Curabitur.vel.lectus@Classaptent.org"),(64,"Eagan Wyatt",78,"eu.dolor@ultriciesligula.ca");
INSERT INTO `clientes` (`cod_cliente`,`nome_cliente`,`idade_cliente`,`email_cliente`) VALUES (65,"Doris Chen",77,"Maecenas.mi.felis@liberoInteger.ca"),(66,"Rama Robinson",82,"In.lorem@Aliquamrutrum.com"),(67,"Cassandra E. Ayala",63,"Nunc@egestas.co.uk"),(68,"Tiger Blanchard",83,"Integer.vulputate@dolor.ca"),(69,"Orson Sweet",67,"mauris.aliquam@ametante.edu"),(70,"Dorian Kirkland",56,"Phasellus@mattis.ca"),(71,"Yen I. Sargent",53,"ante.lectus.convallis@Fuscealiquetmagna.net"),(72,"Audra Hurst",49,"luctus.ipsum@Infaucibus.ca"),(73,"Constance Morton",50,"a.magna.Lorem@nec.com"),(74,"Yetta Thornton",93,"mi@posuerecubilia.org");
INSERT INTO `clientes` (`cod_cliente`,`nome_cliente`,`idade_cliente`,`email_cliente`) VALUES (75,"Mohammad Wilcox",27,"elit.Aliquam@nonante.edu"),(76,"Kirsten Guerra",34,"et@eu.com"),(77,"Russell Obrien",22,"risus@Namporttitor.com"),(78,"Laith Bender",81,"purus@nunc.com"),(79,"Eleanor Stuart",97,"Fusce.aliquam@Morbiquis.co.uk"),(80,"Gloria Kinney",48,"cursus.a@sedtortorInteger.co.uk"),(81,"Amy Moran",32,"ac.feugiat@Donec.co.uk"),(82,"Xaviera Floyd",67,"aliquet@Sedeu.edu"),(83,"Hilel Santos",25,"risus@magnatellusfaucibus.co.uk"),(84,"Yasir Justice",61,"porttitor@Phasellusfermentum.edu");
INSERT INTO `clientes` (`cod_cliente`,`nome_cliente`,`idade_cliente`,`email_cliente`) VALUES (85,"Uma Snyder",22,"cursus.Nunc.mauris@metus.edu"),(86,"Aline M. Brooks",87,"ante.ipsum@IntegerurnaVivamus.co.uk"),(87,"Macaulay Conley",27,"suscipit.est@massa.co.uk"),(88,"Anthony U. Patterson",27,"vitae.diam.Proin@eratvolutpatNulla.org"),(89,"Vincent T. Richmond",70,"Aliquam.erat.volutpat@Fuscemi.ca"),(90,"Gage B. Fields",60,"sem.molestie.sodales@metus.co.uk"),(91,"Isabelle S. Farmer",54,"Sed@nonleo.org"),(92,"Aurelia Y. Justice",38,"metus.facilisis.lorem@Donecfelis.org"),(93,"Alyssa Cohen",18,"at.sem@Donecdignissimmagna.edu"),(94,"Lee E. Berry",64,"et.magnis@arcuMorbi.com");
INSERT INTO `clientes` (`cod_cliente`,`nome_cliente`,`idade_cliente`,`email_cliente`) VALUES (95,"Beau Lane",64,"Cum.sociis@laciniamattisInteger.edu"),(96,"Chelsea K. Bush",31,"tellus@sagittisfelisDonec.edu"),(97,"Anjolie Gray",66,"metus@pharetra.edu"),(98,"Quemby O. Horn",34,"dui.Fusce.diam@ornare.org"),(99,"Hoyt Espinoza",67,"eleifend@vehiculaPellentesquetincidunt.edu"),(100,"Isadora Tanner",75,"vulputate@dictumplacerat.ca"),(101,"Zena J. Gross",70,"orci.quis.lectus@sociis.co.uk"),(102,"Scott K. Pugh",92,"eu@dui.com"),(103,"Camden Newton",91,"et@etrutrumnon.com"),(104,"Oprah T. Sanchez",90,"eu@dapibusquam.org");


select * from itau.tabela_alunos;

-- Sintaxe ver informacoes ordenados por ordem alfabetica
select nome_cliente, idade_cliente,email_cliente from itau.clientes order by nome_cliente;

-- sintaxe para criar um filtro na nossa tabela
select * from itau.clientes where idade_cliente=18;
select * from itau.clientes where idade_cliente<=20 order by idade_cliente;

-- Sintaxe para trazer uma faixa de registros
select * from itau.clientes where idade_cliente>=50 and idade_cliente<=70 order by idade_cliente;
select * from itau.clientes where idade_cliente between 50 and 70 order by idade_cliente desc;

-- sintaxe para contagem de registros
select count(*) as Total_Registro from itau.clientes where idade_cliente between 50 and 70;

-- Sintaxe para retornar o registro com o maior numero
select max(idade_cliente) as Maior_Idade from itau.clientes;
select * from itau.clientes where idade_cliente = 92;

-- Sintaxe para retornar o registro com o menor numero
select min(idade_cliente) as Menor_Idade from itau.clientes;

-- Sintaxe de sub-selects
select * from itau.clientes where idade_cliente=(select max(idade_cliente) from itau.clientes);
select * from itau.clientes where idade_cliente=(select min(idade_cliente) from itau.clientes);

-- sintaxe para fazer o filtro desejado de um ou mais registros especificos
select * from itau.clientes where idade_cliente in(30,40,50) order by idade_cliente;


select * from itau.clientes;


select * from itau.clientes where cod_cliente=4;
select * from itau.clientes where nome_cliente="Monica";

-- sintaxe utilizada para criar filtros em campos caracter like %
select * from itau.clientes where nome_cliente like "Regiane%";
select * from itau.clientes where nome_cliente like "%Silva";
select * from itau.clientes where nome_cliente like "%K.%";

-- sintaxe permite excluir a estrutura da tabela e todos os registros
drop table itau.teste;

-- sintaxe para criacao do bacup de tabela
create table itau.bck_clientes select * from itau.clientes;
select * from itau.bck_clientes;

select count(*) from itau.bck_clientes;
select count(*) from itau.clientes;

-- sintaxe utilizada para adicionar campos de uma tablea
alter table itau.clientes add (endereco varchar(80) not null, bairro_cliente varchar (50) not null);
alter table itau.clientes add endereco varchar(80) not null;


-- sintaxe utlizada para excluir campo da tabela
alter table itau.clientes drop endereco;

-- sintaxe utilizada para renomear campos da estrutura de uma tablea
alter table itau.clientes rename column endereco to endereco_cliente;
alter table itau.clientes rename column cod_cliente to codigo_cliente;


describe itau.clientes;
select * from itau.clientes;

-- sintaxe update, utilizado para inserir registros em campos novos ou com conteudo
update itau.clientes set endereco_cliente = "Rua Tito, 902" where cod_cliente=2;
update itau.clientes set endereco_cliente = "Rua Tito, 1000", bairro_cliente = "Vila Romana" where codigo_cliente=2;

update itau.clientes set endereco_cliente = "Atualizar Endereço" where endereco_cliente = "";
update itau.clientes set bairro_cliente="Atualizar Bairro" where codigo_cliente >1; -- incorreto

-- sintaxe para excluir a tabela e seus regitros
drop table itau.bck_clientes;

create table itau.bck_clientes select * from itau.clientes;

describe itau.clientes;

-- Sintaxe para alterar um campo na estrutura da tabela
alter table itau.clientes change endereco_cliente endereco_cliente varchar (60) not null;


-- sintaxe do comando delete, tulizado para apagar os registros de uma tabela

delete from itau.clientes;
delete from itau.clioentes where cidade_cliente >= 40;


select * from itau.clientes;

-- sintaxe utilizada para fazer a recuperacao dos dados do backup
insert into itau.clientes
 (codigo_cliente, nome_cliente, idade_cliente, email_cliente, endereco_cliente, bairro_cliente)
 select codigo_cliente, nome_cliente, idade_cliente, email_cliente, endereco_cliente, bairro_cliente from itau.bck_clientes where cidade_cliente >= 40;

-- Sintaxe utilizada para fazer a recuperacao dos dados do backup

describe itau.clientes;
describe itau.bck_clientes;

-- sintaxe delecao de tabela
drop table itau.clientes;

-- sintaxe restaura tabela toda
create table itau.clientes select * from itau.bck_clientes;
alter table itau.clientes change codigo_cliente codigo_cliente integer not null primary key;



-- Criando um processo de fusao entre as empresas
create database unibanco;
use unibanco;
create table unibanco.clientes select * from itau.clientes;

use itau;
drop table itau.bck_clientes, clientes, tabela_alunos;
drop table itau.clientes;

create table itau.clientes(
codigo_cliente integer not null auto_increment,
nome_cliente varchar (50) not null,
cpf_cliente char(11) not null,
idade_cliente integer not null,
endereco_cliente varchar (50) not null,
bairro_cliente varchar(40) not null,
estado_cliente char (20) not null,
email_cliente varchar(80)not null,
ddd_cliente char(3) not null,
telefone_cliente bigint not null,
ag_cliente char (4) not null,
conta_Corrente_cliente integer not null,
div_verificardor_cliente char(1) not null,
data_controle_registro datetime,
primary key (codigo_cliente, cpf_cliente));

describe itau.clientes;

insert into itau.clientes 
(nome_cliente,cpf_cliente,idade_cliente,endereco_cliente,bairro_cliente,
estado_cliente,email_cliente,ddd_cliente,telefone_cliente,ag_cliente,conta_Corrente_cliente,
div_verificardor_cliente,data_controle_registro) values (
"Renan","12312312312",31,"avenida washington luis,4150", "vila marieta", "sp", "lefloc@gmail.com", 
"019", 32232222, "0008", 30222,8,now());

select * from itau.clientes;

-- preencho select trocando os campos que nao possui 
select nome_cliente,"ATUALIZAR",idade_cliente,endereco_cliente,bairro_cliente,"XX",email_cliente,000,0,"0000","00000",0,now() from unibanco.clientes;

-- insiro o insert de cima junto com o select
insert into itau.clientes 
(nome_cliente,cpf_cliente,idade_cliente,endereco_cliente,bairro_cliente,
estado_cliente,email_cliente,ddd_cliente,telefone_cliente,ag_cliente,conta_Corrente_cliente,
div_verificardor_cliente,data_controle_registro) select nome_cliente,"ATUALIZAR",idade_cliente,endereco_cliente,bairro_cliente,"XX",email_cliente,000,0,"0000","00000",0,now() from unibanco.clientes;

-- testa ver se evoluiu
select * from itau.clientes;

create table itau.vendas(
codigo_venda integer not null auto_increment primary key,
nome_produto_vendido varchar(20) not null,
quantidade_vendida integer not null,
valor_unitario decimal(8,2) not null,
nome_vendedor varchar(50) not null);

insert into itau.vendas
(nome_produto_vendido,quantidade_vendida,valor_unitario,nome_vendedor)
values
("Mouse", 30, 39.50, "Marcos"),
("Teclado", 10, 50.99, "Cristina"),
("Monitor", 5, 450.00, "Cristina"),
("Impressora", 3, 280.00, "Marcos");


select * from itau.vendas;

-- Sintaxe calculando os campos de uma tabela
SELECT 
    nome_produto_vendido,
    quantidade_vendida,
    valor_unitario,
    (quantidade_vendida * valor_unitario) as Total_Parcial,
    nome_vendedor
FROM
    itau.vendas;


-- sintaxe calculando o total de produtos vendidos
SELECT 
    SUM(quantidade_vendida * valor_unitario) AS Total_Geral,
    nome_vendedor
FROM
    itau.vendas group by nome_vendedor;
    
    
SELECT 
    COUNT(idade_cliente) AS Total_Pessoas, idade_cliente
FROM
    itau.clientes group by idade_cliente;
    
    
-- Criando relacionamento entre tabela
create table itau.cargos(
cod_cargo char(2) not null primary key,
nome_cargo varchar(30) not null,
valor_cargo decimal(8,2) not null);

create table itau.funcionarios(
matricula integer not null auto_increment,
nome_funcionario varchar(50) not null,
idade_funcionario integer not null,
cod_cargo_func char(2) not null,
primary key (matricula),
foreign key (cod_cargo_func) references itau.cargos(cod_cargo));
    
    
insert into itau.funcionarios
(nome_funcionario,idade_funcionario,cod_cargo_func)
values
("João",55,"C2"),
("Victor",38,"C1"),
("Renan",23,"C3"),
("Igor",20,"C3"),
("Vanessa",27,"C3");

insert into itau.cargos
(cod_cargo,nome_cargo,valor_cargo)
values
("C1","Analista de Sistemas",4850),
("C2","Suporte de Help Desk",2850),
("C3","Gerente de CPD",3500),
("C4","Jovem Aprendiz",1800);


