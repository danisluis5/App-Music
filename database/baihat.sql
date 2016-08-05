-- phpMyAdmin SQL Dump
-- version 4.5.1
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Aug 02, 2016 at 01:34 PM
-- Server version: 10.1.13-MariaDB
-- PHP Version: 7.0.6

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `baihat`
--

-- --------------------------------------------------------

--
-- Table structure for table `baihat`
--

CREATE TABLE `baihat` (
  `id_baihat` int(100) NOT NULL,
  `ten` varchar(255) COLLATE utf8_unicode_ci NOT NULL,
  `tacgia` varchar(255) COLLATE utf8_unicode_ci NOT NULL,
  `luotnghe` int(11) NOT NULL,
  `xephang` varchar(255) COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Dumping data for table `baihat`
--

INSERT INTO `baihat` (`id_baihat`, `ten`, `tacgia`, `luotnghe`, `xephang`) VALUES
(1, 'This one''s for you', 'David Guetta ft. Zara Larsson', 82492973, '5 sao'),
(2, 'Until You', 'Shayne Ward', 360926, '4 sao'),
(3, 'Starships', 'Nicki Minaj', 269583804, '4 sao'),
(4, 'Call Me Maybe', 'Carly Rae Jepsen', 856754099, '4 sao'),
(5, 'Last Friday Night', 'Katy Perry', 725692947, '5 sao'),
(6, 'Baby ft. Ludacris', 'Justin Bieber', 1421575685, '4 sao');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `baihat`
--
ALTER TABLE `baihat`
  ADD PRIMARY KEY (`id_baihat`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `baihat`
--
ALTER TABLE `baihat`
  MODIFY `id_baihat` int(100) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
