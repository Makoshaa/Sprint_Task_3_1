package bitlab.course.techorda.controller;


import bitlab.course.techorda.db.StudentList;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;

@Controller
public class HomeController {

    @GetMapping(value="/")
        public String indexPage(Model model) {
        ArrayList<StudentList> students = DBManager.getStudentLists();
        for (StudentList student : students) {
            int exam = student.getExam();
            String mark = DBManager.getMarkByExam(exam);
            student.setMark(mark);
        }
        model.addAttribute("spisoktar", students);
        return "index";
    }

    @PostMapping (value="/add-student")
        public String addStudent (StudentList studentList){
        DBManager.addStudent(studentList);
        return "redirect:/";
        }


    @GetMapping (value="add-student")
    public String addStudentPage (Model model){
        return "addstudent";
        }

}
