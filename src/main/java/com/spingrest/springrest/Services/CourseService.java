package com.spingrest.springrest.Services;

import java.util.List;

import com.spingrest.springrest.Entities.Course;

public interface CourseService {
    public List<Course> getCourses();
    public Course getCourse(long courseId);
}
