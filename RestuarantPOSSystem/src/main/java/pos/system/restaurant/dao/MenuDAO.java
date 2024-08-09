
package pos.system.restaurant.dao;

import pos.system.restaurant.model.Menu;
import pos.system.restaurant.model.TodaysMenu;
import java.util.ArrayList;

public interface MenuDAO {

    public Long getMaxId();

//    add Menu
    public void addMenu(Menu menu);

//    update Menu
    public void updateMenu(Menu menu);

//    delete Menu
    public void deleteMenu(Menu menu);

//    list of Menu
    public ArrayList<Menu> selectMenu();

    public void comboBoxMenu();

    public Menu findPhotoByMenuId(Menu menu);

    public ArrayList<TodaysMenu> selectMenuPrice();

    public void updateMenuPrice(Menu menu);

}
