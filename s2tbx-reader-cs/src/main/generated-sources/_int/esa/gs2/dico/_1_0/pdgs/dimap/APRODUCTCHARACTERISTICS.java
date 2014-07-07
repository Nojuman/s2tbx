//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.7 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2014.07.07 à 03:07:45 PM CEST 
//


package _int.esa.gs2.dico._1_0.pdgs.dimap;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlList;
import javax.xml.bind.annotation.XmlType;
import _int.esa.gs2.dico._1_0.sy.image.APHYSICALBANDNAME;
import _int.esa.gs2.dico._1_0.sy.image.APROCESSINGLEVEL;
import _int.esa.gs2.dico._1_0.sy.image.ASPACECRAFTNAME;
import _int.esa.gs2.dico._1_0.sy.misc.ADOUBLEWITHNMATTR;


/**
 * <p>Classe Java pour A_PRODUCT_CHARACTERISTICS complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="A_PRODUCT_CHARACTERISTICS">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SPACECRAFT" type="{http://gs2.esa.int/DICO/1.0/SY/image/}A_SPACECRAFT_NAME"/>
 *         &lt;element name="PROCESSING_LEVEL" type="{http://gs2.esa.int/DICO/1.0/SY/image/}A_PROCESSING_LEVEL"/>
 *         &lt;element name="Product_Image_Characteristics">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="DATA_FILE_ORGANISATION">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;enumeration value="BAND_SEPARATED"/>
 *                         &lt;enumeration value="BAND_COMPOSITE"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="DATA_FILE_FORMAT">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;enumeration value="JPEG2000"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="Data_Access" type="{http://gs2.esa.int/DICO/1.0/PDGS/dimap/}A_DATA_ACCESS" maxOccurs="unbounded"/>
 *                   &lt;element name="AGGREGATION_FLAG" type="{http://gs2.esa.int/DICO/1.0/SY/misc/}A_VALIDITY_FLAG"/>
 *                   &lt;element name="Special_Values" type="{http://gs2.esa.int/DICO/1.0/PDGS/dimap/}A_SPECIAL_VALUES" maxOccurs="2" minOccurs="2"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Image_Display_Order" type="{http://gs2.esa.int/DICO/1.0/PDGS/dimap/}A_BAND_DISPLAY_ORDER"/>
 *         &lt;element name="Spectral_Information_List">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Spectral_Information" maxOccurs="13">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="RESOLUTION" type="{http://gs2.esa.int/DICO/1.0/SY/image/}A_BAND_RESOLUTION"/>
 *                             &lt;element name="Wavelength">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="MIN" type="{http://gs2.esa.int/DICO/1.0/SY/misc/}A_DOUBLE_WITH_NM_ATTR"/>
 *                                       &lt;element name="MAX" type="{http://gs2.esa.int/DICO/1.0/SY/misc/}A_DOUBLE_WITH_NM_ATTR"/>
 *                                       &lt;element name="CENTRAL" type="{http://gs2.esa.int/DICO/1.0/SY/misc/}A_DOUBLE_WITH_NM_ATTR"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="Spectral_Response">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="STEP" type="{http://gs2.esa.int/DICO/1.0/SY/misc/}A_DOUBLE_WITH_NM_ATTR"/>
 *                                       &lt;element name="VALUES" type="{http://gs2.esa.int/DICO/1.0/SY/misc/}A_LIST_OF_DOUBLE"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                           &lt;attribute name="physicalBand" use="required" type="{http://gs2.esa.int/DICO/1.0/SY/image/}A_PHYSICAL_BAND_NAME" />
 *                           &lt;attribute name="bandId" use="required" type="{http://gs2.esa.int/DICO/1.0/SY/image/}A_BAND_NUMBER" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "A_PRODUCT_CHARACTERISTICS", propOrder = {
    "spacecraft",
    "processinglevel",
    "productImageCharacteristics",
    "imageDisplayOrder",
    "spectralInformationList"
})
public class APRODUCTCHARACTERISTICS {

    @XmlElement(name = "SPACECRAFT", required = true)
    protected ASPACECRAFTNAME spacecraft;
    @XmlElement(name = "PROCESSING_LEVEL", required = true)
    protected APROCESSINGLEVEL processinglevel;
    @XmlElement(name = "Product_Image_Characteristics", required = true)
    protected APRODUCTCHARACTERISTICS.ProductImageCharacteristics productImageCharacteristics;
    @XmlElement(name = "Image_Display_Order", required = true)
    protected ABANDDISPLAYORDER imageDisplayOrder;
    @XmlElement(name = "Spectral_Information_List", required = true)
    protected APRODUCTCHARACTERISTICS.SpectralInformationList spectralInformationList;

    /**
     * Obtient la valeur de la propriété spacecraft.
     * 
     * @return
     *     possible object is
     *     {@link ASPACECRAFTNAME }
     *     
     */
    public ASPACECRAFTNAME getSPACECRAFT() {
        return spacecraft;
    }

    /**
     * Définit la valeur de la propriété spacecraft.
     * 
     * @param value
     *     allowed object is
     *     {@link ASPACECRAFTNAME }
     *     
     */
    public void setSPACECRAFT(ASPACECRAFTNAME value) {
        this.spacecraft = value;
    }

    /**
     * Obtient la valeur de la propriété processinglevel.
     * 
     * @return
     *     possible object is
     *     {@link APROCESSINGLEVEL }
     *     
     */
    public APROCESSINGLEVEL getPROCESSINGLEVEL() {
        return processinglevel;
    }

    /**
     * Définit la valeur de la propriété processinglevel.
     * 
     * @param value
     *     allowed object is
     *     {@link APROCESSINGLEVEL }
     *     
     */
    public void setPROCESSINGLEVEL(APROCESSINGLEVEL value) {
        this.processinglevel = value;
    }

    /**
     * Obtient la valeur de la propriété productImageCharacteristics.
     * 
     * @return
     *     possible object is
     *     {@link APRODUCTCHARACTERISTICS.ProductImageCharacteristics }
     *     
     */
    public APRODUCTCHARACTERISTICS.ProductImageCharacteristics getProductImageCharacteristics() {
        return productImageCharacteristics;
    }

    /**
     * Définit la valeur de la propriété productImageCharacteristics.
     * 
     * @param value
     *     allowed object is
     *     {@link APRODUCTCHARACTERISTICS.ProductImageCharacteristics }
     *     
     */
    public void setProductImageCharacteristics(APRODUCTCHARACTERISTICS.ProductImageCharacteristics value) {
        this.productImageCharacteristics = value;
    }

    /**
     * Obtient la valeur de la propriété imageDisplayOrder.
     * 
     * @return
     *     possible object is
     *     {@link ABANDDISPLAYORDER }
     *     
     */
    public ABANDDISPLAYORDER getImageDisplayOrder() {
        return imageDisplayOrder;
    }

    /**
     * Définit la valeur de la propriété imageDisplayOrder.
     * 
     * @param value
     *     allowed object is
     *     {@link ABANDDISPLAYORDER }
     *     
     */
    public void setImageDisplayOrder(ABANDDISPLAYORDER value) {
        this.imageDisplayOrder = value;
    }

    /**
     * Obtient la valeur de la propriété spectralInformationList.
     * 
     * @return
     *     possible object is
     *     {@link APRODUCTCHARACTERISTICS.SpectralInformationList }
     *     
     */
    public APRODUCTCHARACTERISTICS.SpectralInformationList getSpectralInformationList() {
        return spectralInformationList;
    }

    /**
     * Définit la valeur de la propriété spectralInformationList.
     * 
     * @param value
     *     allowed object is
     *     {@link APRODUCTCHARACTERISTICS.SpectralInformationList }
     *     
     */
    public void setSpectralInformationList(APRODUCTCHARACTERISTICS.SpectralInformationList value) {
        this.spectralInformationList = value;
    }


    /**
     * <p>Classe Java pour anonymous complex type.
     * 
     * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="DATA_FILE_ORGANISATION">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;enumeration value="BAND_SEPARATED"/>
     *               &lt;enumeration value="BAND_COMPOSITE"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="DATA_FILE_FORMAT">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;enumeration value="JPEG2000"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="Data_Access" type="{http://gs2.esa.int/DICO/1.0/PDGS/dimap/}A_DATA_ACCESS" maxOccurs="unbounded"/>
     *         &lt;element name="AGGREGATION_FLAG" type="{http://gs2.esa.int/DICO/1.0/SY/misc/}A_VALIDITY_FLAG"/>
     *         &lt;element name="Special_Values" type="{http://gs2.esa.int/DICO/1.0/PDGS/dimap/}A_SPECIAL_VALUES" maxOccurs="2" minOccurs="2"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "datafileorganisation",
        "datafileformat",
        "dataAccess",
        "aggregationflag",
        "specialValues"
    })
    public static class ProductImageCharacteristics {

        @XmlElement(name = "DATA_FILE_ORGANISATION", required = true)
        protected String datafileorganisation;
        @XmlElement(name = "DATA_FILE_FORMAT", required = true)
        protected String datafileformat;
        @XmlElement(name = "Data_Access", required = true)
        protected List<ADATAACCESS> dataAccess;
        @XmlElement(name = "AGGREGATION_FLAG")
        protected boolean aggregationflag;
        @XmlElement(name = "Special_Values", required = true)
        protected List<ASPECIALVALUES> specialValues;

        /**
         * Obtient la valeur de la propriété datafileorganisation.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDATAFILEORGANISATION() {
            return datafileorganisation;
        }

        /**
         * Définit la valeur de la propriété datafileorganisation.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDATAFILEORGANISATION(String value) {
            this.datafileorganisation = value;
        }

        /**
         * Obtient la valeur de la propriété datafileformat.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDATAFILEFORMAT() {
            return datafileformat;
        }

        /**
         * Définit la valeur de la propriété datafileformat.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDATAFILEFORMAT(String value) {
            this.datafileformat = value;
        }

        /**
         * Gets the value of the dataAccess property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the dataAccess property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getDataAccess().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ADATAACCESS }
         * 
         * 
         */
        public List<ADATAACCESS> getDataAccess() {
            if (dataAccess == null) {
                dataAccess = new ArrayList<ADATAACCESS>();
            }
            return this.dataAccess;
        }

        /**
         * Obtient la valeur de la propriété aggregationflag.
         * 
         */
        public boolean isAGGREGATIONFLAG() {
            return aggregationflag;
        }

        /**
         * Définit la valeur de la propriété aggregationflag.
         * 
         */
        public void setAGGREGATIONFLAG(boolean value) {
            this.aggregationflag = value;
        }

        /**
         * Gets the value of the specialValues property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the specialValues property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSpecialValues().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ASPECIALVALUES }
         * 
         * 
         */
        public List<ASPECIALVALUES> getSpecialValues() {
            if (specialValues == null) {
                specialValues = new ArrayList<ASPECIALVALUES>();
            }
            return this.specialValues;
        }

    }


    /**
     * <p>Classe Java pour anonymous complex type.
     * 
     * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="Spectral_Information" maxOccurs="13">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="RESOLUTION" type="{http://gs2.esa.int/DICO/1.0/SY/image/}A_BAND_RESOLUTION"/>
     *                   &lt;element name="Wavelength">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="MIN" type="{http://gs2.esa.int/DICO/1.0/SY/misc/}A_DOUBLE_WITH_NM_ATTR"/>
     *                             &lt;element name="MAX" type="{http://gs2.esa.int/DICO/1.0/SY/misc/}A_DOUBLE_WITH_NM_ATTR"/>
     *                             &lt;element name="CENTRAL" type="{http://gs2.esa.int/DICO/1.0/SY/misc/}A_DOUBLE_WITH_NM_ATTR"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="Spectral_Response">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="STEP" type="{http://gs2.esa.int/DICO/1.0/SY/misc/}A_DOUBLE_WITH_NM_ATTR"/>
     *                             &lt;element name="VALUES" type="{http://gs2.esa.int/DICO/1.0/SY/misc/}A_LIST_OF_DOUBLE"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *                 &lt;attribute name="physicalBand" use="required" type="{http://gs2.esa.int/DICO/1.0/SY/image/}A_PHYSICAL_BAND_NAME" />
     *                 &lt;attribute name="bandId" use="required" type="{http://gs2.esa.int/DICO/1.0/SY/image/}A_BAND_NUMBER" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "spectralInformation"
    })
    public static class SpectralInformationList {

        @XmlElement(name = "Spectral_Information", required = true)
        protected List<APRODUCTCHARACTERISTICS.SpectralInformationList.SpectralInformation> spectralInformation;

        /**
         * Gets the value of the spectralInformation property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the spectralInformation property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSpectralInformation().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link APRODUCTCHARACTERISTICS.SpectralInformationList.SpectralInformation }
         * 
         * 
         */
        public List<APRODUCTCHARACTERISTICS.SpectralInformationList.SpectralInformation> getSpectralInformation() {
            if (spectralInformation == null) {
                spectralInformation = new ArrayList<APRODUCTCHARACTERISTICS.SpectralInformationList.SpectralInformation>();
            }
            return this.spectralInformation;
        }


        /**
         * <p>Classe Java pour anonymous complex type.
         * 
         * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="RESOLUTION" type="{http://gs2.esa.int/DICO/1.0/SY/image/}A_BAND_RESOLUTION"/>
         *         &lt;element name="Wavelength">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="MIN" type="{http://gs2.esa.int/DICO/1.0/SY/misc/}A_DOUBLE_WITH_NM_ATTR"/>
         *                   &lt;element name="MAX" type="{http://gs2.esa.int/DICO/1.0/SY/misc/}A_DOUBLE_WITH_NM_ATTR"/>
         *                   &lt;element name="CENTRAL" type="{http://gs2.esa.int/DICO/1.0/SY/misc/}A_DOUBLE_WITH_NM_ATTR"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="Spectral_Response">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="STEP" type="{http://gs2.esa.int/DICO/1.0/SY/misc/}A_DOUBLE_WITH_NM_ATTR"/>
         *                   &lt;element name="VALUES" type="{http://gs2.esa.int/DICO/1.0/SY/misc/}A_LIST_OF_DOUBLE"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *       &lt;/sequence>
         *       &lt;attribute name="physicalBand" use="required" type="{http://gs2.esa.int/DICO/1.0/SY/image/}A_PHYSICAL_BAND_NAME" />
         *       &lt;attribute name="bandId" use="required" type="{http://gs2.esa.int/DICO/1.0/SY/image/}A_BAND_NUMBER" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "resolution",
            "wavelength",
            "spectralResponse"
        })
        public static class SpectralInformation {

            @XmlElement(name = "RESOLUTION")
            protected int resolution;
            @XmlElement(name = "Wavelength", required = true)
            protected APRODUCTCHARACTERISTICS.SpectralInformationList.SpectralInformation.Wavelength wavelength;
            @XmlElement(name = "Spectral_Response", required = true)
            protected APRODUCTCHARACTERISTICS.SpectralInformationList.SpectralInformation.SpectralResponse spectralResponse;
            @XmlAttribute(name = "physicalBand", required = true)
            protected APHYSICALBANDNAME physicalBand;
            @XmlAttribute(name = "bandId", required = true)
            protected String bandId;

            /**
             * Obtient la valeur de la propriété resolution.
             * 
             */
            public int getRESOLUTION() {
                return resolution;
            }

            /**
             * Définit la valeur de la propriété resolution.
             * 
             */
            public void setRESOLUTION(int value) {
                this.resolution = value;
            }

            /**
             * Obtient la valeur de la propriété wavelength.
             * 
             * @return
             *     possible object is
             *     {@link APRODUCTCHARACTERISTICS.SpectralInformationList.SpectralInformation.Wavelength }
             *     
             */
            public APRODUCTCHARACTERISTICS.SpectralInformationList.SpectralInformation.Wavelength getWavelength() {
                return wavelength;
            }

            /**
             * Définit la valeur de la propriété wavelength.
             * 
             * @param value
             *     allowed object is
             *     {@link APRODUCTCHARACTERISTICS.SpectralInformationList.SpectralInformation.Wavelength }
             *     
             */
            public void setWavelength(APRODUCTCHARACTERISTICS.SpectralInformationList.SpectralInformation.Wavelength value) {
                this.wavelength = value;
            }

            /**
             * Obtient la valeur de la propriété spectralResponse.
             * 
             * @return
             *     possible object is
             *     {@link APRODUCTCHARACTERISTICS.SpectralInformationList.SpectralInformation.SpectralResponse }
             *     
             */
            public APRODUCTCHARACTERISTICS.SpectralInformationList.SpectralInformation.SpectralResponse getSpectralResponse() {
                return spectralResponse;
            }

            /**
             * Définit la valeur de la propriété spectralResponse.
             * 
             * @param value
             *     allowed object is
             *     {@link APRODUCTCHARACTERISTICS.SpectralInformationList.SpectralInformation.SpectralResponse }
             *     
             */
            public void setSpectralResponse(APRODUCTCHARACTERISTICS.SpectralInformationList.SpectralInformation.SpectralResponse value) {
                this.spectralResponse = value;
            }

            /**
             * Obtient la valeur de la propriété physicalBand.
             * 
             * @return
             *     possible object is
             *     {@link APHYSICALBANDNAME }
             *     
             */
            public APHYSICALBANDNAME getPhysicalBand() {
                return physicalBand;
            }

            /**
             * Définit la valeur de la propriété physicalBand.
             * 
             * @param value
             *     allowed object is
             *     {@link APHYSICALBANDNAME }
             *     
             */
            public void setPhysicalBand(APHYSICALBANDNAME value) {
                this.physicalBand = value;
            }

            /**
             * Obtient la valeur de la propriété bandId.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getBandId() {
                return bandId;
            }

            /**
             * Définit la valeur de la propriété bandId.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setBandId(String value) {
                this.bandId = value;
            }


            /**
             * <p>Classe Java pour anonymous complex type.
             * 
             * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="STEP" type="{http://gs2.esa.int/DICO/1.0/SY/misc/}A_DOUBLE_WITH_NM_ATTR"/>
             *         &lt;element name="VALUES" type="{http://gs2.esa.int/DICO/1.0/SY/misc/}A_LIST_OF_DOUBLE"/>
             *       &lt;/sequence>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "step",
                "values"
            })
            public static class SpectralResponse {

                @XmlElement(name = "STEP", required = true)
                protected ADOUBLEWITHNMATTR step;
                @XmlList
                @XmlElement(name = "VALUES", type = Double.class)
                protected List<Double> values;

                /**
                 * Obtient la valeur de la propriété step.
                 * 
                 * @return
                 *     possible object is
                 *     {@link ADOUBLEWITHNMATTR }
                 *     
                 */
                public ADOUBLEWITHNMATTR getSTEP() {
                    return step;
                }

                /**
                 * Définit la valeur de la propriété step.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ADOUBLEWITHNMATTR }
                 *     
                 */
                public void setSTEP(ADOUBLEWITHNMATTR value) {
                    this.step = value;
                }

                /**
                 * Gets the value of the values property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the values property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getVALUES().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link Double }
                 * 
                 * 
                 */
                public List<Double> getVALUES() {
                    if (values == null) {
                        values = new ArrayList<Double>();
                    }
                    return this.values;
                }

            }


            /**
             * <p>Classe Java pour anonymous complex type.
             * 
             * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="MIN" type="{http://gs2.esa.int/DICO/1.0/SY/misc/}A_DOUBLE_WITH_NM_ATTR"/>
             *         &lt;element name="MAX" type="{http://gs2.esa.int/DICO/1.0/SY/misc/}A_DOUBLE_WITH_NM_ATTR"/>
             *         &lt;element name="CENTRAL" type="{http://gs2.esa.int/DICO/1.0/SY/misc/}A_DOUBLE_WITH_NM_ATTR"/>
             *       &lt;/sequence>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "min",
                "max",
                "central"
            })
            public static class Wavelength {

                @XmlElement(name = "MIN", required = true)
                protected ADOUBLEWITHNMATTR min;
                @XmlElement(name = "MAX", required = true)
                protected ADOUBLEWITHNMATTR max;
                @XmlElement(name = "CENTRAL", required = true)
                protected ADOUBLEWITHNMATTR central;

                /**
                 * Obtient la valeur de la propriété min.
                 * 
                 * @return
                 *     possible object is
                 *     {@link ADOUBLEWITHNMATTR }
                 *     
                 */
                public ADOUBLEWITHNMATTR getMIN() {
                    return min;
                }

                /**
                 * Définit la valeur de la propriété min.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ADOUBLEWITHNMATTR }
                 *     
                 */
                public void setMIN(ADOUBLEWITHNMATTR value) {
                    this.min = value;
                }

                /**
                 * Obtient la valeur de la propriété max.
                 * 
                 * @return
                 *     possible object is
                 *     {@link ADOUBLEWITHNMATTR }
                 *     
                 */
                public ADOUBLEWITHNMATTR getMAX() {
                    return max;
                }

                /**
                 * Définit la valeur de la propriété max.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ADOUBLEWITHNMATTR }
                 *     
                 */
                public void setMAX(ADOUBLEWITHNMATTR value) {
                    this.max = value;
                }

                /**
                 * Obtient la valeur de la propriété central.
                 * 
                 * @return
                 *     possible object is
                 *     {@link ADOUBLEWITHNMATTR }
                 *     
                 */
                public ADOUBLEWITHNMATTR getCENTRAL() {
                    return central;
                }

                /**
                 * Définit la valeur de la propriété central.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ADOUBLEWITHNMATTR }
                 *     
                 */
                public void setCENTRAL(ADOUBLEWITHNMATTR value) {
                    this.central = value;
                }

            }

        }

    }

}
