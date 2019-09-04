package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRServicingMandateAgreementGrantInputModelGrantRequestInputRecord;

import javax.validation.Valid;
  
/**
 * CRServicingMandateAgreementGrantInputModel
 */
public class CRServicingMandateAgreementGrantInputModel   {
  private String servicingMandateServicingSessionReference = null;

  private String servicingMandateAgreementInstanceReference = null;

  private Object servicingMandateAgreementGrantActionTaskRecord = null;

  private String grantRequestRecordType = null;

  private CRServicingMandateAgreementGrantInputModelGrantRequestInputRecord grantRequestInputRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the active servicing session 
   * @return servicingMandateServicingSessionReference
  **/

  public String getServicingMandateServicingSessionReference() {
    return servicingMandateServicingSessionReference;
  }

  public void setServicingMandateServicingSessionReference(String servicingMandateServicingSessionReference) {
    this.servicingMandateServicingSessionReference = servicingMandateServicingSessionReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Servicing Mandate Agreement instance 
   * @return servicingMandateAgreementInstanceReference
  **/

  public String getServicingMandateAgreementInstanceReference() {
    return servicingMandateAgreementInstanceReference;
  }

  public void setServicingMandateAgreementInstanceReference(String servicingMandateAgreementInstanceReference) {
    this.servicingMandateAgreementInstanceReference = servicingMandateAgreementInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The grant service call consolidated processing record 
   * @return servicingMandateAgreementGrantActionTaskRecord
  **/

  public Object getServicingMandateAgreementGrantActionTaskRecord() {
    return servicingMandateAgreementGrantActionTaskRecord;
  }

  public void setServicingMandateAgreementGrantActionTaskRecord(Object servicingMandateAgreementGrantActionTaskRecord) {
    this.servicingMandateAgreementGrantActionTaskRecord = servicingMandateAgreementGrantActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Grant request type (e.g. access permission) 
   * @return grantRequestRecordType
  **/

  public String getGrantRequestRecordType() {
    return grantRequestRecordType;
  }

  public void setGrantRequestRecordType(String grantRequestRecordType) {
    this.grantRequestRecordType = grantRequestRecordType;
  }


  /**
   * Get grantRequestInputRecord
   * @return grantRequestInputRecord
  **/

  public CRServicingMandateAgreementGrantInputModelGrantRequestInputRecord getGrantRequestInputRecord() {
    return grantRequestInputRecord;
  }

  public void setGrantRequestInputRecord(CRServicingMandateAgreementGrantInputModelGrantRequestInputRecord grantRequestInputRecord) {
    this.grantRequestInputRecord = grantRequestInputRecord;
  }


}

