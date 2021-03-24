package com.rj.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Goods {
    private Integer id;
    private String goodName;
    private BigDecimal price;
    private String remark;
    private LocalDateTime createTime;
}
