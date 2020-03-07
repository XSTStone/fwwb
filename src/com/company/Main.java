package com.company;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

import static com.company.Point.pointTips;
import static com.company.Edge.edgeTips;
import static com.company.Car.carTips;

public class Main {
    static int pointNum;
    static int stuffNum;
    static int midNum;
    static int carKinds;
    static int carTotalNum;

    private static void pointInitialize() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("输入货物节点总数： ");
        stuffNum = scanner.nextInt();
        System.out.print("输入中间节点总数： ");
        midNum = scanner.nextInt();
        pointNum = stuffNum + midNum + 1;
    }

    private static void carInitialize() {
        Scanner scanner = new Scanner(System.in);

        System.out.print(carTips[0]);
        carKinds = scanner.nextInt();
    }

    static ArrayList<Point> points = new ArrayList<Point>();
    static ArrayList<Car> cars = new ArrayList<Car>();

    public static void main(String[] args) throws IOException {
        setPoints();
    }

    public static void setPoints() {
        pointInitialize();

        for (int i = 0; i < stuffNum; ++i) {
            Point tempStuffPoint = new StuffPoint();
            points.add(tempStuffPoint);
            System.out.println();
        }
        {
            Point tempStartPoint = new StartPoint();
            points.add(tempStartPoint);
            System.out.println();
        }
        for (int i = 0;i < midNum; ++i) {
            Point tempMidPoint = new MidPoint();
            points.add(tempMidPoint);
            System.out.println();
        }

        for (int i = 0; i < pointNum; ++i) {
            for (int j = 0; j < points.get(i).edges.size(); ++j) {
                points.get(i).edges.get(j).updatePoints();
                points.get(i).setIsStuffPoint();
            }
        }
    }

    public static void setCars() {
        carInitialize();

        for (int i = 0; i < carKinds; ++i) {
            Scanner scanner = new Scanner(System.in);
            System.out.print(carTips[1] + (i + 1) + carTips[2] + carTips[3]);
            double tempMaxWeight = scanner.nextDouble();

            System.out.print(carTips[1] + (i + 1) + carTips[2] + carTips[4]);
            double tempMaxDistance = scanner.nextDouble();

            System.out.print(carTips[1] + (i + 1) + carTips[2] + carTips[5]);
            double tempSpeed = scanner.nextDouble();

            System.out.print(carTips[1] + (i + 1) + carTips[2] + carTips[6]);
            double tempWorkingTime = scanner.nextDouble();

            Car tempCar = new Car(tempMaxWeight, tempMaxDistance, tempSpeed, tempWorkingTime);
            cars.add(tempCar);
        }
    }

    public static void showPoints() {
        for (int i = 0; i < pointNum; ++i) {
            System.out.println("是否为接货节点： " + points.get(i).isStuffPoint());
            System.out.println("顺序： " + points.get(i).order + "\n货物质量： " + points.get(i).getStuffWeight());
            System.out.println("装卸时间： " + points.get(i).getLoadingTime() + "\n链接路线数： " + points.get(i).getEdgeNum());
            for (Edge edge : points.get(i).edges) {
                System.out.println("距离： " + edge.getDistance() + "\n头节点： " + edge.getHeadNum() + " & " + edge.getHead());
                System.out.println("尾节点： " + edge.getTailNum() + " & " + edge.getTail());
            }
            System.out.println();
        }
    }

    public static void showCars() {
        for (int i = 0; i < carKinds; ++i) {
            System.out.println(cars.get(i).getMaxWeight());
            System.out.println(cars.get(i).getMaxDistance());
            System.out.println(cars.get(i).getSpeed());
            System.out.println(cars.get(i).getWorkingTime());
        }
    }
}


