package pos.system.restaurant.model;

import java.util.Date;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class Invoice {

    private Long id;
    private Date createdAt;
    private Float customerCash;
    private Integer noOfOrders;
    //Data integration
    private Float total;
    private Integer tableNo;
    private OrderOption orderOption;
    private UserAccount userAccount;
}
