
package pos.system.restaurant.dao;

import pos.system.restaurant.model.Invoice;
import java.util.ArrayList;

public interface InvoiceDAO {

    public Long getMaxId();

//    add Invoice
    public void addInvoice(Invoice invoice);

//    update Invoice
    public void updateInvoice(Invoice invoice);

//    delete Invoice
    public void deleteInvoice(Invoice invoice);

//    list of Invoice
    public ArrayList<Invoice> selectInvoice();

    public void comboBoxInvoice();

    public ArrayList<pos.system.restaurant.model.Invoice> getSalesUser(Long userId, Long startId, Long endId);

    public void invoiceDateTimeComboBox();
    
    public void invoiceDateTimeComboBox(Long userId) ;

}
