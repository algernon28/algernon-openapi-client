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
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.client.model.HealthCheckResult;
import org.openapitools.client.model.ServerInformationServerTimeZone;

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
 * Details about the Jira instance.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-07-30T14:27:49.596452195Z[Etc/UTC]", comments = "Generator version: 7.8.0-SNAPSHOT")
public class ServerInformation {
  public static final String SERIALIZED_NAME_BASE_URL = "baseUrl";
  @SerializedName(SERIALIZED_NAME_BASE_URL)
  private String baseUrl;

  public static final String SERIALIZED_NAME_BUILD_DATE = "buildDate";
  @SerializedName(SERIALIZED_NAME_BUILD_DATE)
  private OffsetDateTime buildDate;

  public static final String SERIALIZED_NAME_BUILD_NUMBER = "buildNumber";
  @SerializedName(SERIALIZED_NAME_BUILD_NUMBER)
  private Integer buildNumber;

  public static final String SERIALIZED_NAME_DEPLOYMENT_TYPE = "deploymentType";
  @SerializedName(SERIALIZED_NAME_DEPLOYMENT_TYPE)
  private String deploymentType;

  public static final String SERIALIZED_NAME_DISPLAY_URL = "displayUrl";
  @SerializedName(SERIALIZED_NAME_DISPLAY_URL)
  private String displayUrl;

  public static final String SERIALIZED_NAME_DISPLAY_URL_CONFLUENCE = "displayUrlConfluence";
  @SerializedName(SERIALIZED_NAME_DISPLAY_URL_CONFLUENCE)
  private String displayUrlConfluence;

  public static final String SERIALIZED_NAME_DISPLAY_URL_SERVICEDESK_HELP_CENTER = "displayUrlServicedeskHelpCenter";
  @SerializedName(SERIALIZED_NAME_DISPLAY_URL_SERVICEDESK_HELP_CENTER)
  private String displayUrlServicedeskHelpCenter;

  public static final String SERIALIZED_NAME_HEALTH_CHECKS = "healthChecks";
  @SerializedName(SERIALIZED_NAME_HEALTH_CHECKS)
  private List<HealthCheckResult> healthChecks = new ArrayList<>();

  public static final String SERIALIZED_NAME_SCM_INFO = "scmInfo";
  @SerializedName(SERIALIZED_NAME_SCM_INFO)
  private String scmInfo;

  public static final String SERIALIZED_NAME_SERVER_TIME = "serverTime";
  @SerializedName(SERIALIZED_NAME_SERVER_TIME)
  private OffsetDateTime serverTime;

  public static final String SERIALIZED_NAME_SERVER_TIME_ZONE = "serverTimeZone";
  @SerializedName(SERIALIZED_NAME_SERVER_TIME_ZONE)
  private ServerInformationServerTimeZone serverTimeZone;

  public static final String SERIALIZED_NAME_SERVER_TITLE = "serverTitle";
  @SerializedName(SERIALIZED_NAME_SERVER_TITLE)
  private String serverTitle;

  public static final String SERIALIZED_NAME_VERSION = "version";
  @SerializedName(SERIALIZED_NAME_VERSION)
  private String version;

  public static final String SERIALIZED_NAME_VERSION_NUMBERS = "versionNumbers";
  @SerializedName(SERIALIZED_NAME_VERSION_NUMBERS)
  private List<Integer> versionNumbers = new ArrayList<>();

  public ServerInformation() {
  }

  public ServerInformation baseUrl(String baseUrl) {
    this.baseUrl = baseUrl;
    return this;
  }

  /**
   * The base URL of the Jira instance.
   * @return baseUrl
   */
  @javax.annotation.Nullable
  public String getBaseUrl() {
    return baseUrl;
  }

  public void setBaseUrl(String baseUrl) {
    this.baseUrl = baseUrl;
  }


  public ServerInformation buildDate(OffsetDateTime buildDate) {
    this.buildDate = buildDate;
    return this;
  }

  /**
   * The timestamp when the Jira version was built.
   * @return buildDate
   */
  @javax.annotation.Nullable
  public OffsetDateTime getBuildDate() {
    return buildDate;
  }

  public void setBuildDate(OffsetDateTime buildDate) {
    this.buildDate = buildDate;
  }


  public ServerInformation buildNumber(Integer buildNumber) {
    this.buildNumber = buildNumber;
    return this;
  }

