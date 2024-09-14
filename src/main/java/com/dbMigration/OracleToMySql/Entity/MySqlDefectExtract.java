package com.dbMigration.OracleToMySql.Entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(schema = "ds_a23c839c03", name = "DEFECT_EXTRACT")
public class MySqlDefectExtract {
    @Id
    @Column(name = "IDS")
    private String ids;

    @Column(name = "ID_SELF")
    private String idSelf;

    @Column(name = "ISSUE_KEY")
    private String issueKey;

    @Column(name = "PROJECT_KEY")
    private String projectKey;

    @Column(name = "PROJECT_NAME")
    private String projectName;

    @Column(name = "ISSUETYPE_NAME")
    private String issueTypeName;

    @Column(name = "PRIORITY_NAME")
    private String priorityName;

    @Column(name = "ASSIGNEE_NAME")
    private String assigneeName;

    @Column(name = "ASSIGNEE_EMAILADDRESS")
    private String assigneeEmailAddress;

    @Column(name = "ASSIGNEE_DISPLAYNAME")
    private String assigneeDisplayName;

    @Column(name = "REPORTER_NAME")
    private String reporterName;

    @Column(name = "REPORTER_EMAILADDRESS")
    private String reporterEmailAddress;

    @Column(name = "REPORTER_DISPLAYNAME")
    private String reporterDisplayName;

    @Column(name = "CREATED")
    private String created;

    @Column(name = "UPDATED_DATE")
    private String updatedDate;

    @Column(name = "STATUS_NAME")
    private String statusName;

    @Column(name = "STATUS_STATUSCATEGORY_NAME")
    private String statusStatusCategoryName;

    @Column(name = "RESOLUTION_NAME")
    private String resolutionName;

    @Column(name = "RESOLUTIONDATE")
    private String resolutionDate;

    @Column(name = "DUEDATE")
    private String dueDate;

    @Column(name = "FEATURE_TEAM")
    private String featureTeam;

    @Column(name = "FEATURE_TEAMS")
    private String featureTeams;

    @Column(name = "TEAMS")
    private String teams;

    @Column(name = "SUMMARYS")
    private String summarys;

    @Column(name = "LABELS")
    private String labels;

    @Column(name = "MISSION")
    private String mission;

    @Column(name = "CAPABILITY_DOMAIN")
    private String capabilityDomain;

    @Column(name = "FIXVERSIONS")
    private String fixVersions;

    @Column(name = "SPRINT")
    private String sprint;

    @Column(name = "DEPLOYMENT_DATE")
    private String deploymentDate;

    @Column(name = "COMPONENTS_NAME")
    private String componentsName;

    @Column(name = "EPIC_LINK")
    private String epicLink;

    @Column(name = "PARENT_LINK")
    private String parentLink;

    @Column(name = "TEST_PHASE")
    private String testPhase;

    @Column(name = "TEST_TYPE")
    private String testType;

    @Column(name = "ENVIRONMENTS")
    private String environments;

    @Column(name = "APPLICATION_TYPE")
    private String applicationType;

    @Column(name = "DEFECT_TYPE")
    private String defectType;

    @Column(name = "SEVERITY")
    private String severity;

    @Column(name = "EXPLORE_SUBSTATUS")
    private String exploreSubstatus;

    @Column(name = "EARLIEST_DETECTABLE_PHASE")
    private String earliestDetectablePhase;

    @Column(name = "IS_IT_PROGRESSION_DEFECT")
    private String isItProgressionDefect;

    @Column(name = "FIX_TYPE")
    private String fixType;

    @Column(name = "TESTED_IN")
    private String testedIn;

    @Column(name = "PREVENTIVE_ACTION")
    private String preventiveAction;

    @Column(name = "ROOT_CAUSE")
    private String rootCause;

    @Column(name = "PARENT_KEY")
    private String parentKey;

    @Column(name = "UPDATE_FLG")
    private String updateFlag;

    @Column(name = "ENVIRONMENT")
    private String environment;

    @Column(name = "EXECUTION_CYCLE")
    private String executionCycle;

    @Column(name = "PLAN_SPRINT")
    private String planSprint;

    @Column(name = "TECHNOLOGY_DOMAIN")
    private String technologyDomain;

    @Column(name = "B2B_ROOTCAUSE")
    private String b2bRootCause;

    @Column(name = "INTERFACES")
    private String interfaces;

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

