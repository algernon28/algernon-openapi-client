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
import org.openapitools.client.model.DefaultWorkflow;
import org.openapitools.client.model.IssueTypeWorkflowMapping;
import org.openapitools.client.model.IssueTypesWorkflowMapping;
import org.openapitools.client.model.PublishDraftWorkflowScheme;
import org.openapitools.client.model.TaskProgressBeanObject;
import org.openapitools.client.model.WorkflowScheme;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for WorkflowSchemeDraftsApi
 */
@Disabled
public class WorkflowSchemeDraftsApiTest {

    private final WorkflowSchemeDraftsApi api = new WorkflowSchemeDraftsApi();

    /**
     * Create draft workflow scheme
     *
     * Create a draft workflow scheme from an active workflow scheme, by copying the active workflow scheme. Note that an active workflow scheme can only have one draft workflow scheme.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createWorkflowSchemeDraftFromParentTest() throws ApiException {
        Long id = null;
        WorkflowScheme response = api.createWorkflowSchemeDraftFromParent(id);
        // TODO: test validations
    }

    /**
     * Delete draft default workflow
     *
     * Resets the default workflow for a workflow scheme&#39;s draft. That is, the default workflow is set to Jira&#39;s system workflow (the *jira* workflow).  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteDraftDefaultWorkflowTest() throws ApiException {
        Long id = null;
        WorkflowScheme response = api.deleteDraftDefaultWorkflow(id);
        // TODO: test validations
    }

    /**
     * Delete issue types for workflow in draft workflow scheme
     *
     * Deletes the workflow-issue type mapping for a workflow in a workflow scheme&#39;s draft.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteDraftWorkflowMappingTest() throws ApiException {
        Long id = null;
        String workflowName = null;
        api.deleteDraftWorkflowMapping(id, workflowName);
        // TODO: test validations
    }

    /**
     * Delete draft workflow scheme
     *
     * Deletes a draft workflow scheme.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteWorkflowSchemeDraftTest() throws ApiException {
        Long id = null;
        api.deleteWorkflowSchemeDraft(id);
        // TODO: test validations
    }

    /**
     * Delete workflow for issue type in draft workflow scheme
     *
     * Deletes the issue type-workflow mapping for an issue type in a workflow scheme&#39;s draft.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteWorkflowSchemeDraftIssueTypeTest() throws ApiException {
        Long id = null;
        String issueType = null;
        WorkflowScheme response = api.deleteWorkflowSchemeDraftIssueType(id, issueType);
        // TODO: test validations
    }

    /**
     * Get draft default workflow
     *
     * Returns the default workflow for a workflow scheme&#39;s draft. The default workflow is the workflow that is assigned any issue types that have not been mapped to any other workflow. The default workflow has *All Unassigned Issue Types* listed in its issue types for the workflow scheme in Jira.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getDraftDefaultWorkflowTest() throws ApiException {
        Long id = null;
        DefaultWorkflow response = api.getDraftDefaultWorkflow(id);
        // TODO: test validations
    }

    /**
     * Get issue types for workflows in draft workflow scheme
     *
     * Returns the workflow-issue type mappings for a workflow scheme&#39;s draft.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getDraftWorkflowTest() throws ApiException {
        Long id = null;
        String workflowName = null;
        IssueTypesWorkflowMapping response = api.getDraftWorkflow(id, workflowName);
        // TODO: test validations
    }

    /**
     * Get draft workflow scheme
     *
     * Returns the draft workflow scheme for an active workflow scheme. Draft workflow schemes allow changes to be made to the active workflow schemes: When an active workflow scheme is updated, a draft copy is created. The draft is modified, then the changes in the draft are copied back to the active workflow scheme. See [Configuring workflow schemes](https://confluence.atlassian.com/x/tohKLg) for more information.   Note that:   *  Only active workflow schemes can have draft workflow schemes.  *  An active workflow scheme can only have one draft workflow scheme.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getWorkflowSchemeDraftTest() throws ApiException {
        Long id = null;
        WorkflowScheme response = api.getWorkflowSchemeDraft(id);
        // TODO: test validations
    }

    /**
     * Get workflow for issue type in draft workflow scheme
     *
     * Returns the issue type-workflow mapping for an issue type in a workflow scheme&#39;s draft.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getWorkflowSchemeDraftIssueTypeTest() throws ApiException {
        Long id = null;
        String issueType = null;
        IssueTypeWorkflowMapping response = api.getWorkflowSchemeDraftIssueType(id, issueType);
        // TODO: test validations
    }

    /**
     * Publish draft workflow scheme
     *
     * Publishes a draft workflow scheme.  Where the draft workflow includes new workflow statuses for an issue type, mappings are provided to update issues with the original workflow status to the new workflow status.  This operation is [asynchronous](#async). Follow the &#x60;location&#x60; link in the response to determine the status of the task and use [Get task](#api-rest-api-3-task-taskId-get) to obtain updates.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void publishDraftWorkflowSchemeTest() throws ApiException {
        Long id = null;
        PublishDraftWorkflowScheme publishDraftWorkflowScheme = null;
        Boolean validateOnly = null;
        api.publishDraftWorkflowScheme(id, publishDraftWorkflowScheme, validateOnly);
        // TODO: test validations
    }

    /**
     * Set workflow for issue type in draft workflow scheme
     *
     * Sets the workflow for an issue type in a workflow scheme&#39;s draft.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void setWorkflowSchemeDraftIssueTypeTest() throws ApiException {
        Long id = null;
        String issueType = null;
        IssueTypeWorkflowMapping issueTypeWorkflowMapping = null;
        WorkflowScheme response = api.setWorkflowSchemeDraftIssueType(id, issueType, issueTypeWorkflowMapping);
        // TODO: test validations
    }

    /**
     * Update draft default workflow
     *
     * Sets the default workflow for a workflow scheme&#39;s draft.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateDraftDefaultWorkflowTest() throws ApiException {
        Long id = null;
        DefaultWorkflow defaultWorkflow = null;
        WorkflowScheme response = api.updateDraftDefaultWorkflow(id, defaultWorkflow);
        // TODO: test validations
    }

    /**
     * Set issue types for workflow in workflow scheme
     *
     * Sets the issue types for a workflow in a workflow scheme&#39;s draft. The workflow can also be set as the default workflow for the draft workflow scheme. Unmapped issues types are mapped to the default workflow.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateDraftWorkflowMappingTest() throws ApiException {
        Long id = null;
        String workflowName = null;
        IssueTypesWorkflowMapping issueTypesWorkflowMapping = null;
        WorkflowScheme response = api.updateDraftWorkflowMapping(id, workflowName, issueTypesWorkflowMapping);
        // TODO: test validations
    }

    /**
     * Update draft workflow scheme
     *
     * Updates a draft workflow scheme. If a draft workflow scheme does not exist for the active workflow scheme, then a draft is created. Note that an active workflow scheme can only have one draft workflow scheme.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateWorkflowSchemeDraftTest() throws ApiException {
        Long id = null;
        WorkflowScheme workflowScheme = null;
        WorkflowScheme response = api.updateWorkflowSchemeDraft(id, workflowScheme);
        // TODO: test validations
    }

}
