

# IssueLimitReportRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**issuesApproachingLimitParams** | **Map&lt;String, Integer&gt;** | A list of fields and their respective approaching limit threshold. Required for querying issues approaching limits. Optional for querying issues breaching limits. Accepted fields are: &#x60;comment&#x60;, &#x60;worklog&#x60;, &#x60;attachment&#x60;, &#x60;remoteIssueLinks&#x60;, and &#x60;issuelinks&#x60;. Example: &#x60;{\&quot;issuesApproachingLimitParams\&quot;: {\&quot;comment\&quot;: 4500, \&quot;attachment\&quot;: 1800}}&#x60; |  [optional] |



