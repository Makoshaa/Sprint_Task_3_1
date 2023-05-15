package bitlab.course.techorda.controller;

import bitlab.course.techorda.db.StudentList;

import java.awt.image.AreaAveragingScaleFilter;
import java.util.ArrayList;

public class DBManager {

    private static final ArrayList<StudentList> studentLists=new ArrayList<>();
    private static Long id=7L;


    static {
        studentLists.add(new StudentList(1L,"Ilyas","Zhuanyshev",88,"B"));
        studentLists.add(new StudentList(2L,"Serik","Erikov",91,"A"));
        studentLists.add(new StudentList(3L,"Erik","Serikov",65,"D"));
        studentLists.add(new StudentList(4L,"Nurzhan","Bolatov",48,"C"));
        studentLists.add(new StudentList(5L,"Patrick","ZuckerBerg",100,"A"));
        studentLists.add(new StudentList(6L,"Sabina","Assetova",33,"F"));
        studentLists.add(new StudentList(7L,"Madina","Adletova",77,"B"));

    }

    public static ArrayList<StudentList> getStudentLists (){
        return studentLists;
    }

    public static void addStudent(StudentList studentList) {
        studentList.setId(id);
        id++;
        studentLists.add(studentList);
    }

    public static String getMarkByExam(int exam) {
        if (exam >= 90 && exam <=100) {
            return "A";
        } else if (exam >= 75 && exam <=89) {
            return "B";
        } else if (exam >= 60 && exam<=74) {
            return "C";
        } else if (exam >= 50 && exam <=59) {
            return "D";
        }
        else {
            return "F";
        }
    }
}
