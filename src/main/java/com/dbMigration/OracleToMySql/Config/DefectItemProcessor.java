package com.dbMigration.OracleToMySql.Config;

import com.dbMigration.OracleToMySql.Entity.MySqlDefectExtract;
import org.springframework.batch.item.ItemProcessor;

public class DefectItemProcessor implements ItemProcessor<MySqlDefectExtract,MySqlDefectExtract>{

    @Override
    public MySqlDefectExtract process(MySqlDefectExtract mySqlDefectExtract) throws Exception {
        return mySqlDefectExtract;
    }
}
