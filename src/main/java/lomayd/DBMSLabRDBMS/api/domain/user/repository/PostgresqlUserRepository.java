package lomayd.DBMSLabRDBMS.api.domain.user.repository;

import lomayd.DBMSLabRDBMS.api.domain.user.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostgresqlUserRepository extends JpaRepository<User, String> {
}
