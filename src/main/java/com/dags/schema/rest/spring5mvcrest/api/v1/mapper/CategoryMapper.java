package com.dags.schema.rest.spring5mvcrest.api.v1.mapper;

import com.dags.schema.rest.spring5mvcrest.api.v1.model.CategoryDTO;
import com.dags.schema.rest.spring5mvcrest.domain.Category;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;


@Mapper
public interface CategoryMapper {

    CategoryMapper INSTANCE = Mappers.getMapper(CategoryMapper.class);

    CategoryDTO categoryToCategoryDTO(Category category);
}