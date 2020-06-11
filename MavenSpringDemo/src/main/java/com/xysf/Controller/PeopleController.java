package com.xysf.Controller;

import com.xysf.Po.People;
import com.xysf.Service.PeopleService;
import net.sf.json.JSONArray;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
@RequestMapping( value = "/api")
@Controller
@ResponseBody
public class PeopleController {
    @Autowired
    private PeopleService peopleService;
    @RequestMapping("/selectPeople.action")
    public List<People> select(){
       List<People> list=peopleService.selectPeople();
       return list;
    }
}
