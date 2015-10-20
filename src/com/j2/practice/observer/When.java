package com.j2.practice.observer;

public class When{
  private int year;
  private int month;
  private int day;
  private int hour24;
  private int minute;
  public When(int y, int mo, int d, int h, int mi){
    this.year = y;
    this.month = mo;
    this.day = d;
    this.hour24 = h;
    this.minute = mi;
  }
  public void setYear(int y){
    this.year = y;
  }
  public void setMonth(int mo){
    this.month = mo;
  }
  public void setDay(int d){
    this.day = d;
  }
  public void setHour24(int h){
    this.hour24 = h;
  }
  public void setMinute(int mi){
    this.minute = mi;
  }
  public String toString(){
    return this.year + "/" + this.month + "/" + this.day + " " + this.hour24 + ":" + this.minute;
  }
}