  /**
   * The build number of the Jira version.
   * @return buildNumber
   */
  @javax.annotation.Nullable
  public Integer getBuildNumber() {
    return buildNumber;
  }

  public void setBuildNumber(Integer buildNumber) {
    this.buildNumber = buildNumber;
  }


  public ServerInformation deploymentType(String deploymentType) {
    this.deploymentType = deploymentType;
    return this;
  }

  /**
   * The type of server deployment. This is always returned as *Cloud*.
   * @return deploymentType
   */
  @javax.annotation.Nullable
  public String getDeploymentType() {
    return deploymentType;
  }

  public void setDeploymentType(String deploymentType) {
    this.deploymentType = deploymentType;
  }


  public ServerInformation displayUrl(String displayUrl) {
    this.displayUrl = displayUrl;
    return this;
  }

  /**
   * The display URL of the Jira instance.
   * @return displayUrl
   */
  @javax.annotation.Nullable
  public String getDisplayUrl() {
    return displayUrl;
  }

  public void setDisplayUrl(String displayUrl) {
    this.displayUrl = displayUrl;
  }


  public ServerInformation displayUrlConfluence(String displayUrlConfluence) {
    this.displayUrlConfluence = displayUrlConfluence;
    return this;
  }

  /**
   * The display URL of Confluence.
   * @return displayUrlConfluence
   */
  @javax.annotation.Nullable
  public String getDisplayUrlConfluence() {
    return displayUrlConfluence;
  }

  public void setDisplayUrlConfluence(String displayUrlConfluence) {
    this.displayUrlConfluence = displayUrlConfluence;
  }


  public ServerInformation displayUrlServicedeskHelpCenter(String displayUrlServicedeskHelpCenter) {
    this.displayUrlServicedeskHelpCenter = displayUrlServicedeskHelpCenter;
    return this;
  }

  /**
   * The display URL of the Servicedesk Help Center.
   * @return displayUrlServicedeskHelpCenter
   */
  @javax.annotation.Nullable
  public String getDisplayUrlServicedeskHelpCenter() {
    return displayUrlServicedeskHelpCenter;
  }

  public void setDisplayUrlServicedeskHelpCenter(String displayUrlServicedeskHelpCenter) {
    this.displayUrlServicedeskHelpCenter = displayUrlServicedeskHelpCenter;
  }


  public ServerInformation healthChecks(List<HealthCheckResult> healthChecks) {
    this.healthChecks = healthChecks;
    return this;
  }

  public ServerInformation addHealthChecksItem(HealthCheckResult healthChecksItem) {
    if (this.healthChecks == null) {
      this.healthChecks = new ArrayList<>();
    }
    this.healthChecks.add(healthChecksItem);
    return this;
  }

  /**
   * Jira instance health check results. Deprecated and no longer returned.
   * @return healthChecks
   */
  @javax.annotation.Nullable
  public List<HealthCheckResult> getHealthChecks() {
    return healthChecks;
  }

  public void setHealthChecks(List<HealthCheckResult> healthChecks) {
    this.healthChecks = healthChecks;
  }


  public ServerInformation scmInfo(String scmInfo) {
    this.scmInfo = scmInfo;
    return this;
  }

  /**
   * The unique identifier of the Jira version.
   * @return scmInfo
   */
  @javax.annotation.Nullable
  public String getScmInfo() {
    return scmInfo;
  }

  public void setScmInfo(String scmInfo) {
    this.scmInfo = scmInfo;
  }


  public ServerInformation serverTime(OffsetDateTime serverTime) {
    this.serverTime = serverTime;
    return this;
  }

  /**
   * The time in Jira when this request was responded to.
   * @return serverTime
   */
  @javax.annotation.Nullable
  public OffsetDateTime getServerTime() {
    return serverTime;
  }

  public void setServerTime(OffsetDateTime serverTime) {
    this.serverTime = serverTime;
  }


  public ServerInformation serverTimeZone(ServerInformationServerTimeZone serverTimeZone) {
    this.serverTimeZone = serverTimeZone;
    return this;
  }

  /**
   * Get serverTimeZone
   * @return serverTimeZone
   */
  @javax.annotation.Nullable
  public ServerInformationServerTimeZone getServerTimeZone() {
    return serverTimeZone;
  }

  public void setServerTimeZone(ServerInformationServerTimeZone serverTimeZone) {
    this.serverTimeZone = serverTimeZone;
  }


