-- phpMyAdmin SQL Dump
-- version 3.5.1
-- http://www.phpmyadmin.net
--
-- Servidor: localhost:3306
-- Tiempo de generación: 06-07-2020 a las 03:21:31
-- Versión del servidor: 5.5.24-log
-- Versión de PHP: 5.4.3

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Base de datos: `clinica`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `consulta`
--

CREATE TABLE IF NOT EXISTS `consulta` (
  `Id` int(11) NOT NULL,
  `Descripcion` varchar(255) NOT NULL,
  `Fecha` date NOT NULL,
  `Hora` time NOT NULL,
  `NombrePaciente` int(11) NOT NULL,
  PRIMARY KEY (`Id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `doctores`
--

CREATE TABLE IF NOT EXISTS `doctores` (
  `Id` int(11) NOT NULL,
  `Usuario` varchar(255) NOT NULL,
  `Contraseña` varchar(50) NOT NULL,
  `Nombre` varchar(255) NOT NULL,
  `Apellido` varchar(255) NOT NULL,
  `Especialidad` varchar(255) NOT NULL,
  `Paciente` varchar(255) NOT NULL,
  `HoraAtencion` time NOT NULL,
  `FechaAtencion` date NOT NULL,
  `DiagnosticoPaciente` varchar(255) NOT NULL,
  `RecetaPaciente` varchar(255) NOT NULL,
  `DetalleConsuta` varchar(255) NOT NULL,
  PRIMARY KEY (`Id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `especialidad`
--

CREATE TABLE IF NOT EXISTS `especialidad` (
  `Id` int(11) NOT NULL,
  `Descripcion` varchar(255) NOT NULL,
  PRIMARY KEY (`Id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `horaatencion`
--

CREATE TABLE IF NOT EXISTS `horaatencion` (
  `Id` int(11) NOT NULL,
  `Fecha` date NOT NULL,
  `Hora` time NOT NULL,
  `Paciente` varchar(255) NOT NULL,
  `EspecialidadMedico` varchar(255) NOT NULL,
  `NombreMedico` varchar(255) NOT NULL,
  PRIMARY KEY (`Id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `pacientes`
--

CREATE TABLE IF NOT EXISTS `pacientes` (
  `Id` int(11) NOT NULL,
  `Usuario` varchar(255) NOT NULL,
  `Contraseña` varchar(255) NOT NULL,
  `Nombre` varchar(255) NOT NULL,
  `Apellido` varchar(255) NOT NULL,
  `FechaNacimiento` date NOT NULL,
  `Direccion` varchar(255) NOT NULL,
  `Ciudad` varchar(255) NOT NULL,
  `Comuna` varchar(255) NOT NULL,
  `Diagnostico` varchar(255) NOT NULL,
  `Receta` varchar(255) NOT NULL,
  `HoraAtencion` time NOT NULL,
  `FechaAtencion` date NOT NULL,
  PRIMARY KEY (`Id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `receta`
--

CREATE TABLE IF NOT EXISTS `receta` (
  `Id` int(11) NOT NULL,
  `Descripcion` varchar(255) NOT NULL,
  `NombrePaciente` varchar(255) NOT NULL,
  `ApellidoPaciente` varchar(255) NOT NULL,
  `FechaEmision` date NOT NULL,
  `HoraEmision` time NOT NULL,
  PRIMARY KEY (`Id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
