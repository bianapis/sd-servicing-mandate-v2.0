package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRServicingMandateAgreementControlOutputModel
 */
public class CRServicingMandateAgreementControlOutputModel   {
  private String servicingMandateAgreementControlActionTaskReference = null;

  private Object servicingMandateAgreementControlActionTaskRecord = null;

  private String servicingMandateAgreementControlActionResponse = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Servicing Mandate Agreement instance control processing service call 
   * @return servicingMandateAgreementControlActionTaskReference
  **/

  public String getServicingMandateAgreementControlActionTaskReference() {
    return servicingMandateAgreementControlActionTaskReference;
  }

  public void setServicingMandateAgreementControlActionTaskReference(String servicingMandateAgreementControlActionTaskReference) {
    this.servicingMandateAgreementControlActionTaskReference = servicingMandateAgreementControlActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The processing control service call consolidated processing record 
   * @return servicingMandateAgreementControlActionTaskRecord
  **/

  public Object getServicingMandateAgreementControlActionTaskRecord() {
    return servicingMandateAgreementControlActionTaskRecord;
  }

  public void setServicingMandateAgreementControlActionTaskRecord(Object servicingMandateAgreementControlActionTaskRecord) {
    this.servicingMandateAgreementControlActionTaskRecord = servicingMandateAgreementControlActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the control action service response 
   * @return servicingMandateAgreementControlActionResponse
  **/

  public String getServicingMandateAgreementControlActionResponse() {
    return servicingMandateAgreementControlActionResponse;
  }

  public void setServicingMandateAgreementControlActionResponse(String servicingMandateAgreementControlActionResponse) {
    this.servicingMandateAgreementControlActionResponse = servicingMandateAgreementControlActionResponse;
  }


}

