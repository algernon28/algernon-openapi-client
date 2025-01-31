/*
 * The Jira Cloud platform REST API
 * Jira Cloud platform REST API documentation
 *
 * The version of the OpenAPI document: 1001.0.0-SNAPSHOT-df7582dfe7cda5bf12b0b05c137e574248cecd69
 * Contact: ecosystem@atlassian.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.client.model.CustomContextVariable;
import org.openapitools.client.model.IdOrKeyBean;
import org.openapitools.client.model.JexpIssues;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.openapitools.client.JSON;

/**
 * JiraExpressionEvalContextBean
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-07-30T14:27:49.596452195Z[Etc/UTC]", comments = "Generator version: 7.8.0-SNAPSHOT")
public class JiraExpressionEvalContextBean {
  public static final String SERIALIZED_NAME_BOARD = "board";
  @SerializedName(SERIALIZED_NAME_BOARD)
  private Long board;

  public static final String SERIALIZED_NAME_CUSTOM = "custom";
  @SerializedName(SERIALIZED_NAME_CUSTOM)
  private List<CustomContextVariable> custom = new ArrayList<>();

  public static final String SERIALIZED_NAME_CUSTOMER_REQUEST = "customerRequest";
  @SerializedName(SERIALIZED_NAME_CUSTOMER_REQUEST)
  private Long customerRequest;

  public static final String SERIALIZED_NAME_ISSUE = "issue";
  @SerializedName(SERIALIZED_NAME_ISSUE)
  private IdOrKeyBean issue;

  public static final String SERIALIZED_NAME_ISSUES = "issues";
  @SerializedName(SERIALIZED_NAME_ISSUES)
  private JexpIssues issues;

  public static final String SERIALIZED_NAME_PROJECT = "project";
  @SerializedName(SERIALIZED_NAME_PROJECT)
  private IdOrKeyBean project;

  public static final String SERIALIZED_NAME_SERVICE_DESK = "serviceDesk";
  @SerializedName(SERIALIZED_NAME_SERVICE_DESK)
  private Long serviceDesk;

  public static final String SERIALIZED_NAME_SPRINT = "sprint";
  @SerializedName(SERIALIZED_NAME_SPRINT)
  private Long sprint;

  public JiraExpressionEvalContextBean() {
  }

  public JiraExpressionEvalContextBean board(Long board) {
    this.board = board;
    return this;
  }

  /**
   * The ID of the board that is available under the &#x60;board&#x60; variable when evaluating the expression.
   * @return board
   */
  @javax.annotation.Nullable
  public Long getBoard() {
    return board;
  }

  public void setBoard(Long board) {
    this.board = board;
  }


  public JiraExpressionEvalContextBean custom(List<CustomContextVariable> custom) {
    this.custom = custom;
    return this;
  }

  public JiraExpressionEvalContextBean addCustomItem(CustomContextVariable customItem) {
    if (this.custom == null) {
      this.custom = new ArrayList<>();
    }
    this.custom.add(customItem);
    return this;
  }

  /**
   * Custom context variables and their types. These variable types are available for use in a custom context:   *  &#x60;user&#x60;: A [user](https://developer.atlassian.com/cloud/jira/platform/jira-expressions-type-reference#user) specified as an Atlassian account ID.  *  &#x60;issue&#x60;: An [issue](https://developer.atlassian.com/cloud/jira/platform/jira-expressions-type-reference#issue) specified by ID or key. All the fields of the issue object are available in the Jira expression.  *  &#x60;json&#x60;: A JSON object containing custom content.  *  &#x60;list&#x60;: A JSON list of &#x60;user&#x60;, &#x60;issue&#x60;, or &#x60;json&#x60; variable types.
   * @return custom
   */
  @javax.annotation.Nullable
  public List<CustomContextVariable> getCustom() {
    return custom;
  }

  public void setCustom(List<CustomContextVariable> custom) {
    this.custom = custom;
  }


  public JiraExpressionEvalContextBean customerRequest(Long customerRequest) {
    this.customerRequest = customerRequest;
    return this;
  }

  /**
   * The ID of the customer request that is available under the &#x60;customerRequest&#x60; variable when evaluating the expression. This is the same as the ID of the underlying Jira issue, but the customer request context variable will have a different type.
   * @return customerRequest
   */
  @javax.annotation.Nullable
  public Long getCustomerRequest() {
    return customerRequest;
  }

  public void setCustomerRequest(Long customerRequest) {
    this.customerRequest = customerRequest;
  }


  public JiraExpressionEvalContextBean issue(IdOrKeyBean issue) {
    this.issue = issue;
    return this;
  }

  /**
   * The issue that is available under the &#x60;issue&#x60; variable when evaluating the expression.
   * @return issue
   */
  @javax.annotation.Nullable
  public IdOrKeyBean getIssue() {
    return issue;
  }

  public void setIssue(IdOrKeyBean issue) {
    this.issue = issue;
  }


  public JiraExpressionEvalContextBean issues(JexpIssues issues) {
    this.issues = issues;
    return this;
  }

  /**
   * The collection of issues that is available under the &#x60;issues&#x60; variable when evaluating the expression.
   * @return issues
   */
  @javax.annotation.Nullable
  public JexpIssues getIssues() {
    return issues;
  }

  public void setIssues(JexpIssues issues) {
    this.issues = issues;
  }


  public JiraExpressionEvalContextBean project(IdOrKeyBean project) {
    this.project = project;
    return this;
  }

  /**
   * The project that is available under the &#x60;project&#x60; variable when evaluating the expression.
   * @return project
   */
  @javax.annotation.Nullable
  public IdOrKeyBean getProject() {
    return project;
  }

  public void setProject(IdOrKeyBean project) {
    this.project = project;
  }


  public JiraExpressionEvalContextBean serviceDesk(Long serviceDesk) {
    this.serviceDesk = serviceDesk;
    return this;
  }

  /**
   * The ID of the service desk that is available under the &#x60;serviceDesk&#x60; variable when evaluating the expression.
   * @return serviceDesk
   */
  @javax.annotation.Nullable
  public Long getServiceDesk() {
    return serviceDesk;
  }

  public void setServiceDesk(Long serviceDesk) {
    this.serviceDesk = serviceDesk;
  }


  public JiraExpressionEvalContextBean sprint(Long sprint) {
    this.sprint = sprint;
    return this;
  }

  /**
   * The ID of the sprint that is available under the &#x60;sprint&#x60; variable when evaluating the expression.
   * @return sprint
   */
  @javax.annotation.Nullable
  public Long getSprint() {
    return sprint;
  }

  public void setSprint(Long sprint) {
    this.sprint = sprint;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JiraExpressionEvalContextBean jiraExpressionEvalContextBean = (JiraExpressionEvalContextBean) o;
    return Objects.equals(this.board, jiraExpressionEvalContextBean.board) &&
        Objects.equals(this.custom, jiraExpressionEvalContextBean.custom) &&
        Objects.equals(this.customerRequest, jiraExpressionEvalContextBean.customerRequest) &&
        Objects.equals(this.issue, jiraExpressionEvalContextBean.issue) &&
        Objects.equals(this.issues, jiraExpressionEvalContextBean.issues) &&
        Objects.equals(this.project, jiraExpressionEvalContextBean.project) &&
        Objects.equals(this.serviceDesk, jiraExpressionEvalContextBean.serviceDesk) &&
        Objects.equals(this.sprint, jiraExpressionEvalContextBean.sprint);
  }

  @Override
  public int hashCode() {
    return Objects.hash(board, custom, customerRequest, issue, issues, project, serviceDesk, sprint);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JiraExpressionEvalContextBean {\n");
    sb.append("    board: ").append(toIndentedString(board)).append("\n");
    sb.append("    custom: ").append(toIndentedString(custom)).append("\n");
    sb.append("    customerRequest: ").append(toIndentedString(customerRequest)).append("\n");
    sb.append("    issue: ").append(toIndentedString(issue)).append("\n");
    sb.append("    issues: ").append(toIndentedString(issues)).append("\n");
    sb.append("    project: ").append(toIndentedString(project)).append("\n");
    sb.append("    serviceDesk: ").append(toIndentedString(serviceDesk)).append("\n");
    sb.append("    sprint: ").append(toIndentedString(sprint)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("board");
    openapiFields.add("custom");
    openapiFields.add("customerRequest");
    openapiFields.add("issue");
    openapiFields.add("issues");
    openapiFields.add("project");
    openapiFields.add("serviceDesk");
    openapiFields.add("sprint");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to JiraExpressionEvalContextBean
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!JiraExpressionEvalContextBean.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in JiraExpressionEvalContextBean is not found in the empty JSON string", JiraExpressionEvalContextBean.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!JiraExpressionEvalContextBean.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `JiraExpressionEvalContextBean` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (jsonObj.get("custom") != null && !jsonObj.get("custom").isJsonNull()) {
        JsonArray jsonArraycustom = jsonObj.getAsJsonArray("custom");
        if (jsonArraycustom != null) {
          // ensure the json data is an array
          if (!jsonObj.get("custom").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `custom` to be an array in the JSON string but got `%s`", jsonObj.get("custom").toString()));
          }

          // validate the optional field `custom` (array)
          for (int i = 0; i < jsonArraycustom.size(); i++) {
            CustomContextVariable.validateJsonElement(jsonArraycustom.get(i));
          };
        }
      }
      // validate the optional field `issue`
      if (jsonObj.get("issue") != null && !jsonObj.get("issue").isJsonNull()) {
        IdOrKeyBean.validateJsonElement(jsonObj.get("issue"));
      }
      // validate the optional field `issues`
      if (jsonObj.get("issues") != null && !jsonObj.get("issues").isJsonNull()) {
        JexpIssues.validateJsonElement(jsonObj.get("issues"));
      }
      // validate the optional field `project`
      if (jsonObj.get("project") != null && !jsonObj.get("project").isJsonNull()) {
        IdOrKeyBean.validateJsonElement(jsonObj.get("project"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!JiraExpressionEvalContextBean.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'JiraExpressionEvalContextBean' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<JiraExpressionEvalContextBean> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(JiraExpressionEvalContextBean.class));

       return (TypeAdapter<T>) new TypeAdapter<JiraExpressionEvalContextBean>() {
           @Override
           public void write(JsonWriter out, JiraExpressionEvalContextBean value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public JiraExpressionEvalContextBean read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of JiraExpressionEvalContextBean given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of JiraExpressionEvalContextBean
   * @throws IOException if the JSON string is invalid with respect to JiraExpressionEvalContextBean
   */
  public static JiraExpressionEvalContextBean fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, JiraExpressionEvalContextBean.class);
  }

  /**
   * Convert an instance of JiraExpressionEvalContextBean to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

