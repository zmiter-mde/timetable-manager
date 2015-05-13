package com.mde.univer.kcb.db.dao;
 

import java.util.List;
 


import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.mde.univer.kcb.db.vo.Lecture;
 
 
public class LectureDAO {
 
    private SqlSessionFactory sqlSessionFactory = null;
 
    public LectureDAO(SqlSessionFactory sqlSessionFactory){
    	this.sqlSessionFactory = sqlSessionFactory;
    }
 
    /**
     * Returns the list of all Lecture instances from the database.
     * @return the list of all Lecture instances from the database.
     */
    @SuppressWarnings("unchecked")
    public  List<Lecture> selectAll(){
    	List<Lecture> list = null;
        SqlSession session = sqlSessionFactory.openSession();
 
        try {
            list = session.selectList("Lecture.selectAll");
        } finally {
            session.close();
        }
        System.out.println("selectAll() --> "+list);
        return list;

    }
    /**
     * Select instance of Lecture from the database.
     * @param Lecture the instance to be persisted.
     */
   public Lecture selectById(int id){
       	Lecture lecture = null;
        SqlSession session = sqlSessionFactory.openSession();
        try {
        	lecture = session.selectOne("Lecture.selectById", id);
        } finally {
            session.close();
        }
        System.out.println("selectById("+id+") --> "+lecture);
        return lecture;
    } 
    /**
     * Insert an instance of Lecture into the database.
     * @param lecture the instance to be persisted.
     */
   public int insert(Lecture lecture){
	   int id = -1;
        SqlSession session = sqlSessionFactory.openSession();

        try {
            id = session.insert("Lecture.insert", lecture);
        } finally {
            session.commit();
            session.close();
        }
        System.out.println("insert("+lecture+") --> "+lecture.getId());
        return id;
    }
    /**
   * Update an instance of Lecture into the database.
   * @param lecture the instance to be persisted.
   */
  	public void update(Lecture lecture){
	   int id = -1;
      SqlSession session = sqlSessionFactory.openSession();

      try {
          id = session.update("Lecture.update", lecture);

      } finally {
          session.commit();
          session.close();
      }
      System.out.println("update("+lecture+") --> updated");
  }
 
    /**
     * Delete an instance of Lecture from the database.
     * @param id value of the instance to be deleted.
     */
    public void delete(int id){
 
        SqlSession session = sqlSessionFactory.openSession();
 
        try {
            session.delete("Lecture.delete", id);
        } finally {
            session.commit();
            session.close();
        }
        System.out.println("delete("+id+")");

    }
}