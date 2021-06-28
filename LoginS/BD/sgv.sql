-- phpMyAdmin SQL Dump
-- version 4.8.3
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1:3306
-- Generation Time: 01-Nov-2019 às 10:27
-- Versão do servidor: 5.7.23
-- versão do PHP: 7.2.10

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `sgv`
--

-- --------------------------------------------------------

--
-- Estrutura da tabela `compra`
--

DROP TABLE IF EXISTS `compra`;
CREATE TABLE IF NOT EXISTS `compra` (
  `id_compra` int(11) NOT NULL AUTO_INCREMENT,
  `Produto_C` varchar(200) NOT NULL,
  `Quantidade` int(30) NOT NULL,
  `Preco` double NOT NULL,
  `Data` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`id_compra`)
) ENGINE=MyISAM AUTO_INCREMENT=12 DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `compra`
--

INSERT INTO `compra` (`id_compra`, `Produto_C`, `Quantidade`, `Preco`, `Data`) VALUES
(1, 'Acucar', 10, 30, '2019-03-31 18:50:21'),
(2, 'Amendoim', 40, 20, '2019-03-31 18:50:48'),
(3, 'Chocolate', 30, 100, '2019-03-31 18:51:32'),
(4, 'Refresco', 20, 300, '2019-03-31 18:53:12'),
(5, 'computador', 0, 4000, '2019-09-19 14:42:26'),
(6, 'Acucar', 100, 200, '2019-09-19 17:56:42'),
(7, 'computador', -60, 100, '2019-09-19 20:02:53'),
(8, 'computador', -20, 100, '2019-09-19 20:03:08'),
(9, 'Acucar', 200, 200, '2019-09-24 13:04:10'),
(10, 'Acucar', 100, 200, '2019-09-24 13:04:25'),
(11, 'computador', 10, 100, '2019-09-24 13:12:05');

-- --------------------------------------------------------

--
-- Estrutura da tabela `descricao_vendas`
--

DROP TABLE IF EXISTS `descricao_vendas`;
CREATE TABLE IF NOT EXISTS `descricao_vendas` (
  `id_Tvendas` int(11) NOT NULL AUTO_INCREMENT,
  `id_Mercadoria` int(11) NOT NULL,
  `Preco` double NOT NULL,
  `quantidade` int(11) NOT NULL,
  `valor_pagar` double NOT NULL,
  `id_Tvenda` int(11) NOT NULL,
  `Desconto` double NOT NULL,
  `NomeP` varchar(1000) NOT NULL,
  `Stock` int(11) NOT NULL,
  `VRB` double NOT NULL,
  `Data` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`id_Tvendas`)
) ENGINE=MyISAM AUTO_INCREMENT=8 DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `descricao_vendas`
--

INSERT INTO `descricao_vendas` (`id_Tvendas`, `id_Mercadoria`, `Preco`, `quantidade`, `valor_pagar`, `id_Tvenda`, `Desconto`, `NomeP`, `Stock`, `VRB`, `Data`) VALUES
(1, 6, 250, 1, 250, 2, 0, 'Acucar', 120, 2170, '2019-09-21 19:51:46'),
(2, 5, 240, 2, 480, 2, 0, 'computador', 102, 2170, '2019-09-21 19:51:46'),
(3, 5, 240, 6, 1440, 2, 0, 'computador', 102, 2170, '2019-09-21 19:51:46'),
(4, 6, 250, 6, 1500, 3, 0, 'Acucar', 119, 1500, '2019-09-21 19:51:46'),
(5, 6, 250, 12, 3000, 4, 0, 'Acucar', 213, 3500, '2019-10-10 16:23:21'),
(6, 6, 250, 2, 500, 4, 0, 'Acucar', 213, 3500, '2019-10-10 16:23:21'),
(7, 6, 250, 10, 2500, 5, 0, 'Acucar', 199, 2500, '2019-10-19 08:10:31');

-- --------------------------------------------------------

--
-- Estrutura da tabela `fornecedor`
--

DROP TABLE IF EXISTS `fornecedor`;
CREATE TABLE IF NOT EXISTS `fornecedor` (
  `id_for` int(11) NOT NULL AUTO_INCREMENT,
  `Nome` varchar(200) NOT NULL,
  `contacto` int(50) NOT NULL,
  `Email` varchar(100) NOT NULL,
  `endereco` varchar(200) NOT NULL,
  `Data` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `foto` varchar(200) NOT NULL,
  PRIMARY KEY (`Nome`),
  KEY `id_for` (`id_for`)
) ENGINE=MyISAM AUTO_INCREMENT=13 DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `fornecedor`
--

