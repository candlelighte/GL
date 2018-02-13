
package com.dao.impl;

import java.sql.Date;
import java.util.List;

import org.hibernate.Session;
import org.springframework.stereotype.Service;

import com.bo.Vol;
import com.dao.VolDao;
import com.genericdao.impl.NativeHibernateGenericDAOImpl;

@Service("volDaoImpl")
public class VolDaoImpl extends NativeHibernateGenericDAOImpl<Vol, Long> implements VolDao {

	public VolDaoImpl() {
		super(Vol.class);

	}

	@Override
	public List<Vol> getVolsInDate(Date dateVoyageAllee, Date dateVoyageRetour) {

		Session s = getSession();

		 s.beginTransaction();

		System.out.println(dateVoyageAllee);
		System.out.println(dateVoyageRetour);

		String query = "from Vol where dateTimeAlle >= :dateAlle and dateTimeRetour <= :dateRetour ";
		System.out.println( s.createQuery(query)
				.setDate("dateAlle", dateVoyageAllee)
				.setDate("dateRetour",dateVoyageRetour).list().toString() );

		// Criteria criteria = s.createCriteria(Vol.class, "Vol")
		// .add(Restrictions.lt("dateTimeRetour", dateVoyageRetour))
		// .add(Restrictions.gt("dateTimeAlle", dateVoyageAllee));
		//
		// criteria.list();

		s.getTransaction().commit();
		return null;
	}

}
