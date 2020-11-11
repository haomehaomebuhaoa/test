package cn.edu.xmu.ooad.dao;

import cn.edu.xmu.ooad.mapper.CategoryPoMapper;
import cn.edu.xmu.ooad.mapper.GoodsCategoryPoMapper;
import cn.edu.xmu.ooad.model.bo.Category;
import cn.edu.xmu.ooad.model.po.CategoryPo;
import cn.edu.xmu.ooad.model.po.GoodsCategoryPo;
import cn.edu.xmu.ooad.util.ResponseCode;
import cn.edu.xmu.ooad.util.ReturnObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class CategoryDao {
    @Autowired
    CategoryPoMapper categoryMapper;

    public ReturnObject<Category> getCategoryById(long id){
        CategoryPo categoryPo=categoryMapper.selectByPrimaryKey(id);
        if (categoryPo == null) {
            return new ReturnObject(ResponseCode.RESOURCE_ID_NOTEXIST);
        }
        Category category = new User(userPo);
        if (!user.authetic()) {
            StringBuilder message = new StringBuilder().append("getUserById: ").append(ResponseCode.RESOURCE_FALSIFY.getMessage()).append(" id = ")
                    .append(user.getId()).append(" username =").append(user.getUserName());
            logger.error(message.toString());
            return new ReturnObject<>(ResponseCode.RESOURCE_FALSIFY);
        }
        return new ReturnObject<>(user);
        CategoryPo category=categoryMapper.selectByPrimaryKey(id);
        return category;
    }

    public int setCategoryById(int id, int pid, String name){
        GoodsCategoryPo categoryPo = new GoodsCategoryPo();
        categoryPo.setId(id);
        categoryPo.setPid(pid);
        categoryPo.setName(name);
        return categoryMapper.updateByPrimaryKey(categoryPo);
    }

    public int addCategoryById(int pid, String name){
        GoodsCategoryPo categoryPo = new GoodsCategoryPo();
        categoryPo.setPid(pid);
        categoryPo.setName(name);
        return categoryMapper.insert(categoryPo);
    }

    public int delCategoryById(int id){
        return categoryMapper.deleteByPrimaryKey(id);
    }
}
