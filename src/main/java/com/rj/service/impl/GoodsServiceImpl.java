package com.rj.service.impl;

import com.rj.dto.GoodsDTO;
import com.rj.entity.Goods;
import com.rj.mapper.GoodsMapper;
import com.rj.service.GoodsService;
import com.rj.vo.GoodsVO;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Service
public class GoodsServiceImpl implements GoodsService {

    @Autowired
    private GoodsMapper goodsMapper;
    @Override
    public Boolean add(Goods goodsDTO) {
        LocalDateTime now = LocalDateTime.now();
        goodsDTO.setCreateTime(now);
        Boolean flag = goodsMapper.add(goodsDTO);
        return flag;
    }

    @Override
    public GoodsVO detail(Integer id) {
        Goods goods = goodsMapper.detail(id);
        LocalDateTime createTime = goods.getCreateTime();
        DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String strDate2 = dtf2.format(createTime);
        GoodsVO goodsVO = new GoodsVO(goods.getGoodName(),goods.getPrice(),goods.getRemark(),strDate2);
        return goodsVO;
    }

    @Override
    public Boolean remove(Integer id) {
        Boolean flag = goodsMapper.remove(id);
        return flag;
    }
}
