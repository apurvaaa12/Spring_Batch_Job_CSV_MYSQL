package com.dbMigration.OracleToMySql.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(schema = "ds_a23c839c03", name = "PFP_STORY")
public class MySqlPfpStory {
    @Id
    @Column(name = "IDS")
    private String ids;

    @Column(name = "ID_SELF")
    private String idSelf;

    @Column(name = "ISSUE_KEY")
    private String issueKey;

    @Column(name = "VIABILITY")
    private String viability;

    @Column(name = "ISSUETYPE_NAME")
    private String issueTypeName;

    @Column(name = "FEASIBILITY")
    private String feasibility;

    @Column(name = "PARENT_KEY")
    private String parentKey;

    @Column(name = "PF_SUMMARY")
    private String pfSummary;

    @Column(name = "PF_STATUS_NAME")
    private String pfStatusName;

    @Column(name = "PF_STATUS_STCATEGORY_NAME")
    private String pfStatusStCategoryName;

    @Column(name = "PF_PRIORITY_NAME")
    private String pfPriorityName;

    @Column(name = "PF_ISSUETYPE_NAME")
    private String pfIssueTypeName;

    @Column(name = "TARGET_END")
    private String targetEnd;

    @Column(name = "WIKI_LINK")
    private String wikiLink;

    @Column(name = "TARGET_START")
    private String targetStart;

    @Column(name = "DESIRABILITY")
    private String desirability;

    @Column(name = "SPRINT")
    private String sprint;

    @Column(name = "EPIC_LINK")
    private String epicLink;

    @Column(name = "PROJECT_KEY")
    private String projectKey;

    @Column(name = "PROJECT_NAME")
    private String projectName;

    @Column(name = "FIXVERSIONS")
    private String fixVersions;

    @Column(name = "RESOLUTION_NAME")
    private String resolutionName;

    @Column(name = "TTR_ORIGINALESTIMATE")
    private String ttrOriginalEstimate;

    @Column(name = "TTR_REMAININGESTIMATE")
    private String ttrRemainingEstimate;

    @Column(name = "TTR_ORIGINALESTIMATESECONDS")
    private String ttrOriginalEstimateSeconds;

    @Column(name = "TTR_REMAININGESTIMATESECONDS")
    private String ttrRemainingEstimateSeconds;

    @Column(name = "RAG_STATUS_VALUE")
    private String ragStatusValue;

    @Column(name = "RESOLUTIONDATE")
    private String resolutionDate;

    @Column(name = "OWNING_GROUP_VALUE")
    private String owningGroupValue;

    @Column(name = "SUMMARYS")
    private String summarys;

    @Column(name = "EXTERNAL_REFERENCE")
    private String externalReference;

    @Column(name = "CREATED")
    private String created;

    @Column(name = "STRATEGIC_THEME_VALUE")
    private String strategicThemeValue;

    @Column(name = "REPORTER_NAME")
    private String reporterName;

    @Column(name = "REPORTER_EMAILADDRESS")
    private String reporterEmailAddress;

    @Column(name = "REPORTER_DISPLAYNAME")
    private String reporterDisplayName;

    @Column(name = "REPORTER_ACTIVE")
    private String reporterActive;

    @Column(name = "REPORTER_TIMEZONE")
    private String reporterTimezone;

    @Column(name = "T_SHIRT_SIZE_VALUE")
    private String tShirtSizeValue;

    @Column(name = "FLAGGED_VALUE")
    private String flaggedValue;

    @Column(name = "PRIORITY_NAME")
    private String priorityName;

    @Column(name = "FEATURE_TEAM")
    private String featureTeam;

    @Column(name = "FEATURE_TEAMS")
    private String featureTeams;

    @Column(name = "TEAMS")
    private String teams;

    @Column(name = "STORY_POINTS")
    private String storyPoints;

    @Column(name = "LABELS")
    private String labels;

    @Column(name = "PARENT_LINK")
    private String parentLink;

    @Column(name = "DUEDATE")
    private String dueDate;

    @Column(name = "ASSIGNEE_NAME")
    private String assigneeName;

    @Column(name = "ASSIGNEE_EMAILADDRESS")
    private String assigneeEmailAddress;

    @Column(name = "ASSIGNEE_DISPLAYNAME")
    private String assigneeDisplayName;

    @Column(name = "ASSIGNEE_ACTIVE")
    private String assigneeActive;

    @Column(name = "ASSIGNEE_TIMEZONE")
    private String assigneeTimezone;

    @Column(name = "UPDATED_DATE")
    private String updatedDate;

