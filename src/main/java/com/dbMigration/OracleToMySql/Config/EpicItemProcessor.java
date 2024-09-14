package com.dbMigration.OracleToMySql.Config;

import com.dbMigration.OracleToMySql.Entity.MySqlPfpEpic;
import org.springframework.batch.item.ItemProcessor;

public class EpicItemProcessor implements ItemProcessor<MySqlPfpEpic,MySqlPfpEpic> {

    @Override
    public MySqlPfpEpic process(MySqlPfpEpic mySqlPfpEpic) throws Exception {
        return mySqlPfpEpic;
    }
}
