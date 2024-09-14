package com.dbMigration.OracleToMySql.Config;

import com.dbMigration.OracleToMySql.Entity.MySqlDefectExtract;
import com.dbMigration.OracleToMySql.Entity.MySqlPfpEpic;
import com.dbMigration.OracleToMySql.Entity.MySqlPfpStory;
import com.dbMigration.OracleToMySql.Repository.DefectExtractRepository;
import com.dbMigration.OracleToMySql.Repository.PfpEpicRepository;
import com.dbMigration.OracleToMySql.Repository.PfpStoryRepository;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.item.data.RepositoryItemWriter;
import org.springframework.batch.item.file.FlatFileItemReader;
import org.springframework.batch.item.file.LineMapper;
import org.springframework.batch.item.file.mapping.BeanWrapperFieldSetMapper;
import org.springframework.batch.item.file.mapping.DefaultLineMapper;
import org.springframework.batch.item.file.transform.DelimitedLineTokenizer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.task.SimpleAsyncTaskExecutor;
import org.springframework.core.task.TaskExecutor;


@Configuration
@EnableBatchProcessing
public class JobConfig {
    @Autowired
    private JobBuilderFactory jobBuilderFactory;

    @Autowired
    private StepBuilderFactory stepBuilderFactory;

    @Autowired(required = true)
    private PfpEpicRepository pfpEpicRepository;

    @Autowired
    private DefectExtractRepository defectExtractRepository;
    @Autowired
    private PfpStoryRepository pfpStoryRepository;


    public FlatFileItemReader<MySqlPfpEpic> reader() {
        FlatFileItemReader<MySqlPfpEpic> itemReader = new FlatFileItemReader<>();
        itemReader.setResource(new FileSystemResource("src/main/resources/PFP_EPIC.csv"));
        itemReader.setName("CsvReader");
        itemReader.setLinesToSkip(1);
        itemReader.setLineMapper(lineMapper());
        return itemReader;
    }

    private LineMapper<MySqlPfpEpic> lineMapper() {
        DefaultLineMapper<MySqlPfpEpic> lineMapper = new DefaultLineMapper<>();

        DelimitedLineTokenizer lineTokenizer = new DelimitedLineTokenizer();
        lineTokenizer.setDelimiter(",");
        lineTokenizer.setStrict(false);
        lineTokenizer.setNames("IDS", "ID_SELF", "ISSUE_KEY", "PROJECT_KEY", "PROJECT_NAME", "ISSUETYPE_NAME", "PRIORITY_NAME", "ASSIGNEE_NAME", "ASSIGNEE_EMAILADDRESS", "ASSIGNEE_DISPLAYNAME", "REPORTER_NAME", "REPORTER_EMAILADDRESS", "REPORTER_DISPLAYNAME", "CREATED", "UPDATED_DATE", "STATUS_NAME", "STATUS_STATUSCATEGORY_NAME", "RESOLUTION_NAME", "RESOLUTIONDATE", "DUEDATE", "FEATURE_TEAM", "FEATURE_TEAMS", "TEAMS", "SUMMARYS", "LABELS", "MISSION", "CAPABILITY_DOMAIN", "FIXVERSIONS", "SPRINT", "DEPLOYMENT_DATE", "COMPONENTS_NAME", "EPIC_LINK", "PARENT_LINK", "TEST_PHASE", "TEST_TYPE", "ENVIRONMENTS", "APPLICATION_TYPE", "DEFECT_TYPE", "SEVERITY", "EXPLORE_SUBSTATUS", "EARLIEST_DETECTABLE_PHASE", "IS_IT_PROGRESSION_DEFECT", "FIX_TYPE", "TESTED_IN", "PREVENTIVE_ACTION", "ROOT_CAUSE", "PARENT_KEY", "UPDATE_FLG", "ENVIRONMENT", "EXECUTION_CYCLE", "PLAN_SPRINT", "TECHNOLOGY_DOMAIN", "B2B_ROOTCAUSE", "INTERFACES");
        BeanWrapperFieldSetMapper<MySqlPfpEpic> fieldSetMapper = new BeanWrapperFieldSetMapper<>();
        fieldSetMapper.setTargetType(MySqlPfpEpic.class);

        lineMapper.setLineTokenizer(lineTokenizer);
        lineMapper.setFieldSetMapper(fieldSetMapper);
        return lineMapper;
    }

