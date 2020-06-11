package com.xysf.Service;

import com.xysf.Po.People;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface PeopleService {
    //客户列表
    public List<People> selectPeople();
    //客户数
    public int selectPeopleCount(People people);
    public int addPeople(People people);
    public int updatePeople(People people);
    public int deletePeople(Integer id);
}
