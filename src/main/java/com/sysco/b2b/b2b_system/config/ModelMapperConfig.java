package com.sysco.b2b.b2b_system.config;

import com.sysco.b2b.b2b_system.dto.ProductDto;
import com.sysco.b2b.b2b_system.entity.Product;
import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ModelMapperConfig {

    @Bean
    public ModelMapper modelMapper() {
        ModelMapper modelMapper = new ModelMapper();
        modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);

        // Explicit Enum Mapping
        modelMapper.typeMap(ProductDto.class, Product.class).addMappings(mapper ->
                mapper.map(ProductDto::getCategory, Product::setCategory)
        );

        return modelMapper;
    }
}