    @Bean
    public EpicItemProcessor processor() {
        return new EpicItemProcessor();
    }

    @Bean
    public RepositoryItemWriter<MySqlPfpEpic> writer() {
        RepositoryItemWriter<MySqlPfpEpic> writer = new RepositoryItemWriter<>();
        writer.setRepository(pfpEpicRepository);
        writer.setMethodName("save");
        return writer;
    }

    @Bean
    public Step step1() {
        return stepBuilderFactory.get("csv-step")
                .<MySqlPfpEpic, MySqlPfpEpic>chunk(1000)
                .reader(reader())
                .processor(processor())
                .writer(writer())
                .taskExecutor(taskExecutor())
                .build();
    }

    public FlatFileItemReader<MySqlDefectExtract> defectReader() throws Exception {
        FlatFileItemReader<MySqlDefectExtract> itemReader = new FlatFileItemReader<>();
        itemReader.setResource(new FileSystemResource("src/main/resources/DEFECT_EXTRACT_B.csv"));
        itemReader.setName("CsvDefectReader");
        itemReader.setLinesToSkip(1);
        itemReader.setLineMapper(defectLineMapper());
        return itemReader;
    }

    private LineMapper<MySqlDefectExtract> defectLineMapper() {
        DefaultLineMapper<MySqlDefectExtract> lineMapper = new DefaultLineMapper<>();

        DelimitedLineTokenizer lineTokenizer = new DelimitedLineTokenizer();
        lineTokenizer.setDelimiter(",");
        lineTokenizer.setStrict(false);
        lineTokenizer.setNames("IDS", "ID_SELF", "ISSUE_KEY", "PROJECT_KEY", "PROJECT_NAME", "ISSUETYPE_NAME", "PRIORITY_NAME", "ASSIGNEE_NAME", "ASSIGNEE_EMAILADDRESS", "ASSIGNEE_DISPLAYNAME", "REPORTER_NAME", "REPORTER_EMAILADDRESS", "REPORTER_DISPLAYNAME", "CREATED", "UPDATED_DATE", "STATUS_NAME", "STATUS_STATUSCATEGORY_NAME", "RESOLUTION_NAME", "RESOLUTIONDATE", "DUEDATE", "FEATURE_TEAM", "FEATURE_TEAMS", "TEAMS", "SUMMARYS", "LABELS", "MISSION", "CAPABILITY_DOMAIN", "FIXVERSIONS", "SPRINT", "DEPLOYMENT_DATE", "COMPONENTS_NAME", "EPIC_LINK", "PARENT_LINK", "TEST_PHASE", "TEST_TYPE", "ENVIRONMENTS", "APPLICATION_TYPE", "DEFECT_TYPE", "SEVERITY", "EXPLORE_SUBSTATUS", "EARLIEST_DETECTABLE_PHASE", "IS_IT_PROGRESSION_DEFECT", "FIX_TYPE", "TESTED_IN", "PREVENTIVE_ACTION", "ROOT_CAUSE", "PARENT_KEY", "UPDATE_FLG", "ENVIRONMENT", "EXECUTION_CYCLE", "PLAN_SPRINT", "TECHNOLOGY_DOMAIN", "B2B_ROOTCAUSE", "INTERFACES");
        BeanWrapperFieldSetMapper<MySqlDefectExtract> fieldSetMapper = new BeanWrapperFieldSetMapper<>();
        fieldSetMapper.setTargetType(MySqlDefectExtract.class);

        lineMapper.setLineTokenizer(lineTokenizer);
        lineMapper.setFieldSetMapper(fieldSetMapper);
        return lineMapper;
    }

    @Bean
    public DefectItemProcessor defectProcessor() {
        return new DefectItemProcessor();
    }

    @Bean
    public RepositoryItemWriter<MySqlDefectExtract> defectWriter() {
        RepositoryItemWriter<MySqlDefectExtract> writer = new RepositoryItemWriter<>();
        writer.setRepository(defectExtractRepository);
        writer.setMethodName("save");
        return writer;
    }

    @Bean
    public Step step2() throws Exception {
        return stepBuilderFactory.get("Csv-Defect-Step").<MySqlDefectExtract, MySqlDefectExtract>chunk(1000)
                .reader(defectReader())
                .processor(defectProcessor())
                .writer(defectWriter())
                .taskExecutor(taskExecutor())
                .build();
    }

