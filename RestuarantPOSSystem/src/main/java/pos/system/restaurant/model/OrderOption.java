
package pos.system.restaurant.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


@Setter
@Getter
@ToString
public class OrderOption {
    private Long id;
    private String orderOption;
    private String description;
}
