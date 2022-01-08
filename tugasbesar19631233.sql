-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Waktu pembuatan: 08 Jan 2022 pada 10.30
-- Versi server: 10.4.21-MariaDB
-- Versi PHP: 8.0.11

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `tugasbesar19631233`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `inputkrs`
--

CREATE TABLE `inputkrs` (
  `npm` varchar(20) NOT NULL,
  `nama` varchar(50) NOT NULL,
  `teknologi_grafika` varchar(15) NOT NULL,
  `teknik_kompilasi` varchar(15) NOT NULL,
  `struktur_data` varchar(15) NOT NULL,
  `sistem_terdistribusi` varchar(15) NOT NULL,
  `jaringan_komputer` varchar(15) NOT NULL,
  `matematika_diskrit` varchar(15) NOT NULL,
  `interman` varchar(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `inputkrs`
--

INSERT INTO `inputkrs` (`npm`, `nama`, `teknologi_grafika`, `teknik_kompilasi`, `struktur_data`, `sistem_terdistribusi`, `jaringan_komputer`, `matematika_diskrit`, `interman`) VALUES
('19631233', 'Muhammad Dwi Haryadi', 'Tidak Ambil', 'Ambil', 'Ambil', 'Tidak Ambil', 'Ambil', 'Ambil', 'Tidak Ambil'),
('196312099', 'Aditya Harlan', 'Tidak Ambil', 'Ambil', 'Ambil', 'Tidak Ambil', 'Tidak Ambil', 'Ambil', 'Tidak Ambil');

-- --------------------------------------------------------

--
-- Struktur dari tabel `profilmahasiswa`
--

CREATE TABLE `profilmahasiswa` (
  `npm` varchar(20) NOT NULL,
  `nama` varchar(50) NOT NULL,
  `jurusan` varchar(50) NOT NULL,
  `alamat` varchar(100) NOT NULL,
  `email` varchar(30) NOT NULL,
  `no_telp` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `profilmahasiswa`
--

INSERT INTO `profilmahasiswa` (`npm`, `nama`, `jurusan`, `alamat`, `email`, `no_telp`) VALUES
('196312099', 'Aditya Harlan', 'Teknik Informatika', 'Banjarbaru', 'harlandi12@gmail.com', '089653421782167'),
('19631233', 'Muhammad Dwi Haryadi', 'Sistem Informasi', 'jl.zafri zam-zam KOMP.LLASDP 1 RT.41 Blok.A No.22', 'dwih115@gmail.com', '0895620065807'),
('1983438', 'BAHDER JOHAN ', 'Sistem Informasi', 'JL.PEMUDA KM.5,5 ', 'bahder09@gmail.com', '08945463264'),
('198736432', 'arie lesmana', 'Administrasi Publik', 'jl.kayutangi no12', 'dwih89@gmail.com', '08964734221');

--
-- Indexes for dumped tables
--

--
-- Indeks untuk tabel `profilmahasiswa`
--
ALTER TABLE `profilmahasiswa`
  ADD PRIMARY KEY (`npm`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
