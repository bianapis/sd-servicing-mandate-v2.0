package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRServicingMandateAgreementControlInputModelServicingMandateAgreementControlActionRequest;

import javax.validation.Valid;
  
/**
 * CRServicingMandateAgreementControlInputModel
 */
public class CRServicingMandateAgreementControlInputModel   {
  private String servicingMandateServicingSessionReference = null;

  private String servicingMandateAgreementInstanceReference = null;

  private Object servicingMandateAgreementControlActionTaskRecord = null;

  private CRServicingMandateAgreementControlInputModelServicingMandateAgreementControlActionRequest servicingMandateAgreementControlActionRequest = null;


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
   * Get servicingMandateAgreementControlActionRequest
   * @return servicingMandateAgreementControlActionRequest
  **/

  public CRServicingMandateAgreementControlInputModelServicingMandateAgreementControlActionRequest getServicingMandateAgreementControlActionRequest() {
    return servicingMandateAgreementControlActionRequest;
  }

  public void setServicingMandateAgreementControlActionRequest(CRServicingMandateAgreementControlInputModelServicingMandateAgreementControlActionRequest servicingMandateAgreementControlActionRequest) {
    this.servicingMandateAgreementControlActionRequest = servicingMandateAgreementControlActionRequest;
  }


}

