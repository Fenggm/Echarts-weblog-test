package com.fgm.weblog.pojo;

public class FlowNum {

   /** idint(11) NULL
    dateStr varchar(255) NULL
    pVNum int(11) NULL
    uVNum int(11) NULL
    iPNum int(11) NULL
    newUvNum int(11) NULL
    visitNum int(11) NULL*/
   private  int  id;
   private String dateStr;
   private int  pVNum;

    private int  uVNum;
    private int  iPNum;
    private int  newUvNum;
    private int  visitNum;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDateStr() {
        return dateStr;
    }

    public void setDateStr(String dateStr) {
        this.dateStr = dateStr;
    }

    public int getpVNum() {
        return pVNum;
    }

    public void setpVNum(int pVNum) {
        this.pVNum = pVNum;
    }

    public int getuVNum() {
        return uVNum;
    }

    public void setuVNum(int uVNum) {
        this.uVNum = uVNum;
    }

    public int getiPNum() {
        return iPNum;
    }

    public void setiPNum(int iPNum) {
        this.iPNum = iPNum;
    }

    public int getNewUvNum() {
        return newUvNum;
    }

    public void setNewUvNum(int newUvNum) {
        this.newUvNum = newUvNum;
    }

    public int getVisitNum() {
        return visitNum;
    }

    public void setVisitNum(int visitNum) {
        this.visitNum = visitNum;
    }
}
