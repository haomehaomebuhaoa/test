package cn.edu.xmu.ooad.model.vo;

import cn.edu.xmu.ooad.model.bo.Brand;
import cn.edu.xmu.ooad.model.bo.Category;
import lombok.Data;

import javax.validation.constraints.NotBlank;

@Data
public class CategoryVo {
    @NotBlank(message = "分类名不能为空")
    private String name;
    public Category createCategory() {
        Category category = new Category();
        category.setName(this.name);
        return category;
    }
}
