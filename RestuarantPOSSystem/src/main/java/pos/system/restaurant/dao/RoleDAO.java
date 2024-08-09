
package pos.system.restaurant.dao;


import pos.system.restaurant.model.Role;
import java.util.List;

public interface RoleDAO {
     public Long getMaxId();
     
//    add Role
    public void addRole(Role role);
    
//    update Role
    public void updateRole(Role role);
    
//    delete Role
    public void deleteRole(Role role);
    
//    list of Role
    public List<Role> selectRole();
    
    public void comboBoxRole();
}
