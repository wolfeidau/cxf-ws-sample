package au.id.wolfe.cxf.contact.webservices.people;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import static au.id.wolfe.cxf.contact.webservices.util.WebServiceConstants.PEOPLE_SERVICE_NAMESPACE;

/**
 *
 */
@XmlRootElement(name = "person", namespace = PEOPLE_SERVICE_NAMESPACE)
@XmlAccessorType(XmlAccessType.PUBLIC_MEMBER)
public class Person {

    @XmlElement(name = "firstName")
    public String firstName;

    @XmlElement(name = "middleName")
    public String middleName;

    @XmlElement(name = "lastName")
    public String lastName;

    @XmlElement(name = "secondLastName")
    public String secondLastName;

    @XmlElement(name = "address1")
    public String address1;

    @XmlElement(name = "address2")
    public String address2;

    @XmlElement(name = "town")
    public String town;

    @XmlElement(name = "state")
    public String state;

    @XmlElement(name = "postcode")
    public String postcode;

    @XmlElement(name = "country")
    public String country;

    @XmlElement(name = "phone")
    public String phone;

    @XmlElement(name = "email")
    public String email;

}
