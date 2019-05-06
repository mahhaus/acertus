package com.mahhaus.acertus.core.repository;

import com.mahhaus.acertus.core.model.ApplicationUser;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 * @author josias on 05/05/19
 */
public interface ApplicationUserRepository extends PagingAndSortingRepository<ApplicationUser, Long> {
    ApplicationUser findByUsername(String username);
}
