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
@TableName("sys_station")
public class SysStation implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(type = IdType.AUTO)
    @TableField("id")
    private Long id;

    @TableField("station_id")
    private String stationId;//站点编号

    @TableField("operator_id")
    private String operatorId;

    @TableField("equipment_owner_id")
    private String equipmentOwnerId;//设备拥有者编号

    @TableField("station_name")
    private String stationName;//站点名称

    @TableField("country_code")
    private String countryCode;//国家编码

    @TableField("area_code")
    private String areaCode;//区域编码

    @TableField("address")
    private String address;

    @TableField("station_tel")
    private String stationTel;//站点电话

    @TableField("service_tel")
    private String serviceTel;//客服电话

    @TableField("station_type")
    private Integer stationType;//站点类型

    @TableField("station_status")
    private Short stationStatus;//站点状态

    @TableField("park_nums")
    private Integer parkNums;// 停车场数量

    @TableField("station_lng")
    private BigDecimal stationLng;//站点经度

    @TableField("station_lat")
    private BigDecimal stationLat;//站点纬度

    @TableField("site_guide")
    private String siteGuide;//站点指引

    @TableField("construction")
    private Integer construction;// 施工状态

    @TableField("pictures")
    private String pictures;// 站点图片

    @TableField("match_cars")
    private String matchCars;// 匹配车型

    @TableField("park_info")
    private String parkInfo;// 停车场信息

    @TableField("business_hours")
    private String businessHours;// 营业时间

    @TableField(value = "create_by_id", fill = FieldFill.INSERT)
    private Long createById;// 创建者

    @TableField(fill = FieldFill.INSERT)
    private Date createTime;

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

    @TableField("electricity_fee")
    private String electricityFee;//电费

    @TableField("service_fee")
    private String serviceFee;// 服务费

    @TableField("park_fee")
    private String parkFee;// 停车费

    @TableField("payment")
    private String payment;// 支付方式

    @TableField("support_order")
    private Short supportOrder;// 是否支持预约

    @TableField("remark")
    private String remark;// 备注

    @TableField("report_gov_flag")
    private Short reportGovFlag;// 是否上报政府

    @TableField("report_gov")
    private Short reportGov;// 是否上报政府

    @TableField("is_alone_apply")
    private Short isAloneApply;// 是否单独申请

    @TableField("account_number")
    private String accountNumber;// 账号

    @TableField("capacity")
    private BigDecimal capacity;// 容量

    @TableField("is_public_parking_lot")
    private Short isPublicParkingLot;// 是否为公共停车场

    @TableField("parking_lot_number")
    private String parkingLotNumber;// 停车场编号

    @TableField("open_all_day")
    private Short openAllDay;// 是否全天开放

    @TableField("park_free")
    private Short parkFree;// 是否免费停车

    @TableField("park_fee_type")
    private Short parkFeeType;// 停车费类型

    @TableField("unit_flag")
    private Integer unitFlag;// 单位标识

    @TableField("min_electricity_price")
    private BigDecimal minElectricityPrice;// 最小电费

    @TableField("subsidy_per_kwh")
    private BigDecimal subsidyPerKwh;// 单位补贴电费

    @TableField("subsidy_year_max")
    private BigDecimal subsidyYearMax;// 年度补贴上限

    @TableField("subsidy_operator")
    private String subsidyOperator;// 补贴运营商

    @TableField(exist = false)
    private Integer pileNum;// 充电桩数量

    @TableField(exist = false)
    private Integer gunNum;// 枪数量

    @TableField(exist = false)
    private String createUserName;// 创建人姓名

    @TableField(exist = false)
    private String updateUsername;// 更新人姓名

}
