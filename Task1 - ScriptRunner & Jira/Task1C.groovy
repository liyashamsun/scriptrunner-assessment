import com.atlassian.jira.issue.IssueInputParameters
import com.atlassian.jira.bc.issue.IssueService
import com.atlassian.jira.bc.issue.IssueService.IssueResult
import com.atlassian.jira.bc.issue.IssueService.UpdateValidationResult
import com.atlassian.jira.component.ComponentAccessor
import com.atlassian.jira.issue.Issue

final String issueKey = "AS-29"

def issue = ComponentAccessor.issueManager.getIssueByCurrentKey(issueKey)
def latestComment = ComponentAccessor.commentManager.getLastComment(issue)
def loggedInUser = ComponentAccessor.jiraAuthenticationContext.loggedInUser

IssueService issueService = ComponentAccessor.issueService
IssueResult issueResult = issueService.getIssue(loggedInUser, issueKey)

// to get input parameter from an issue
IssueInputParameters issueInputParameters = issueService.newIssueInputParameters()
issueInputParameters.setDescription(latestComment.body) //set latest comment as issue's description

// update input parameter after set a new one
UpdateValidationResult updateValidationResult = issueService.validateUpdate(loggedInUser, issue.id, issueInputParameters);
if (updateValidationResult.isValid()){
    IssueResult updateResult = issueService.update(loggedInUser, updateValidationResult);
}


