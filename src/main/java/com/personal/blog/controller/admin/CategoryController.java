package com.personal.blog.controller.admin;

import cn.hutool.core.util.StrUtil;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.personal.blog.entity.Category;
import com.personal.blog.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

/**
 * @author YUDI
 * @date 2020/9/27 20:52
 */
@Controller
@RequestMapping("/admin/category")
public class CategoryController {

    private final String prefix = "/admin/category";

    @Autowired
    private CategoryService categoryService;

    @GetMapping("/list")
    public String category(Page<Category> page, ModelMap modelMap){
        // IPage<Category> pageList = categoryService.page(ipage);
        page.setSize(5);
        page.setMaxLimit(8L);
        modelMap.put("page",categoryService.page(page));
        return prefix + "/category";
    }

    /**
     * 跳转新增页面
     * @param modelMap
     * @return
     */
    @GetMapping("/add")
    public String add(ModelMap modelMap){
        modelMap.put("category",new Category());
        return prefix + "/add";
    }

    /**
     * 新增保存
     * @param category
     * @param modelMap
     * @param attributes
     * @return
     */
    @PostMapping("/add")
    public String addSave(Category category, ModelMap modelMap, RedirectAttributes attributes){
        if(StrUtil.isEmpty(category.getName())){
            attributes.addFlashAttribute("message","分类名称不能为空");
        }
        if(categoryService.save(category)){
            attributes.addFlashAttribute("message","操作成功");
            modelMap.put("category",category);
            return "redirect:/admin/category/list";
        }else{
            attributes.addFlashAttribute("message","操作失败，请联系管理员");
        }
        return "redirect:" + prefix + "/add";
    }

    /**
     * 跳转编辑页面
     * @param id
     * @param modelMap
     * @return
     */
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") long id, ModelMap modelMap){
        modelMap.put("category",categoryService.getById(id));
        return prefix + "/add";
    }

    /**
     * 编辑保存
     * @param category
     * @param modelMap
     * @param attributes
     * @return
     */
    @PostMapping("/edit")
    public String editSave(Category category, ModelMap modelMap, RedirectAttributes attributes){
        if(StrUtil.isEmpty(category.getName())){
            attributes.addFlashAttribute("message","分类名称不能为空");
        }
        UpdateWrapper<Category> updateWrapper = new UpdateWrapper<>();
        updateWrapper.eq("id",category.getId());
        if(categoryService.update(category,updateWrapper)){
            attributes.addFlashAttribute("message","操作成功");
            modelMap.put("category",category);
            return "redirect:admin/category/list";
        }else{
            attributes.addFlashAttribute("message","操作失败，请联系管理员");
        }
        return "redirect:" + prefix + "/add";
    }

    @GetMapping("/remove")
    public String remove(@RequestParam("id") long id, RedirectAttributes attributes){
        if (categoryService.removeById(id)) {
            attributes.addFlashAttribute("message","删除成功");
        }else{
            attributes.addFlashAttribute("message","删除失败");
        }
        return "redirect:" + prefix + "/list";
    }
}
