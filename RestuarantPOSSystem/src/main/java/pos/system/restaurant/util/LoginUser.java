
package pos.system.restaurant.util;

import pos.system.restaurant.model.UserAccount;
public class LoginUser {
    private static UserAccount userAccount;

    /**
     * @return the userAccount
     */
    public static UserAccount getUserAccount() {
        return userAccount;
    }

    /**
     * @param aUserAccount the userAccount to set
     */
    public static void setUserAccount(UserAccount aUserAccount) {
        userAccount = aUserAccount;
    }
}
