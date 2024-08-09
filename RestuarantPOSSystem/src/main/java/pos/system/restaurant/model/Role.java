
package pos.system.restaurant.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class Role {

    private Long id;
    private String role;
    private String description;
    private Boolean deleted;

    public Role() {

    }

    public Role(String role) {
        this.role = role;
    }

    public Role(Long id, String role) {
        this.id = id;
        this.role = role;
    }
}
