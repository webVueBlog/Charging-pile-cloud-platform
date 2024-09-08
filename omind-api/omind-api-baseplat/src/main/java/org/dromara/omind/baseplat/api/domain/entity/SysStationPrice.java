package org.dromara.omind.baseplat.api.domain.entity;

import com.baomidou.mybatisplus.annotation.*;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
@TableName("sys_station_price")
public class SysStationPrice implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(type = IdType.AUTO)
    @TableField("id")
    private Long id;

    @TableField("station_id")
    private String stationId;// 岗位编码

    @TableField("price_code")
    private Long priceCode;// 价格编码

    @TableField("price_type")
    private Integer priceType;// 价格类型

    @TableField("remark")
    private String remark;

    @TableField("is_use")
    private Short isUse;// 是否启用

    /**
     * 删除标志（0代表存在 1代表删除）
     */
    @Schema(description = "删除标志", accessMode = Schema.AccessMode.READ_ONLY)
    @TableField("del_flag")
    @TableLogic
    private Short delFlag;

    @TableField(value = "create_by_id", fill = FieldFill.INSERT)
    private Long createById;// 创建者

    @TableField(fill = FieldFill.INSERT)
    private Date createTime;// 创建时间

    @TableField(value = "update_by_id", fill = FieldFill.INSERT_UPDATE)
    private Long updateById;// 更新者

    @TableField(fill = FieldFill.INSERT_UPDATE)
    private Date updateTime;// 更新时间

}
