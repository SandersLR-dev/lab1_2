package pl.com.bottega.ecommerce.sales.domain.invoicing;

import com.sun.security.ntlm.Client;
import pl.com.bottega.ecommerce.canonicalmodel.publishedlanguage.ClientData;
import pl.com.bottega.ecommerce.canonicalmodel.publishedlanguage.Id;

public class InvoiceNew {

    public Invoice create(Id id, ClientData clientData)
    {
        return new Invoice(id,clientData);
    }
}
