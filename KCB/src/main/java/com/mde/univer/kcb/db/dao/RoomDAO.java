package com.mde.univer.kcb.db.dao;
 

import java.util.List;
 


import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.mde.univer.kcb.db.vo.Room;
 
 
public class RoomDAO {
 
    private SqlSessionFactory sqlSessionFactory = null;
 
    public RoomDAO(SqlSessionFactory sqlSessionFactory){
    	this.sqlSessionFactory = sqlSessionFactory;
    }
 
    /**
     * Returns the list of all Room instances from the database.
     * @return the list of all Room instances from the database.
     */
    @SuppressWarnings("unchecked")
    public  List<Room> selectAll(){
    	List<Room> list = null;
        SqlSession session = sqlSessionFactory.openSession();
 
        try {
            list = session.selectList("Room.selectAll");
        } finally {
            session.close();
        }
        System.out.println("selectAll() --> "+list);
        return list;

    }
    /**
     * Select instance of Room from the database.
     * @param Room the instance to be persisted.
     */
   public Room selectById(int id){
       	Room room = null;
        SqlSession session = sqlSessionFactory.openSession();
        try {
        	room = session.selectOne("Room.selectById", id);
        } finally {
            session.close();
        }
        System.out.println("selectById("+id+") --> "+room);
        return room;
    } 
    /**
     * Insert an instance of Room into the database.
     * @param room the instance to be persisted.
     */
   public int insert(Room room){
	   int id = -1;
        SqlSession session = sqlSessionFactory.openSession();

        try {
            id = session.insert("Room.insert", room);
        } finally {
            session.commit();
            session.close();
        }
        System.out.println("insert("+room+") --> "+room.getId());
        return id;
    }
    /**
   * Update an instance of Room into the database.
   * @param room the instance to be persisted.
   */
  	public void update(Room room){
	   int id = -1;
      SqlSession session = sqlSessionFactory.openSession();

      try {
          id = session.update("Room.update", room);

      } finally {
          session.commit();
          session.close();
      }
      System.out.println("update("+room+") --> updated");
  }
 
    /**
     * Delete an instance of Room from the database.
     * @param id value of the instance to be deleted.
     */
    public void delete(int id){
 
        SqlSession session = sqlSessionFactory.openSession();
 
        try {
            session.delete("Room.delete", id);
        } finally {
            session.commit();
            session.close();
        }
        System.out.println("delete("+id+")");

    }
}