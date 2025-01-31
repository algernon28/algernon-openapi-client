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
 * The IDs of the screens for the screen types of the screen scheme.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-07-30T14:27:49.596452195Z[Etc/UTC]", comments = "Generator version: 7.8.0-SNAPSHOT")
public class UpdateScreenTypes {
  public static final String SERIALIZED_NAME_CREATE = "create";
  @SerializedName(SERIALIZED_NAME_CREATE)
  private String create;

  public static final String SERIALIZED_NAME_DEFAULT = "default";
  @SerializedName(SERIALIZED_NAME_DEFAULT)
  private String _default;

  public static final String SERIALIZED_NAME_EDIT = "edit";
  @SerializedName(SERIALIZED_NAME_EDIT)
  private String edit;

  public static final String SERIALIZED_NAME_VIEW = "view";
  @SerializedName(SERIALIZED_NAME_VIEW)
  private String view;

  public UpdateScreenTypes() {
  }

  public UpdateScreenTypes create(String create) {
    this.create = create;
    return this;
  }

  /**
   * The ID of the create screen. To remove the screen association, pass a null.
   * @return create
   */
  @javax.annotation.Nullable
  public String getCreate() {
    return create;
  }

  public void setCreate(String create) {
    this.create = create;
  }


  public UpdateScreenTypes _default(String _default) {
    this._default = _default;
    return this;
  }

  /**
   * The ID of the default screen. When specified, must include a screen ID as a default screen is required.
   * @return _default
   */
  @javax.annotation.Nullable
  public String getDefault() {
    return _default;
  }

  public void setDefault(String _default) {
    this._default = _default;
  }


  public UpdateScreenTypes edit(String edit) {
    this.edit = edit;
    return this;
  }

  /**
   * The ID of the edit screen. To remove the screen association, pass a null.
   * @return edit
   */
  @javax.annotation.Nullable
  public String getEdit() {
    return edit;
  }

  public void setEdit(String edit) {
    this.edit = edit;
  }


  public UpdateScreenTypes view(String view) {
    this.view = view;
    return this;
  }

  /**
   * The ID of the view screen. To remove the screen association, pass a null.
   * @return view
   */
  @javax.annotation.Nullable
  public String getView() {
    return view;
  }

  public void setView(String view) {
    this.view = view;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateScreenTypes updateScreenTypes = (UpdateScreenTypes) o;
    return Objects.equals(this.create, updateScreenTypes.create) &&
        Objects.equals(this._default, updateScreenTypes._default) &&
        Objects.equals(this.edit, updateScreenTypes.edit) &&
        Objects.equals(this.view, updateScreenTypes.view);
  }

  @Override
  public int hashCode() {
    return Objects.hash(create, _default, edit, view);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateScreenTypes {\n");
    sb.append("    create: ").append(toIndentedString(create)).append("\n");
    sb.append("    _default: ").append(toIndentedString(_default)).append("\n");
    sb.append("    edit: ").append(toIndentedString(edit)).append("\n");
    sb.append("    view: ").append(toIndentedString(view)).append("\n");
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
    openapiFields.add("create");
    openapiFields.add("default");
    openapiFields.add("edit");
    openapiFields.add("view");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to UpdateScreenTypes
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!UpdateScreenTypes.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in UpdateScreenTypes is not found in the empty JSON string", UpdateScreenTypes.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!UpdateScreenTypes.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `UpdateScreenTypes` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("create") != null && !jsonObj.get("create").isJsonNull()) && !jsonObj.get("create").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `create` to be a primitive type in the JSON string but got `%s`", jsonObj.get("create").toString()));
      }
      if ((jsonObj.get("default") != null && !jsonObj.get("default").isJsonNull()) && !jsonObj.get("default").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `default` to be a primitive type in the JSON string but got `%s`", jsonObj.get("default").toString()));
      }
      if ((jsonObj.get("edit") != null && !jsonObj.get("edit").isJsonNull()) && !jsonObj.get("edit").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `edit` to be a primitive type in the JSON string but got `%s`", jsonObj.get("edit").toString()));
      }
      if ((jsonObj.get("view") != null && !jsonObj.get("view").isJsonNull()) && !jsonObj.get("view").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `view` to be a primitive type in the JSON string but got `%s`", jsonObj.get("view").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!UpdateScreenTypes.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'UpdateScreenTypes' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<UpdateScreenTypes> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(UpdateScreenTypes.class));

       return (TypeAdapter<T>) new TypeAdapter<UpdateScreenTypes>() {
           @Override
           public void write(JsonWriter out, UpdateScreenTypes value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public UpdateScreenTypes read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of UpdateScreenTypes given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of UpdateScreenTypes
   * @throws IOException if the JSON string is invalid with respect to UpdateScreenTypes
   */
  public static UpdateScreenTypes fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UpdateScreenTypes.class);
  }

  /**
   * Convert an instance of UpdateScreenTypes to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

