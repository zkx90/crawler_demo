package com.aladdin.demo.controller;

import com.aladdin.demo.entity.Result;
import com.aladdin.demo.service.ZoneService;
import com.aladdin.demo.util.CommonUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by zkx on 2017/7/30.
 */
@Controller
@RequestMapping("v1/zone")
public class ZoneController {



    @Autowired
    private ZoneService zoneService;

    @RequestMapping("list")
    @ResponseBody
    public Result queryZoneList(Long userId,) {
        Result result = CommonUtils.generateSuccessResult();
        result.setData(zoneService.queryZoneList(userId));
        return result;
    }

    @RequestMapping("freeze")
    @ResponseBody
    public Result freezeZone(){

    }
}