package cn.edu.xmu.ooad.service;
import cn.edu.xmu.ooad.dao.BrandDao;
import cn.edu.xmu.ooad.model.VoObject;
import cn.edu.xmu.ooad.model.bo.Brand;
import cn.edu.xmu.ooad.model.po.BrandPo;
import cn.edu.xmu.ooad.model.vo.BrandVo;
import cn.edu.xmu.ooad.util.ResponseCode;
import cn.edu.xmu.ooad.util.ReturnObject;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;

@Service
public class BrandService {


    @Autowired
    private BrandDao brandDao;
    public ReturnObject<Object> deleteBrand(Long id) {
        return brandDao.deleteBrandById(id);
    }

    public ReturnObject<VoObject> addBrand(BrandVo vo) {
        Brand brand = vo.createBrand();
        ReturnObject<Brand> retObj = brandDao.addBrand(brand);
        ReturnObject<VoObject> retBrand = null;
        if (retObj.getCode().equals(ResponseCode.OK)) {
            retBrand = new ReturnObject<>(retObj.getData());
        } else {
            retBrand = new ReturnObject<>(retObj.getCode(), retObj.getErrmsg());
        }
        return retBrand;
    }
    public ReturnObject <Object> setBrand( Long id, BrandVo vo) {
        Brand brand = vo.createBrand();
        brand.setId(id);
        ReturnObject<Brand> retObj = brandDao.setBrand(brand);
        ReturnObject<Object> retBrand;
        if (retObj.getCode().equals(ResponseCode.OK)) {
            retBrand = new ReturnObject<>(retObj.getData());
        } else {
            retBrand = new ReturnObject<>(retObj.getCode(), retObj.getErrmsg());
        }
        return retBrand;
    }

    public ReturnObject<PageInfo<VoObject>> selectAllBrands(Integer pageNum, Integer pageSize) {
        ReturnObject<PageInfo<VoObject>> returnObject = brandDao.selectAllBrand(pageNum, pageSize);
        return returnObject;
    }

}
