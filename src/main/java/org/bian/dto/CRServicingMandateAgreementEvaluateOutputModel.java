package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRServicingMandateAgreementEvaluateOutputModelServicingMandateAgreementInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRServicingMandateAgreementEvaluateOutputModel
 */
public class CRServicingMandateAgreementEvaluateOutputModel   {
  private String servicingMandateAgreementInstanceReference = null;

  private String servicingMandateAgreementEvaluateActionReference = null;

  private Object servicingMandateAgreementEvaluateActionRecord = null;

  private String servicingMandateAgreementInstanceStatus = null;

  private CRServicingMandateAgreementEvaluateOutputModelServicingMandateAgreementInstanceRecord servicingMandateAgreementInstanceRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an Evaluate service call 
   * @return servicingMandateAgreementEvaluateActionReference
  **/

  public String getServicingMandateAgreementEvaluateActionReference() {
    return servicingMandateAgreementEvaluateActionReference;
  }

  public void setServicingMandateAgreementEvaluateActionReference(String servicingMandateAgreementEvaluateActionReference) {
    this.servicingMandateAgreementEvaluateActionReference = servicingMandateAgreementEvaluateActionReference;
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

  public CRServicingMandateAgreementEvaluateOutputModelServicingMandateAgreementInstanceRecord getServicingMandateAgreementInstanceRecord() {
    return servicingMandateAgreementInstanceRecord;
  }

  public void setServicingMandateAgreementInstanceRecord(CRServicingMandateAgreementEvaluateOutputModelServicingMandateAgreementInstanceRecord servicingMandateAgreementInstanceRecord) {
    this.servicingMandateAgreementInstanceRecord = servicingMandateAgreementInstanceRecord;
  }


}

