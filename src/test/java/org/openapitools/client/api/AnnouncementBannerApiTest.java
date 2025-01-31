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
import org.openapitools.client.model.AnnouncementBannerConfiguration;
import org.openapitools.client.model.AnnouncementBannerConfigurationUpdate;
import org.openapitools.client.model.ErrorCollection;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for AnnouncementBannerApi
 */
@Disabled
public class AnnouncementBannerApiTest {

    private final AnnouncementBannerApi api = new AnnouncementBannerApi();

    /**
     * Get announcement banner configuration
     *
     * Returns the current announcement banner configuration.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getBannerTest() throws ApiException {
        AnnouncementBannerConfiguration response = api.getBanner();
        // TODO: test validations
    }

    /**
     * Update announcement banner configuration
     *
     * Updates the announcement banner configuration.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void setBannerTest() throws ApiException {
        AnnouncementBannerConfigurationUpdate announcementBannerConfigurationUpdate = null;
        Object response = api.setBanner(announcementBannerConfigurationUpdate);
        // TODO: test validations
    }

}
