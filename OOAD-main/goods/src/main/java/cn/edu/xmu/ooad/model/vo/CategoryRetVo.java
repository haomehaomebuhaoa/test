package cn.edu.xmu.ooad.model.vo;

import cn.edu.xmu.ooad.model.bo.Category;
import cn.edu.xmu.ooad.model.bo.Shop;
import lombok.Data;

@Data
public class CategoryRetVo {
    private Long id;
    private String name;
    private Long pid;
    public CategoryRetVo(Category category) {
        this.id = category.getId();
        this.name = category.getName();
        this.pid = category.getId();
    }
}
