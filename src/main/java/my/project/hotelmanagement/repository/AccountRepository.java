package my.project.hotelmanagement.repository;

import my.project.hotelmanagement.entity.AccountEntity;
import my.project.hotelmanagement.entity.RoleEntity;
import org.springframework.data.repository.CrudRepository;

public interface AccountRepository  extends CrudRepository<AccountEntity,Integer> {
}