INSERT INTO `fornecedor` (`id_for`, `Nome`, `contacto`, `Email`, `endereco`, `Data`, `foto`) VALUES
(1, 'Antonio', 83838383, 'antonio@fmail.com', 'Avenida das Industrias\n', '2019-02-09 19:55:38', 'C:/Users/Junior Cua/Documents/NetBeansProjects/LoginS/foto/fornecedor/2016-Toyota-Land-Cruiser-GXR-Awesome-Car.jpg'),
(5, 'Marilia', 846463383, 'Mairlia@gmail.com', 'Boane', '2019-02-11 11:18:00', 'C:/Users/Junior Cua/Documents/NetBeansProjects/LoginS/foto/fornecedor/cool-car-wallpapers-hd-10.jpg'),
(7, 'Maria', 847372620, 'maria@gmail.com', 'sikwama', '2019-02-11 11:48:18', 'C:/Users/Junior Cua/Documents/NetBeansProjects/LoginS/foto/fornecedor/architecture-wallpapers-18.jpg'),
(10, 'Karen Cua', 846382637, 'karen@gmail.com', 'Matola rio', '2019-02-11 11:56:18', 'C:/Users/Junior Cua/Documents/NetBeansProjects/LoginS/foto/fornecedor/Unitiva.jpg');

-- --------------------------------------------------------

--
-- Estrutura da tabela `login`
--

DROP TABLE IF EXISTS `login`;
CREATE TABLE IF NOT EXISTS `login` (
  `id_login` int(11) NOT NULL AUTO_INCREMENT,
  `Nome_User` varchar(100) NOT NULL,
  `Senha` varchar(50) NOT NULL,
  `Data` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `Ide` int(11) NOT NULL,
  PRIMARY KEY (`id_login`)
) ENGINE=MyISAM AUTO_INCREMENT=14 DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `login`
--

INSERT INTO `login` (`id_login`, `Nome_User`, `Senha`, `Data`, `Ide`) VALUES
(10, 'Antonio', '12345', '2019-04-05 07:52:23', 12),
(9, 'Antonio', '12345', '2019-04-01 07:25:30', 12),
(8, 'Antonio', '12345', '2019-03-31 20:41:44', 12),
(7, 'Antonio', '12345', '2019-03-31 20:38:50', 12),
(5, 'Antonio', '12345', '2019-03-15 10:38:56', 12),
(6, 'Antonio', '12345', '2019-03-15 10:41:43', 12),
(11, 'Antonio', '12345', '2019-04-30 18:22:40', 12),
(12, 'Antonio', '12345', '2019-09-19 20:26:10', 12),
(13, 'Antonio', '12345', '2019-09-22 15:06:54', 12);

-- --------------------------------------------------------

--
-- Estrutura da tabela `mercadoria`
--

DROP TABLE IF EXISTS `mercadoria`;
CREATE TABLE IF NOT EXISTS `mercadoria` (
  `id_mercadoria` int(11) NOT NULL AUTO_INCREMENT,
  `nome_produto` varchar(200) NOT NULL,
  `id_Produto` int(11) NOT NULL,
  `Quantidade` int(11) NOT NULL,
  `preco` double NOT NULL,
  `valor` double NOT NULL,
  `P_venda` double NOT NULL,
  `Descontos` double NOT NULL,
  `Fornecedor` varchar(100) NOT NULL,
  `Data` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`id_mercadoria`),
  UNIQUE KEY `nome_produto` (`nome_produto`)
) ENGINE=MyISAM AUTO_INCREMENT=7 DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `mercadoria`
--

INSERT INTO `mercadoria` (`id_mercadoria`, `nome_produto`, `id_Produto`, `Quantidade`, `preco`, `valor`, `P_venda`, `Descontos`, `Fornecedor`, `Data`) VALUES
(6, 'Acucar', 2, 189, 200, 42600, 250, 0, 'Marilia', '2019-09-19 14:47:57');

-- --------------------------------------------------------

--
-- Estrutura da tabela `produto`
--

DROP TABLE IF EXISTS `produto`;
CREATE TABLE IF NOT EXISTS `produto` (
  `codP` int(11) NOT NULL AUTO_INCREMENT,
  `nomeP` varchar(200) NOT NULL,
  `categoriaP` varchar(100) NOT NULL,
  `foto` text NOT NULL,
  `Descricao` varchar(200) NOT NULL,
  `prateleira` int(11) NOT NULL,
  `Marca` varchar(100) NOT NULL,
  `Data` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`codP`),
  UNIQUE KEY `nomeP` (`nomeP`)
) ENGINE=MyISAM AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `produto`
--

