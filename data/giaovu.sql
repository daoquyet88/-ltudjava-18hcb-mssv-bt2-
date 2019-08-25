-- phpMyAdmin SQL Dump
-- version 4.9.0.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Aug 25, 2019 at 12:59 PM
-- Server version: 10.4.6-MariaDB
-- PHP Version: 7.1.31

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `giaovu`
--

-- --------------------------------------------------------

--
-- Table structure for table `bangdiem`
--

CREATE TABLE `bangdiem` (
  `STT` int(11) NOT NULL,
  `MaLop` varchar(10) COLLATE utf8_unicode_ci NOT NULL,
  `MaMon` varchar(10) COLLATE utf8_unicode_ci NOT NULL,
  `MaSV` varchar(10) COLLATE utf8_unicode_ci NOT NULL,
  `HoTen` varchar(200) COLLATE utf8_unicode_ci NOT NULL,
  `GK` float NOT NULL,
  `CK` float NOT NULL,
  `Khac` float NOT NULL,
  `TongDiem` float NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Dumping data for table `bangdiem`
--

INSERT INTO `bangdiem` (`STT`, `MaLop`, `MaMon`, `MaSV`, `HoTen`, `GK`, `CK`, `Khac`, `TongDiem`) VALUES
(2, '17hcb', 'CTT011', '1242001', 'Nguyễn Văn A', 4, 5, 6, 5),
(1, '17hcb', 'CTT011', '1742005', 'Hồ Thị E', 5, 5, 5, 5),
(1, '18hcb', 'CTT001', '1742005', 'Hồ Thị E', 1, 2, 3, 2),
(2, '18hcb', 'CTT001', '1842002', 'Chiêu Văn G', 4, 5, 6, 5),
(3, '18hcb', 'CTT001', '1842003', 'Trần Thị H', 7, 8, 9, 8.5),
(5, '18hcb', 'CTT001', '1842004', 'Văn Thị J', 8, 10, 2, 9.5),
(4, '18hcb', 'CTT001', '1842006', 'Mạc Văn I', 2, 4, 6, 4.5);

-- --------------------------------------------------------

--
-- Table structure for table `dkmh`
--

CREATE TABLE `dkmh` (
  `STT` int(11) NOT NULL,
  `MaLop` varchar(10) COLLATE utf8_unicode_ci NOT NULL,
  `MaMon` varchar(10) COLLATE utf8_unicode_ci NOT NULL,
  `MaSV` varchar(10) COLLATE utf8_unicode_ci NOT NULL,
  `HoTen` varchar(200) COLLATE utf8_unicode_ci NOT NULL,
  `GioiTinh` varchar(10) COLLATE utf8_unicode_ci NOT NULL,
  `CMND` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Dumping data for table `dkmh`
--

INSERT INTO `dkmh` (`STT`, `MaLop`, `MaMon`, `MaSV`, `HoTen`, `GioiTinh`, `CMND`) VALUES
(1, '17hcb', 'CTT011', '1742001', 'Nguyễn Văn A', 'Nam', 123456789),
(2, '17hcb', 'CTT011', '1742002', 'Trần Văn B', 'Nam', 234567891),
(3, '17hcb', 'CTT011', '1742003', 'Huỳnh Thị C', 'Nư', 345678912),
(4, '17hcb', 'CTT011', '1742004', 'Mai Văn D', 'Nam', 456789123),
(5, '17hcb', 'CTT011', '1742005', 'Hồ Thị E', 'Nư', 567891234),
(1, '17hcb', 'CTT012', '1742001', 'Nguyễn Văn A', 'Nam', 123456789),
(2, '17hcb', 'CTT012', '1742002', 'Trần Văn B', 'Nam', 234567891),
(3, '17hcb', 'CTT012', '1742003', 'Huỳnh Thị C', 'Nư', 345678912),
(4, '17hcb', 'CTT012', '1742004', 'Mai Văn D', 'Nam', 456789123),
(5, '17hcb', 'CTT012', '1742005', 'Hồ Thị E', 'Nư', 567891234),
(4, '18hcb', 'CTT001', '1742005', 'Hồ Thị E', 'Nư', 567891234),
(2, '18hcb', 'CTT001', '1842002', 'Chiêu Văn G', 'Nam', 789123456),
(3, '18hcb', 'CTT001', '1842003', 'Trân Thị H', 'Nư', 891234567),
(4, '18hcb', 'CTT001', '1842004', 'Mạc Văn J', 'Nam', 901234567),
(5, '18hcb', 'CTT001', '1842005', 'văn Thị I', 'Nữ', 987654321),
(1, '18hcb', 'CTT002', '1842001', 'Lý Văn F', 'Nam', 678912345),
(2, '18hcb', 'CTT002', '1842002', 'Chiêu Văn G', 'Nam', 789123456),
(3, '18hcb', 'CTT002', '1842003', 'Trân Thị H', 'Nư', 891234567),
(4, '18hcb', 'CTT002', '1842004', 'Mạc Văn J', 'Nam', 901234567),
(5, '18hcb', 'CTT002', '1842005', 'văn Thị I', 'Nữ', 987654321);

-- --------------------------------------------------------

--
-- Table structure for table `monhoc`
--

CREATE TABLE `monhoc` (
  `STT` int(11) NOT NULL,
  `MaMon` varchar(10) COLLATE utf8_unicode_ci NOT NULL,
  `MaLop` varchar(10) COLLATE utf8_unicode_ci NOT NULL,
  `TenMH` varchar(200) COLLATE utf8_unicode_ci NOT NULL,
  `PhongHoc` varchar(10) COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Dumping data for table `monhoc`
--

INSERT INTO `monhoc` (`STT`, `MaMon`, `MaLop`, `TenMH`, `PhongHoc`) VALUES
(1, 'CTT001', '18hcb', 'Lập trình ứng dụng java', 'C31'),
(2, 'CTT002', '18hcb', 'Mạng máy tinh', 'C31'),
(1, 'CTT011', '17hcb', 'Thiết kế giao diên', 'C32'),
(2, 'CTT012', '17hcb', 'Kiểm chứng phần mềm', 'C32');

-- --------------------------------------------------------

--
-- Table structure for table `phuckhao`
--

CREATE TABLE `phuckhao` (
  `STT` int(11) NOT NULL,
  `MaLop` varchar(10) COLLATE utf8_unicode_ci NOT NULL,
  `MaMon` varchar(10) COLLATE utf8_unicode_ci NOT NULL,
  `TenMH` varchar(200) COLLATE utf8_unicode_ci NOT NULL,
  `NgayBatDau` date NOT NULL,
  `NgayHetHan` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Dumping data for table `phuckhao`
--

INSERT INTO `phuckhao` (`STT`, `MaLop`, `MaMon`, `TenMH`, `NgayBatDau`, `NgayHetHan`) VALUES
(1, '17hcb', 'CTT011', 'Thiết kế giao diên', '2019-08-25', '2019-08-25'),
(2, '17hcb', 'CTT012', 'Kiểm chứng phần mềm', '2019-08-25', '2019-08-25'),
(1, '18hcb', 'CTT001', 'Lập trình ứng dụng java', '2019-08-25', '2019-08-25'),
(2, '18hcb', 'CTT002', 'Mạng máy tinh', '2019-08-25', '2019-08-25');

-- --------------------------------------------------------

--
-- Table structure for table `sinhvien`
--

CREATE TABLE `sinhvien` (
  `STT` int(11) NOT NULL,
  `MaSV` varchar(10) COLLATE utf8_unicode_ci NOT NULL,
  `HoTen` varchar(200) COLLATE utf8_unicode_ci NOT NULL,
  `GioiTinh` varchar(10) COLLATE utf8_unicode_ci NOT NULL,
  `CMND` bigint(20) NOT NULL,
  `MaLop` varchar(10) COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Dumping data for table `sinhvien`
--

INSERT INTO `sinhvien` (`STT`, `MaSV`, `HoTen`, `GioiTinh`, `CMND`, `MaLop`) VALUES
(1, '1742001', 'Nguyễn Văn A', 'Nam', 123456789, '17hcb'),
(2, '1742002', 'Trần Văn B', 'Nam', 234567891, '17hcb'),
(3, '1742003', 'Huỳnh Thị C', 'Nư', 345678912, '17hcb'),
(4, '1742004', 'Mai Văn D', 'Nam', 456789123, '17hcb'),
(5, '1742005', 'Hồ Thị E', 'Nư', 567891234, '17hcb'),
(1, '1842001', 'Lý Văn F', 'Nam', 678912345, '18hcb'),
(2, '1842002', 'Chiêu Văn G', 'Nam', 789123456, '18hcb'),
(3, '1842003', 'Trân Thị H', 'Nư', 891234567, '18hcb'),
(4, '1842004', 'Mạc Văn J', 'Nam', 901234567, '18hcb'),
(5, '1842005', 'văn Thị I', 'Nữ', 987654321, '18hcb');

-- --------------------------------------------------------

--
-- Table structure for table `svphuckhao`
--

CREATE TABLE `svphuckhao` (
  `STT` int(11) NOT NULL,
  `MaSV` varchar(10) COLLATE utf8_unicode_ci NOT NULL,
  `MaLop` varchar(10) COLLATE utf8_unicode_ci NOT NULL,
  `HoTen` varchar(200) COLLATE utf8_unicode_ci NOT NULL,
  `MaMon` varchar(10) COLLATE utf8_unicode_ci NOT NULL,
  `GiuaKy` varchar(10) COLLATE utf8_unicode_ci NOT NULL,
  `CuoiKy` float NOT NULL,
  `DiemKhac` float NOT NULL,
  `TongDiem` float NOT NULL,
  `DiemMM` float NOT NULL,
  `LyDo` varchar(200) COLLATE utf8_unicode_ci NOT NULL,
  `TinhTrang` varchar(200) COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Dumping data for table `svphuckhao`
--

INSERT INTO `svphuckhao` (`STT`, `MaSV`, `MaLop`, `HoTen`, `MaMon`, `GiuaKy`, `CuoiKy`, `DiemKhac`, `TongDiem`, `DiemMM`, `LyDo`, `TinhTrang`) VALUES
(5, '1742005', '18hcb', 'Hồ Thị E', 'CTT001', '1', 1, 1, 1, 10, 'lam rat tot', 'Chua Xem');

-- --------------------------------------------------------

--
-- Table structure for table `taikhoan`
--

CREATE TABLE `taikhoan` (
  `STT` int(11) NOT NULL,
  `UseName` varchar(200) CHARACTER SET utf32 COLLATE utf32_unicode_ci NOT NULL,
  `PassWord` varchar(200) COLLATE utf8_unicode_ci NOT NULL,
  `Quyen` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Dumping data for table `taikhoan`
--

INSERT INTO `taikhoan` (`STT`, `UseName`, `PassWord`, `Quyen`) VALUES
(1, '1742005', 'ca4ea3a264d302a35889e44155bbf251', 0),
(3, '1842001', '8238a029b380d41fa7eb2245eb546bbc', 0),
(2, 'giaovu', '9c5e8ed003d1ccebd3674e7040f844d6', 1);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `bangdiem`
--
ALTER TABLE `bangdiem`
  ADD PRIMARY KEY (`MaLop`,`MaMon`,`MaSV`);

--
-- Indexes for table `dkmh`
--
ALTER TABLE `dkmh`
  ADD PRIMARY KEY (`MaLop`,`MaMon`,`MaSV`),
  ADD KEY `FK_dkmh_sv` (`MaSV`),
  ADD KEY `FK_dkmh_mh` (`MaMon`);

--
-- Indexes for table `monhoc`
--
ALTER TABLE `monhoc`
  ADD PRIMARY KEY (`MaMon`,`MaLop`);

--
-- Indexes for table `phuckhao`
--
ALTER TABLE `phuckhao`
  ADD PRIMARY KEY (`MaLop`,`MaMon`);

--
-- Indexes for table `sinhvien`
--
ALTER TABLE `sinhvien`
  ADD PRIMARY KEY (`MaSV`);

--
-- Indexes for table `svphuckhao`
--
ALTER TABLE `svphuckhao`
  ADD PRIMARY KEY (`MaSV`,`MaLop`,`MaMon`),
  ADD UNIQUE KEY `STT` (`STT`);

--
-- Indexes for table `taikhoan`
--
ALTER TABLE `taikhoan`
  ADD PRIMARY KEY (`UseName`),
  ADD UNIQUE KEY `STT` (`STT`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `svphuckhao`
--
ALTER TABLE `svphuckhao`
  MODIFY `STT` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT for table `taikhoan`
--
ALTER TABLE `taikhoan`
  MODIFY `STT` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
