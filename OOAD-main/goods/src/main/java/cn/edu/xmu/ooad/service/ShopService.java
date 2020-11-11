package cn.edu.xmu.ooad.service;

import cn.edu.xmu.ooad.dao.BrandDao;
import cn.edu.xmu.ooad.dao.ShopDao;
import cn.edu.xmu.ooad.model.VoObject;
import cn.edu.xmu.ooad.model.bo.Brand;
import cn.edu.xmu.ooad.model.bo.Shop;
import cn.edu.xmu.ooad.model.vo.BrandVo;
import cn.edu.xmu.ooad.model.vo.ShopVo;
import cn.edu.xmu.ooad.util.ResponseCode;
import cn.edu.xmu.ooad.util.ReturnObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ShopService {
    @Autowired
    private ShopDao shopDao;
    public ReturnObject<Object> deleteShop(Long id) {
        return shopDao.delShop(id);
    }
    public ReturnObject<VoObject> addShop(ShopVo vo) {
        Shop shop = vo.createShop();
        ReturnObject<Shop> retObj = shopDao.addShop(shop);
        ReturnObject<VoObject> retShop = null;
        if (retObj.getCode().equals(ResponseCode.OK)) {
            retShop = new ReturnObject<>(retObj.getData());
        } else {
            retShop = new ReturnObject<>(retObj.getCode(), retObj.getErrmsg());
        }
        return retShop;
    }
    public ReturnObject <Object> setShopState( Long id, ShopVo vo) {
        Shop shop = vo.createShop();
        shop.setId(id);
        ReturnObject<Shop> retObj = shopDao.setShopState(shop);
        ReturnObject<Object> retShop;
        if (retObj.getCode().equals(ResponseCode.OK)) {
            retShop = new ReturnObject<>(retObj.getData());
        } else {
            retShop = new ReturnObject<>(retObj.getCode(), retObj.getErrmsg());
        }
        return retShop;
    }
}
