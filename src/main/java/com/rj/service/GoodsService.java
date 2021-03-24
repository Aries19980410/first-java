package com.rj.service;

import com.rj.dto.GoodsDTO;
import com.rj.entity.Goods;
import com.rj.vo.GoodsVO;

public interface
GoodsService {
    Boolean add(Goods goodsDTO);

    GoodsVO detail(Integer id);

    Boolean remove(Integer id);
}
