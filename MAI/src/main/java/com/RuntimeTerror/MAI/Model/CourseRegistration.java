package com.RuntimeTerror.MAI.Model;

import lombok.*;

import javax.persistence.*;
import javax.persistence.Entity;
import java.time.LocalDateTime;

@Entity
@Data
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class CourseRegistration {
    @Id
    Long id;

    @ManyToOne
    @JoinColumn(name = "student_id")
    AppUser student;

    @ManyToOne
    @JoinColumn(name = "course_id")
    Disciplines course;

    LocalDateTime registeredAt;

    int grade;

}