    public FlatFileItemReader<MySqlPfpStory> storyReader() throws Exception {
        FlatFileItemReader<MySqlPfpStory> itemReader = new FlatFileItemReader<>();
        itemReader.setResource(new FileSystemResource("src/main/resources/PFP_STORY.csv"));
        itemReader.setName("CsvDefectReader");
        itemReader.setLinesToSkip(1);
        itemReader.setLineMapper(storyLineMapper());
        return itemReader;
    }

    private LineMapper<MySqlPfpStory> storyLineMapper() {
        DefaultLineMapper<MySqlPfpStory> lineMapper = new DefaultLineMapper<>();

        DelimitedLineTokenizer lineTokenizer = new DelimitedLineTokenizer();
        lineTokenizer.setDelimiter(",");
        lineTokenizer.setStrict(false);
        lineTokenizer.setNames("IDS", "ID_SELF", "ISSUE_KEY", "VIABILITY", "ISSUETYPE_NAME", "FEASIBILITY", "PARENT_KEY", "PF_SUMMARY", "PF_STATUS_NAME", "PF_STATUS_STCATEGORY_NAME", "PF_PRIORITY_NAME", "PF_ISSUETYPE_NAME", "TARGET_END", "WIKI_LINK", "TARGET_START", "DESIRABILITY", "SPRINT", "EPIC_LINK", "PROJECT_KEY", "PROJECT_NAME", "FIXVERSIONS", "RESOLUTION_NAME", "TTR_ORIGINALESTIMATE", "TTR_REMAININGESTIMATE", "TTR_ORIGINALESTIMATESECONDS", "TTR_REMAININGESTIMATESECONDS", "RAG_STATUS_VALUE", "RESOLUTIONDATE", "OWNING_GROUP_VALUE", "SUMMARYS", "EXTERNAL_REFERENCE", "CREATED", "STRATEGIC_THEME_VALUE", "REPORTER_NAME", "REPORTER_EMAILADDRESS", "REPORTER_DISPLAYNAME", "REPORTER_ACTIVE", "REPORTER_TIMEZONE", "T_SHIRT_SIZE_VALUE", "FLAGGED_VALUE", "PRIORITY_NAME", "FEATURE_TEAM", "FEATURE_TEAMS", "TEAMS", "STORY_POINTS", "LABELS", "PARENT_LINK", "DUEDATE", "ASSIGNEE_NAME", "ASSIGNEE_EMAILADDRESS", "ASSIGNEE_DISPLAYNAME", "ASSIGNEE_ACTIVE", "ASSIGNEE_TIMEZONE", "UPDATED_DATE", "STATUS_NAME", "STATUS_STATUSCATEGORY_NAME", "COMPONENTS_NAME", "UPDATE_FLG");
        BeanWrapperFieldSetMapper<MySqlPfpStory> fieldSetMapper = new BeanWrapperFieldSetMapper<>();
        fieldSetMapper.setTargetType(MySqlPfpStory.class);

        lineMapper.setLineTokenizer(lineTokenizer);
        lineMapper.setFieldSetMapper(fieldSetMapper);
        return lineMapper;
    }

    @Bean
    public PfpStoryProcessor storyProcessor() {
        return new PfpStoryProcessor();
    }

    @Bean
    public RepositoryItemWriter<MySqlPfpStory> storyWriter() {
        RepositoryItemWriter<MySqlPfpStory> writer = new RepositoryItemWriter<>();
        writer.setRepository(pfpStoryRepository);
        writer.setMethodName("save");
        return writer;
    }

    @Bean
    public Step step3() throws Exception {
        return stepBuilderFactory.get("Csv-Story-Step")
                .<MySqlPfpStory, MySqlPfpStory>chunk(1000)
                .reader(storyReader())
                .processor(storyProcessor())
                .writer(storyWriter())
                .taskExecutor(taskExecutor())
                .build();
    }

    @Bean
    public Job migrateJob() throws Exception {
        return jobBuilderFactory.get("migrateData")
                .flow(step1())
                .next(step2())
                .next(step3())
                .end()
                .build();

    }

    @Bean
    public TaskExecutor taskExecutor() {
        SimpleAsyncTaskExecutor asyncTaskExecutor = new SimpleAsyncTaskExecutor();
        asyncTaskExecutor.setConcurrencyLimit(1000);
        return asyncTaskExecutor;
    }


}
