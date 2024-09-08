package org.dromara.omind.baseplat.api.domain.entity;

import com.baomidou.mybatisplus.annotation.*;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Data
@TableName("sys_charge_order")
public class SysChargeOrder implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(type = IdType.AUTO)
    @TableField("id")
    private Long id;

    @TableField("start_charge_seq")
    private String startChargeSeq;// 开始充电流水号

    @TableField("operator_id")
    private String operatorId;

    @TableField("trade_no")
    private String tradeNo;// 订单号

    @TableField("start_charge_seq_stat")
    private Short startChargeSeqStat;// 开始充电流水号状态

    @TableField("station_id")
    private String stationId;// 充电站id

    @TableField("connector_id")
    private String connectorId;// 充电桩id

    @TableField("connector_status")
    private Integer connectorStatus;// 充电桩状态

    @TableField("current_a")
    private BigDecimal currentA;// 充电电流

    @TableField("current_b")
    private BigDecimal currentB;// 充电电流

    @TableField("current_c")
    private BigDecimal currentC;// 充电电流

    @TableField("voltage_a")
    private BigDecimal voltageA;// 充电电压

    @TableField("voltage_b")
    private BigDecimal voltageB;// 充电电压

    @TableField("voltage_c")
    private BigDecimal voltageC;

    @TableField("soc")
    private BigDecimal soc;// 电池SOC

    @TableField("start_time")
    private Date startTime;

    @TableField("end_time")
    private Date endTime;

    @TableField("total_power")
    private BigDecimal totalPower;// 总电量

    @TableField("elec_money")
    private BigDecimal elecMoney;// 电费

    @TableField("service_money")
    private BigDecimal serviceMoney;// 服务费

    @TableField("total_money")
    private BigDecimal totalMoney;// 总金额

    @TableField("sum_period")
    private Short sumPeriod;// 充电时长

    @TableField("fail_reason")
    private Integer failReason;// 充电失败原因

    @TableField("car_vin")
    private String carVin;// 车辆vin码

    @TableField("phone_num")
    private String phoneNum;// 手机号

    @TableField("plate_num")
    private String plateNum;// 车牌号

    @TableField("sync_flag")
    private Short syncFlag;// 同步标志

    @TableField("report_gov")
    private Short reportGov;// 是否上报政府平台

    @TableField(fill = FieldFill.INSERT)
    private Date createTime;// 创建时间

    @TableField(fill = FieldFill.INSERT_UPDATE)
    private Date updateTime = new Date();// 更新时间

    @TableField("price_info")
    private String priceInfo;// 价格信息

    /**
     * 删除标志（0代表存在 1代表删除）
     */
    @Schema(description = "删除标志", accessMode = Schema.AccessMode.READ_ONLY)
    @TableField("del_flag")
    @TableLogic
    private Short delFlag;

}
