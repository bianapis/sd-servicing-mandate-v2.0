package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRServicingMandateAgreementEvaluateInputModelServicingMandateAgreementInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRServicingMandateAgreementEvaluateInputModel
 */
public class CRServicingMandateAgreementEvaluateInputModel   {
  private String servicingMandateServicingSessionReference = null;

  private Object servicingMandateAgreementEvaluateActionRecord = null;

  private String servicingMandateAgreementInstanceStatus = null;

  private CRServicingMandateAgreementEvaluateInputModelServicingMandateAgreementInstanceRecord servicingMandateAgreementInstanceRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The Evaluate service call input and output record 
   * @return servicingMandateAgreementEvaluateActionRecord
  **/

  public Object getServicingMandateAgreementEvaluateActionRecord() {
    return servicingMandateAgreementEvaluateActionRecord;
  }

  public void setServicingMandateAgreementEvaluateActionRecord(Object servicingMandateAgreementEvaluateActionRecord) {
    this.servicingMandateAgreementEvaluateActionRecord = servicingMandateAgreementEvaluateActionRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the Servicing Mandate Agreement instance (e.g. initialised, pending, active) 
   * @return servicingMandateAgreementInstanceStatus
  **/

  public String getServicingMandateAgreementInstanceStatus() {
    return servicingMandateAgreementInstanceStatus;
  }

  public void setServicingMandateAgreementInstanceStatus(String servicingMandateAgreementInstanceStatus) {
    this.servicingMandateAgreementInstanceStatus = servicingMandateAgreementInstanceStatus;
  }


  /**
   * Get servicingMandateAgreementInstanceRecord
   * @return servicingMandateAgreementInstanceRecord
  **/

  public CRServicingMandateAgreementEvaluateInputModelServicingMandateAgreementInstanceRecord getServicingMandateAgreementInstanceRecord() {
    return servicingMandateAgreementInstanceRecord;
  }

  public void setServicingMandateAgreementInstanceRecord(CRServicingMandateAgreementEvaluateInputModelServicingMandateAgreementInstanceRecord servicingMandateAgreementInstanceRecord) {
    this.servicingMandateAgreementInstanceRecord = servicingMandateAgreementInstanceRecord;
  }


}

