package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRServicingMandateAgreementUpdateInputModelServicingMandateAgreementInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRServicingMandateAgreementUpdateOutputModel
 */
public class CRServicingMandateAgreementUpdateOutputModel   {
  private CRServicingMandateAgreementUpdateInputModelServicingMandateAgreementInstanceRecord servicingMandateAgreementInstanceRecord = null;

  private String servicingMandateAgreementUpdateActionTaskReference = null;

  private Object servicingMandateAgreementUpdateActionTaskRecord = null;

  private Object updateResponseRecord = null;


  /**
   * Get servicingMandateAgreementInstanceRecord
   * @return servicingMandateAgreementInstanceRecord
  **/

  public CRServicingMandateAgreementUpdateInputModelServicingMandateAgreementInstanceRecord getServicingMandateAgreementInstanceRecord() {
    return servicingMandateAgreementInstanceRecord;
  }

  public void setServicingMandateAgreementInstanceRecord(CRServicingMandateAgreementUpdateInputModelServicingMandateAgreementInstanceRecord servicingMandateAgreementInstanceRecord) {
    this.servicingMandateAgreementInstanceRecord = servicingMandateAgreementInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an update service call 
   * @return servicingMandateAgreementUpdateActionTaskReference
  **/

  public String getServicingMandateAgreementUpdateActionTaskReference() {
    return servicingMandateAgreementUpdateActionTaskReference;
  }

  public void setServicingMandateAgreementUpdateActionTaskReference(String servicingMandateAgreementUpdateActionTaskReference) {
    this.servicingMandateAgreementUpdateActionTaskReference = servicingMandateAgreementUpdateActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return servicingMandateAgreementUpdateActionTaskRecord
  **/

  public Object getServicingMandateAgreementUpdateActionTaskRecord() {
    return servicingMandateAgreementUpdateActionTaskRecord;
  }

  public void setServicingMandateAgreementUpdateActionTaskRecord(Object servicingMandateAgreementUpdateActionTaskRecord) {
    this.servicingMandateAgreementUpdateActionTaskRecord = servicingMandateAgreementUpdateActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the Update action service response 
   * @return updateResponseRecord
  **/

  public Object getUpdateResponseRecord() {
    return updateResponseRecord;
  }

  public void setUpdateResponseRecord(Object updateResponseRecord) {
    this.updateResponseRecord = updateResponseRecord;
  }


}

