package com.mde.univer.kcb.db.dao;
 

import java.util.List;
 


import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.mde.univer.kcb.db.vo.Timetable;
 
 
public class TimetableDAO {
 
    private SqlSessionFactory sqlSessionFactory = null;
 
    public TimetableDAO(SqlSessionFactory sqlSessionFactory){
    	this.sqlSessionFactory = sqlSessionFactory;
    }
 
    /**
     * Returns the list of all Timetable instances from the database.
     * @return the list of all Timetable instances from the database.
     */
    @SuppressWarnings("unchecked")
    public  List<Timetable> selectAll(){
    	List<Timetable> list = null;
        SqlSession session = sqlSessionFactory.openSession();
 
        try {
            list = session.selectList("Timetable.selectAll");
        } finally {
            session.close();
        }
        System.out.println("selectAll() --> "+list);
        return list;

    }
    /**
     * Select instance of Timetable from the database.
     * @param Timetable the instance to be persisted.
     */
   public Timetable selectById(int id){
       	Timetable timetable = null;
        SqlSession session = sqlSessionFactory.openSession();
        try {
        	timetable = session.selectOne("Timetable.selectById", id);
        } finally {
            session.close();
        }
        System.out.println("selectById("+id+") --> "+timetable);
        return timetable;
    } 
    /**
     * Insert an instance of Timetable into the database.
     * @param timetable the instance to be persisted.
     */
   public int insert(Timetable timetable){
	   int id = -1;
        SqlSession session = sqlSessionFactory.openSession();

        try {
            id = session.insert("Timetable.insert", timetable);
        } finally {
            session.commit();
            session.close();
        }
        System.out.println("insert("+timetable+")");
        return id;
    }
    /**
   * Update an instance of Timetable into the database.
   * @param timetable the instance to be persisted.
   */
  	public void update(Timetable timetable){
	   int id = -1;
      SqlSession session = sqlSessionFactory.openSession();

      try {
          id = session.update("Timetable.update", timetable);

      } finally {
          session.commit();
          session.close();
      }
      System.out.println("update("+timetable+") --> updated");
  }
 
    /**
     * Delete an instance of Timetable from the database.
     * @param id value of the instance to be deleted.
     */
    public void delete(int id){
 
        SqlSession session = sqlSessionFactory.openSession();
 
        try {
            session.delete("Timetable.delete", id);
        } finally {
            session.commit();
            session.close();
        }
        System.out.println("delete("+id+")");

    }
}