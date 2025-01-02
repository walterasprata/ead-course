package com.ead.course.services.impl;

import com.ead.course.repositories.LessonRepository;
import org.springframework.stereotype.Service;

@Service
public class LessonServiceImpl {
    final LessonRepository lessonRepository;

    public LessonServiceImpl(LessonRepository lessonRepository) {
        this.lessonRepository = lessonRepository;
    }
}
