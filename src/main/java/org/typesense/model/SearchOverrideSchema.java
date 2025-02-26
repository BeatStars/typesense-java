package org.typesense.model;

import java.util.ArrayList;
import java.util.List;
import org.typesense.model.SearchOverrideExclude;
import org.typesense.model.SearchOverrideInclude;
import org.typesense.model.SearchOverrideRule;

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

public class SearchOverrideSchema   {
  
  @Schema(required = true, description = "")
  private SearchOverrideRule rule = null;
  
  @Schema(required = true, description = "List of document `id`s that should be included in the search results with their corresponding `position`s.")
 /**
   * List of document `id`s that should be included in the search results with their corresponding `position`s.  
  **/
  private List<SearchOverrideInclude> includes = new ArrayList<SearchOverrideInclude>();
  
  @Schema(required = true, description = "List of document `id`s that should be excluded from the search results.")
 /**
   * List of document `id`s that should be excluded from the search results.  
  **/
  private List<SearchOverrideExclude> excludes = new ArrayList<SearchOverrideExclude>();
 /**
   * Get rule
   * @return rule
  **/
  @JsonProperty("rule")
  public SearchOverrideRule getRule() {
    return rule;
  }

  public void setRule(SearchOverrideRule rule) {
    this.rule = rule;
  }

  public SearchOverrideSchema rule(SearchOverrideRule rule) {
    this.rule = rule;
    return this;
  }

 /**
   * List of document &#x60;id&#x60;s that should be included in the search results with their corresponding &#x60;position&#x60;s.
   * @return includes
  **/
  @JsonProperty("includes")
  public List<SearchOverrideInclude> getIncludes() {
    return includes;
  }

  public void setIncludes(List<SearchOverrideInclude> includes) {
    this.includes = includes;
  }

  public SearchOverrideSchema includes(List<SearchOverrideInclude> includes) {
    this.includes = includes;
    return this;
  }

  public SearchOverrideSchema addIncludesItem(SearchOverrideInclude includesItem) {
    this.includes.add(includesItem);
    return this;
  }

 /**
   * List of document &#x60;id&#x60;s that should be excluded from the search results.
   * @return excludes
  **/
  @JsonProperty("excludes")
  public List<SearchOverrideExclude> getExcludes() {
    return excludes;
  }

  public void setExcludes(List<SearchOverrideExclude> excludes) {
    this.excludes = excludes;
  }

  public SearchOverrideSchema excludes(List<SearchOverrideExclude> excludes) {
    this.excludes = excludes;
    return this;
  }

  public SearchOverrideSchema addExcludesItem(SearchOverrideExclude excludesItem) {
    this.excludes.add(excludesItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SearchOverrideSchema {\n");
    
    sb.append("    rule: ").append(toIndentedString(rule)).append("\n");
    sb.append("    includes: ").append(toIndentedString(includes)).append("\n");
    sb.append("    excludes: ").append(toIndentedString(excludes)).append("\n");
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
