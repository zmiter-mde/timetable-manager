package com.mde.univer.kcb.db.dao;
 

import java.util.List;
 


import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.mde.univer.kcb.db.vo.StudentGroup;
 
 
public class StudentGroupDAO {
 
    private SqlSessionFactory sqlSessionFactory = null;
 
    public StudentGroupDAO(SqlSessionFactory sqlSessionFactory){
    	this.sqlSessionFactory = sqlSessionFactory;
    }
 
    /**
     * Returns the list of all StudentGroup instances from the database.
     * @return the list of all StudentGroup instances from the database.
     */
    @SuppressWarnings("unchecked")
    public  List<StudentGroup> selectAll(){
    	List<StudentGroup> list = null;
        SqlSession session = sqlSessionFactory.openSession();
 
        try {
            list = session.selectList("StudentGroup.selectAll");
        } finally {
            session.close();
        }
        System.out.println("selectAll() --> "+list);
        return list;

    }
    /**
     * Select instance of StudentGroup from the database.
     * @param StudentGroup the instance to be persisted.
     */
   public StudentGroup selectById(int id){
       	StudentGroup studentGroup = null;
        SqlSession session = sqlSessionFactory.openSession();
        try {
        	studentGroup = session.selectOne("StudentGroup.selectById", id);
        } finally {
            session.close();
        }
        System.out.println("selectById("+id+") --> "+studentGroup);
        return studentGroup;
    } 
    /**
     * Insert an instance of StudentGroup into the database.
     * @param studentGroup the instance to be persisted.
     */
   public int insert(StudentGroup studentGroup){
	   int id = -1;
        SqlSession session = sqlSessionFactory.openSession();

        try {
            id = session.insert("StudentGroup.insert", studentGroup);
        } finally {
            session.commit();
            session.close();
        }
        System.out.println("insert("+studentGroup+") --> "+studentGroup.getId());
        return id;
    }
    /**
   * Update an instance of StudentGroup into the database.
   * @param studentGroup the instance to be persisted.
   */
  	public void update(StudentGroup studentGroup){
	   int id = -1;
      SqlSession session = sqlSessionFactory.openSession();

      try {
          id = session.update("StudentGroup.update", studentGroup);

      } finally {
          session.commit();
          session.close();
      }
      System.out.println("update("+studentGroup+") --> updated");
  }
 
    /**
     * Delete an instance of StudentGroup from the database.
     * @param id value of the instance to be deleted.
     */
    public void delete(int id){
 
        SqlSession session = sqlSessionFactory.openSession();
 
        try {
            session.delete("StudentGroup.delete", id);
        } finally {
            session.commit();
            session.close();
        }
        System.out.println("delete("+id+")");

    }
}