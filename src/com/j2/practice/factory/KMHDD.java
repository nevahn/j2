package com.j2.practice.factory;

public class KMHDD extends HDD{
  public KMHDD(){
    storage = 500;
  }
  public String toString(){
    return "KM HDD " + getStorage() + "G";
  }
}