package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRServicingMandateAgreementExchangeOutputModel
 */
public class CRServicingMandateAgreementExchangeOutputModel   {
  private String servicingMandateAgreementExchangeActionTaskReference = null;

  private Object servicingMandateAgreementExchangeActionTaskRecord = null;

  private String servicingMandateAgreementExchangeActionResponse = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Servicing Mandate Agreement instance exchange service call 
   * @return servicingMandateAgreementExchangeActionTaskReference
  **/

  public String getServicingMandateAgreementExchangeActionTaskReference() {
    return servicingMandateAgreementExchangeActionTaskReference;
  }

  public void setServicingMandateAgreementExchangeActionTaskReference(String servicingMandateAgreementExchangeActionTaskReference) {
    this.servicingMandateAgreementExchangeActionTaskReference = servicingMandateAgreementExchangeActionTaskReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the exchange action service response 
   * @return servicingMandateAgreementExchangeActionResponse
  **/

  public String getServicingMandateAgreementExchangeActionResponse() {
    return servicingMandateAgreementExchangeActionResponse;
  }

  public void setServicingMandateAgreementExchangeActionResponse(String servicingMandateAgreementExchangeActionResponse) {
    this.servicingMandateAgreementExchangeActionResponse = servicingMandateAgreementExchangeActionResponse;
  }


}

