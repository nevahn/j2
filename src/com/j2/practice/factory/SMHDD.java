package com.j2.practice.factory;

public class SMHDD extends HDD{
  public SMHDD(){
    storage = 1000;
  }
  public String toString(){
    return "SM SSD " + getStorage() + "G";
  }
}