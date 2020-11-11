package cn.edu.xmu.ooad.dao;

import cn.edu.xmu.ooad.mapper.ShopPoMapper;
import cn.edu.xmu.ooad.model.bo.Brand;
import cn.edu.xmu.ooad.model.bo.Shop;
import cn.edu.xmu.ooad.model.po.BrandPo;
import cn.edu.xmu.ooad.model.po.ShopPo;
import cn.edu.xmu.ooad.util.ResponseCode;
import cn.edu.xmu.ooad.util.ReturnObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;

import java.util.Objects;

@Repository
public class ShopDao {
    @Autowired
    ShopPoMapper shopPoMapper;

    public ReturnObject<Shop> setShopState(Shop shop){
        ShopPo shopPo = shop.gotShopPo();
        ReturnObject<Shop> retObj = null;
        try{
            int ret = shopPoMapper.updateByPrimaryKeySelective(shopPo);
            if (ret == 0) {
                retObj = new ReturnObject<>(ResponseCode.RESOURCE_ID_NOTEXIST, String.format("商铺id不存在：" + shopPo.getId()));
            } else {
                retObj = new ReturnObject<>();
            }
        }
        catch (DataAccessException e) {
            // 其他数据库错误
            retObj = new ReturnObject<>(ResponseCode.INTERNAL_SERVER_ERR, String.format("数据库错误：%s", e.getMessage()));
        }
        catch (Exception e) {
            // 其他Exception错误
            retObj = new ReturnObject<>(ResponseCode.INTERNAL_SERVER_ERR, String.format("发生了严重的数据库错误：%s", e.getMessage()));
        }
        return retObj;
    }

    public ReturnObject<Shop>addShop(Shop shop){
        ShopPo shopPo = shop.gotShopPo();
        ReturnObject<Shop> retObj = null;
        try{
            int ret = shopPoMapper.insertSelective(shopPo);
            if (ret == 0) {
                //插入失败
                retObj = new ReturnObject<>(ResponseCode.USER_HASSHOP, String.format("用户已经有店铺：" + shopPo.getName()));

            } else {
                //插入成功
                shop.setId(shopPo.getId());
                retObj = new ReturnObject<>(shop);
            }
        }
        catch (DataAccessException e) {
                // 其他数据库错误
                retObj = new ReturnObject<>(ResponseCode.INTERNAL_SERVER_ERR, String.format("数据库错误：%s", e.getMessage()));

        }
        catch (Exception e) {
            // 其他Exception错误
            retObj = new ReturnObject<>(ResponseCode.INTERNAL_SERVER_ERR, String.format("发生了严重的数据库错误：%s", e.getMessage()));
        }
        return retObj;
    }

    public ReturnObject<Object> delShop(long id){
        ReturnObject<Object> retObj = null;
        int ret = shopPoMapper.deleteByPrimaryKey(id);
        if (ret == 0) {
            retObj = new ReturnObject<>(ResponseCode.RESOURCE_ID_NOTEXIST, String.format("商铺id不存在：" + id));
        }
        else{
            retObj = new ReturnObject<>();
        }
        return retObj;
    }
}
