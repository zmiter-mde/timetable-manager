package com.mde.univer.kcb.db.dao;
 

import java.util.List;
 


import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.mde.univer.kcb.db.vo.Tutor;
 
 
public class TutorDAO {
 
    private SqlSessionFactory sqlSessionFactory = null;
 
    public TutorDAO(SqlSessionFactory sqlSessionFactory){
    	this.sqlSessionFactory = sqlSessionFactory;
    }
 
    /**
     * Returns the list of all Tutor instances from the database.
     * @return the list of all Tutor instances from the database.
     */
    @SuppressWarnings("unchecked")
    public  List<Tutor> selectAll(){
    	List<Tutor> list = null;
        SqlSession session = sqlSessionFactory.openSession();
 
        try {
            list = session.selectList("Tutor.selectAll");
        } finally {
            session.close();
        }
        System.out.println("selectAll() --> "+list);
        return list;

    }
    /**
     * Select instance of Tutor from the database.
     * @param Tutor the instance to be persisted.
     */
   public Tutor selectById(int id){
       	Tutor tutor = null;
        SqlSession session = sqlSessionFactory.openSession();
        try {
        	tutor = session.selectOne("Tutor.selectById", id);
        } finally {
            session.close();
        }
        System.out.println("selectById("+id+") --> "+tutor);
        return tutor;
    } 
    /**
     * Insert an instance of Tutor into the database.
     * @param tutor the instance to be persisted.
     */
   public int insert(Tutor tutor){
	   int id = -1;
        SqlSession session = sqlSessionFactory.openSession();

        try {
            id = session.insert("Tutor.insert", tutor);
        } finally {
            session.commit();
            session.close();
        }
        System.out.println("insert("+tutor+") --> "+tutor.getId());
        return id;
    }
    /**
   * Update an instance of Tutor into the database.
   * @param tutor the instance to be persisted.
   */
  	public void update(Tutor tutor){
	   int id = -1;
      SqlSession session = sqlSessionFactory.openSession();

      try {
          id = session.update("Tutor.update", tutor);

      } finally {
          session.commit();
          session.close();
      }
      System.out.println("update("+tutor+") --> updated");
  }
 
    /**
     * Delete an instance of Tutor from the database.
     * @param id value of the instance to be deleted.
     */
    public void delete(int id){
 
        SqlSession session = sqlSessionFactory.openSession();
 
        try {
            session.delete("Tutor.delete", id);
        } finally {
            session.commit();
            session.close();
        }
        System.out.println("delete("+id+")");

    }
}