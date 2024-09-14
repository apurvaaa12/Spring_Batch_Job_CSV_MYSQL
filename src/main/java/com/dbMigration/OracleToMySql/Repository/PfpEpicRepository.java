package com.dbMigration.OracleToMySql.Repository;

import com.dbMigration.OracleToMySql.Entity.MySqlPfpEpic;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PfpEpicRepository extends JpaRepository<MySqlPfpEpic, String> {
}
