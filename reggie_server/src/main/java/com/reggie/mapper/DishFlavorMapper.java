package com.reggie.mapper;

import com.github.pagehelper.Page;
import com.reggie.dto.DishPageQueryDTO;
import com.reggie.entity.DishFlavor;
import com.reggie.vo.DishVO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface DishFlavorMapper {

    //插入菜品口味
    void insert(@Param("flavors") List<DishFlavor> flavors);

    //菜品信息分页查询
    Page<DishVO> PageQuery(DishPageQueryDTO dishPageQueryDTO);
}
