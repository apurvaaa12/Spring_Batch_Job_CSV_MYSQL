package com.dbMigration.OracleToMySql.Config;

import com.dbMigration.OracleToMySql.Entity.MySqlPfpEpic;
import com.dbMigration.OracleToMySql.Entity.MySqlPfpStory;
import org.springframework.batch.item.ItemProcessor;

public class PfpStoryProcessor implements ItemProcessor<MySqlPfpStory,MySqlPfpStory> {
    @Override
    public MySqlPfpStory process(MySqlPfpStory mySqlPfpStory) throws Exception {
        return mySqlPfpStory;
    }
}
