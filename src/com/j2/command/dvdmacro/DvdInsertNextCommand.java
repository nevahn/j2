package com.j2.command.dvdmacro;

public class DvdInsertNextCommand implements Command{
  private DvdBox dvdbox;
  private int lastPlay;
  public DvdInsertNextCommand(DvdBox dvdbox){
    this.dvdbox = dvdbox;
  }
  public void execute(){
    lastPlay = dvdbox.getPlay();
    dvdbox.playNext();
    dvdbox.play();
  }
  public void undo(){
    int temp = dvdbox.getPlay();
    dvdbox.playIndex(lastPlay);
    lastPlay = temp;
    dvdbox.play();
  }
}