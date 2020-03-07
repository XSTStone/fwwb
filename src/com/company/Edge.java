package com.company;

import javax.swing.*;

import static com.company.Main.points;

public class Edge {
    private double distance;
    private int headNum;
    private int tailNum;
    private Point head;
    private Point tail;

    public static String[] edgeTips = {
            "输入该路线的头节点(字母)： ",
            "输入该路线的尾节点(字母)： "
    };

    Edge(double _distance, int _headNum, int _tailNum) {
        this.distance = _distance;
        this.headNum = _headNum;
        this.tailNum = _tailNum;
    }

    public void updatePoints() {
        this.head = points.get(headNum);
        this.tail = points.get(tailNum);
    }

    public void modifyHead(Point _head) {
        this.head = _head;
    }

    public void modifyTail(Point _tail) {
        this.tail = _tail;
    }

    public double getDistance() {
        return this.distance;
    }

    public int getHeadNum() {
        return this.headNum;
    }

    public int getTailNum() {
        return this.tailNum;
    }

    public Point getHead() {
        return this.head;
    }

    public Point getTail() {
        return this.tail;
    }

    public void printEdgeTips(int index) {
        System.out.print(edgeTips[index]);
    }

}
