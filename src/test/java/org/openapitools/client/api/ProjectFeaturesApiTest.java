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


package org.openapitools.client.api;

import org.openapitools.client.ApiException;
import org.openapitools.client.model.ContainerForProjectFeatures;
import org.openapitools.client.model.ProjectFeatureState;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ProjectFeaturesApi
 */
@Disabled
public class ProjectFeaturesApiTest {

    private final ProjectFeaturesApi api = new ProjectFeaturesApi();

    /**
     * Get project features
     *
     * Returns the list of features for a project.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getFeaturesForProjectTest() throws ApiException {
        String projectIdOrKey = null;
        ContainerForProjectFeatures response = api.getFeaturesForProject(projectIdOrKey);
        // TODO: test validations
    }

    /**
     * Set project feature state
     *
     * Sets the state of a project feature.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void toggleFeatureForProjectTest() throws ApiException {
        String projectIdOrKey = null;
        String featureKey = null;
        ProjectFeatureState projectFeatureState = null;
        ContainerForProjectFeatures response = api.toggleFeatureForProject(projectIdOrKey, featureKey, projectFeatureState);
        // TODO: test validations
    }

}
