
package pos.system.restaurant.dao;

import pos.system.restaurant.model.UserAccount;
import java.util.List;

public interface UserAccountDAO {

    public Long getMaxId();

//    add User
    public void addUserAccount(UserAccount userAccount);

//    update User
    public void updateUserAccount(UserAccount userAccount);

//    delete User
    public void deleteUserAccount(UserAccount userAccount);

//    list of the User
    public List<UserAccount> selectUserAccount();

    public UserAccount loginUserAccount(UserAccount userAccount);

    public Boolean changePassword(UserAccount userAccount);

    public UserAccount findPhotoByUserAccountId(UserAccount userAccount);

    public void comboBoxUserAccount();
}
