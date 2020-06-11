package com.xysf.Service.impl;

import com.xysf.Dao.PeopleDao;
import com.xysf.Po.People;
import com.xysf.Service.PeopleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
@Transactional
public class PeopleServiceimp implements PeopleService {
    @Autowired
    private PeopleDao peopleDao;
    @Override
    public List<People> selectPeople() {
       List<People> list= peopleDao.selectPeople();
       return list;
    }

    @Override
    public int selectPeopleCount(People people) {
        return 1;
    }

    @Override
    public int addPeople(People people) {
        return 0;
    }

    @Override
    public int updatePeople(People people) {
        return 0;
    }

    @Override
    public int deletePeople(Integer id) {
        return 0;
    }
}
