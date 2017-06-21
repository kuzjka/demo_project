-- phpMyAdmin SQL Dump
-- version 4.6.4
-- https://www.phpmyadmin.net/
--
-- Хост: 127.0.0.1
-- Время создания: Июн 21 2017 г., 15:38
-- Версия сервера: 5.7.10-log
-- Версия PHP: 5.6.25

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- База данных: `person`
--

-- --------------------------------------------------------

--
-- Структура таблицы `person_info`
--

CREATE TABLE `person_info` (
  `id` int(11) NOT NULL,
  `name` varchar(45) NOT NULL,
  `age` int(11) NOT NULL,
  `height` int(11) NOT NULL,
  `weight` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Дамп данных таблицы `person_info`
--

INSERT INTO `person_info` (`id`, `name`, `age`, `height`, `weight`) VALUES
(1, 'Anton', 32, 180, 100),
(2, 'Igor', 31, 190, 100);

--
-- Индексы сохранённых таблиц
--

--
-- Индексы таблицы `person_info`
--
ALTER TABLE `person_info`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT для сохранённых таблиц
--

--
-- AUTO_INCREMENT для таблицы `person_info`
--
ALTER TABLE `person_info`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
