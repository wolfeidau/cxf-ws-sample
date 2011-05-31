package au.id.wolfe.cxf.contact.webservices.people.api;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import static au.id.wolfe.cxf.contact.webservices.util.WebServiceConstants.PEOPLE_SERVICE_NAMESPACE;

/**
 *
 */
@XmlRootElement(name = "registerNewPersonResponse", namespace = PEOPLE_SERVICE_NAMESPACE)
@XmlAccessorType(XmlAccessType.PUBLIC_MEMBER)
public class RegisterNewPersonResponse {

    @XmlElement(name = "personId")
    public long personId;
}
