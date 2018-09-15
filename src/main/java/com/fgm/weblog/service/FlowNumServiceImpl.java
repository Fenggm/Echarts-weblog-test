package com.fgm.weblog.service;


import com.fgm.weblog.dao.FlowNumDao;
import com.fgm.weblog.pojo.FlowNum;
import com.fgm.weblog.pojo.ReturnFlowNumPojo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
public class FlowNumServiceImpl implements FlowNumService {


    @Autowired
    private FlowNumDao flowNumDao;


    @Override
    public ReturnFlowNumPojo getReturnFlowNum() {
        ReturnFlowNumPojo returnFlowNumPojo = new ReturnFlowNumPojo();
         List<String> dates = new ArrayList<String>();
         List<Integer> uvs= new ArrayList<Integer>();
         List<Integer> new_uvs= new ArrayList<Integer>();


        List<FlowNum>  flowNumList =  flowNumDao.getAllFlowNum();
        for (FlowNum flowNum : flowNumList) {
            dates.add(flowNum.getDateStr());
            uvs.add(flowNum.getuVNum());
            new_uvs.add(flowNum.getNewUvNum());


        }
        returnFlowNumPojo.setDates(dates);
        returnFlowNumPojo.setUvs(uvs);
        returnFlowNumPojo.setNew_uvs(new_uvs);

        return returnFlowNumPojo;
    }
}
