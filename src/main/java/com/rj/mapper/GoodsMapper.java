package com.rj.mapper;

import com.rj.dto.GoodsDTO;
import com.rj.entity.Goods;
import org.springframework.stereotype.Component;

@Component
public interface GoodsMapper {
    Boolean add(Goods goodsDTO);

    Goods detail(Integer id);

    Boolean remove(Integer id);
}

