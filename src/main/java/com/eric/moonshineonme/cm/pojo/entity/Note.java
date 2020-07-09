package com.eric.moonshineonme.cm.pojo.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.eric.moonshineonme.common.base.BaseEntity;

/**
 * <p>
 * Description:
 *  我的笔记
 * </P>
 *
 * @author wangfei
 * @since 2020-07-09
 */
@TableName("moon_cm_note")
public class Note extends BaseEntity {

    @TableField
    private String recordDate;

    @TableField
    private String recordTime;

    @TableField
    private String recordContent;

    @TableField
    private String recordUsername;

    @TableField
    private String recordType;

    @TableField
    private String weather;

    public String getRecordDate() {
        return recordDate;
    }

    public void setRecordDate(String recordDate) {
        this.recordDate = recordDate;
    }

    public String getRecordTime() {
        return recordTime;
    }

    public void setRecordTime(String recordTime) {
        this.recordTime = recordTime;
    }

    public String getRecordContent() {
        return recordContent;
    }

    public void setRecordContent(String recordContent) {
        this.recordContent = recordContent;
    }

    public String getRecordUsername() {
        return recordUsername;
    }

    public void setRecordUsername(String recordUsername) {
        this.recordUsername = recordUsername;
    }

    public String getRecordType() {
        return recordType;
    }

    public void setRecordType(String recordType) {
        this.recordType = recordType;
    }

    public String getWeather() {
        return weather;
    }

    public void setWeather(String weather) {
        this.weather = weather;
    }
}
