package com.everysens.itss.dto.movement;

import com.everysens.itss.dto.BaseDeviceResponseDto;
import com.everysens.itss.dto.position.PositionEventDto;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.validation.constraints.NotNull;

public class MovementStateEventDto extends PositionEventDto {

    @NotNull
    @JsonProperty("ITSS_MovementState")
    private MovementState movementState;

}