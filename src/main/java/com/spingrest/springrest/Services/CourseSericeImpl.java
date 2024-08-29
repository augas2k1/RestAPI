package com.spingrest.springrest.Services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.spingrest.springrest.Entities.Course;
@Service
public class CourseSericeImpl implements CourseService {
    List<Course> list;
    

    public CourseSericeImpl() {
       list = new ArrayList<>();
       list.add(new Course(145,"Java Core Course", "This is base Course"));
       list.add(new Course(4343,"Spring Boot Course", "This is for creating API Course"));
    }


    @Override
    public List<Course> getCourses() {
        // TODO Auto-generated method stub
        return list;
    }


    @Override
    public Course getCourse(long courseId) {
        Course c = null;

        for(Course course:list){
            if(course.getId()==courseId){
                c = course;
                break;
            }
        }
        return c;
    }

}
