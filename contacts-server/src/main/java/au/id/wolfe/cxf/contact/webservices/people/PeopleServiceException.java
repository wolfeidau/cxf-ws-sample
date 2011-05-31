package au.id.wolfe.cxf.contact.webservices.people;

import javax.xml.ws.WebFault;

/**
 *
 */
@WebFault(name = "PeopleServiceError")
public class PeopleServiceException extends Exception{

    public PeopleServiceException() {
        super();
    }

    public PeopleServiceException(String message) {
        super(message);
    }

    public PeopleServiceException(String message, Throwable cause) {
        super(message, cause);
    }

    public PeopleServiceException(Throwable cause) {
        super(cause);
    }
}
