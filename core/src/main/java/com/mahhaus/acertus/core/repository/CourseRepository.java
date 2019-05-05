package com.mahhaus.acertus.core.repository;

import com.mahhaus.acertus.core.model.Course;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 * @author josias on 05/05/19
 */
public interface CourseRepository extends PagingAndSortingRepository<Course, Long> {
}
