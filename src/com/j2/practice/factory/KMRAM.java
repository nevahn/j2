package com.j2.practice.factory;

public class KMRAM extends RAM{
  public KMRAM(){
    volume = 4;
  }
  public String toString(){
    return "KM DRAM DDR3 " + getVolume() + "G";
  }
}