-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jul 17, 2024 at 06:00 PM
-- Server version: 10.4.32-MariaDB
-- PHP Version: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `db_uas_laundry`
--

-- --------------------------------------------------------

--
-- Table structure for table `customer`
--

CREATE TABLE `customer` (
  `number` int(5) NOT NULL,
  `id_user` varchar(20) NOT NULL,
  `username` varchar(30) NOT NULL,
  `nama` varchar(40) NOT NULL,
  `password` varchar(50) NOT NULL,
  `telpon` varchar(20) NOT NULL,
  `alamat` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `customer`
--

INSERT INTO `customer` (`number`, `id_user`, `username`, `nama`, `password`, `telpon`, `alamat`) VALUES
(14, 'CST14', 'mukti1', 'mukti aja', '123', '3344', 'bdg'),
(5, 'CST5', 'ka', 'kaka', '234', '0182309812345', 'dyh');

-- --------------------------------------------------------

--
-- Table structure for table `login`
--

CREATE TABLE `login` (
  `username` varchar(50) NOT NULL,
  `password` varchar(50) NOT NULL,
  `photo` varchar(500) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `login`
--

INSERT INTO `login` (`username`, `password`, `photo`) VALUES
('admin', '1234', 'C:UsersMyBook Hype AMDPicturesscrum.png'),
('kasir', 'kasir1', 'C:UsersMyBook Hype AMDPictureshamster.jpg'),
('kasir1', '123', 'C:UsersMyBook Hype AMDPicturescat10.jpg');

-- --------------------------------------------------------

--
-- Table structure for table `point_diskon`
--

CREATE TABLE `point_diskon` (
  `id_user` varchar(20) NOT NULL,
  `point` int(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `point_diskon`
--

INSERT INTO `point_diskon` (`id_user`, `point`) VALUES
('CST5', 0);

-- --------------------------------------------------------

--
-- Table structure for table `services`
--

CREATE TABLE `services` (
  `id_jenis_laundry` varchar(20) NOT NULL,
  `jenis_laundry` varchar(30) NOT NULL,
  `harga` int(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `services`
--

INSERT INTO `services` (`id_jenis_laundry`, `jenis_laundry`, `harga`) VALUES
('SRV-001', 'Cuci Setrika', 9000),
('SRV-002', 'Cuci Kering', 7000),
('SRV-003', 'Setrika', 6500),
('SRV-004', 'Bed Cover', 11000),
('SRV-005', 'Pickup and Delivery', 15000);

-- --------------------------------------------------------

--
-- Table structure for table `tab_pesanan`
--

CREATE TABLE `tab_pesanan` (
  `no` int(5) NOT NULL,
  `id_pesanan` varchar(50) NOT NULL,
  `tanggal` varchar(20) NOT NULL,
  `jam` varchar(10) NOT NULL,
  `id_user` varchar(20) NOT NULL,
  `nama` varchar(30) NOT NULL,
  `no_hp` varchar(20) NOT NULL,
  `alamat` varchar(50) NOT NULL,
  `services` varchar(100) NOT NULL,
  `berat` int(10) NOT NULL,
  `aktual_berat` int(10) NOT NULL,
  `ongkir` int(10) NOT NULL,
  `harga` int(10) NOT NULL,
  `diskon` int(10) NOT NULL,
  `total_bayar` int(10) NOT NULL,
  `status` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `tab_pesanan`
--

INSERT INTO `tab_pesanan` (`no`, `id_pesanan`, `tanggal`, `jam`, `id_user`, `nama`, `no_hp`, `alamat`, `services`, `berat`, `aktual_berat`, `ongkir`, `harga`, `diskon`, `total_bayar`, `status`) VALUES
(13, '#ORD-0013', '10/07/2024', '8', 'CST14', 'mukti aja', '3344', 'bdg', 'Cuci Setrika', 1, 1, 15000, 9000, 0, 24000, 'false');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `customer`
--
ALTER TABLE `customer`
  ADD PRIMARY KEY (`id_user`);

--
-- Indexes for table `login`
--
ALTER TABLE `login`
  ADD PRIMARY KEY (`username`);

--
-- Indexes for table `point_diskon`
--
ALTER TABLE `point_diskon`
  ADD KEY `point_diskon_fk` (`id_user`);

--
-- Indexes for table `services`
--
ALTER TABLE `services`
  ADD PRIMARY KEY (`id_jenis_laundry`);

--
-- Indexes for table `tab_pesanan`
--
ALTER TABLE `tab_pesanan`
  ADD PRIMARY KEY (`id_pesanan`),
  ADD KEY `tab_pesanan_cst` (`id_user`) USING BTREE;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `point_diskon`
--
ALTER TABLE `point_diskon`
  ADD CONSTRAINT `point_diskon_ibfk_1` FOREIGN KEY (`id_user`) REFERENCES `customer` (`id_user`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `tab_pesanan`
--
ALTER TABLE `tab_pesanan`
  ADD CONSTRAINT `fk_nama_constraint` FOREIGN KEY (`id_user`) REFERENCES `customer` (`id_user`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