    public String getIssueTypeName() {
        return issueTypeName;
    }

    public void setIssueTypeName(String issueTypeName) {
        this.issueTypeName = issueTypeName;
    }

    public String getPriorityName() {
        return priorityName;
    }

    public void setPriorityName(String priorityName) {
        this.priorityName = priorityName;
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

    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
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

    public String getResolutionName() {
        return resolutionName;
    }

    public void setResolutionName(String resolutionName) {
        this.resolutionName = resolutionName;
    }

    public String getResolutionDate() {
        return resolutionDate;
    }

    public void setResolutionDate(String resolutionDate) {
        this.resolutionDate = resolutionDate;
    }

    public String getDueDate() {
        return dueDate;
    }

    public void setDueDate(String dueDate) {
        this.dueDate = dueDate;
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

    public String getSummarys() {
        return summarys;
    }

    public void setSummarys(String summarys) {
        this.summarys = summarys;
    }

    public String getLabels() {
        return labels;
    }

    public void setLabels(String labels) {
        this.labels = labels;
    }

    public String getMission() {
        return mission;
    }

    public void setMission(String mission) {
        this.mission = mission;
    }

    public String getCapabilityDomain() {
        return capabilityDomain;
    }

    public void setCapabilityDomain(String capabilityDomain) {
        this.capabilityDomain = capabilityDomain;
    }

    public String getFixVersions() {
        return fixVersions;
    }

    public void setFixVersions(String fixVersions) {
        this.fixVersions = fixVersions;
    }

    public String getSprint() {
        return sprint;
    }

    public void setSprint(String sprint) {
        this.sprint = sprint;
    }

    public String getDeploymentDate() {
        return deploymentDate;
    }

    public void setDeploymentDate(String deploymentDate) {
        this.deploymentDate = deploymentDate;
    }

    public String getComponentsName() {
        return componentsName;
    }

    public void setComponentsName(String componentsName) {
        this.componentsName = componentsName;
    }

    public String getEpicLink() {
        return epicLink;
    }

    public void setEpicLink(String epicLink) {
        this.epicLink = epicLink;
    }

    public String getParentLink() {
        return parentLink;
    }

    public void setParentLink(String parentLink) {
        this.parentLink = parentLink;
    }

    public String getTestPhase() {
        return testPhase;
    }

    public void setTestPhase(String testPhase) {
        this.testPhase = testPhase;
    }

    public String getTestType() {
        return testType;
    }

    public void setTestType(String testType) {
        this.testType = testType;
    }

    public String getEnvironments() {
        return environments;
    }

    public void setEnvironments(String environments) {
        this.environments = environments;
    }

    public String getApplicationType() {
        return applicationType;
    }

    public void setApplicationType(String applicationType) {
        this.applicationType = applicationType;
    }

    public String getDefectType() {
        return defectType;
    }

    public void setDefectType(String defectType) {
        this.defectType = defectType;
    }

    public String getSeverity() {
        return severity;
    }

    public void setSeverity(String severity) {
        this.severity = severity;
    }

    public String getExploreSubstatus() {
        return exploreSubstatus;
    }

    public void setExploreSubstatus(String exploreSubstatus) {
        this.exploreSubstatus = exploreSubstatus;
    }

    public String getEarliestDetectablePhase() {
        return earliestDetectablePhase;
    }

    public void setEarliestDetectablePhase(String earliestDetectablePhase) {
        this.earliestDetectablePhase = earliestDetectablePhase;
    }

    public String getIsItProgressionDefect() {
        return isItProgressionDefect;
    }

    public void setIsItProgressionDefect(String isItProgressionDefect) {
        this.isItProgressionDefect = isItProgressionDefect;
    }

    public String getFixType() {
        return fixType;
    }

    public void setFixType(String fixType) {
        this.fixType = fixType;
    }

    public String getTestedIn() {
        return testedIn;
    }

    public void setTestedIn(String testedIn) {
        this.testedIn = testedIn;
    }

    public String getPreventiveAction() {
        return preventiveAction;
    }

    public void setPreventiveAction(String preventiveAction) {
        this.preventiveAction = preventiveAction;
    }

    public String getRootCause() {
        return rootCause;
    }

    public void setRootCause(String rootCause) {
        this.rootCause = rootCause;
    }

    public String getParentKey() {
        return parentKey;
    }

    public void setParentKey(String parentKey) {
        this.parentKey = parentKey;
    }

    public String getUpdateFlag() {
        return updateFlag;
    }

    public void setUpdateFlag(String updateFlag) {
        this.updateFlag = updateFlag;
    }

    public String getEnvironment() {
        return environment;
    }

    public void setEnvironment(String environment) {
        this.environment = environment;
    }

    public String getExecutionCycle() {
        return executionCycle;
    }

    public void setExecutionCycle(String executionCycle) {
        this.executionCycle = executionCycle;
    }

    public String getPlanSprint() {
        return planSprint;
    }

    public void setPlanSprint(String planSprint) {
        this.planSprint = planSprint;
    }

    public String getTechnologyDomain() {
        return technologyDomain;
    }

    public void setTechnologyDomain(String technologyDomain) {
        this.technologyDomain = technologyDomain;
    }

    public String getB2bRootCause() {
        return b2bRootCause;
    }

    public void setB2bRootCause(String b2bRootCause) {
        this.b2bRootCause = b2bRootCause;
    }

    public String getInterfaces() {
        return interfaces;
    }

    public void setInterfaces(String interfaces) {
        this.interfaces = interfaces;
    }

    @Override
    public String toString() {
        return "MySqlDefectExtract{" +
                "ids='" + ids + '\'' +
                ", idSelf='" + idSelf + '\'' +
                ", issueKey='" + issueKey + '\'' +
                ", projectKey='" + projectKey + '\'' +
                ", projectName='" + projectName + '\'' +
                ", issueTypeName='" + issueTypeName + '\'' +
                ", priorityName='" + priorityName + '\'' +
                ", assigneeName='" + assigneeName + '\'' +
                ", assigneeEmailAddress='" + assigneeEmailAddress + '\'' +
                ", assigneeDisplayName='" + assigneeDisplayName + '\'' +
                ", reporterName='" + reporterName + '\'' +
                ", reporterEmailAddress='" + reporterEmailAddress + '\'' +
                ", reporterDisplayName='" + reporterDisplayName + '\'' +
                ", created='" + created + '\'' +
                ", updatedDate='" + updatedDate + '\'' +
                ", statusName='" + statusName + '\'' +
                ", statusStatusCategoryName='" + statusStatusCategoryName + '\'' +
                ", resolutionName='" + resolutionName + '\'' +
                ", resolutionDate='" + resolutionDate + '\'' +
                ", dueDate='" + dueDate + '\'' +
                ", featureTeam='" + featureTeam + '\'' +
                ", featureTeams='" + featureTeams + '\'' +
                ", teams='" + teams + '\'' +
                ", summarys='" + summarys + '\'' +
                ", labels='" + labels + '\'' +
                ", mission='" + mission + '\'' +
                ", capabilityDomain='" + capabilityDomain + '\'' +
                ", fixVersions='" + fixVersions + '\'' +
                ", sprint='" + sprint + '\'' +
                ", deploymentDate='" + deploymentDate + '\'' +
                ", componentsName='" + componentsName + '\'' +
                ", epicLink='" + epicLink + '\'' +
                ", parentLink='" + parentLink + '\'' +
                ", testPhase='" + testPhase + '\'' +
                ", testType='" + testType + '\'' +
                ", environments='" + environments + '\'' +
                ", applicationType='" + applicationType + '\'' +
                ", defectType='" + defectType + '\'' +
                ", severity='" + severity + '\'' +
                ", exploreSubstatus='" + exploreSubstatus + '\'' +
                ", earliestDetectablePhase='" + earliestDetectablePhase + '\'' +
                ", isItProgressionDefect='" + isItProgressionDefect + '\'' +
                ", fixType='" + fixType + '\'' +
                ", testedIn='" + testedIn + '\'' +
                ", preventiveAction='" + preventiveAction + '\'' +
                ", rootCause='" + rootCause + '\'' +
                ", parentKey='" + parentKey + '\'' +
                ", updateFlag='" + updateFlag + '\'' +
                ", environment='" + environment + '\'' +
                ", executionCycle='" + executionCycle + '\'' +
                ", planSprint='" + planSprint + '\'' +
                ", technologyDomain='" + technologyDomain + '\'' +
                ", b2bRootCause='" + b2bRootCause + '\'' +
                ", interfaces='" + interfaces + '\'' +
                '}';
    }
}
