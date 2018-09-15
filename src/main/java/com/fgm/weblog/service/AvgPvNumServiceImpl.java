package com.fgm.weblog.service;

import com.fgm.weblog.dao.AvgPvNumDao;
import com.fgm.weblog.pojo.AvgPvNum;
import com.fgm.weblog.pojo.ReturnAvgPvNumPojo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
public class AvgPvNumServiceImpl implements   AvgPvNumService {


    /**
     * 在这个方法里面构造我们的ReturnAvgPvNumPojo
     * @return
     */
    @Autowired
    private AvgPvNumDao avgPvNumDao;


    @Override
    public ReturnAvgPvNumPojo getReturnPojo() {
        ReturnAvgPvNumPojo returnAvgPvNumPojo = new ReturnAvgPvNumPojo();
        List<String> dateStr = new ArrayList<String>();
        List<String> datas = new ArrayList<String>();
        List<AvgPvNum>  pvNumList = avgPvNumDao.getAllPvNum();
        for (AvgPvNum avgPvNum : pvNumList) {
            dateStr.add(avgPvNum.getDateStr());
            datas.add(avgPvNum.getAvgPvNum());
        }
        returnAvgPvNumPojo.setData(datas);
        returnAvgPvNumPojo.setDates(dateStr);
        return returnAvgPvNumPojo;
    }
}
