package com.company;

public class Car {
    private double maxWeight;
    private double maxDistance;
    private double speed;
    private double workingTime;
    public static String[] carTips = {
            "输入货车种类数目： ",
            "输入第",
            "种货车",
            "最大承载量(吨)： ",
            "最大运行路线距离(千米)： ",
            "最大行驶速度(千米/时)： ",
            "最大工作时间(小时)： ",
    };

    Car(double _maxWeight, double _maxDistance, double _speed, double _workingTime) {
        this.maxWeight = _maxWeight;
        this.maxDistance = _maxDistance;
        this.speed = _speed;
        this.workingTime = _workingTime;
    }

    public double getMaxWeight() {
        return this.maxWeight;
    }

    public double getMaxDistance() {
        return this.maxDistance;
    }

    public double getSpeed() {
        return this.speed;
    }

    public double getWorkingTime() {
        return this.workingTime;
    }
}
