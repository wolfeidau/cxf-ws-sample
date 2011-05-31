package au.id.wolfe.cxf.contact.webservices.people;

import au.id.wolfe.cxf.contact.webservices.people.api.PeopleWebService;
import au.id.wolfe.cxf.contact.webservices.people.api.RegisterNewPersonRequest;
import au.id.wolfe.cxf.contact.webservices.people.api.RegisterNewPersonResponse;

/**
 *
 */
public class DefaultPeopleWebService implements PeopleWebService {

    public RegisterNewPersonResponse registerNewPerson(RegisterNewPersonRequest registerNewPersonRequest) throws PeopleServiceException {

        RegisterNewPersonResponse registerNewPersonResponse = new RegisterNewPersonResponse();

        registerNewPersonResponse.personId = 21;

        return registerNewPersonResponse;
    }
}