INSERT INTO `produto` (`codP`, `nomeP`, `categoriaP`, `foto`, `Descricao`, `prateleira`, `Marca`, `Data`) VALUES
(1, 'computador', 'eletrodomestico', 'C:/Users/Junior Cua/Documents/NetBeansProjects/LoginS/foto/Produto/2016-Toyota-Land-Cruiser-GXR-Awesome-Car.jpg', 'caixas', 2, 'HP', '2019-09-19 14:25:24'),
(2, 'Acucar', 'alimento', 'C:/Users/Junior Cua/Documents/NetBeansProjects/LoginS/foto/Produto/architecture-wallpapers-5.jpg', 'embalagem', 3, 'acucar nacional', '2019-09-19 14:29:07');

-- --------------------------------------------------------

--
-- Estrutura da tabela `taxas`
--

DROP TABLE IF EXISTS `taxas`;
CREATE TABLE IF NOT EXISTS `taxas` (
  `id_Taxa` int(11) NOT NULL AUTO_INCREMENT,
  `Iva` double NOT NULL,
  `Data` timestamp NULL DEFAULT CURRENT_TIMESTAMP,
  `Usuario` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`id_Taxa`)
) ENGINE=MyISAM AUTO_INCREMENT=5 DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `taxas`
--

INSERT INTO `taxas` (`id_Taxa`, `Iva`, `Data`, `Usuario`) VALUES
(1, 17, '2019-02-16 07:40:31', NULL),
(3, 10, '2019-02-19 17:58:26', NULL),
(4, 17, '2019-02-19 17:58:45', NULL);

-- --------------------------------------------------------

--
-- Estrutura da tabela `usuario`
--

DROP TABLE IF EXISTS `usuario`;
CREATE TABLE IF NOT EXISTS `usuario` (
  `id_user` int(30) NOT NULL AUTO_INCREMENT,
  `nome_User` varchar(200) NOT NULL,
  `Senha` varchar(50) NOT NULL,
  `Co_Senha` varchar(50) NOT NULL,
  `contacto_User` int(50) NOT NULL,
  `sexo` varchar(100) NOT NULL,
  `funcao` varchar(100) NOT NULL,
  `endereco` varchar(100) NOT NULL,
  `Email` varchar(100) NOT NULL,
  `foto` varchar(300) DEFAULT NULL,
  `Nivel` varchar(100) NOT NULL,
  `Data` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`nome_User`),
  KEY `id` (`id_user`)
) ENGINE=MyISAM AUTO_INCREMENT=15 DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `usuario`
--

INSERT INTO `usuario` (`id_user`, `nome_User`, `Senha`, `Co_Senha`, `contacto_User`, `sexo`, `funcao`, `endereco`, `Email`, `foto`, `Nivel`, `Data`) VALUES
(12, 'Antonio', '12345', '12345', 844132504, 'Masculino', 'Administrador', 'sikwama', 'antonio@gmail.com', 'C:/Users/Junior Cua/Documents/NetBeansProjects/LoginS/foto/Usuario/architecture-wallpapers-9.jpg', 'Administrador', '2019-03-14 18:33:17'),
(13, 'Karen', '000', '000', 84372623, 'Feminino', 'Usuario', 'beluluane', 'karen@gmail.com', 'C:/Users/Junior Cua/Documents/NetBeansProjects/LoginS/foto/Usuario/hulk-wallpaper-21.jpg', 'Usuario', '2019-03-14 18:35:18');

-- --------------------------------------------------------

--
-- Estrutura da tabela `venda`
--

DROP TABLE IF EXISTS `venda`;
CREATE TABLE IF NOT EXISTS `venda` (
  `id_Venda` int(11) NOT NULL AUTO_INCREMENT,
  `VRecebido` double NOT NULL,
  `VPago` double NOT NULL,
  `Trocos` double NOT NULL,
  `Desconto` double NOT NULL,
  `Iva` double NOT NULL,
  `Plastico` double NOT NULL,
  `Data` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`id_Venda`)
) ENGINE=MyISAM AUTO_INCREMENT=6 DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `venda`
--

INSERT INTO `venda` (`id_Venda`, `VRecebido`, `VPago`, `Trocos`, `Desconto`, `Iva`, `Plastico`, `Data`) VALUES
(2, 2170, 3000, 830, 0, 0, 0, '2019-09-19 18:41:30'),
(3, 1500, 2000, 500, 0, 0, 0, '2019-09-21 19:45:33'),
(4, 3500, 4000, 500, 0, 0, 0, '2019-10-10 16:23:19'),
(5, 2500, 3000, 500, 0, 0, 0, '2019-10-19 08:10:29');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
