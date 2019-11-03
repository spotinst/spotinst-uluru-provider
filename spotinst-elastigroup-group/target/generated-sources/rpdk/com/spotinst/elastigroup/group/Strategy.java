// This is a generated file. Modifications will be overwritten.
package com.spotinst.elastigroup.group;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;
import java.util.List;
import java.util.Set;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Strategy {
    @JsonProperty("risk")
    private Integer risk;

    @JsonProperty("onDemandCount")
    private Integer onDemandCount;

    @JsonProperty("availabilityVsCost")
    private String availabilityVsCost;

    @JsonProperty("drainingTimeout")
    private Integer drainingTimeout;

    @JsonProperty("fallbackToOd")
    private Boolean fallbackToOd;

    @JsonProperty("lifetimePeriod")
    private String lifetimePeriod;

    @JsonProperty("revertToSpot")
    private RevertToSpot revertToSpot;

}
