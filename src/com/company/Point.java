package com.company;

import java.util.ArrayList;
import java.util.Scanner;

import static com.company.Main.points;

public abstract class Point {
    protected int order;
    protected int edgeNum;
    protected double stuffWeight;
    protected double loadingTime;
    private boolean isStuffPoint;
    private boolean hasSent = false;
    protected ArrayList<Edge> edges = new ArrayList<Edge>();

    protected static String[] pointTips = {
            "输入该接货节点顺序(字母)： ",//0
            "输入该接货节点货物质量(吨)： ",//1
            "输入该接货节点装卸时间(分钟)： ",//2
            "输入该节点链接的路线数： ",//3
            "输入路线长度(千米)： ",//4
            "该点初始化完成！",//5
            "输入该中接节点顺序(字母)： "//6
    };

    protected static void printPointTips(int index) {
        System.out.print(pointTips[index]);
    }

    public static com.company.Point getPoint(int index) {
        return points.get(index);
    }

    public void setIsStuffPoint() {
        if(this.loadingTime == 0 && this.stuffWeight == 0) {
            isStuffPoint = false;
        } else {
            isStuffPoint = true;
        }
    }

    public void alreadyHasSent() {
        this.hasSent = true;
    }

    public double getStuffWeight() {
        return this.stuffWeight;
    }

    public double getLoadingTime() {
        return this.loadingTime;
    };

    public int getOrder() {
        return this.order;
    }

    public int getEdgeNum() {
        return edgeNum;
    };

    public boolean isStuffPoint() {
        return this.isStuffPoint;
    }

    public boolean isHasSent() {
        return this.hasSent;
    }

    public ArrayList<Edge> getEdges() {
        return this.edges;
    }

}

