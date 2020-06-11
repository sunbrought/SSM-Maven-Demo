package com.xysf.Dao;

import com.xysf.Po.People;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface PeopleDao {
    //客户列表
    public List<People> selectPeople();
    //客户数
    public int selectPeopleCount(People people);
    public int addPeople(People people);
    public int updatePeople(People people);
    public int deletePeople(Integer id);
}
