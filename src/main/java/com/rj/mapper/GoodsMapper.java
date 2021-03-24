package com.rj.mapper;

import com.rj.dto.GoodsDTO;
import com.rj.entity.Goods;
import org.springframework.stereotype.Component;

@Component
public interface GoodsMapper {
    Boolean add(Goods goodsDTO);

    Goods detail(Integer id);

    Goods remove(Integer id);
}

