package com.mde.univer.kcb.db.dao;
 

import java.util.List;
 


import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.mde.univer.kcb.db.vo.Subject;
 
 
public class SubjectDAO {
 
    private SqlSessionFactory sqlSessionFactory = null;
 
    public SubjectDAO(SqlSessionFactory sqlSessionFactory){
    	this.sqlSessionFactory = sqlSessionFactory;
    }
 
    /**
     * Returns the list of all Subject instances from the database.
     * @return the list of all Subject instances from the database.
     */
    @SuppressWarnings("unchecked")
    public  List<Subject> selectAll(){
    	List<Subject> list = null;
        SqlSession session = sqlSessionFactory.openSession();
 
        try {
            list = session.selectList("Subject.selectAll");
        } finally {
            session.close();
        }
        System.out.println("selectAll() --> "+list);
        return list;

    }
    /**
     * Select instance of Subject from the database.
     * @param Subject the instance to be persisted.
     */
   public Subject selectById(int id){
       	Subject subject = null;
        SqlSession session = sqlSessionFactory.openSession();
        try {
        	subject = session.selectOne("Subject.selectById", id);
        } finally {
            session.close();
        }
        System.out.println("selectById("+id+") --> "+subject);
        return subject;
    } 
    /**
     * Insert an instance of Subject into the database.
     * @param subject the instance to be persisted.
     */
   public int insert(Subject subject){
	   int id = -1;
        SqlSession session = sqlSessionFactory.openSession();

        try {
            id = session.insert("Subject.insert", subject);
        } finally {
            session.commit();
            session.close();
        }
        System.out.println("insert("+subject+") --> "+subject.getId());
        return id;
    }
    /**
   * Update an instance of Subject into the database.
   * @param subject the instance to be persisted.
   */
  	public void update(Subject subject){
	   int id = -1;
      SqlSession session = sqlSessionFactory.openSession();

      try {
          id = session.update("Subject.update", subject);

      } finally {
          session.commit();
          session.close();
      }
      System.out.println("update("+subject+") --> updated");
  }
 
    /**
     * Delete an instance of Subject from the database.
     * @param id value of the instance to be deleted.
     */
    public void delete(int id){
 
        SqlSession session = sqlSessionFactory.openSession();
 
        try {
            session.delete("Subject.delete", id);
        } finally {
            session.commit();
            session.close();
        }
        System.out.println("delete("+id+")");

    }
}