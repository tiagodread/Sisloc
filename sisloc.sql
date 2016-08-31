-- phpMyAdmin SQL Dump
-- version 4.2.11
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: 31-Ago-2016 às 16:35
-- Versão do servidor: 5.6.21
-- PHP Version: 5.6.3

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `sisloc`
--

-- --------------------------------------------------------

--
-- Estrutura da tabela `cliente`
--

CREATE TABLE IF NOT EXISTS `cliente` (
`idcliente` int(11) NOT NULL,
  `cnpj` varchar(20) DEFAULT NULL,
  `cpf` varchar(20) DEFAULT NULL,
  `nome` varchar(50) NOT NULL,
  `logradouro` varchar(45) NOT NULL,
  `numero` smallint(5) unsigned NOT NULL,
  `bairro` varchar(30) NOT NULL,
  `cidade` varchar(45) NOT NULL,
  `uf` char(2) NOT NULL,
  `telefone` varchar(14) NOT NULL,
  `celular` varchar(15) NOT NULL,
  `email` varchar(50) NOT NULL,
  `tipo` varchar(10) NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `cliente`
--

INSERT INTO `cliente` (`idcliente`, `cnpj`, `cpf`, `nome`, `logradouro`, `numero`, `bairro`, `cidade`, `uf`, `telefone`, `celular`, `email`, `tipo`) VALUES
(1, NULL, '36325583701', 'JOÃO DO PRADO', 'ERASMO MANUEL', 12, 'JARDIM AMÉRICA', 'CRUZEIRO', 'SP', '1231432021', '12987451236', 'JOAO.PRADO@HOTMAIL.COM', 'fisica'),
(2, NULL, '56369953938', 'LUCAS MARTINS DOS SANTOS', 'PADRE EMÍLIO COSTA', 45, 'VILA RICA', 'CRUZEIRO', 'SP', '1231458789', '12987416325', 'PADREEMILIO@HOTMAIL.COM', 'fisica'),
(3, NULL, '22134322446', 'SORAYA NUNES DO NASCIMENTO', 'OSWALDO CRUZ', 89, 'VILA BATISTA', 'CRUZEIRO', 'SP', '1231458720', '12987489874', 'SORAYA-NUNES@GMAIL.COM', 'fisica'),
(4, NULL, '70734762305', 'DILMA DA SILVA', 'BRASIL', 123, 'BANDEIRANTES', 'CACHOEIRA PAULISTA', 'SP', '1236982525', '1298741412023', 'DILMA_SILVA@GMAIL.COM', 'fisica'),
(5, '01671876000122', NULL, 'FORTES ADVOCACIA', 'TENENTE GERALDO LUIS', 852, 'VILA BATISTA', 'CRUZEIRO', 'SP', '1231456655', '12987463210', 'FORTES_ADV@HOTMAIL.COM', 'juridica'),
(6, 'null', '43420147856', 'TIAGO GOES DA SILVA', 'ARTHUR BARBOSA', 3, 'VILA CARMEM', 'CACHOEIRA PAULISTA', 'SP', '1231032082', '12981918216', 'TIAGO.GOES2009@HOTMAIL.COM', 'fisica'),
(7, 'null', '43782414802', 'GUILHERME ROCCATOPOPOPO', 'RUA 1', 50, 'CENTRO', 'CRUZEIRO', 'SP', '1111111111', '11111111111', 'GUILHERME@GMAIL.COM', 'fisica');

-- --------------------------------------------------------

--
-- Estrutura da tabela `fornecedor`
--

CREATE TABLE IF NOT EXISTS `fornecedor` (
  `cnpj` varchar(20) NOT NULL,
  `nome` varchar(45) NOT NULL,
  `telefone` varchar(10) NOT NULL,
  `logradouro` varchar(45) NOT NULL,
  `numero` smallint(5) unsigned NOT NULL,
  `bairro` varchar(45) NOT NULL,
  `cidade` varchar(45) NOT NULL,
  `uf` char(2) NOT NULL,
  `email` varchar(50) NOT NULL,
  `descricao` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `fornecedor`
--

INSERT INTO `fornecedor` (`cnpj`, `nome`, `telefone`, `logradouro`, `numero`, `bairro`, `cidade`, `uf`, `email`, `descricao`) VALUES
('12254856000172', 'JÚLIO CONTAINERS', '1231458899', 'CARMEN ROCHA', 147, 'JARDIM EUROPA', 'CRUZEIRO', 'SP', 'JULIO.CONTAINER@GMAIL.COM', 'FORNECE TODO TIPO DE CONTAINER'),
('78335615000166', 'TICO TECO CONSTRUÇÕES', '1231458787', 'ALTAIR SOBRINHO', 231, 'VILA RICA', 'CRUZEIRO', 'SP', 'TICO.TECO@HOTMAIL.COM', 'FORNECE BANHEIRO QUÍMICO');

-- --------------------------------------------------------

--
-- Estrutura da tabela `funcionario`
--

CREATE TABLE IF NOT EXISTS `funcionario` (
`matricula` int(11) NOT NULL,
  `cpf` varchar(20) NOT NULL,
  `nome` varchar(50) NOT NULL,
  `logradouro` varchar(45) NOT NULL,
  `numero` smallint(5) unsigned NOT NULL,
  `bairro` varchar(30) NOT NULL,
  `cidade` varchar(45) NOT NULL,
  `uf` char(2) NOT NULL,
  `telefone` varchar(14) NOT NULL,
  `celular` varchar(15) NOT NULL,
  `email` varchar(50) NOT NULL,
  `cargo` varchar(20) NOT NULL,
  `salario` float NOT NULL,
  `login` varchar(20) NOT NULL,
  `senha` varchar(20) NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `funcionario`
--

INSERT INTO `funcionario` (`matricula`, `cpf`, `nome`, `logradouro`, `numero`, `bairro`, `cidade`, `uf`, `telefone`, `celular`, `email`, `cargo`, `salario`, `login`, `senha`) VALUES
(1, '95436112706', 'GABRIEL COSTA', 'JÚLIO SIMÕES', 456, 'EXPEDICIONÁRIOS', 'CRUZEIRO', 'SP', '1231447845', '129876320', 'G.COSTA@GMAIL.COM', 'GERENTE', 1.2, 'gabriel', 'gabriel'),
(2, '75278371447', 'RICARDO MAYCON BRAGA', 'MARIA JOANA', 223, 'VILA PAULISTA', 'CRUZEIRO', 'SP', '1231436528', '12987465555', 'RMB-BRAGA@HOTMAIL.COM', 'ATENDENTE', 900, 'ricardo', 'ricardo'),
(3, '43420147856', 'TIAGO GOES DA SILVA', 'RUA 1', 3, 'VILA CARMEM', 'CACHOEIRA PTA', 'SP', '1231032082', '12981918216', 'TIAGO@GMAIL.COM', 'GERENTE', 1800, 'TIAGODREAD', 'taekwondo');

-- --------------------------------------------------------

--
-- Estrutura da tabela `item`
--

CREATE TABLE IF NOT EXISTS `item` (
  `locacao_idlocacao` int(11) NOT NULL,
  `idproduto` int(11) NOT NULL,
  `iditem` int(11) unsigned NOT NULL,
  `quantidade` int(11) NOT NULL,
  `qt_dias` int(11) NOT NULL,
  `data_inicio` varchar(10) NOT NULL,
  `data_fim` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `item`
--

INSERT INTO `item` (`locacao_idlocacao`, `idproduto`, `iditem`, `quantidade`, `qt_dias`, `data_inicio`, `data_fim`) VALUES
(1, 1, 1, 1, 3, '05/12/2015', '08/12/2015'),
(2, 4, 1, 1, 2, '06/12/2015', '08/12/2015'),
(3, 1, 1, 1, 8, '31/08/2016', '08/09/2016');

-- --------------------------------------------------------

--
-- Estrutura da tabela `locacao`
--

CREATE TABLE IF NOT EXISTS `locacao` (
  `idlocacao` int(11) NOT NULL,
  `cliente_idcliente` int(11) NOT NULL,
  `funcionario_matricula` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `locacao`
--

INSERT INTO `locacao` (`idlocacao`, `cliente_idcliente`, `funcionario_matricula`) VALUES
(1, 6, 3),
(2, 6, 3),
(3, 6, 3);

-- --------------------------------------------------------

--
-- Estrutura da tabela `produto`
--

CREATE TABLE IF NOT EXISTS `produto` (
`idproduto` int(11) NOT NULL,
  `nome` varchar(45) NOT NULL,
  `quantidade` smallint(5) unsigned NOT NULL,
  `valor_unitario` float NOT NULL,
  `descricao` varchar(50) NOT NULL,
  `fornecedor_cnpj` varchar(20) NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `produto`
--

INSERT INTO `produto` (`idproduto`, `nome`, `quantidade`, `valor_unitario`, `descricao`, `fornecedor_cnpj`) VALUES
(1, 'CONTAINER TIPO C', 100, 230, 'CONTAINER 2X5', '12254856000172'),
(2, 'CONTAINER TIPO B', 100, 250, 'CONTAINER 2X6', '12254856000172'),
(3, 'CONTAINER TIPO A', 100, 460, 'CONTAINER 3X8', '12254856000172'),
(4, 'BANHEIRO QUÍMICO', 100, 150, 'BANHEIRO QUÍMICO SIMPLES', '78335615000166'),
(5, 'CARRINHO DE MÃO', 100, 60, 'CARRINHO DE MÃO SIMPLES', '12254856000172');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `cliente`
--
ALTER TABLE `cliente`
 ADD PRIMARY KEY (`idcliente`);

--
-- Indexes for table `fornecedor`
--
ALTER TABLE `fornecedor`
 ADD PRIMARY KEY (`cnpj`);

--
-- Indexes for table `funcionario`
--
ALTER TABLE `funcionario`
 ADD PRIMARY KEY (`matricula`);

--
-- Indexes for table `item`
--
ALTER TABLE `item`
 ADD KEY `fk_item_produto1` (`idproduto`), ADD KEY `fk_item_locacao1` (`locacao_idlocacao`);

--
-- Indexes for table `locacao`
--
ALTER TABLE `locacao`
 ADD PRIMARY KEY (`idlocacao`), ADD KEY `fk_locacao_cliente1` (`cliente_idcliente`), ADD KEY `fk_locacao_funcionario1` (`funcionario_matricula`);

--
-- Indexes for table `produto`
--
ALTER TABLE `produto`
 ADD PRIMARY KEY (`idproduto`), ADD KEY `fk_produto_fornecedor` (`fornecedor_cnpj`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `cliente`
--
ALTER TABLE `cliente`
MODIFY `idcliente` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=8;
--
-- AUTO_INCREMENT for table `funcionario`
--
ALTER TABLE `funcionario`
MODIFY `matricula` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=4;
--
-- AUTO_INCREMENT for table `produto`
--
ALTER TABLE `produto`
MODIFY `idproduto` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=6;
--
-- Constraints for dumped tables
--

--
-- Limitadores para a tabela `item`
--
ALTER TABLE `item`
ADD CONSTRAINT `fk_item_locacao1` FOREIGN KEY (`locacao_idlocacao`) REFERENCES `locacao` (`idlocacao`) ON DELETE CASCADE ON UPDATE CASCADE,
ADD CONSTRAINT `fk_item_produto1` FOREIGN KEY (`idproduto`) REFERENCES `produto` (`idproduto`) ON DELETE NO ACTION ON UPDATE CASCADE;

--
-- Limitadores para a tabela `locacao`
--
ALTER TABLE `locacao`
ADD CONSTRAINT `fk_locacao_cliente1` FOREIGN KEY (`cliente_idcliente`) REFERENCES `cliente` (`idcliente`) ON DELETE NO ACTION ON UPDATE CASCADE,
ADD CONSTRAINT `fk_locacao_funcionario1` FOREIGN KEY (`funcionario_matricula`) REFERENCES `funcionario` (`matricula`) ON DELETE NO ACTION ON UPDATE CASCADE;

--
-- Limitadores para a tabela `produto`
--
ALTER TABLE `produto`
ADD CONSTRAINT `fk_produto_fornecedor` FOREIGN KEY (`fornecedor_cnpj`) REFERENCES `fornecedor` (`cnpj`) ON DELETE NO ACTION ON UPDATE CASCADE;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
