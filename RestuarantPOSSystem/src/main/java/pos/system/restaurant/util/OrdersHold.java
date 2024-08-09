
package pos.system.restaurant.util;

import java.util.ArrayList;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class OrdersHold {


    private Integer id;
    private Integer qty;
    private String recipe;
    private String unitPrice;
    private String lineTotal;
    private String lineTotalUF;
    private String unitPriceUF;
    private static ArrayList<OrdersHold> ordersHold;
 

    public static ArrayList<OrdersHold> getOrdersHold() {
        return ordersHold;
    }

    public static void setOrdersHold(ArrayList<OrdersHold> aOrdersHold) {
        ordersHold = aOrdersHold;
    }


}
