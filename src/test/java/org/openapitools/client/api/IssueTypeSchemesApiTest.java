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
import org.openapitools.client.model.IssueTypeIds;
import org.openapitools.client.model.IssueTypeSchemeDetails;
import org.openapitools.client.model.IssueTypeSchemeID;
import org.openapitools.client.model.IssueTypeSchemeProjectAssociation;
import org.openapitools.client.model.IssueTypeSchemeUpdateDetails;
import org.openapitools.client.model.OrderOfIssueTypes;
import org.openapitools.client.model.PageBeanIssueTypeScheme;
import org.openapitools.client.model.PageBeanIssueTypeSchemeMapping;
import org.openapitools.client.model.PageBeanIssueTypeSchemeProjects;
import java.util.Set;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for IssueTypeSchemesApi
 */
@Disabled
public class IssueTypeSchemesApiTest {

    private final IssueTypeSchemesApi api = new IssueTypeSchemesApi();

    /**
     * Add issue types to issue type scheme
     *
     * Adds issue types to an issue type scheme.  The added issue types are appended to the issue types list.  If any of the issue types exist in the issue type scheme, the operation fails and no issue types are added.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void addIssueTypesToIssueTypeSchemeTest() throws ApiException {
        Long issueTypeSchemeId = null;
        IssueTypeIds issueTypeIds = null;
        Object response = api.addIssueTypesToIssueTypeScheme(issueTypeSchemeId, issueTypeIds);
        // TODO: test validations
    }

    /**
     * Assign issue type scheme to project
     *
     * Assigns an issue type scheme to a project.  If any issues in the project are assigned issue types not present in the new scheme, the operation will fail. To complete the assignment those issues must be updated to use issue types in the new scheme.  Issue type schemes can only be assigned to classic projects.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void assignIssueTypeSchemeToProjectTest() throws ApiException {
        IssueTypeSchemeProjectAssociation issueTypeSchemeProjectAssociation = null;
        Object response = api.assignIssueTypeSchemeToProject(issueTypeSchemeProjectAssociation);
        // TODO: test validations
    }

    /**
     * Create issue type scheme
     *
     * Creates an issue type scheme.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createIssueTypeSchemeTest() throws ApiException {
        IssueTypeSchemeDetails issueTypeSchemeDetails = null;
        IssueTypeSchemeID response = api.createIssueTypeScheme(issueTypeSchemeDetails);
        // TODO: test validations
    }

    /**
     * Delete issue type scheme
     *
     * Deletes an issue type scheme.  Only issue type schemes used in classic projects can be deleted.  Any projects assigned to the scheme are reassigned to the default issue type scheme.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteIssueTypeSchemeTest() throws ApiException {
        Long issueTypeSchemeId = null;
        Object response = api.deleteIssueTypeScheme(issueTypeSchemeId);
        // TODO: test validations
    }

    /**
     * Get all issue type schemes
     *
     * Returns a [paginated](#pagination) list of issue type schemes.  Only issue type schemes used in classic projects are returned.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getAllIssueTypeSchemesTest() throws ApiException {
        Long startAt = null;
        Integer maxResults = null;
        Set<Long> id = null;
        String orderBy = null;
        String expand = null;
        String queryString = null;
        PageBeanIssueTypeScheme response = api.getAllIssueTypeSchemes(startAt, maxResults, id, orderBy, expand, queryString);
        // TODO: test validations
    }

    /**
     * Get issue type schemes for projects
     *
     * Returns a [paginated](#pagination) list of issue type schemes and, for each issue type scheme, a list of the projects that use it.  Only issue type schemes used in classic projects are returned.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getIssueTypeSchemeForProjectsTest() throws ApiException {
        Set<Long> projectId = null;
        Long startAt = null;
        Integer maxResults = null;
        PageBeanIssueTypeSchemeProjects response = api.getIssueTypeSchemeForProjects(projectId, startAt, maxResults);
        // TODO: test validations
    }

    /**
     * Get issue type scheme items
     *
     * Returns a [paginated](#pagination) list of issue type scheme items.  Only issue type scheme items used in classic projects are returned.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getIssueTypeSchemesMappingTest() throws ApiException {
        Long startAt = null;
        Integer maxResults = null;
        Set<Long> issueTypeSchemeId = null;
        PageBeanIssueTypeSchemeMapping response = api.getIssueTypeSchemesMapping(startAt, maxResults, issueTypeSchemeId);
        // TODO: test validations
    }

    /**
     * Remove issue type from issue type scheme
     *
     * Removes an issue type from an issue type scheme.  This operation cannot remove:   *  any issue type used by issues.  *  any issue types from the default issue type scheme.  *  the last standard issue type from an issue type scheme.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void removeIssueTypeFromIssueTypeSchemeTest() throws ApiException {
        Long issueTypeSchemeId = null;
        Long issueTypeId = null;
        Object response = api.removeIssueTypeFromIssueTypeScheme(issueTypeSchemeId, issueTypeId);
        // TODO: test validations
    }

    /**
     * Change order of issue types
     *
     * Changes the order of issue types in an issue type scheme.  The request body parameters must meet the following requirements:   *  all of the issue types must belong to the issue type scheme.  *  either &#x60;after&#x60; or &#x60;position&#x60; must be provided.  *  the issue type in &#x60;after&#x60; must not be in the issue type list.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void reorderIssueTypesInIssueTypeSchemeTest() throws ApiException {
        Long issueTypeSchemeId = null;
        OrderOfIssueTypes orderOfIssueTypes = null;
        Object response = api.reorderIssueTypesInIssueTypeScheme(issueTypeSchemeId, orderOfIssueTypes);
        // TODO: test validations
    }

    /**
     * Update issue type scheme
     *
     * Updates an issue type scheme.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateIssueTypeSchemeTest() throws ApiException {
        Long issueTypeSchemeId = null;
        IssueTypeSchemeUpdateDetails issueTypeSchemeUpdateDetails = null;
        Object response = api.updateIssueTypeScheme(issueTypeSchemeId, issueTypeSchemeUpdateDetails);
        // TODO: test validations
    }

}
