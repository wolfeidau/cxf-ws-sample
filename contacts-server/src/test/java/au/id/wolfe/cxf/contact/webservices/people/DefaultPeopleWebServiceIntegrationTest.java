package au.id.wolfe.cxf.contact.webservices.people;

import au.id.wolfe.cxf.contact.webservices.people.api.PeopleWebService;
import au.id.wolfe.cxf.contact.webservices.people.api.RegisterNewPersonRequest;
import au.id.wolfe.cxf.contact.webservices.people.api.RegisterNewPersonResponse;
import org.apache.cxf.interceptor.LoggingInInterceptor;
import org.apache.cxf.interceptor.LoggingOutInterceptor;
import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;

/**
 *
 */
public class DefaultPeopleWebServiceIntegrationTest {

    PeopleWebService client;

    @Before
    public void setUp() throws Exception {
        JaxWsProxyFactoryBean factory = new JaxWsProxyFactoryBean();

        factory.getInInterceptors().add(new LoggingInInterceptor());

        factory.getOutInterceptors().add(new LoggingOutInterceptor());

        factory.setServiceClass(PeopleWebService.class);

        factory.setAddress("http://localhost:9080/services/peopleService");

        client = (PeopleWebService) factory.create();
    }

    @Test
    public void testRegisterNewPerson() throws Exception {

        Person person = new Person();

        RegisterNewPersonRequest registerNewPersonRequest = new RegisterNewPersonRequest();

        registerNewPersonRequest.person = person;

        RegisterNewPersonResponse registerNewPersonResponse = client.registerNewPerson(registerNewPersonRequest);

        assertNotNull(registerNewPersonResponse);

    }
}
