package au.id.wolfe.cxf.contact.webservices.people.api;

import au.id.wolfe.cxf.contact.webservices.people.PeopleServiceException;

import javax.jws.WebMethod;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

import static au.id.wolfe.cxf.contact.webservices.util.WebServiceConstants.PEOPLE_SERVICE_NAMESPACE;

/**
 *
 */
@WebService(serviceName = "peopleService", targetNamespace = PEOPLE_SERVICE_NAMESPACE)
@SOAPBinding(style = SOAPBinding.Style.DOCUMENT, use = SOAPBinding.Use.LITERAL, parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface PeopleWebService {

    @WebMethod
    RegisterNewPersonResponse registerNewPerson(RegisterNewPersonRequest registerNewPersonRequest) throws PeopleServiceException;

}
