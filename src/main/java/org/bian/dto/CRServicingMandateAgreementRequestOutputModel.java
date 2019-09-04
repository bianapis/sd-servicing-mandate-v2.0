package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRServicingMandateAgreementRequestInputModelServicingMandateAgreementInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRServicingMandateAgreementRequestOutputModel
 */
public class CRServicingMandateAgreementRequestOutputModel   {
  private CRServicingMandateAgreementRequestInputModelServicingMandateAgreementInstanceRecord servicingMandateAgreementInstanceRecord = null;

  private String servicingMandateAgreementRequestActionTaskReference = null;

  private Object servicingMandateAgreementRequestActionTaskRecord = null;

  private String requestRecordReference = null;

  private Object requestResponseRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Servicing Mandate Agreement instance request service call 
   * @return servicingMandateAgreementRequestActionTaskReference
  **/

  public String getServicingMandateAgreementRequestActionTaskReference() {
    return servicingMandateAgreementRequestActionTaskReference;
  }

  public void setServicingMandateAgreementRequestActionTaskReference(String servicingMandateAgreementRequestActionTaskReference) {
    this.servicingMandateAgreementRequestActionTaskReference = servicingMandateAgreementRequestActionTaskReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the service request record 
   * @return requestRecordReference
  **/

  public String getRequestRecordReference() {
    return requestRecordReference;
  }

  public void setRequestRecordReference(String requestRecordReference) {
    this.requestRecordReference = requestRecordReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the request action service response 
   * @return requestResponseRecord
  **/

  public Object getRequestResponseRecord() {
    return requestResponseRecord;
  }

  public void setRequestResponseRecord(Object requestResponseRecord) {
    this.requestResponseRecord = requestResponseRecord;
  }


}

