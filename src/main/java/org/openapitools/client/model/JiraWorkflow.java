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
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;
import org.openapitools.client.model.DocumentVersion;
import org.openapitools.client.model.ProjectIssueTypes;
import org.openapitools.client.model.WorkflowLayout;
import org.openapitools.client.model.WorkflowReferenceStatus;
import org.openapitools.client.model.WorkflowScope;
import org.openapitools.client.model.WorkflowTransitions;
import org.openapitools.jackson.nullable.JsonNullable;

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
 * Details of a workflow.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-07-30T14:27:49.596452195Z[Etc/UTC]", comments = "Generator version: 7.8.0-SNAPSHOT")
public class JiraWorkflow {
  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_IS_EDITABLE = "isEditable";
  @SerializedName(SERIALIZED_NAME_IS_EDITABLE)
  private Boolean isEditable;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_SCOPE = "scope";
  @SerializedName(SERIALIZED_NAME_SCOPE)
  private WorkflowScope scope;

  public static final String SERIALIZED_NAME_START_POINT_LAYOUT = "startPointLayout";
  @SerializedName(SERIALIZED_NAME_START_POINT_LAYOUT)
  private WorkflowLayout startPointLayout;

  public static final String SERIALIZED_NAME_STATUSES = "statuses";
  @SerializedName(SERIALIZED_NAME_STATUSES)
  private Set<WorkflowReferenceStatus> statuses = new LinkedHashSet<>();

  public static final String SERIALIZED_NAME_TASK_ID = "taskId";
  @SerializedName(SERIALIZED_NAME_TASK_ID)
  private String taskId;

  public static final String SERIALIZED_NAME_TRANSITIONS = "transitions";
  @SerializedName(SERIALIZED_NAME_TRANSITIONS)
  private Set<WorkflowTransitions> transitions = new LinkedHashSet<>();

  public static final String SERIALIZED_NAME_USAGES = "usages";
  @SerializedName(SERIALIZED_NAME_USAGES)
  private Set<ProjectIssueTypes> usages = new LinkedHashSet<>();

  public static final String SERIALIZED_NAME_VERSION = "version";
  @SerializedName(SERIALIZED_NAME_VERSION)
  private DocumentVersion version;

  public JiraWorkflow() {
  }

  public JiraWorkflow description(String description) {
    this.description = description;
    return this;
  }

