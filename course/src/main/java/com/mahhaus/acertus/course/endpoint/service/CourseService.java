package com.mahhaus.acertus.course.endpoint.service;

import com.mahhaus.acertus.core.model.Course;
import com.mahhaus.acertus.core.repository.CourseRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

/**
 * @author josias on 05/05/19
 */
@Service
@Slf4j
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class CourseService {
    private final CourseRepository courseRepository;

    public Iterable<Course> list(Pageable pageable) {
        log.info("Listen all courses");
        return courseRepository.findAll(pageable);
    }
}
