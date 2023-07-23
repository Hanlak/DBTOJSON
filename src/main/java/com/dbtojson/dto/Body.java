package com.dbtojson.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class Body {
    @JsonProperty("applicaton")
    private ApplicationDto application;
}
