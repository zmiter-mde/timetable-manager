package com.mde.univer.kcb.db.dao;
 

import java.util.List;
 


import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.mde.univer.kcb.db.vo.Lesson;
 
 
public class LessonDAO {
 
    private SqlSessionFactory sqlSessionFactory = null;
 
    public LessonDAO(SqlSessionFactory sqlSessionFactory){
    	this.sqlSessionFactory = sqlSessionFactory;
    }
 
    /**
     * Returns the list of all Lesson instances from the database.
     * @return the list of all Lesson instances from the database.
     */
    @SuppressWarnings("unchecked")
    public  List<Lesson> selectAll(){
    	List<Lesson> list = null;
        SqlSession session = sqlSessionFactory.openSession();
 
        try {
            list = session.selectList("Lesson.selectAll");
        } finally {
            session.close();
        }
        System.out.println("selectAll() --> "+list);
        return list;

    }
    /**
     * Select instance of Lesson from the database.
     * @param Lesson the instance to be persisted.
     */
   public Lesson selectById(int id){
       	Lesson lesson = null;
        SqlSession session = sqlSessionFactory.openSession();
        try {
        	lesson = session.selectOne("Lesson.selectById", id);
        } finally {
            session.close();
        }
        System.out.println("selectById("+id+") --> "+lesson);
        return lesson;
    } 
    /**
     * Insert an instance of Lesson into the database.
     * @param lesson the instance to be persisted.
     */
   public int insert(Lesson lesson){
	   int id = -1;
        SqlSession session = sqlSessionFactory.openSession();

        try {
            id = session.insert("Lesson.insert", lesson);
        } finally {
            session.commit();
            session.close();
        }
        System.out.println("insert("+lesson+")");
        return id;
    }
    /**
   * Update an instance of Lesson into the database.
   * @param lesson the instance to be persisted.
   */
  	public void update(Lesson lesson){
	   int id = -1;
      SqlSession session = sqlSessionFactory.openSession();

      try {
          id = session.update("Lesson.update", lesson);

      } finally {
          session.commit();
          session.close();
      }
      System.out.println("update("+lesson+") --> updated with id = " + id);
  }
 
    /**
     * Delete an instance of Lesson from the database.
     * @param id value of the instance to be deleted.
     */
    public void delete(int id){
 
        SqlSession session = sqlSessionFactory.openSession();
 
        try {
            session.delete("Lesson.delete", id);
        } finally {
            session.commit();
            session.close();
        }
        System.out.println("delete("+id+")");

    }
}