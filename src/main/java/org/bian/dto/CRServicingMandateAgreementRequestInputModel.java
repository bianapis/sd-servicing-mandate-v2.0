package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRServicingMandateAgreementRequestInputModelRequestRecordType;
import org.bian.dto.CRServicingMandateAgreementRequestInputModelServicingMandateAgreementInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRServicingMandateAgreementRequestInputModel
 */
public class CRServicingMandateAgreementRequestInputModel   {
  private String servicingMandateServicingSessionReference = null;

  private String servicingMandateAgreementInstanceReference = null;

  private CRServicingMandateAgreementRequestInputModelServicingMandateAgreementInstanceRecord servicingMandateAgreementInstanceRecord = null;

  private Object servicingMandateAgreementRequestActionTaskRecord = null;

  private CRServicingMandateAgreementRequestInputModelRequestRecordType requestRecordType = null;


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
   * Get servicingMandateAgreementInstanceRecord
   * @return servicingMandateAgreementInstanceRecord
  **/

  public CRServicingMandateAgreementRequestInputModelServicingMandateAgreementInstanceRecord getServicingMandateAgreementInstanceRecord() {
    return servicingMandateAgreementInstanceRecord;
  }

  public void setServicingMandateAgreementInstanceRecord(CRServicingMandateAgreementRequestInputModelServicingMandateAgreementInstanceRecord servicingMandateAgreementInstanceRecord) {
    this.servicingMandateAgreementInstanceRecord = servicingMandateAgreementInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The request service call consolidated processing record 
   * @return servicingMandateAgreementRequestActionTaskRecord
  **/

  public Object getServicingMandateAgreementRequestActionTaskRecord() {
    return servicingMandateAgreementRequestActionTaskRecord;
  }

  public void setServicingMandateAgreementRequestActionTaskRecord(Object servicingMandateAgreementRequestActionTaskRecord) {
    this.servicingMandateAgreementRequestActionTaskRecord = servicingMandateAgreementRequestActionTaskRecord;
  }


  /**
   * Get requestRecordType
   * @return requestRecordType
  **/

  public CRServicingMandateAgreementRequestInputModelRequestRecordType getRequestRecordType() {
    return requestRecordType;
  }

  public void setRequestRecordType(CRServicingMandateAgreementRequestInputModelRequestRecordType requestRecordType) {
    this.requestRecordType = requestRecordType;
  }


}

