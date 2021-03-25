package org.test.project.repo;

import org.springframework.data.repository.CrudRepository;
import org.test.project.domain.StringOp;

public interface StringOpJPAData extends CrudRepository<StringOp,String> {
}
