package com.rj.controller;

import com.rj.dto.GoodsDTO;
import com.rj.entity.Goods;
import com.rj.res.Result;
import com.rj.service.GoodsService;
import com.rj.vo.GoodsVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Objects;

@RestController
public class GoodsController {

    @Autowired
    private GoodsService goodsService;

    @PostMapping("/good/add")
    public Result add(@RequestBody Goods goodsDTO){
        Boolean reslut = goodsService.add(goodsDTO);
        if (reslut){
            return new Result(true,200,"成功",reslut);
        }
        return new Result(true,500,"失败",reslut);
    }

    @GetMapping("/good/detail")
    public Result add(@RequestParam Integer id){
        GoodsVO reslut = goodsService.detail(id);
        if (Objects.isNull(reslut)){
            return new Result(true,500,"失败",reslut);
        }
        return new Result(true,200,"成功",reslut);
    }

    @PostMapping("/good/remove")
    public Result remove(@RequestParam Integer id){
        Goods reslut = goodsService.remove(id);
        if (Objects.isNull(reslut)){
            return new Result(true,200,"成功",reslut);
        }
        return new Result(true,500,"失败",reslut);
    }
}
