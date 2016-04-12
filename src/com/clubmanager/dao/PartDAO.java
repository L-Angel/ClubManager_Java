package com.clubmanager.dao;

import java.util.List;
import java.util.Set;
import org.hibernate.LockMode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.clubmanager.bean.Part;

/**
 * A data access object (DAO) providing persistence and search support for Part
 * entities. Transaction control of the save(), update() and delete() operations
 * can directly support Spring container-managed transactions or they can be
 * augmented to handle user-managed Spring transactions. Each of these methods
 * provides additional information for how to configure it for the desired type
 * of transaction control.
 * 
 * @see com.clubmanager.bean.Part
 * @author MyEclipse Persistence Tools
 */
public class PartDAO extends HibernateDaoSupport {
	private static final Logger log = LoggerFactory.getLogger(PartDAO.class);
	// property constants
	public static final String PARTNAME = "partname";

	protected void initDao() {
		// do nothing
	}

	public void save(Part transientInstance) {
		log.debug("saving Part instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(Part persistentInstance) {
		log.debug("deleting Part instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Part findById(java.lang.Integer id) {
		log.debug("getting Part instance with id: " + id);
		try {
			Part instance = (Part) getHibernateTemplate().get(
					"com.clubmanager.bean.Part", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Part instance) {
		log.debug("finding Part instance by example");
		try {
			List results = getHibernateTemplate().findByExample(instance);
			log.debug("find by example successful, result size: "
					+ results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List findByProperty(String propertyName, Object value) {
		log.debug("finding Part instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from Part as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByPartname(Object partname) {
		return findByProperty(PARTNAME, partname);
	}

	public List findAll() {
		log.debug("finding all Part instances");
		try {
			String queryString = "from Part";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public Part merge(Part detachedInstance) {
		log.debug("merging Part instance");
		try {
			Part result = (Part) getHibernateTemplate().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(Part instance) {
		log.debug("attaching dirty Part instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Part instance) {
		log.debug("attaching clean Part instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static PartDAO getFromApplicationContext(ApplicationContext ctx) {
		return (PartDAO) ctx.getBean("PartDAO");
	}
}