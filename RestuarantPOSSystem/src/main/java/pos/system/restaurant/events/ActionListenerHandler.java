
package pos.system.restaurant.events;

import pos.system.restaurant.guii.JFrameHome;
import pos.system.restaurant.model.Category;
import pos.system.restaurant.model.Menu;
import pos.system.restaurant.model.TodaysMenu;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.LinkedList;
import javax.swing.JButton;

public class ActionListenerHandler implements ActionListener {

    private ArrayList<Category> categoryList;
    private LinkedList<Menu> menuList;
    private LinkedList<TodaysMenu> motdList;
    private JButton jButton;
    private ArrayList<JButton> arrayButtons = new ArrayList<>();
    private JFrameHome jFrameCafSys;

    public ActionListenerHandler() {
    }

    public ActionListenerHandler(ArrayList<Category> categoryList,JFrameHome jFrameCafSys) {
        this.categoryList = categoryList;
        this.jFrameCafSys =jFrameCafSys;
    }

    public ActionListenerHandler(LinkedList<Menu> menuList,JFrameHome jFrameCafSys) {
        this.menuList = menuList;
        this.jFrameCafSys =jFrameCafSys;
    }

    public ActionListenerHandler(JButton jButton, LinkedList<TodaysMenu> motdList,JFrameHome jFrameCafSys) {
        this.setjButton(jButton);
        this.motdList = motdList;
        this.jFrameCafSys =jFrameCafSys;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //Category Event
        String command = e.getActionCommand();
        if (getCategoryList() != null) {
            for (Category c : getCategoryList()) {
                if (command.equals(c.getCategory())) {
//                    JFrameHome p = new JFrameHome(c,jFrameCafSys);
                    jFrameCafSys.selectTodaysMenu(c.getId());
                    jFrameCafSys.revalidate();
                }
            }
        }
        //Today Menu Events
        JButton jButton = new JButton();
        if (e.getSource() == getjButton()) {
            for (TodaysMenu motd : getMotdList()) {
                TodaysMenu m = new TodaysMenu();
                m.setId(Long.parseLong(getjButton().getName())); 
                if (motd.getId() == Integer.parseInt(getjButton().getName())) {
                     JFrameHome p = new JFrameHome(motd);
                     
                }
            }
        }
    }

    /**
     * @return the categoryList
     */
    public ArrayList<Category> getCategoryList() {
        return categoryList;
    }

    /**
     * @param categoryList the categoryList to set
     */
    public void setCategoryList(ArrayList<Category> categoryList) {
        this.categoryList = categoryList;
    }

    /**
     * @return the menuList
     */
    public LinkedList<Menu> getMenuList() {
        return menuList;
    }

    /**
     * @param menuList the menuList to set
     */
    public void setMenuList(LinkedList<Menu> menuList) {
        this.menuList = menuList;
    }

    /**
     * @return the jButton
     */
    public JButton getjButton() {
        return jButton;
    }

    /**
     * @param jButton the jButton to set
     */
    public void setjButton(JButton jButton) {
        this.jButton = jButton;
    }

    /**
     * @return the arrayButtons
     */
    public ArrayList<JButton> getArrayButtons() {
        return arrayButtons;
    }

    /**
     * @param arrayButtons the arrayButtons to set
     */
    public void setArrayButtons(ArrayList<JButton> arrayButtons) {
        this.arrayButtons = arrayButtons;
    }

    /**
     * @return the motdList
     */
    public LinkedList<TodaysMenu> getMotdList() {
        return motdList;
    }

    /**
     * @param motdList the motdList to set
     */
    public void setMotdList(LinkedList<TodaysMenu> motdList) {
        this.motdList = motdList;
    }
}
