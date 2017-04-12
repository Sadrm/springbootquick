package com.quick.api;



import com.quick.po.Address;
import com.quick.utils.BaseResp;
import com.quick.utils.ResultStatus;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created with IDEA
 * User: vector
 * Data: 2017/4/12
 * Time: 8:41
 * Description:
 */
@RestController
@RequestMapping("/api")
public class WebController {

    @RequestMapping("/address")
    public BaseResp<Address> getAddressInfo(@RequestParam(value = "province")String province,
                                   @RequestParam(value = "area")String area,
                                   @RequestParam(value = "street")String street,
                                   @RequestParam(value = "num")String num){

        if(StringUtils.isEmpty(province)||StringUtils.isEmpty(area)||StringUtils.isEmpty(street)||StringUtils.isEmpty(num)){
            return new BaseResp(ResultStatus.error_invalid_argument);
        }
        Address address = new Address();
        address.setProvince(province);
        address.setArea(area);
        address.setStreet(street);
        address.setNum(num);
        return new BaseResp(ResultStatus.SUCCESS,address);

    }

    @RequestMapping("/address/str")
    public BaseResp<String> getAddressString(@RequestParam(value = "province")String province,
                                            @RequestParam(value = "area")String area,
                                            @RequestParam(value = "street")String street,
                                            @RequestParam(value = "num")String num){

        if(StringUtils.isEmpty(province)||StringUtils.isEmpty(area)||StringUtils.isEmpty(street)||StringUtils.isEmpty(num)){
            return new BaseResp(ResultStatus.error_invalid_argument);
        }
        Address address = new Address();
        address.setProvince(province);
        address.setArea(area);
        address.setStreet(street);
        address.setNum(num);
        return new BaseResp(ResultStatus.SUCCESS,address.toString());

    }

    @RequestMapping("/address/list")
    public BaseResp<List<Address>> getAddressList(@RequestParam(value = "province")String province,
                                             @RequestParam(value = "area")String area,
                                             @RequestParam(value = "street")String street,
                                             @RequestParam(value = "num")String num){

        if(StringUtils.isEmpty(province)||StringUtils.isEmpty(area)||StringUtils.isEmpty(street)||StringUtils.isEmpty(num)){
            return new BaseResp(ResultStatus.error_invalid_argument);
        }
        Address address = new Address();
        address.setProvince(province);
        address.setArea(area);
        address.setStreet(street);
        address.setNum(num);
        List<Address> lists = new ArrayList<>();
        lists.add(address);
        lists.add(address);
        lists.add(address);
        return new BaseResp(ResultStatus.SUCCESS,lists);

    }

    @RequestMapping("/address/map")
    public BaseResp<Map<String,Address>> getAddressMap(@RequestParam(value = "province")String province,
                                                        @RequestParam(value = "area")String area,
                                                        @RequestParam(value = "street")String street,
                                                        @RequestParam(value = "num")String num){

        if(StringUtils.isEmpty(province)||StringUtils.isEmpty(area)||StringUtils.isEmpty(street)||StringUtils.isEmpty(num)){
            return new BaseResp(ResultStatus.error_invalid_argument);
        }
        Map<String,Address> map = new HashMap<>();
        Address address = new Address();
        address.setProvince(province);
        address.setArea(area);
        address.setStreet(street);
        address.setNum(num);
        map.put(num,address);
        return new BaseResp(ResultStatus.SUCCESS,map);

    }
}