    @Column(name = "STATUS_NAME")
    private String statusName;

    @Column(name = "STATUS_STATUSCATEGORY_NAME")
    private String statusStatusCategoryName;

    @Column(name = "COMPONENTS_NAME")
    private String componentsName;

    @Column(name = "UPDATE_FLG")
    private String updateFlag;

    public String getIds() {
        return ids;
    }

    public void setIds(String ids) {
        this.ids = ids;
    }

    public String getIdSelf() {
        return idSelf;
    }

    public void setIdSelf(String idSelf) {
        this.idSelf = idSelf;
    }

    public String getIssueKey() {
        return issueKey;
    }

    public void setIssueKey(String issueKey) {
        this.issueKey = issueKey;
    }

    public String getViability() {
        return viability;
    }

    public void setViability(String viability) {
        this.viability = viability;
    }

    public String getIssueTypeName() {
        return issueTypeName;
    }

    public void setIssueTypeName(String issueTypeName) {
        this.issueTypeName = issueTypeName;
    }

    public String getFeasibility() {
        return feasibility;
    }

    public void setFeasibility(String feasibility) {
        this.feasibility = feasibility;
    }

    public String getParentKey() {
        return parentKey;
    }

    public void setParentKey(String parentKey) {
        this.parentKey = parentKey;
    }

    public String getPfSummary() {
        return pfSummary;
    }

    public void setPfSummary(String pfSummary) {
        this.pfSummary = pfSummary;
    }

    public String getPfStatusName() {
        return pfStatusName;
    }

    public void setPfStatusName(String pfStatusName) {
        this.pfStatusName = pfStatusName;
    }

    public String getPfStatusStCategoryName() {
        return pfStatusStCategoryName;
    }

    public void setPfStatusStCategoryName(String pfStatusStCategoryName) {
        this.pfStatusStCategoryName = pfStatusStCategoryName;
    }

    public String getPfPriorityName() {
        return pfPriorityName;
    }

    public void setPfPriorityName(String pfPriorityName) {
        this.pfPriorityName = pfPriorityName;
    }

    public String getPfIssueTypeName() {
        return pfIssueTypeName;
    }

    public void setPfIssueTypeName(String pfIssueTypeName) {
        this.pfIssueTypeName = pfIssueTypeName;
    }

    public String getTargetEnd() {
        return targetEnd;
    }

    public void setTargetEnd(String targetEnd) {
        this.targetEnd = targetEnd;
    }

    public String getWikiLink() {
        return wikiLink;
    }

    public void setWikiLink(String wikiLink) {
        this.wikiLink = wikiLink;
    }

    public String getTargetStart() {
        return targetStart;
    }

    public void setTargetStart(String targetStart) {
        this.targetStart = targetStart;
    }

    public String getDesirability() {
        return desirability;
    }

    public void setDesirability(String desirability) {
        this.desirability = desirability;
    }

    public String getSprint() {
        return sprint;
    }

    public void setSprint(String sprint) {
        this.sprint = sprint;
    }

    public String getEpicLink() {
        return epicLink;
    }

    public void setEpicLink(String epicLink) {
        this.epicLink = epicLink;
    }

    public String getProjectKey() {
        return projectKey;
    }

