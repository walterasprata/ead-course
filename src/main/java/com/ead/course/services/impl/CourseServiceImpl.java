package com.ead.course.services.impl;

import com.ead.course.repositories.CourseRepository;
import org.springframework.stereotype.Service;

@Service
public class CourseServiceImpl {
    final CourseRepository courseRepository;

    public CourseServiceImpl(CourseRepository courseRepository) {
        this.courseRepository = courseRepository;
    }
}