  /**
   * The description of the workflow.
   * @return description
   */
  @javax.annotation.Nullable
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }


  public JiraWorkflow id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The ID of the workflow.
   * @return id
   */
  @javax.annotation.Nullable
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }


  public JiraWorkflow isEditable(Boolean isEditable) {
    this.isEditable = isEditable;
    return this;
  }

  /**
   * Indicates if the workflow can be edited.
   * @return isEditable
   */
  @javax.annotation.Nullable
  public Boolean getIsEditable() {
    return isEditable;
  }

  public void setIsEditable(Boolean isEditable) {
    this.isEditable = isEditable;
  }


  public JiraWorkflow name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The name of the workflow.
   * @return name
   */
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public JiraWorkflow scope(WorkflowScope scope) {
    this.scope = scope;
    return this;
  }

  /**
   * Get scope
   * @return scope
   */
  @javax.annotation.Nullable
  public WorkflowScope getScope() {
    return scope;
  }

  public void setScope(WorkflowScope scope) {
    this.scope = scope;
  }


  public JiraWorkflow startPointLayout(WorkflowLayout startPointLayout) {
    this.startPointLayout = startPointLayout;
    return this;
  }

  /**
   * Get startPointLayout
   * @return startPointLayout
   */
  @javax.annotation.Nullable
  public WorkflowLayout getStartPointLayout() {
    return startPointLayout;
  }

  public void setStartPointLayout(WorkflowLayout startPointLayout) {
    this.startPointLayout = startPointLayout;
  }


  public JiraWorkflow statuses(Set<WorkflowReferenceStatus> statuses) {
    this.statuses = statuses;
    return this;
  }

  public JiraWorkflow addStatusesItem(WorkflowReferenceStatus statusesItem) {
    if (this.statuses == null) {
      this.statuses = new LinkedHashSet<>();
    }
    this.statuses.add(statusesItem);
    return this;
  }

  /**
   * The statuses referenced in this workflow.
   * @return statuses
   */
  @javax.annotation.Nullable
  public Set<WorkflowReferenceStatus> getStatuses() {
    return statuses;
  }

  public void setStatuses(Set<WorkflowReferenceStatus> statuses) {
    this.statuses = statuses;
  }


  public JiraWorkflow taskId(String taskId) {
    this.taskId = taskId;
    return this;
  }

  /**
   * If there is a current [asynchronous task](#async-operations) operation for this workflow.
   * @return taskId
   */
  @javax.annotation.Nullable
  public String getTaskId() {
    return taskId;
  }

  public void setTaskId(String taskId) {
    this.taskId = taskId;
  }


  public JiraWorkflow transitions(Set<WorkflowTransitions> transitions) {
    this.transitions = transitions;
    return this;
  }

  public JiraWorkflow addTransitionsItem(WorkflowTransitions transitionsItem) {
    if (this.transitions == null) {
      this.transitions = new LinkedHashSet<>();
    }
    this.transitions.add(transitionsItem);
    return this;
  }

  /**
   * The transitions of the workflow. Note that a transition can have either the deprecated &#x60;to&#x60;/&#x60;from&#x60; fields or the &#x60;toStatusReference&#x60;/&#x60;links&#x60; fields, but never both nor a combination.
   * @return transitions
   */
  @javax.annotation.Nullable
  public Set<WorkflowTransitions> getTransitions() {
    return transitions;
  }

  public void setTransitions(Set<WorkflowTransitions> transitions) {
    this.transitions = transitions;
  }


  public JiraWorkflow usages(Set<ProjectIssueTypes> usages) {
    this.usages = usages;
    return this;
  }

  public JiraWorkflow addUsagesItem(ProjectIssueTypes usagesItem) {
    if (this.usages == null) {
      this.usages = new LinkedHashSet<>();
    }
    this.usages.add(usagesItem);
    return this;
  }

  /**
   * Use the optional &#x60;workflows.usages&#x60; expand to get additional information about the projects and issue types associated with the requested workflows.
   * @return usages
   */
  @javax.annotation.Nullable
  public Set<ProjectIssueTypes> getUsages() {
    return usages;
  }

  public void setUsages(Set<ProjectIssueTypes> usages) {
    this.usages = usages;
  }


  public JiraWorkflow version(DocumentVersion version) {
    this.version = version;
    return this;
  }

  /**
   * Get version
   * @return version
   */
  @javax.annotation.Nullable
  public DocumentVersion getVersion() {
    return version;
  }

  public void setVersion(DocumentVersion version) {
    this.version = version;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JiraWorkflow jiraWorkflow = (JiraWorkflow) o;
    return Objects.equals(this.description, jiraWorkflow.description) &&
        Objects.equals(this.id, jiraWorkflow.id) &&
        Objects.equals(this.isEditable, jiraWorkflow.isEditable) &&
        Objects.equals(this.name, jiraWorkflow.name) &&
        Objects.equals(this.scope, jiraWorkflow.scope) &&
        Objects.equals(this.startPointLayout, jiraWorkflow.startPointLayout) &&
        Objects.equals(this.statuses, jiraWorkflow.statuses) &&
        Objects.equals(this.taskId, jiraWorkflow.taskId) &&
        Objects.equals(this.transitions, jiraWorkflow.transitions) &&
        Objects.equals(this.usages, jiraWorkflow.usages) &&
        Objects.equals(this.version, jiraWorkflow.version);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, id, isEditable, name, scope, startPointLayout, statuses, taskId, transitions, usages, version);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JiraWorkflow {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    isEditable: ").append(toIndentedString(isEditable)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
    sb.append("    startPointLayout: ").append(toIndentedString(startPointLayout)).append("\n");
    sb.append("    statuses: ").append(toIndentedString(statuses)).append("\n");
    sb.append("    taskId: ").append(toIndentedString(taskId)).append("\n");
    sb.append("    transitions: ").append(toIndentedString(transitions)).append("\n");
    sb.append("    usages: ").append(toIndentedString(usages)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
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
    openapiFields.add("description");
    openapiFields.add("id");
    openapiFields.add("isEditable");
    openapiFields.add("name");
    openapiFields.add("scope");
    openapiFields.add("startPointLayout");
    openapiFields.add("statuses");
    openapiFields.add("taskId");
    openapiFields.add("transitions");
    openapiFields.add("usages");
    openapiFields.add("version");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to JiraWorkflow
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!JiraWorkflow.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in JiraWorkflow is not found in the empty JSON string", JiraWorkflow.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!JiraWorkflow.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `JiraWorkflow` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      // validate the optional field `scope`
      if (jsonObj.get("scope") != null && !jsonObj.get("scope").isJsonNull()) {
        WorkflowScope.validateJsonElement(jsonObj.get("scope"));
      }
      // validate the optional field `startPointLayout`
      if (jsonObj.get("startPointLayout") != null && !jsonObj.get("startPointLayout").isJsonNull()) {
        WorkflowLayout.validateJsonElement(jsonObj.get("startPointLayout"));
      }
      if (jsonObj.get("statuses") != null && !jsonObj.get("statuses").isJsonNull()) {
        JsonArray jsonArraystatuses = jsonObj.getAsJsonArray("statuses");
        if (jsonArraystatuses != null) {
          // ensure the json data is an array
          if (!jsonObj.get("statuses").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `statuses` to be an array in the JSON string but got `%s`", jsonObj.get("statuses").toString()));
          }

          // validate the optional field `statuses` (array)
          for (int i = 0; i < jsonArraystatuses.size(); i++) {
            WorkflowReferenceStatus.validateJsonElement(jsonArraystatuses.get(i));
          };
        }
      }
      if ((jsonObj.get("taskId") != null && !jsonObj.get("taskId").isJsonNull()) && !jsonObj.get("taskId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `taskId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("taskId").toString()));
      }
      if (jsonObj.get("transitions") != null && !jsonObj.get("transitions").isJsonNull()) {
        JsonArray jsonArraytransitions = jsonObj.getAsJsonArray("transitions");
        if (jsonArraytransitions != null) {
          // ensure the json data is an array
          if (!jsonObj.get("transitions").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `transitions` to be an array in the JSON string but got `%s`", jsonObj.get("transitions").toString()));
          }

          // validate the optional field `transitions` (array)
          for (int i = 0; i < jsonArraytransitions.size(); i++) {
            WorkflowTransitions.validateJsonElement(jsonArraytransitions.get(i));
          };
        }
      }
      if (jsonObj.get("usages") != null && !jsonObj.get("usages").isJsonNull()) {
        JsonArray jsonArrayusages = jsonObj.getAsJsonArray("usages");
        if (jsonArrayusages != null) {
          // ensure the json data is an array
          if (!jsonObj.get("usages").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `usages` to be an array in the JSON string but got `%s`", jsonObj.get("usages").toString()));
          }

          // validate the optional field `usages` (array)
          for (int i = 0; i < jsonArrayusages.size(); i++) {
            ProjectIssueTypes.validateJsonElement(jsonArrayusages.get(i));
          };
        }
      }
      // validate the optional field `version`
      if (jsonObj.get("version") != null && !jsonObj.get("version").isJsonNull()) {
        DocumentVersion.validateJsonElement(jsonObj.get("version"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!JiraWorkflow.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'JiraWorkflow' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<JiraWorkflow> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(JiraWorkflow.class));

       return (TypeAdapter<T>) new TypeAdapter<JiraWorkflow>() {
           @Override
           public void write(JsonWriter out, JiraWorkflow value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public JiraWorkflow read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of JiraWorkflow given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of JiraWorkflow
   * @throws IOException if the JSON string is invalid with respect to JiraWorkflow
   */
  public static JiraWorkflow fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, JiraWorkflow.class);
  }

  /**
   * Convert an instance of JiraWorkflow to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

