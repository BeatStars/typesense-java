package org.typesense.model;

import java.util.ArrayList;
import java.util.List;
import org.typesense.model.SearchGroupedHit;
import org.typesense.model.SearchResultHit;
import org.typesense.model.SearchResultRequestParams;

import io.swagger.v3.oas.annotations.media.Schema;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonCreator;

public class SearchResult   {
  
  @Schema(required = true, description = "")
  private List<SearchFacetCount> facetCounts = new ArrayList<>();
  
  @Schema(required = true, description = "The number of documents found")
 /**
   * The number of documents found  
  **/
  private Integer found = null;
  
  @Schema(required = true, description = "The number of milliseconds the search took")
 /**
   * The number of milliseconds the search took  
  **/
  private Integer searchTimeMs = null;
  
  @Schema(required = true, description = "The search result page number")
 /**
   * The search result page number  
  **/
  private Integer page = null;
  
  @Schema(required = true, description = "")
  private List<SearchGroupedHit> groupedHits = new ArrayList<SearchGroupedHit>();
  
  @Schema(required = true, description = "The documents that matched the search query")
 /**
   * The documents that matched the search query  
  **/
  private List<SearchResultHit> hits = new ArrayList<SearchResultHit>();
  
  @Schema(required = true, description = "")
  private SearchResultRequestParams requestParams = null;
 /**
   * Get facetCounts
   * @return facetCounts
  **/
  @JsonProperty("facet_counts")
  public List<SearchFacetCount> getFacetCounts() {
    return facetCounts;
  }

  public void setFacetCounts(List<SearchFacetCount> facetCounts) {
    this.facetCounts = facetCounts;
  }

  public SearchResult facetCounts(List<SearchFacetCount> facetCounts) {
    this.facetCounts = facetCounts;
    return this;
  }

  public SearchResult addFacetCountsItem(SearchFacetCount facetCountsItem) {
    this.facetCounts.add(facetCountsItem);
    return this;
  }

 /**
   * The number of documents found
   * @return found
  **/
  @JsonProperty("found")
  public Integer getFound() {
    return found;
  }

  public void setFound(Integer found) {
    this.found = found;
  }

  public SearchResult found(Integer found) {
    this.found = found;
    return this;
  }

 /**
   * The number of milliseconds the search took
   * @return searchTimeMs
  **/
  @JsonProperty("search_time_ms")
  public Integer getSearchTimeMs() {
    return searchTimeMs;
  }

  public void setSearchTimeMs(Integer searchTimeMs) {
    this.searchTimeMs = searchTimeMs;
  }

  public SearchResult searchTimeMs(Integer searchTimeMs) {
    this.searchTimeMs = searchTimeMs;
    return this;
  }

 /**
   * The search result page number
   * @return page
  **/
  @JsonProperty("page")
  public Integer getPage() {
    return page;
  }

  public void setPage(Integer page) {
    this.page = page;
  }

  public SearchResult page(Integer page) {
    this.page = page;
    return this;
  }

 /**
   * Get groupedHits
   * @return groupedHits
  **/
  @JsonProperty("grouped_hits")
  public List<SearchGroupedHit> getGroupedHits() {
    return groupedHits;
  }

  public void setGroupedHits(List<SearchGroupedHit> groupedHits) {
    this.groupedHits = groupedHits;
  }

  public SearchResult groupedHits(List<SearchGroupedHit> groupedHits) {
    this.groupedHits = groupedHits;
    return this;
  }

  public SearchResult addGroupedHitsItem(SearchGroupedHit groupedHitsItem) {
    this.groupedHits.add(groupedHitsItem);
    return this;
  }

 /**
   * The documents that matched the search query
   * @return hits
  **/
  @JsonProperty("hits")
  public List<SearchResultHit> getHits() {
    return hits;
  }

  public void setHits(List<SearchResultHit> hits) {
    this.hits = hits;
  }

  public SearchResult hits(List<SearchResultHit> hits) {
    this.hits = hits;
    return this;
  }

  public SearchResult addHitsItem(SearchResultHit hitsItem) {
    this.hits.add(hitsItem);
    return this;
  }

 /**
   * Get requestParams
   * @return requestParams
  **/
  @JsonProperty("request_params")
  public SearchResultRequestParams getRequestParams() {
    return requestParams;
  }

  public void setRequestParams(SearchResultRequestParams requestParams) {
    this.requestParams = requestParams;
  }

  public SearchResult requestParams(SearchResultRequestParams requestParams) {
    this.requestParams = requestParams;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SearchResult {\n");
    
    sb.append("    facetCounts: ").append(toIndentedString(facetCounts)).append("\n");
    sb.append("    found: ").append(toIndentedString(found)).append("\n");
    sb.append("    searchTimeMs: ").append(toIndentedString(searchTimeMs)).append("\n");
    sb.append("    page: ").append(toIndentedString(page)).append("\n");
    sb.append("    groupedHits: ").append(toIndentedString(groupedHits)).append("\n");
    sb.append("    hits: ").append(toIndentedString(hits)).append("\n");
    sb.append("    requestParams: ").append(toIndentedString(requestParams)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
