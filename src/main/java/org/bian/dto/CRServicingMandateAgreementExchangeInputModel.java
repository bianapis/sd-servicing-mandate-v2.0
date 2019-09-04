package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRServicingMandateAgreementExchangeInputModelServicingMandateAgreementExchangeActionRequest;

import javax.validation.Valid;
  
/**
 * CRServicingMandateAgreementExchangeInputModel
 */
public class CRServicingMandateAgreementExchangeInputModel   {
  private String servicingMandateServicingSessionReference = null;

  private String servicingMandateAgreementInstanceReference = null;

  private Object servicingMandateAgreementExchangeActionTaskRecord = null;

  private CRServicingMandateAgreementExchangeInputModelServicingMandateAgreementExchangeActionRequest servicingMandateAgreementExchangeActionRequest = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The exchange service call consolidated processing record 
   * @return servicingMandateAgreementExchangeActionTaskRecord
  **/

  public Object getServicingMandateAgreementExchangeActionTaskRecord() {
    return servicingMandateAgreementExchangeActionTaskRecord;
  }

  public void setServicingMandateAgreementExchangeActionTaskRecord(Object servicingMandateAgreementExchangeActionTaskRecord) {
    this.servicingMandateAgreementExchangeActionTaskRecord = servicingMandateAgreementExchangeActionTaskRecord;
  }


  /**
   * Get servicingMandateAgreementExchangeActionRequest
   * @return servicingMandateAgreementExchangeActionRequest
  **/

  public CRServicingMandateAgreementExchangeInputModelServicingMandateAgreementExchangeActionRequest getServicingMandateAgreementExchangeActionRequest() {
    return servicingMandateAgreementExchangeActionRequest;
  }

  public void setServicingMandateAgreementExchangeActionRequest(CRServicingMandateAgreementExchangeInputModelServicingMandateAgreementExchangeActionRequest servicingMandateAgreementExchangeActionRequest) {
    this.servicingMandateAgreementExchangeActionRequest = servicingMandateAgreementExchangeActionRequest;
  }


}

