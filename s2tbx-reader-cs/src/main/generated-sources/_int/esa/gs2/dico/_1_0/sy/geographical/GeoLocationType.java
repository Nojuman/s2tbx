//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.7 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2014.07.07 à 03:07:45 PM CEST 
//


package _int.esa.gs2.dico._1_0.sy.geographical;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import _int.esa.gs2.dico._1_0.sy.misc.HeightType;


/**
 * <p>Classe Java pour Geo_Location_Type complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="Geo_Location_Type">
 *   &lt;complexContent>
 *     &lt;extension base="{http://gs2.esa.int/DICO/1.0/SY/geographical/}Geo_Location_2D_Type">
 *       &lt;sequence>
 *         &lt;element name="Alt" type="{http://gs2.esa.int/DICO/1.0/SY/misc/}Height_Type"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Geo_Location_Type", propOrder = {
    "alt"
})
public class GeoLocationType
    extends GeoLocation2DType
{

    @XmlElement(name = "Alt", required = true)
    protected HeightType alt;

    /**
     * Obtient la valeur de la propriété alt.
     * 
     * @return
     *     possible object is
     *     {@link HeightType }
     *     
     */
    public HeightType getAlt() {
        return alt;
    }

    /**
     * Définit la valeur de la propriété alt.
     * 
     * @param value
     *     allowed object is
     *     {@link HeightType }
     *     
     */
    public void setAlt(HeightType value) {
        this.alt = value;
    }

}
