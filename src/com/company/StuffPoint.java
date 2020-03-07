package com.company;

import java.util.Scanner;
import static com.company.Edge.edgeTips;

public class StuffPoint extends Point{

    StuffPoint() {
        Scanner scanner = new Scanner(System.in);
        printPointTips(0);
        String str = scanner.nextLine();
        char ch = str.toLowerCase().charAt(0);
        this.order = (byte) ch - 97;

        printPointTips(1);
        this.stuffWeight = scanner.nextDouble();

        printPointTips(2);
        this.loadingTime = scanner.nextDouble();

        printPointTips(3);
        this.edgeNum = scanner.nextInt();
        for (int i = 0;i < edgeNum;++i) {
            System.out.print("输入第" + (i + 1) + "条路线的距离(千米)： ");
            double tempDistance = scanner.nextDouble();

            System.out.print(edgeTips[1]);
            str = scanner.next();
            ch = str.toLowerCase().charAt(0);
            int tempTailNum = (byte) ch - 97;

            Edge tempEdge = new Edge(tempDistance, this.getOrder(), tempTailNum);

            this.edges.add(tempEdge);
        }
    }

}
