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
import org.openapitools.client.model.ProjectType;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ProjectTypesApi
 */
@Disabled
public class ProjectTypesApiTest {

    private final ProjectTypesApi api = new ProjectTypesApi();

    /**
     * Get accessible project type by key
     *
     * Returns a [project type](https://confluence.atlassian.com/x/Var1Nw) if it is accessible to the user.  **[Permissions](#permissions) required:** Permission to access Jira.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getAccessibleProjectTypeByKeyTest() throws ApiException {
        String projectTypeKey = null;
        ProjectType response = api.getAccessibleProjectTypeByKey(projectTypeKey);
        // TODO: test validations
    }

    /**
     * Get licensed project types
     *
     * Returns all [project types](https://confluence.atlassian.com/x/Var1Nw) with a valid license.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getAllAccessibleProjectTypesTest() throws ApiException {
        List<ProjectType> response = api.getAllAccessibleProjectTypes();
        // TODO: test validations
    }

    /**
     * Get all project types
     *
     * Returns all [project types](https://confluence.atlassian.com/x/Var1Nw), whether or not the instance has a valid license for each type.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:** None.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getAllProjectTypesTest() throws ApiException {
        List<ProjectType> response = api.getAllProjectTypes();
        // TODO: test validations
    }

    /**
     * Get project type by key
     *
     * Returns a [project type](https://confluence.atlassian.com/x/Var1Nw).  This operation can be accessed anonymously.  **[Permissions](#permissions) required:** None.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getProjectTypeByKeyTest() throws ApiException {
        String projectTypeKey = null;
        ProjectType response = api.getProjectTypeByKey(projectTypeKey);
        // TODO: test validations
    }

}
