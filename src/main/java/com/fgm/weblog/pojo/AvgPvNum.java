package com.fgm.weblog.pojo;

import org.springframework.web.servlet.view.InternalResourceViewResolver;

public class AvgPvNum {
    /**
     *
     FieldTypeComment
     idint(11) NULL
     dateStrvarchar(255) NULL
     avgPvNumdecimal(6,2) NULL
     */

    private int  id;
    private String dateStr;
    private String avgPvNum;

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

    public String getAvgPvNum() {
        return avgPvNum;
    }

    public void setAvgPvNum(String avgPvNum) {
        this.avgPvNum = avgPvNum;
    }
}