    public void setProjectKey(String projectKey) {
        this.projectKey = projectKey;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getFixVersions() {
        return fixVersions;
    }

    public void setFixVersions(String fixVersions) {
        this.fixVersions = fixVersions;
    }

    public String getResolutionName() {
        return resolutionName;
    }

    public void setResolutionName(String resolutionName) {
        this.resolutionName = resolutionName;
    }

    public String getTtrOriginalEstimate() {
        return ttrOriginalEstimate;
    }

    public void setTtrOriginalEstimate(String ttrOriginalEstimate) {
        this.ttrOriginalEstimate = ttrOriginalEstimate;
    }

    public String getTtrRemainingEstimate() {
        return ttrRemainingEstimate;
    }

    public void setTtrRemainingEstimate(String ttrRemainingEstimate) {
        this.ttrRemainingEstimate = ttrRemainingEstimate;
    }

    public String getTtrOriginalEstimateSeconds() {
        return ttrOriginalEstimateSeconds;
    }

    public void setTtrOriginalEstimateSeconds(String ttrOriginalEstimateSeconds) {
        this.ttrOriginalEstimateSeconds = ttrOriginalEstimateSeconds;
    }

    public String getTtrRemainingEstimateSeconds() {
        return ttrRemainingEstimateSeconds;
    }

    public void setTtrRemainingEstimateSeconds(String ttrRemainingEstimateSeconds) {
        this.ttrRemainingEstimateSeconds = ttrRemainingEstimateSeconds;
    }

    public String getRagStatusValue() {
        return ragStatusValue;
    }

    public void setRagStatusValue(String ragStatusValue) {
        this.ragStatusValue = ragStatusValue;
    }

    public String getResolutionDate() {
        return resolutionDate;
    }

    public void setResolutionDate(String resolutionDate) {
        this.resolutionDate = resolutionDate;
    }

    public String getOwningGroupValue() {
        return owningGroupValue;
    }

    public void setOwningGroupValue(String owningGroupValue) {
        this.owningGroupValue = owningGroupValue;
    }

    public String getSummarys() {
        return summarys;
    }

    public void setSummarys(String summarys) {
        this.summarys = summarys;
    }

    public String getExternalReference() {
        return externalReference;
    }

    public void setExternalReference(String externalReference) {
        this.externalReference = externalReference;
    }

    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    public String getStrategicThemeValue() {
        return strategicThemeValue;
    }

    public void setStrategicThemeValue(String strategicThemeValue) {
        this.strategicThemeValue = strategicThemeValue;
    }

    public String getReporterName() {
        return reporterName;
    }

    public void setReporterName(String reporterName) {
        this.reporterName = reporterName;
    }

    public String getReporterEmailAddress() {
        return reporterEmailAddress;
    }

    public void setReporterEmailAddress(String reporterEmailAddress) {
        this.reporterEmailAddress = reporterEmailAddress;
    }

    public String getReporterDisplayName() {
        return reporterDisplayName;
    }

    public void setReporterDisplayName(String reporterDisplayName) {
        this.reporterDisplayName = reporterDisplayName;
    }

    public String getReporterActive() {
        return reporterActive;
    }

    public void setReporterActive(String reporterActive) {
        this.reporterActive = reporterActive;
    }

    public String getReporterTimezone() {
        return reporterTimezone;
    }

    public void setReporterTimezone(String reporterTimezone) {
        this.reporterTimezone = reporterTimezone;
    }

    public String gettShirtSizeValue() {
        return tShirtSizeValue;
    }

    public void settShirtSizeValue(String tShirtSizeValue) {
        this.tShirtSizeValue = tShirtSizeValue;
    }

    public String getFlaggedValue() {
        return flaggedValue;
    }

    public void setFlaggedValue(String flaggedValue) {
        this.flaggedValue = flaggedValue;
    }

    public String getPriorityName() {
        return priorityName;
    }

    public void setPriorityName(String priorityName) {
        this.priorityName = priorityName;
    }

    public String getFeatureTeam() {
        return featureTeam;
    }

    public void setFeatureTeam(String featureTeam) {
        this.featureTeam = featureTeam;
    }

    public String getFeatureTeams() {
        return featureTeams;
    }

    public void setFeatureTeams(String featureTeams) {
        this.featureTeams = featureTeams;
    }

    public String getTeams() {
        return teams;
    }

    public void setTeams(String teams) {
        this.teams = teams;
    }

    public String getStoryPoints() {
        return storyPoints;
    }

    public void setStoryPoints(String storyPoints) {
        this.storyPoints = storyPoints;
    }

    public String getLabels() {
        return labels;
    }

    public void setLabels(String labels) {
        this.labels = labels;
    }

    public String getParentLink() {
        return parentLink;
    }

    public void setParentLink(String parentLink) {
        this.parentLink = parentLink;
    }

    public String getDueDate() {
        return dueDate;
    }

    public void setDueDate(String dueDate) {
        this.dueDate = dueDate;
    }

    public String getAssigneeName() {
        return assigneeName;
    }

    public void setAssigneeName(String assigneeName) {
        this.assigneeName = assigneeName;
    }

    public String getAssigneeEmailAddress() {
        return assigneeEmailAddress;
    }

    public void setAssigneeEmailAddress(String assigneeEmailAddress) {
        this.assigneeEmailAddress = assigneeEmailAddress;
    }

    public String getAssigneeDisplayName() {
        return assigneeDisplayName;
    }

    public void setAssigneeDisplayName(String assigneeDisplayName) {
        this.assigneeDisplayName = assigneeDisplayName;
    }

    public String getAssigneeActive() {
        return assigneeActive;
    }

    public void setAssigneeActive(String assigneeActive) {
        this.assigneeActive = assigneeActive;
    }

    public String getAssigneeTimezone() {
        return assigneeTimezone;
    }

    public void setAssigneeTimezone(String assigneeTimezone) {
        this.assigneeTimezone = assigneeTimezone;
    }

    public String getUpdatedDate() {
        return updatedDate;
    }

    public void setUpdatedDate(String updatedDate) {
        this.updatedDate = updatedDate;
    }

    public String getStatusName() {
        return statusName;
    }

    public void setStatusName(String statusName) {
        this.statusName = statusName;
    }

    public String getStatusStatusCategoryName() {
        return statusStatusCategoryName;
    }

    public void setStatusStatusCategoryName(String statusStatusCategoryName) {
        this.statusStatusCategoryName = statusStatusCategoryName;
    }

    public String getComponentsName() {
        return componentsName;
    }

    public void setComponentsName(String componentsName) {
        this.componentsName = componentsName;
    }

    public String getUpdateFlag() {
        return updateFlag;
    }

    public void setUpdateFlag(String updateFlag) {
        this.updateFlag = updateFlag;
    }

    @Override
    public String toString() {
        return "MySqlPfpStory{" +
                "ids='" + ids + '\'' +
                ", idSelf='" + idSelf + '\'' +
                ", issueKey='" + issueKey + '\'' +
                ", viability='" + viability + '\'' +
                ", issueTypeName='" + issueTypeName + '\'' +
                ", feasibility='" + feasibility + '\'' +
                ", parentKey='" + parentKey + '\'' +
                ", pfSummary='" + pfSummary + '\'' +
                ", pfStatusName='" + pfStatusName + '\'' +
                ", pfStatusStCategoryName='" + pfStatusStCategoryName + '\'' +
                ", pfPriorityName='" + pfPriorityName + '\'' +
                ", pfIssueTypeName='" + pfIssueTypeName + '\'' +
                ", targetEnd='" + targetEnd + '\'' +
                ", wikiLink='" + wikiLink + '\'' +
                ", targetStart='" + targetStart + '\'' +
                ", desirability='" + desirability + '\'' +
                ", sprint='" + sprint + '\'' +
                ", epicLink='" + epicLink + '\'' +
                ", projectKey='" + projectKey + '\'' +
                ", projectName='" + projectName + '\'' +
                ", fixVersions='" + fixVersions + '\'' +
                ", resolutionName='" + resolutionName + '\'' +
                ", ttrOriginalEstimate='" + ttrOriginalEstimate + '\'' +
                ", ttrRemainingEstimate='" + ttrRemainingEstimate + '\'' +
                ", ttrOriginalEstimateSeconds='" + ttrOriginalEstimateSeconds + '\'' +
                ", ttrRemainingEstimateSeconds='" + ttrRemainingEstimateSeconds + '\'' +
                ", ragStatusValue='" + ragStatusValue + '\'' +
                ", resolutionDate='" + resolutionDate + '\'' +
                ", owningGroupValue='" + owningGroupValue + '\'' +
                ", summarys='" + summarys + '\'' +
                ", externalReference='" + externalReference + '\'' +
                ", created='" + created + '\'' +
                ", strategicThemeValue='" + strategicThemeValue + '\'' +
                ", reporterName='" + reporterName + '\'' +
                ", reporterEmailAddress='" + reporterEmailAddress + '\'' +
                ", reporterDisplayName='" + reporterDisplayName + '\'' +
                ", reporterActive='" + reporterActive + '\'' +
                ", reporterTimezone='" + reporterTimezone + '\'' +
                ", tShirtSizeValue='" + tShirtSizeValue + '\'' +
                ", flaggedValue='" + flaggedValue + '\'' +
                ", priorityName='" + priorityName + '\'' +
                ", featureTeam='" + featureTeam + '\'' +
                ", featureTeams='" + featureTeams + '\'' +
                ", teams='" + teams + '\'' +
                ", storyPoints='" + storyPoints + '\'' +
                ", labels='" + labels + '\'' +
                ", parentLink='" + parentLink + '\'' +
                ", dueDate='" + dueDate + '\'' +
                ", assigneeName='" + assigneeName + '\'' +
                ", assigneeEmailAddress='" + assigneeEmailAddress + '\'' +
                ", assigneeDisplayName='" + assigneeDisplayName + '\'' +
                ", assigneeActive='" + assigneeActive + '\'' +
                ", assigneeTimezone='" + assigneeTimezone + '\'' +
                ", updatedDate='" + updatedDate + '\'' +
                ", statusName='" + statusName + '\'' +
                ", statusStatusCategoryName='" + statusStatusCategoryName + '\'' +
                ", componentsName='" + componentsName + '\'' +
                ", updateFlag='" + updateFlag + '\'' +
                '}';
    }
}
