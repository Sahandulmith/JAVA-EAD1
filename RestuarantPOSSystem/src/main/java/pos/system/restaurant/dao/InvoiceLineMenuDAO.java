package pos.system.restaurant.dao;

import pos.system.restaurant.model.Invoice;
import pos.system.restaurant.model.InvoiceLineMenu;
import java.util.ArrayList;

public interface InvoiceLineMenuDAO {

    public Long getMaxId();

//    add InvoiceLineMenu
    public void addInvoiceLineMenu(InvoiceLineMenu invoiceLineMenu);

//    update InvoiceLineMenu
    public void updateInvoiceLineMenu(InvoiceLineMenu invoiceLineMenu);

//    delete InvoiceLineMenu
    public void deleteInvoiceLineMenu(InvoiceLineMenu invoiceLineMenu);

//    list of InvoiceLineMenu
    public ArrayList<InvoiceLineMenu> selectInvoiceLineMenu();

    public void comboBoxInvoiceLineMenu();

    public ArrayList<InvoiceLineMenu> selectInvoiceLineMenuByInvoiceId(Long id);

}
