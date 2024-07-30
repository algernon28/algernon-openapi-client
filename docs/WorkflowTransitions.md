

# WorkflowTransitions

The transitions of the workflow. Note that a transition can have either the deprecated `to`/`from` fields or the `toStatusReference`/`links` fields, but never both nor a combination.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**actions** | [**List&lt;WorkflowRuleConfiguration&gt;**](WorkflowRuleConfiguration.md) | The post-functions of the transition. |  [optional] |
|**conditions** | [**ConditionGroupConfiguration**](ConditionGroupConfiguration.md) |  |  [optional] |
|**customIssueEventId** | **String** | The custom event ID of the transition. |  [optional] |
|**description** | **String** | The description of the transition. |  [optional] |
|**from** | [**List&lt;WorkflowStatusAndPort&gt;**](WorkflowStatusAndPort.md) | The statuses and ports that the transition can start from. This field is deprecated - use &#x60;toStatusReference&#x60;/&#x60;links&#x60; instead. |  [optional] |
|**id** | **String** | The ID of the transition. |  [optional] |
|**links** | [**List&lt;WorkflowTransitionLinks&gt;**](WorkflowTransitionLinks.md) | The statuses the transition can start from, and the mapping of ports between the statuses. |  [optional] |
|**name** | **String** | The name of the transition. |  [optional] |
|**properties** | **Map&lt;String, String&gt;** | The properties of the transition. |  [optional] |
|**to** | [**WorkflowStatusAndPort**](WorkflowStatusAndPort.md) |  |  [optional] |
|**toStatusReference** | **String** | The status the transition goes to. |  [optional] |
|**transitionScreen** | [**WorkflowRuleConfiguration**](WorkflowRuleConfiguration.md) |  |  [optional] |
|**triggers** | [**List&lt;WorkflowTrigger&gt;**](WorkflowTrigger.md) | The triggers of the transition. |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) | The transition type. |  [optional] |
|**validators** | [**List&lt;WorkflowRuleConfiguration&gt;**](WorkflowRuleConfiguration.md) | The validators of the transition. |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| INITIAL | &quot;INITIAL&quot; |
| GLOBAL | &quot;GLOBAL&quot; |
| DIRECTED | &quot;DIRECTED&quot; |



