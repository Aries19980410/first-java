package com.rj.dto;

import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
public class GoodsDTO {
    private String goodName;
    private BigDecimal price;
    private String remark;
    private LocalDateTime now;
}
