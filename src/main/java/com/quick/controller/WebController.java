package com.quick.controller;

import com.quick.spark.WordCountService;
import com.quick.util.BaseResp;
import com.quick.util.ResultStatus;
import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Map;

/**
 * Created with IDEA
 * User: vector
 * Data: 2017/4/13
 * Time: 18:02
 * Description:
 */
@RestController
@RequestMapping("/spark")
public class WebController {
    private Logger logger = Logger.getLogger(WebController.class);

    @Resource
    private WordCountService wordCountService;

    @RequestMapping("/wordCount")
    @ResponseBody
    public BaseResp<Map<String, Integer>> wordCount(){

        logger.info("start submit spark tast...");
        Map<String, Integer> counts = wordCountService.run();
        return new BaseResp<Map<String, Integer>>(ResultStatus.SUCCESS,counts);
    }

    

    @RequestMapping("/hello")
    public BaseResp<String> pring(){
        return new BaseResp<String>(ResultStatus.SUCCESS,"hihi");
    }
}
