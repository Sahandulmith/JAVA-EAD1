
package pos.system.restaurant.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class UserAccount {

    private Long id;

    private String firstname;
    private String surname;
    private String username;
    private String password;
    private Boolean active; 
    private byte[] photo;
    
    private Role role;

    public UserAccount() {

    }

}
