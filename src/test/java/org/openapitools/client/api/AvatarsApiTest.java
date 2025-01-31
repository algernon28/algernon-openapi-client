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
import org.openapitools.client.model.Avatar;
import org.openapitools.client.model.Avatars;
import org.openapitools.client.model.ErrorCollection;
import org.openapitools.client.model.SystemAvatars;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for AvatarsApi
 */
@Disabled
public class AvatarsApiTest {

    private final AvatarsApi api = new AvatarsApi();

    /**
     * Delete avatar
     *
     * Deletes an avatar from a project or issue type.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteAvatarTest() throws ApiException {
        String type = null;
        String owningObjectId = null;
        Long id = null;
        api.deleteAvatar(type, owningObjectId, id);
        // TODO: test validations
    }

    /**
     * Get system avatars by type
     *
     * Returns a list of system avatar details by owner type, where the owner types are issue type, project, or user.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:** None.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getAllSystemAvatarsTest() throws ApiException {
        String type = null;
        SystemAvatars response = api.getAllSystemAvatars(type);
        // TODO: test validations
    }

    /**
     * Get avatar image by ID
     *
     * Returns a project or issue type avatar image by ID.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:**   *  For system avatars, none.  *  For custom project avatars, *Browse projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project the avatar belongs to.  *  For custom issue type avatars, *Browse projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for at least one project the issue type is used in.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getAvatarImageByIDTest() throws ApiException {
        String type = null;
        Long id = null;
        String size = null;
        String format = null;
        api.getAvatarImageByID(type, id, size, format);
        // TODO: test validations
    }

    /**
     * Get avatar image by owner
     *
     * Returns the avatar image for a project or issue type.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:**   *  For system avatars, none.  *  For custom project avatars, *Browse projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project the avatar belongs to.  *  For custom issue type avatars, *Browse projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for at least one project the issue type is used in.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getAvatarImageByOwnerTest() throws ApiException {
        String type = null;
        String entityId = null;
        String size = null;
        String format = null;
        api.getAvatarImageByOwner(type, entityId, size, format);
        // TODO: test validations
    }

    /**
     * Get avatar image by type
     *
     * Returns the default project or issue type avatar image.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:** None.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getAvatarImageByTypeTest() throws ApiException {
        String type = null;
        String size = null;
        String format = null;
        api.getAvatarImageByType(type, size, format);
        // TODO: test validations
    }

    /**
     * Get avatars
     *
     * Returns the system and custom avatars for a project or issue type.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:**   *  for custom project avatars, *Browse projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project the avatar belongs to.  *  for custom issue type avatars, *Browse projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for at least one project the issue type is used in.  *  for system avatars, none.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getAvatarsTest() throws ApiException {
        String type = null;
        String entityId = null;
        Avatars response = api.getAvatars(type, entityId);
        // TODO: test validations
    }

    /**
     * Load avatar
     *
     * Loads a custom avatar for a project or issue type.  Specify the avatar&#39;s local file location in the body of the request. Also, include the following headers:   *  &#x60;X-Atlassian-Token: no-check&#x60; To prevent XSRF protection blocking the request, for more information see [Special Headers](#special-request-headers).  *  &#x60;Content-Type: image/image type&#x60; Valid image types are JPEG, GIF, or PNG.  For example:   &#x60;curl --request POST &#x60;  &#x60;--user email@example.com:&lt;api_token&gt; &#x60;  &#x60;--header &#39;X-Atlassian-Token: no-check&#39; &#x60;  &#x60;--header &#39;Content-Type: image/&lt; image_type&gt;&#39; &#x60;  &#x60;--data-binary \&quot;&lt;@/path/to/file/with/your/avatar&gt;\&quot; &#x60;  &#x60;--url &#39;https://your-domain.atlassian.net/rest/api/3/universal_avatar/type/{type}/owner/{entityId}&#39;&#x60;  The avatar is cropped to a square. If no crop parameters are specified, the square originates at the top left of the image. The length of the square&#39;s sides is set to the smaller of the height or width of the image.  The cropped image is then used to create avatars of 16x16, 24x24, 32x32, and 48x48 in size.  After creating the avatar use:   *  [Update issue type](#api-rest-api-3-issuetype-id-put) to set it as the issue type&#39;s displayed avatar.  *  [Set project avatar](#api-rest-api-3-project-projectIdOrKey-avatar-put) to set it as the project&#39;s displayed avatar.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void storeAvatarTest() throws ApiException {
        String type = null;
        String entityId = null;
        Integer size = null;
        Object body = null;
        Integer x = null;
        Integer y = null;
        Avatar response = api.storeAvatar(type, entityId, size, body, x, y);
        // TODO: test validations
    }

}
