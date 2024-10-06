package org.example.everything.db.jpa;

import jakarta.persistence.EntityManagerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.transaction.PlatformTransactionManager;

import javax.sql.DataSource;

/**
 * @author lucky6757
 * @since 2024/10/06
 * @apiNote JPA 카페24 마리아 DB 설정 클래스
 */
public class JpaMariaConfig {

    // 추가적으로 DB 세팅 확인해서 추가
    @Bean
    LocalContainerEntityManagerFactoryBean entityManagerFactory(DataSource dataSource) {
        LocalContainerEntityManagerFactoryBean emFac = new LocalContainerEntityManagerFactoryBean();
        emFac.setDataSource(dataSource);
        emFac.setPackagesToScan("org.example.everything.db.jpa.entity");

        return emFac;
    }


    @Bean
    PlatformTransactionManager platformTransactionManager(EntityManagerFactory entityManagerFactory) {
        return new JpaTransactionManager(entityManagerFactory);
    }

}
