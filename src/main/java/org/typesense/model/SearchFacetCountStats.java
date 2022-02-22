package org.typesense.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SearchFacetCountStats {
    private Long totalValues;

    @JsonProperty("total_values")
    public Long getTotalValues() {
        return totalValues;
    }

    public void setTotalValues(Long totalValues) {
        this.totalValues = totalValues;
    }
}
