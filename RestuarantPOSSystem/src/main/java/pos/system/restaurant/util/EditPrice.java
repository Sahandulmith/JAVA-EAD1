
package pos.system.restaurant.util;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class EditPrice {

    private Long todaysMenuId;
    private Long menuId;
    private Float price;
    private String recipe;
    private String ingredients;
}
