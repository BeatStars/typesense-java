package org.typesense.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SearchFacetCountDetails {
    private Long count;
    private String highlighted;
    private String value;

    @JsonProperty("count")
    public Long getCount() {
        return count;
    }

    public void setCount(Long count) {
        this.count = count;
    }

    @JsonProperty("highlighted")
    public String getHighlighted() {
        return highlighted;
    }

    public void setHighlighted(String highlighted) {
        this.highlighted = highlighted;
    }

    @JsonProperty("value")
    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
