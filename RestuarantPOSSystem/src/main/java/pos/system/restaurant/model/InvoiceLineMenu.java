package pos.system.restaurant.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Getter
@Setter
public class InvoiceLineMenu {

    private Long id;

    private Integer qty;
    //Data integration
    private Invoice invoice;
    private TodaysMenu todaysMenu;
}
