package com.dbMigration.OracleToMySql.Repository;

import com.dbMigration.OracleToMySql.Entity.MySqlDefectExtract;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DefectExtractRepository extends JpaRepository<MySqlDefectExtract,String> {
}
