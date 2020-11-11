package cn.edu.xmu.ooad.controller;

import cn.edu.xmu.ooad.annotation.Audit;
import cn.edu.xmu.ooad.model.VoObject;
import cn.edu.xmu.ooad.model.vo.BrandVo;
import cn.edu.xmu.ooad.model.vo.ShopVo;
import cn.edu.xmu.ooad.service.ShopService;
import cn.edu.xmu.ooad.util.Common;
import cn.edu.xmu.ooad.util.ReturnObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;

@Controller
public class ShopController {
    @Autowired
    ShopService shopService;
    @Autowired
    private HttpServletResponse httpServletResponse;
    @Audit
    @DeleteMapping("shops/{id}")
    public Object deleteShop(@PathVariable("id") Long id){
        ReturnObject returnObject = shopService.deleteShop(id);
        return Common.decorateReturnObject(returnObject);
    }
    @Audit
    @PutMapping("shops/{id}")
    public Object setShop(@PathVariable Long id, @RequestBody ShopVo vo, BindingResult bindingResult){
        Object returnObject = Common.processFieldErrors(bindingResult, httpServletResponse);
        if (null != returnObject) {
            return returnObject;
        }
        ReturnObject<Object> retObject = shopService.setShopState(id, vo);
        return Common.decorateReturnObject(retObject);
    }
    @Audit
    @PostMapping("shops/{id}")
    public Object addShop( @RequestBody BindingResult bindingResult,ShopVo vo) {
        Object returnObject = Common.processFieldErrors(bindingResult, httpServletResponse);
        if (null != returnObject) {
            return returnObject;
        }
        ReturnObject<VoObject> retObject = shopService.addShop(vo);
        httpServletResponse.setStatus(HttpStatus.CREATED.value());
        return Common.decorateReturnObject(retObject);
    }
}
