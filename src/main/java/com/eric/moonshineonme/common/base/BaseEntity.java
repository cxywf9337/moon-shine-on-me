package com.eric.moonshineonme.common.base;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * <p>
 * Description:
 * </P>
 *
 * @author wangfei
 * @since 2020-07-09
 */
public class BaseEntity implements Serializable {

    /**
     * 自增主键
     */
    @TableId
    private Long id;

    /**
     * 数据库默认当前时间
     */
    @TableField(value = "created_time")
    private LocalDateTime createdTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDateTime getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(LocalDateTime createdTime) {
        this.createdTime = createdTime;
    }
}
