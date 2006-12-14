import java.awt.Point;
import java.util.HashMap;

/*
 * HilbertMap.java
 *
 * Copyright 2006 General Electric Company.  All rights reserved.
 */

/**
 * @author Ian Dees
 */
public class HilbertMap {

    private static HashMap<Integer, Point> intToPoint = new HashMap<Integer, Point>();
    private static HashMap<Point, Integer> pointToInt = new HashMap<Point, Integer>();
    
    static {
        add(0, 0, 0);
        add(1, 1, 0);
        add(2, 1, 1);
        add(3, 0, 1);
        add(4, 0, 2);
        add(5, 0, 3);
        add(6, 1, 3);
        add(7, 1, 2);
        add(8, 2, 2);
        add(9, 2, 3);
        add(10, 3, 3);
        add(11, 3, 2);
        add(12, 3, 1);
        add(13, 2, 1);
        add(14, 2, 0);
        add(15, 3, 0);
        add(16, 4, 0);
        add(17, 4, 1);
        add(18, 5, 1);
        add(19, 5, 0);
        add(20, 6, 0);
        add(21, 7, 0);
        add(22, 7, 1);
        add(23, 6, 1);
        add(24, 6, 2);
        add(25, 7, 2);
        add(26, 7, 3);
        add(27, 6, 3);
        add(28, 5, 3);
        add(29, 5, 2);
        add(30, 4, 2);
        add(31, 4, 3);
        add(32, 4, 4);
        add(33, 4, 5);
        add(34, 5, 5);
        add(35, 5, 4);
        add(36, 6, 4);
        add(37, 7, 4);
        add(38, 7, 5);
        add(39, 6, 5);
        add(40, 6, 6);
        add(41, 7, 6);
        add(42, 7, 7);
        add(43, 6, 7);
        add(44, 5, 7);
        add(45, 5, 6);
        add(46, 4, 6);
        add(47, 4, 7);
        add(48, 3, 7);
        add(49, 2, 7);
        add(50, 2, 6);
        add(51, 3, 6);
        add(52, 3, 5);
        add(53, 3, 4);
        add(54, 2, 4);
        add(55, 2, 5);
        add(56, 1, 5);
        add(57, 1, 4);
        add(58, 0, 4);
        add(59, 0, 5);
        add(60, 0, 6);
        add(61, 1, 6);
        add(62, 1, 7);
        add(63, 0, 7);
        add(64, 0, 8);
        add(65, 0, 9);
        add(66, 1, 9);
        add(67, 1, 8);
        add(68, 2, 8);
        add(69, 3, 8);
        add(70, 3, 9);
        add(71, 2, 9);
        add(72, 2, 10);
        add(73, 3, 10);
        add(74, 3, 11);
        add(75, 2, 11);
        add(76, 1, 11);
        add(77, 1, 10);
        add(78, 0, 10);
        add(79, 0, 11);
        add(80, 0, 12);
        add(81, 1, 12);
        add(82, 1, 13);
        add(83, 0, 13);
        add(84, 0, 14);
        add(85, 0, 15);
        add(86, 1, 15);
        add(87, 1, 14);
        add(88, 2, 14);
        add(89, 2, 15);
        add(90, 3, 15);
        add(91, 3, 14);
        add(92, 3, 13);
        add(93, 2, 13);
        add(94, 2, 12);
        add(95, 3, 12);
        add(96, 4, 12);
        add(97, 5, 12);
        add(98, 5, 13);
        add(99, 4, 13);
        add(100, 4, 14);
        add(101, 4, 15);
        add(102, 5, 15);
        add(103, 5, 14);
        add(104, 6, 14);
        add(105, 6, 15);
        add(106, 7, 15);
        add(107, 7, 14);
        add(108, 7, 13);
        add(109, 6, 13);
        add(110, 6, 12);
        add(111, 7, 12);
        add(112, 7, 11);
        add(113, 7, 10);
        add(114, 6, 10);
        add(115, 6, 11);
        add(116, 5, 11);
        add(117, 4, 11);
        add(118, 4, 10);
        add(119, 5, 10);
        add(120, 5, 9);
        add(121, 4, 9);
        add(122, 4, 8);
        add(123, 5, 8);
        add(124, 6, 8);
        add(125, 6, 9);
        add(126, 7, 9);
        add(127, 7, 8);
        add(128, 8, 8);
        add(129, 8, 9);
        add(130, 9, 9);
        add(131, 9, 8);
        add(132, 10, 8);
        add(133, 11, 8);
        add(134, 11, 9);
        add(135, 10, 9);
        add(136, 10, 10);
        add(137, 11, 10);
        add(138, 11, 11);
        add(139, 10, 11);
        add(140, 9, 11);
        add(141, 9, 10);
        add(142, 8, 10);
        add(143, 8, 11);
        add(144, 8, 12);
        add(145, 9, 12);
        add(146, 9, 13);
        add(147, 8, 13);
        add(148, 8, 14);
        add(149, 8, 15);
        add(150, 9, 15);
        add(151, 9, 14);
        add(152, 10, 14);
        add(153, 10, 15);
        add(154, 11, 15);
        add(155, 11, 14);
        add(156, 11, 13);
        add(157, 10, 13);
        add(158, 10, 12);
        add(159, 11, 12);
        add(160, 12, 12);
        add(161, 13, 12);
        add(162, 13, 13);
        add(163, 12, 13);
        add(164, 12, 14);
        add(165, 12, 15);
        add(166, 13, 15);
        add(167, 13, 14);
        add(168, 14, 14);
        add(169, 14, 15);
        add(170, 15, 15);
        add(171, 15, 14);
        add(172, 15, 13);
        add(173, 14, 13);
        add(174, 14, 12);
        add(175, 15, 12);
        add(176, 15, 11);
        add(177, 15, 10);
        add(178, 14, 10);
        add(179, 14, 11);
        add(180, 13, 11);
        add(181, 12, 11);
        add(182, 12, 10);
        add(183, 13, 10);
        add(184, 13, 9);
        add(185, 12, 9);
        add(186, 12, 8);
        add(187, 13, 8);
        add(188, 14, 8);
        add(189, 14, 9);
        add(190, 15, 9);
        add(191, 15, 8);
        add(192, 15, 7);
        add(193, 14, 7);
        add(194, 14, 6);
        add(195, 15, 6);
        add(196, 15, 5);
        add(197, 15, 4);
        add(198, 14, 4);
        add(199, 14, 5);
        add(200, 13, 5);
        add(201, 13, 4);
        add(202, 12, 4);
        add(203, 12, 5);
        add(204, 12, 6);
        add(205, 13, 6);
        add(206, 13, 7);
        add(207, 12, 7);
        add(208, 11, 7);
        add(209, 11, 6);
        add(210, 10, 6);
        add(211, 10, 7);
        add(212, 9, 7);
        add(213, 8, 7);
        add(214, 8, 6);
        add(215, 9, 6);
        add(216, 9, 5);
        add(217, 8, 5);
        add(218, 8, 4);
        add(219, 9, 4);
        add(220, 10, 4);
        add(221, 10, 5);
        add(222, 11, 5);
        add(223, 11, 4);
        add(224, 11, 3);
        add(225, 11, 2);
        add(226, 10, 2);
        add(227, 10, 3);
        add(228, 9, 3);
        add(229, 8, 3);
        add(230, 8, 2);
        add(231, 9, 2);
        add(232, 9, 1);
        add(233, 8, 1);
        add(234, 8, 0);
        add(235, 9, 0);
        add(236, 10, 0);
        add(237, 10, 1);
        add(238, 11, 1);
        add(239, 11, 0);
        add(240, 12, 0);
        add(241, 13, 0);
        add(242, 13, 1);
        add(243, 12, 1);
        add(244, 12, 2);
        add(245, 12, 3);
        add(246, 13, 3);
        add(247, 13, 2);
        add(248, 14, 2);
        add(249, 14, 3);
        add(250, 15, 3);
        add(251, 15, 2);
        add(252, 15, 1);
        add(253, 14, 1);
        add(254, 14, 0);
        add(255, 15, 0);
    }

    /**
     * @param val
     * @param x
     * @param y
     */
    private static void add(int val, int x, int y) {
        Point p = new Point(x, y);
        intToPoint.put(val, p);
        pointToInt.put(p, val);
    }
    
    public static int getVal(int x, int y) {
        return pointToInt.get(new Point(x,y));
    }
    
    public static Point getPoint(int val) {
        return intToPoint.get(val);
    }
}
