
package pos.system.restaurant.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class TodaysMenu {

    private Long id;
    private Menu menu;
    private Float price;
    private String createdAt;
    private Boolean deleted;

}
