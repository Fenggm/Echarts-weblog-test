package com.fgm.weblog.controller;


import com.fgm.weblog.pojo.ReturnAvgPvNumPojo;
import com.fgm.weblog.pojo.ReturnFlowNumPojo;
import com.fgm.weblog.service.AvgPvNumService;
import com.fgm.weblog.service.FlowNumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class IndexController {

    @RequestMapping("/index.action")
    public  String skipToIndex(){


        return "index";
    }


    /**
     * 我们要返回一个json格式的数据，里面包含两个字段  dates  一个是data   这两个字段都是数组
     */

    @Autowired
    private AvgPvNumService avgPvNumService;


    @RequestMapping("/avgPvNum.action")
    @ResponseBody
    public ReturnAvgPvNumPojo getPvNumPojo(){
        ReturnAvgPvNumPojo  returnAvgPvNumPojo = avgPvNumService.getReturnPojo();


        return returnAvgPvNumPojo;
    }

    @Autowired
    private FlowNumService flowNumService;

    @RequestMapping("/flowNum.action")
    @ResponseBody
    public ReturnFlowNumPojo getReturnFlowNumPojo(){
        ReturnFlowNumPojo returnFlowNumPojo  = flowNumService.getReturnFlowNum();




        return returnFlowNumPojo;
    }





}
