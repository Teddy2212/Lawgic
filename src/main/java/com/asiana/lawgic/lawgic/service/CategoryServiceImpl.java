package com.asiana.lawgic.lawgic.service;

import com.asiana.lawgic.lawgic.config.ModelMapperConfig;
import com.asiana.lawgic.lawgic.dto.LawyerDTO;
import com.asiana.lawgic.lawgic.entity.Category;
import com.asiana.lawgic.lawgic.entity.Lawyer;
import com.asiana.lawgic.lawgic.repository.LawyerRepository;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@RequiredArgsConstructor
@Service
public class CategoryServiceImpl implements CategoryService{
    final private LawyerRepository lawyerRepository;
    @Override
    public List<LawyerDTO> getLawyersByCategoryId(Category category) {
        ModelMapper mapper=ModelMapperConfig.getModelMapperInstance();
        Object[] result= lawyerRepository.getLawyersByCategoryId(category);
        List<Lawyer> lawyers=new ArrayList<>();
        List<LawyerDTO> lawyerDTO=new ArrayList<>();
        for(Object o:result){
            lawyers.add((Lawyer)o);
        }
        for(Lawyer lawyer:lawyers){
            LawyerDTO dto=mapper.map(lawyer,LawyerDTO.class);
            lawyerDTO.add(dto);
        }

        return lawyerDTO;
    }
}