  public ServerInformation serverTitle(String serverTitle) {
    this.serverTitle = serverTitle;
    return this;
  }

  /**
   * The name of the Jira instance.
   * @return serverTitle
   */
  @javax.annotation.Nullable
  public String getServerTitle() {
    return serverTitle;
  }

  public void setServerTitle(String serverTitle) {
    this.serverTitle = serverTitle;
  }


  public ServerInformation version(String version) {
    this.version = version;
    return this;
  }

  /**
   * The version of Jira.
   * @return version
   */
  @javax.annotation.Nullable
  public String getVersion() {
    return version;
  }

  public void setVersion(String version) {
    this.version = version;
  }


  public ServerInformation versionNumbers(List<Integer> versionNumbers) {
    this.versionNumbers = versionNumbers;
    return this;
  }

  public ServerInformation addVersionNumbersItem(Integer versionNumbersItem) {
    if (this.versionNumbers == null) {
      this.versionNumbers = new ArrayList<>();
    }
    this.versionNumbers.add(versionNumbersItem);
    return this;
  }

  /**
   * The major, minor, and revision version numbers of the Jira version.
   * @return versionNumbers
   */
  @javax.annotation.Nullable
  public List<Integer> getVersionNumbers() {
    return versionNumbers;
  }

  public void setVersionNumbers(List<Integer> versionNumbers) {
    this.versionNumbers = versionNumbers;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ServerInformation serverInformation = (ServerInformation) o;
    return Objects.equals(this.baseUrl, serverInformation.baseUrl) &&
        Objects.equals(this.buildDate, serverInformation.buildDate) &&
        Objects.equals(this.buildNumber, serverInformation.buildNumber) &&
        Objects.equals(this.deploymentType, serverInformation.deploymentType) &&
        Objects.equals(this.displayUrl, serverInformation.displayUrl) &&
        Objects.equals(this.displayUrlConfluence, serverInformation.displayUrlConfluence) &&
        Objects.equals(this.displayUrlServicedeskHelpCenter, serverInformation.displayUrlServicedeskHelpCenter) &&
        Objects.equals(this.healthChecks, serverInformation.healthChecks) &&
        Objects.equals(this.scmInfo, serverInformation.scmInfo) &&
        Objects.equals(this.serverTime, serverInformation.serverTime) &&
        Objects.equals(this.serverTimeZone, serverInformation.serverTimeZone) &&
        Objects.equals(this.serverTitle, serverInformation.serverTitle) &&
        Objects.equals(this.version, serverInformation.version) &&
        Objects.equals(this.versionNumbers, serverInformation.versionNumbers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(baseUrl, buildDate, buildNumber, deploymentType, displayUrl, displayUrlConfluence, displayUrlServicedeskHelpCenter, healthChecks, scmInfo, serverTime, serverTimeZone, serverTitle, version, versionNumbers);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServerInformation {\n");
    sb.append("    baseUrl: ").append(toIndentedString(baseUrl)).append("\n");
    sb.append("    buildDate: ").append(toIndentedString(buildDate)).append("\n");
    sb.append("    buildNumber: ").append(toIndentedString(buildNumber)).append("\n");
    sb.append("    deploymentType: ").append(toIndentedString(deploymentType)).append("\n");
    sb.append("    displayUrl: ").append(toIndentedString(displayUrl)).append("\n");
    sb.append("    displayUrlConfluence: ").append(toIndentedString(displayUrlConfluence)).append("\n");
    sb.append("    displayUrlServicedeskHelpCenter: ").append(toIndentedString(displayUrlServicedeskHelpCenter)).append("\n");
    sb.append("    healthChecks: ").append(toIndentedString(healthChecks)).append("\n");
    sb.append("    scmInfo: ").append(toIndentedString(scmInfo)).append("\n");
    sb.append("    serverTime: ").append(toIndentedString(serverTime)).append("\n");
    sb.append("    serverTimeZone: ").append(toIndentedString(serverTimeZone)).append("\n");
    sb.append("    serverTitle: ").append(toIndentedString(serverTitle)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    versionNumbers: ").append(toIndentedString(versionNumbers)).append("\n");
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
    openapiFields.add("baseUrl");
    openapiFields.add("buildDate");
    openapiFields.add("buildNumber");
    openapiFields.add("deploymentType");
    openapiFields.add("displayUrl");
    openapiFields.add("displayUrlConfluence");
    openapiFields.add("displayUrlServicedeskHelpCenter");
    openapiFields.add("healthChecks");
    openapiFields.add("scmInfo");
    openapiFields.add("serverTime");
    openapiFields.add("serverTimeZone");
    openapiFields.add("serverTitle");
    openapiFields.add("version");
    openapiFields.add("versionNumbers");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to ServerInformation
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ServerInformation.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ServerInformation is not found in the empty JSON string", ServerInformation.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ServerInformation.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ServerInformation` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("baseUrl") != null && !jsonObj.get("baseUrl").isJsonNull()) && !jsonObj.get("baseUrl").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `baseUrl` to be a primitive type in the JSON string but got `%s`", jsonObj.get("baseUrl").toString()));
      }
      if ((jsonObj.get("deploymentType") != null && !jsonObj.get("deploymentType").isJsonNull()) && !jsonObj.get("deploymentType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `deploymentType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("deploymentType").toString()));
      }
      if ((jsonObj.get("displayUrl") != null && !jsonObj.get("displayUrl").isJsonNull()) && !jsonObj.get("displayUrl").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `displayUrl` to be a primitive type in the JSON string but got `%s`", jsonObj.get("displayUrl").toString()));
      }
      if ((jsonObj.get("displayUrlConfluence") != null && !jsonObj.get("displayUrlConfluence").isJsonNull()) && !jsonObj.get("displayUrlConfluence").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `displayUrlConfluence` to be a primitive type in the JSON string but got `%s`", jsonObj.get("displayUrlConfluence").toString()));
      }
      if ((jsonObj.get("displayUrlServicedeskHelpCenter") != null && !jsonObj.get("displayUrlServicedeskHelpCenter").isJsonNull()) && !jsonObj.get("displayUrlServicedeskHelpCenter").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `displayUrlServicedeskHelpCenter` to be a primitive type in the JSON string but got `%s`", jsonObj.get("displayUrlServicedeskHelpCenter").toString()));
      }
      if (jsonObj.get("healthChecks") != null && !jsonObj.get("healthChecks").isJsonNull()) {
        JsonArray jsonArrayhealthChecks = jsonObj.getAsJsonArray("healthChecks");
        if (jsonArrayhealthChecks != null) {
          // ensure the json data is an array
          if (!jsonObj.get("healthChecks").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `healthChecks` to be an array in the JSON string but got `%s`", jsonObj.get("healthChecks").toString()));
          }

          // validate the optional field `healthChecks` (array)
          for (int i = 0; i < jsonArrayhealthChecks.size(); i++) {
            HealthCheckResult.validateJsonElement(jsonArrayhealthChecks.get(i));
          };
        }
      }
      if ((jsonObj.get("scmInfo") != null && !jsonObj.get("scmInfo").isJsonNull()) && !jsonObj.get("scmInfo").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `scmInfo` to be a primitive type in the JSON string but got `%s`", jsonObj.get("scmInfo").toString()));
      }
      // validate the optional field `serverTimeZone`
      if (jsonObj.get("serverTimeZone") != null && !jsonObj.get("serverTimeZone").isJsonNull()) {
        ServerInformationServerTimeZone.validateJsonElement(jsonObj.get("serverTimeZone"));
      }
      if ((jsonObj.get("serverTitle") != null && !jsonObj.get("serverTitle").isJsonNull()) && !jsonObj.get("serverTitle").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `serverTitle` to be a primitive type in the JSON string but got `%s`", jsonObj.get("serverTitle").toString()));
      }
      if ((jsonObj.get("version") != null && !jsonObj.get("version").isJsonNull()) && !jsonObj.get("version").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `version` to be a primitive type in the JSON string but got `%s`", jsonObj.get("version").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("versionNumbers") != null && !jsonObj.get("versionNumbers").isJsonNull() && !jsonObj.get("versionNumbers").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `versionNumbers` to be an array in the JSON string but got `%s`", jsonObj.get("versionNumbers").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ServerInformation.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ServerInformation' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ServerInformation> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ServerInformation.class));

       return (TypeAdapter<T>) new TypeAdapter<ServerInformation>() {
           @Override
           public void write(JsonWriter out, ServerInformation value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ServerInformation read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of ServerInformation given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ServerInformation
   * @throws IOException if the JSON string is invalid with respect to ServerInformation
   */
  public static ServerInformation fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ServerInformation.class);
  }

  /**
   * Convert an instance of ServerInformation to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

