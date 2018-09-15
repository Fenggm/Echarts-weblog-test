package com.fgm.weblog.pojo;

import java.util.List;

public class ReturnFlowNumPojo {

    private List<String> dates;

    private List<Integer> uvs;
    private List<Integer> new_uvs;

    public List<String> getDates() {
        return dates;
    }

    public void setDates(List<String> dates) {
        this.dates = dates;
    }

    public List<Integer> getUvs() {
        return uvs;
    }

    public void setUvs(List<Integer> uvs) {
        this.uvs = uvs;
    }

    public List<Integer> getNew_uvs() {
        return new_uvs;
    }

    public void setNew_uvs(List<Integer> new_uvs) {
        this.new_uvs = new_uvs;
    }
}
