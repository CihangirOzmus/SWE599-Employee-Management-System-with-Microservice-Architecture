package cigi.microservice.authservice.config.mongodb.changelogs;

import cigi.microservice.authservice.domain.AuthClientDetails;
import cigi.microservice.authservice.domain.User;
import cigi.microservice.authservice.enums.Authorities;
import com.github.mongobee.changeset.ChangeLog;
import com.github.mongobee.changeset.ChangeSet;

import org.springframework.data.mongodb.core.MongoTemplate;

import java.util.HashSet;
import java.util.Set;

@ChangeLog
public class InitialValuesChangeLog {

    @ChangeSet(order = "001", id = "insertBrowserClientDetails", author = "Cihangir Ozmus")
    public void insertBrowserClientDetails(MongoTemplate mongoTemplate) {
        AuthClientDetails browserClientDetails = new AuthClientDetails();
        browserClientDetails.setClientId("browser");
        browserClientDetails.setClientSecret("$2a$10$fWNTd3H.u7G/aNROVQSifebOkZ2xzU5nUPOCI2Ld42M8E25/ljJqK");
        browserClientDetails.setScopes("ui");
        browserClientDetails.setGrantTypes("refresh_token,password");

        mongoTemplate.save(browserClientDetails);
    }

    @ChangeSet(order = "002", id = "insertUserToTestAuthentication", author = "Cihangir Ozmus")
    public void insertUserToTestAuthentication(MongoTemplate mongoTemplate) {
        Set<Authorities> authorities = new HashSet<>();
        authorities.add(Authorities.ROLE_USER);

        User user = new User();
        user.setActivated(true);
        user.setAuthorities(authorities);
        user.setPassword("$2a$10$fWNTd3H.u7G/aNROVQSifebOkZ2xzU5nUPOCI2Ld42M8E25/ljJqK");
        user.setUsername("randomuser");

        mongoTemplate.save(user);
    }

    @ChangeSet(order = "003", id = "insertAccountServiceClientDetails", author = "Cihangir Ozmus")
    public void insertAccountServiceClientDetails(MongoTemplate mongoTemplate) {
        AuthClientDetails accountServiceClientDetails = new AuthClientDetails();
        accountServiceClientDetails.setClientId("account-service");
        accountServiceClientDetails.setClientSecret("$2a$10$fWNTd3H.u7G/aNROVQSifebOkZ2xzU5nUPOCI2Ld42M8E25/ljJqK");
        accountServiceClientDetails.setScopes("server");
        accountServiceClientDetails.setGrantTypes("refresh_token,client_credentials");

        mongoTemplate.save(accountServiceClientDetails);
    }

    @ChangeSet(order = "004", id = "insertEmployeeServiceClientDetails", author = "Cihangir Ozmus")
    public void insertEmployeeServiceClientDetails(MongoTemplate mongoTemplate) {
        AuthClientDetails employeeServiceClientDetails = new AuthClientDetails();
        employeeServiceClientDetails.setClientId("employee-service");
        employeeServiceClientDetails.setClientSecret("$2y$12$pd9/WLz/vCHow19DN3PhPe4Ob4VVaihByOHFGTodE/xznJ17pqI4m");
        employeeServiceClientDetails.setScopes("server");
        employeeServiceClientDetails.setGrantTypes("refresh_token,client_credentials");

        mongoTemplate.save(employeeServiceClientDetails);
    }

}
