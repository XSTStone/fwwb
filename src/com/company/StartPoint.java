package com.company;

import java.util.Scanner;

import static com.company.Edge.edgeTips;

public class StartPoint extends Point {

    StartPoint() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入起点节点顺序： ");
        String str = scanner.nextLine();

        printPointTips(3);
        this.edgeNum = scanner.nextInt();
        for (int i = 0; i < edgeNum; ++i) {
            System.out.print("输入第" + (i + 1) + "条路线的距离(千米)： ");
            double tempDistance = scanner.nextDouble();

            System.out.print(edgeTips[1]);
            str = scanner.next();
            char ch = str.toLowerCase().charAt(0);
            int tempTailNum = (byte) ch - 97;

            Edge tempEdge = new Edge(tempDistance, this.getOrder(), tempTailNum);

            this.edges.add(tempEdge);
        }
    }
}
