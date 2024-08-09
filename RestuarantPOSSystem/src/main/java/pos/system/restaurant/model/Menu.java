
package pos.system.restaurant.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class Menu {

    private Long id;
    private String recipe;
    private String ingredients;
    private Float price;
    private byte[] photo;
    private Category category;
    private Boolean deleted;

    public Menu() {

    }

}
