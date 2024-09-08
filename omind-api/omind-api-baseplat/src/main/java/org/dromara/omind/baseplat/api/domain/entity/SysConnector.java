package org.dromara.omind.baseplat.api.domain.entity;

import com.alibaba.fastjson2.annotation.JSONField;
import com.baomidou.mybatisplus.annotation.*;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
@TableName("sys_connector")
public class SysConnector implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(type = IdType.AUTO)
    @TableField("id")
    private Long id;

    @TableField("equipment_id")
    private String equipmentId;// 设备编号

    @TableField("connector_id")
    private String connectorId;// 充电桩编号

    @TableField("gun_no")
    private Short gunNo;// 枪号

    @TableField("connector_name")
    private String connectorName;// 充电桩名称

    @TableField("connector_type")
    private Short connectorType;// 充电桩类型

    @TableField("voltage_upper_limits")
    private Integer voltageUpperLimits;// 电压上限

    @TableField("voltage_lower_limits")
    private Integer voltageLowerLimits;// 电压下限

    @TableField("current_value")
    @JSONField(name = "current")
    private Integer currentValue;// 电流

    @TableField("power")
    private BigDecimal power;// 功率

    @TableField("park_no")
    private String parkNo;// 停车场编号

    @TableField("national_standard")
    private Short nationalStandard;// 国家标准

    @TableField("status")
    private Short status;// 充电桩状态

    @TableField("park_status")
    private Short parkStatus;// 停车场状态

    @TableField("lock_status")
    private Short lockStatus;// 锁状态

    @TableField("price_code")
    private Integer priceCode;// 价格代码

    @TableField("state")
    private Short state;// 状态

    @TableField("ping_tm")
    private Date pingTm;// 心跳时间

    @TableField(value = "create_by_id", fill = FieldFill.INSERT)
    private Long createById;// 创建者

    @TableField(fill = FieldFill.INSERT)
    private Date createTime;// 创建时间

    @TableField(value = "update_by_id", fill = FieldFill.INSERT_UPDATE)
    private Long updateById;// 更新者

    @TableField(fill = FieldFill.INSERT_UPDATE)
    private Date updateTime = new Date();

    /**
     * 删除标志（0代表存在 1代表删除）
     */
    @Schema(description = "删除标志", accessMode = Schema.AccessMode.READ_ONLY)
    @TableField("del_flag")
    @TableLogic
    private Short delFlag;

}
