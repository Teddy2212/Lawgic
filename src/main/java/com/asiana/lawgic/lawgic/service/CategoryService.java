package com.asiana.lawgic.lawgic.service;

import com.asiana.lawgic.lawgic.dto.LawyerDTO;
import com.asiana.lawgic.lawgic.entity.Category;
import com.asiana.lawgic.lawgic.entity.Lawyer;

import java.util.List;

public interface CategoryService {
    public List<LawyerDTO> getLawyersByCategoryId(Category category);
}
