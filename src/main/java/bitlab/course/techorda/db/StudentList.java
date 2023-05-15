package bitlab.course.techorda.db;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor


public class StudentList {
    private Long id;
    private String name;
    private String surname;
    private int exam;
    private String mark;
}


