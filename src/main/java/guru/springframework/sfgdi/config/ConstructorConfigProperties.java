package guru.springframework.sfgdi.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.bind.ConstructorBinding;

/**
 * Created by r.edward on {12/08/2023}
 */
//@ConstructorBinding
@ConfigurationProperties("guru") /*this will require to be marked as component with EnableComfigProperties*/
public class ConstructorConfigProperties {
    //final to not allow modification and only getters
    private final String username;
    private final String password;
    private final String jdbcUrl;
    @ConstructorBinding
    public ConstructorConfigProperties(String username, String password, String jdbcUrl) {
        this.username = username;
        this.password = password;
        this.jdbcUrl = jdbcUrl;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getJdbcUrl() {
        return jdbcUrl;
    }
}
