package org.dromara.omind.baseplat.api.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

@Schema(name = "ConnectorStatsInfoData", description = "充电设备接口统计信息")
@Data
public class ConnectorStatsInfoData  implements Serializable {

    private static final long serialVersionUID = 1L;

    @Schema(name = "ConnectorID", description = "充电设备接口编码",  requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty(value = "ConnectorID")
    private String connectorID;

    @Schema(name = "ConnectorElectricity", description = "充电设备接口累计电量",  requiredMode = Schema.RequiredMode.AUTO)
    @JsonProperty(value = "ConnectorElectricity")
    private BigDecimal connectorElectricity;

}
