//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.7 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2014.07.07 à 03:07:45 PM CEST 
//


package _int.esa.s2.pdgs.psd.s2_pdi_level_1b_datastrip_metadata;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the _int.esa.s2.pdgs.psd.s2_pdi_level_1b_datastrip_metadata package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Level1BDataStripID_QNAME = new QName("http://pdgs.s2.esa.int/PSD/S2_PDI_Level-1B_Datastrip_Metadata.xsd", "Level-1B_DataStrip_ID");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: _int.esa.s2.pdgs.psd.s2_pdi_level_1b_datastrip_metadata
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Level1BDataStrip }
     * 
     */
    public Level1BDataStrip createLevel1BDataStrip() {
        return new Level1BDataStrip();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Level1BDataStrip }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pdgs.s2.esa.int/PSD/S2_PDI_Level-1B_Datastrip_Metadata.xsd", name = "Level-1B_DataStrip_ID")
    public JAXBElement<Level1BDataStrip> createLevel1BDataStripID(Level1BDataStrip value) {
        return new JAXBElement<Level1BDataStrip>(_Level1BDataStripID_QNAME, Level1BDataStrip.class, null, value);
    }

}
