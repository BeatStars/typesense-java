package org.typesense.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;

public class SearchFacetCount {
    @Schema(required = true, description = "")
    private List<SearchFacetCountDetails> counts = new ArrayList<>();

    @Schema(required = true, description = "")
    private String fieldName = null;

    @Schema(required = true, description = "")
    private SearchFacetCountStats stats = null;

    @JsonProperty("counts")
    public List<SearchFacetCountDetails> getCounts() {
        return counts;
    }

    public void setCounts(List<SearchFacetCountDetails> counts) {
        this.counts = counts;
    }

    @JsonProperty("field_name")
    public String getFieldName() {
        return fieldName;
    }

    public void setFieldName(String fieldName) {
        this.fieldName = fieldName;
    }

    @JsonProperty("stats")
    public SearchFacetCountStats getStats() {
        return stats;
    }

    public void setStats(SearchFacetCountStats stats) {
        this.stats = stats;
    }
}
