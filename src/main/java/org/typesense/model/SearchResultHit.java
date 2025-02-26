package org.typesense.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.typesense.model.SearchHighlight;

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

public class SearchResultHit   {
  
  @Schema(required = true, description = "Contains highlighted portions of the search fields")
 /**
   * Contains highlighted portions of the search fields  
  **/
  private List<SearchHighlight> highlights = new ArrayList<SearchHighlight>();
  
  @Schema(required = true, description = "Can be any key-value pair")
 /**
   * Can be any key-value pair  
  **/
  private Map<String, Object> document = new HashMap<String, Object>();
 /**
   * Contains highlighted portions of the search fields
   * @return highlights
  **/
  @JsonProperty("highlights")
  public List<SearchHighlight> getHighlights() {
    return highlights;
  }

  public void setHighlights(List<SearchHighlight> highlights) {
    this.highlights = highlights;
  }

  public SearchResultHit highlights(List<SearchHighlight> highlights) {
    this.highlights = highlights;
    return this;
  }

  public SearchResultHit addHighlightsItem(SearchHighlight highlightsItem) {
    this.highlights.add(highlightsItem);
    return this;
  }

 /**
   * Can be any key-value pair
   * @return document
  **/
  @JsonProperty("document")
  public Map<String, Object> getDocument() {
    return document;
  }

  public void setDocument(Map<String, Object> document) {
    this.document = document;
  }

  public SearchResultHit document(Map<String, Object> document) {
    this.document = document;
    return this;
  }

  public SearchResultHit putDocumentItem(String key, Object documentItem) {
    this.document.put(key, documentItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SearchResultHit {\n");
    
    sb.append("    highlights: ").append(toIndentedString(highlights)).append("\n");
    sb.append("    document: ").append(toIndentedString(document)).append("\n");
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
