package com.configuration;

import java.util.Properties;

import javax.sql.DataSource;

import org.apache.commons.dbcp.BasicDataSource;
import org.apache.log4j.Logger;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.dao.annotation.PersistenceExceptionTranslationPostProcessor;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.orm.hibernate4.HibernateTransactionManager;
import org.springframework.orm.hibernate4.LocalSessionFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.bo.Aeroport;
import com.bo.Client;
import com.bo.CompagnieAerienne;
import com.bo.DateVoyage;
import com.bo.Reservation;
import com.bo.Vol;

@Configuration
@ComponentScan(basePackages = { "com.services", "com.dao", "com.genericdao", "com.configuration"  })
@EnableTransactionManagement
public class AppConfig {

	private static final String BD_NAME = "gestion_vol";
	private static final String USER_NAME_BD = "root";
	private static final String USER_PASSWRD_BD = "Sanjojinkin0-0";

	private static final Logger LOGGER = Logger.getLogger(AppConfig.class);

	public AppConfig() {
		
		LOGGER.debug(" configuration init...");
	}

	@Autowired
	SessionFactory sessionFactory;

	@Bean
	@Autowired
	public HibernateTemplate hibernateTemplate(final SessionFactory sessionFactory) {
		HibernateTemplate hibernateTemplate = new HibernateTemplate();
		hibernateTemplate.setSessionFactory(sessionFactory);

		if (hibernateTemplate != null) {
			LOGGER.debug(" HibernateTemplate created ...");
		}

		return hibernateTemplate;
	}

	@Bean
	public LocalSessionFactoryBean sessionFactory() {

		final LocalSessionFactoryBean sessionFactory = new LocalSessionFactoryBean();
		sessionFactory.setDataSource(getDataSource());
		sessionFactory.setHibernateProperties(hibernateProperties());

		sessionFactory.setAnnotatedClasses(Aeroport.class, Client.class, CompagnieAerienne.class, DateVoyage.class,
				Reservation.class, Vol.class);

		// méthode à tester setAnnotatedPackages("com.bo");

		if (sessionFactory != null) {
			LOGGER.debug(" sessionFactory created ...");
		}
		return sessionFactory;
	}

	final Properties hibernateProperties() {

		final Properties hibernateProperties = new Properties();

		hibernateProperties.setProperty("hibernate.hbm2ddl.auto", "update");
		hibernateProperties.setProperty("hibernate.dialect", "org.hibernate.dialect.MySQLDialect");
		hibernateProperties.setProperty("hibernate.show_sql", "true");

		return hibernateProperties;
	}

	@Bean
	public DataSource getDataSource() {
		BasicDataSource dataSource = new BasicDataSource();
		dataSource.setDriverClassName("com.mysql.jdbc.Driver");
		dataSource.setUrl("jdbc:mysql://localhost:3306/" + BD_NAME);

		dataSource.setUsername(USER_NAME_BD);
		dataSource.setPassword(USER_PASSWRD_BD);
		return dataSource;
	}

	@Bean
	public PersistenceExceptionTranslationPostProcessor exceptionTranslation() {
		return new PersistenceExceptionTranslationPostProcessor();
	}

	@Bean
	@Autowired
	public HibernateTransactionManager transactionManager(final SessionFactory sessionFactory) {
		final HibernateTransactionManager txManager = new HibernateTransactionManager();
		txManager.setSessionFactory(sessionFactory);

		if (txManager != null) {
			LOGGER.debug(" Hibernate Transaction Manager created ...");

		}

		return txManager;

	}
}