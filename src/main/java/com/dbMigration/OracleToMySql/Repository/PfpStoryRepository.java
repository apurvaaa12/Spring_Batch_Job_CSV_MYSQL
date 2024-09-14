package com.dbMigration.OracleToMySql.Repository;

import com.dbMigration.OracleToMySql.Entity.MySqlPfpStory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface PfpStoryRepository extends JpaRepository<MySqlPfpStory,String> {
}
