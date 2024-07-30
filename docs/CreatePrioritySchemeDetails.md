

# CreatePrioritySchemeDetails

Details of a new priority scheme

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**defaultPriorityId** | **Long** | The ID of the default priority for the priority scheme. |  |
|**description** | **String** | The description of the priority scheme. |  [optional] |
|**mappings** | [**PriorityMapping**](PriorityMapping.md) | Mappings of issue priorities for issues being migrated in and out of this priority scheme. |  [optional] |
|**name** | **String** | The name of the priority scheme. Must be unique. |  |
|**priorityIds** | **List&lt;Long&gt;** | The IDs of priorities in the scheme. |  |
|**projectIds** | **Set&lt;Long&gt;** | The IDs of projects that will use the priority scheme. |  [optional] |



