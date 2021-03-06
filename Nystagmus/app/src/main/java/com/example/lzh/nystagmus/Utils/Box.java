package com.example.lzh.nystagmus.Utils;

/**
 * 用于表示一个圆
 * Created by LZH on 2017/7/17.
 */

public class Box {
    private double x;
    private double y;
    private double r;
    public Box()
    {}
    public Box(double x,double y,double r)
    {
        this.x=x;
        this.y=y;
        this.r=r;
    }
    public void setX(double x)
    {
        this.x=x;
    }
    public void setY(double y)
    {
        this.y=y;
    }
    public void setR(double r)
    {
        this.r=r;
    }
    public double getX()
    {
        return this.x;
    }
    public double getY()
    {
        return this.y;
    }
    public double getR()
    {
        return this.r;
    }
}
