package org.dromara.omind.baseplat.api.domain.entity;

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
@TableName("sys_equipment")
public class SysEquipment implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(type = IdType.AUTO)
    @TableField("id")
    private Long id;

    @TableField("equipment_id")
    private String equipmentId;// 设备编号

    @TableField("pile_no")
    private String pileNo;// 充电桩编号

    @TableField("station_id")
    private String stationId;// 充电站编号

    @TableField("price_code")
    private Integer priceCode;// 电价代码

    @TableField("manufacturer_id")
    private String manufacturerId;// 厂商编号

    @TableField("manufacturer_name")
    private String manufacturerName;// 厂商名称

    @TableField("equipment_model")
    private String equipmentModel;// 设备型号

    @TableField("production_date")
    private String productionDate;// 生产日期

    @TableField("equipment_type")
    private Short equipmentType;// 设备类型

    @TableField("equipment_lng")
    private BigDecimal equipmentLng;// 经度

    @TableField("equipment_lat")
    private BigDecimal equipmentLat;// 纬度

    @TableField("power")
    private BigDecimal power;// 设备功率

    @TableField("max_power")
    private BigDecimal maxPower;// 最大功率

    @TableField("is_working")
    private Short isWorking;// 是否在用

    @TableField("sync_tm")
    private Date syncTm;// 同步时间

    @TableField("online_tm")
    private Date onlineTm;// 上线时间

    @TableField("serv_ip")
    private String serverIp;// 服务器IP

    @TableField("equipment_name")
    private String equipmentName;// 设备名称

    @TableField("net_type")
    private Short netType;// 网络类型

    @TableField("m_operator")
    private Short mOperator;// 运营商

    @TableField(value = "create_by_id", fill = FieldFill.INSERT)
    private Long createById;// 创建者

    @TableField(fill = FieldFill.INSERT)
    private Date createTime;// 创建时间

    @TableField(value = "update_by_id", fill = FieldFill.INSERT_UPDATE)
    private Long updateById;

    @TableField(fill = FieldFill.INSERT_UPDATE)
    private Date updateTime;

    /**
     * 删除标志（0代表存在 1代表删除）
     */
    @Schema(description = "删除标志", accessMode = Schema.AccessMode.READ_ONLY)
    @TableField("del_flag")
    @TableLogic
    private Short delFlag;

    @TableField(exist = false)
    private Integer gunNum;// 枪数

}
