-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: localhost
-- Generation Time: Jan 07, 2023 at 04:43 PM
-- Server version: 10.4.27-MariaDB
-- PHP Version: 8.1.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `UMS`
--

-- --------------------------------------------------------

--
-- Table structure for table `attendance_student`
--

CREATE TABLE `attendance_student` (
  `rollno` varchar(30) NOT NULL,
  `Date` varchar(30) NOT NULL,
  `first` varchar(30) NOT NULL,
  `second` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `attendance_student`
--

INSERT INTO `attendance_student` (`rollno`, `Date`, `first`, `second`) VALUES
('15336919', '8-4-2004', 'OD', 'Present'),
('2826582', '21/12/2023', 'Present', 'Present'),
('1190684', '24-3-2022', 'Present', 'Present');

-- --------------------------------------------------------

--
-- Table structure for table `attendance_teacher`
--

CREATE TABLE `attendance_teacher` (
  `emp_id` varchar(30) NOT NULL,
  `Date` varchar(30) NOT NULL,
  `first` varchar(30) NOT NULL,
  `second` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `attendance_teacher`
--

INSERT INTO `attendance_teacher` (`emp_id`, `Date`, `first`, `second`) VALUES
('1015308', '22.12.22', 'Absent', 'Present'),
('1015308', 'Mon Jan 02 10:44:37 IST 2023', 'Present', 'Present');

-- --------------------------------------------------------

--
-- Table structure for table `fee`
--

CREATE TABLE `fee` (
  `rollno` varchar(50) NOT NULL,
  `name` varchar(50) NOT NULL,
  `fathers_name` varchar(50) NOT NULL,
  `course` varchar(30) NOT NULL,
  `branch` varchar(20) NOT NULL,
  `semester` varchar(30) NOT NULL,
  `fee_paid` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `fee`
--

INSERT INTO `fee` (`rollno`, `name`, `fathers_name`, `course`, `branch`, `semester`, `fee_paid`) VALUES
('15336919', 'manoj', 'saravanan', 'B.Tech', 'Computer Science', '3rd', '50000');

-- --------------------------------------------------------

--
-- Table structure for table `marks`
--

CREATE TABLE `marks` (
  `rollno` varchar(50) NOT NULL,
  `marks1` varchar(50) NOT NULL,
  `marks2` varchar(50) NOT NULL,
  `marks3` varchar(50) NOT NULL,
  `marks4` varchar(50) NOT NULL,
  `marks5` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `marks`
--

INSERT INTO `marks` (`rollno`, `marks1`, `marks2`, `marks3`, `marks4`, `marks5`) VALUES
('15336919', '99', '93', '95', '90', '99'),
('15331191', '81', '83', '85', '87', '89'),
('15336919', '100', '99', '98', '97', '96'),
('15331191', '99', '98', '97', '96', '95');

-- --------------------------------------------------------

--
-- Table structure for table `student`
--

CREATE TABLE `student` (
  `name` varchar(250) NOT NULL,
  `fathers_name` varchar(250) NOT NULL,
  `age` varchar(3) NOT NULL,
  `dob` varchar(30) NOT NULL,
  `address` text NOT NULL,
  `phone` varchar(30) NOT NULL,
  `email` varchar(30) NOT NULL,
  `class_x` varchar(30) NOT NULL,
  `class_xii` varchar(30) NOT NULL,
  `aadhar` varchar(30) NOT NULL,
  `rollno` varchar(30) NOT NULL,
  `course` varchar(30) NOT NULL,
  `branch` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `student`
--

INSERT INTO `student` (`name`, `fathers_name`, `age`, `dob`, `address`, `phone`, `email`, `class_x`, `class_xii`, `aadhar`, `rollno`, `course`, `branch`) VALUES
('manoj', 'saravanan', '19', '21/10/2003', 'pondy', '9827384237', 'manoj@123', '99', '99', '1234 2345 3456', '3163788', 'B.Tech', 'Computer Science'),
('raj', 'rajadurai', '19', '28/07/2003', 'madurai', '9337573294', 'raj@123', '96', '97', '1234 1234 1234', '9346927', 'B.Tech', 'Computer Science'),
('mitesh', 'vivek', '19', '22/08/2004', 'chennai', '976543213', 'mitesh@gmail.com', '99', '99', '1234 5678 9876', '6973483', 'B.Tech', 'Computer Science');

-- --------------------------------------------------------

--
-- Table structure for table `subject`
--

CREATE TABLE `subject` (
  `rollno` varchar(30) NOT NULL,
  `subject1` varchar(50) NOT NULL,
  `subject2` varchar(50) NOT NULL,
  `subject3` varchar(50) NOT NULL,
  `subject4` varchar(50) NOT NULL,
  `subject5` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `subject`
--

INSERT INTO `subject` (`rollno`, `subject1`, `subject2`, `subject3`, `subject4`, `subject5`) VALUES
('15336919', 's1', 's2', 's3', 's4', 's5'),
('15331191', 's1', 's2', 's3', 's4', 's5'),
('15336919', 'cse', 'cse1', 'cse2', 'cse3', 'cse4'),
('1190684', 'maths', 'phy', '', '', ''),
('15331191', 'mark1', 'mark2', 'mark3', 'mark4', 'mark5');

-- --------------------------------------------------------

--
-- Table structure for table `teacher`
--

CREATE TABLE `teacher` (
  `name` varchar(250) NOT NULL,
  `fathers_name` varchar(250) NOT NULL,
  `age` varchar(3) NOT NULL,
  `dob` varchar(30) NOT NULL,
  `address` text NOT NULL,
  `phone` varchar(30) NOT NULL,
  `email` varchar(30) NOT NULL,
  `class_x` varchar(30) NOT NULL,
  `class_xii` varchar(30) NOT NULL,
  `aadhar` varchar(30) NOT NULL,
  `course` varchar(30) NOT NULL,
  `emp_id` varchar(20) NOT NULL,
  `dep` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `teacher`
--

INSERT INTO `teacher` (`name`, `fathers_name`, `age`, `dob`, `address`, `phone`, `email`, `class_x`, `class_xii`, `aadhar`, `course`, `emp_id`, `dep`) VALUES
('Eniyan', 'mukesh kumar', '19', '12/33/33', 'ram,nagar,karur,TN', '8870154133', 'infotoeniyan@gmail.com', '100', '100', '667766565656', 'B.Tech', '1015308', 'Computer Science'),
('manoj', 'saravanan', '19', '21/10/2003', 'pondy', '987654322', 'manoj10@gmail.com', '100', '100', '3456 4567 7889', 'B.Tech', '1017636', 'Computer Science');

-- --------------------------------------------------------

--
-- Table structure for table `userdetails`
--

CREATE TABLE `userdetails` (
  `username` varchar(50) NOT NULL,
  `password` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `userdetails`
--

INSERT INTO `userdetails` (`username`, `password`) VALUES
('eniyan', '123'),
('Manoj', 'Manoj1!');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
