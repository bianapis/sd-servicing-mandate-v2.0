package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRServicingMandateAgreementRetrieveOutputModelServicingMandateAgreementInstanceAnalysis;
import org.bian.dto.CRServicingMandateAgreementRetrieveOutputModelServicingMandateAgreementInstanceRecord;
import org.bian.dto.CRServicingMandateAgreementRetrieveOutputModelServicingMandateAgreementInstanceReportRecord;

import javax.validation.Valid;
  
/**
 * CRServicingMandateAgreementRetrieveOutputModel
 */
public class CRServicingMandateAgreementRetrieveOutputModel   {
  private CRServicingMandateAgreementRetrieveOutputModelServicingMandateAgreementInstanceRecord servicingMandateAgreementInstanceRecord = null;

  private String servicingMandateAgreementRetrieveActionTaskReference = null;

  private Object servicingMandateAgreementRetrieveActionTaskRecord = null;

  private String servicingMandateAgreementRetrieveActionResponse = null;

  private CRServicingMandateAgreementRetrieveOutputModelServicingMandateAgreementInstanceReportRecord servicingMandateAgreementInstanceReportRecord = null;

  private CRServicingMandateAgreementRetrieveOutputModelServicingMandateAgreementInstanceAnalysis servicingMandateAgreementInstanceAnalysis = null;


  /**
   * Get servicingMandateAgreementInstanceRecord
   * @return servicingMandateAgreementInstanceRecord
  **/

  public CRServicingMandateAgreementRetrieveOutputModelServicingMandateAgreementInstanceRecord getServicingMandateAgreementInstanceRecord() {
    return servicingMandateAgreementInstanceRecord;
  }

  public void setServicingMandateAgreementInstanceRecord(CRServicingMandateAgreementRetrieveOutputModelServicingMandateAgreementInstanceRecord servicingMandateAgreementInstanceRecord) {
    this.servicingMandateAgreementInstanceRecord = servicingMandateAgreementInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Servicing Mandate Agreement instance retrieve service call 
   * @return servicingMandateAgreementRetrieveActionTaskReference
  **/

  public String getServicingMandateAgreementRetrieveActionTaskReference() {
    return servicingMandateAgreementRetrieveActionTaskReference;
  }

  public void setServicingMandateAgreementRetrieveActionTaskReference(String servicingMandateAgreementRetrieveActionTaskReference) {
    this.servicingMandateAgreementRetrieveActionTaskReference = servicingMandateAgreementRetrieveActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return servicingMandateAgreementRetrieveActionTaskRecord
  **/

  public Object getServicingMandateAgreementRetrieveActionTaskRecord() {
    return servicingMandateAgreementRetrieveActionTaskRecord;
  }

  public void setServicingMandateAgreementRetrieveActionTaskRecord(Object servicingMandateAgreementRetrieveActionTaskRecord) {
    this.servicingMandateAgreementRetrieveActionTaskRecord = servicingMandateAgreementRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return servicingMandateAgreementRetrieveActionResponse
  **/

  public String getServicingMandateAgreementRetrieveActionResponse() {
    return servicingMandateAgreementRetrieveActionResponse;
  }

  public void setServicingMandateAgreementRetrieveActionResponse(String servicingMandateAgreementRetrieveActionResponse) {
    this.servicingMandateAgreementRetrieveActionResponse = servicingMandateAgreementRetrieveActionResponse;
  }


  /**
   * Get servicingMandateAgreementInstanceReportRecord
   * @return servicingMandateAgreementInstanceReportRecord
  **/

  public CRServicingMandateAgreementRetrieveOutputModelServicingMandateAgreementInstanceReportRecord getServicingMandateAgreementInstanceReportRecord() {
    return servicingMandateAgreementInstanceReportRecord;
  }

  public void setServicingMandateAgreementInstanceReportRecord(CRServicingMandateAgreementRetrieveOutputModelServicingMandateAgreementInstanceReportRecord servicingMandateAgreementInstanceReportRecord) {
    this.servicingMandateAgreementInstanceReportRecord = servicingMandateAgreementInstanceReportRecord;
  }


  /**
   * Get servicingMandateAgreementInstanceAnalysis
   * @return servicingMandateAgreementInstanceAnalysis
  **/

  public CRServicingMandateAgreementRetrieveOutputModelServicingMandateAgreementInstanceAnalysis getServicingMandateAgreementInstanceAnalysis() {
    return servicingMandateAgreementInstanceAnalysis;
  }

  public void setServicingMandateAgreementInstanceAnalysis(CRServicingMandateAgreementRetrieveOutputModelServicingMandateAgreementInstanceAnalysis servicingMandateAgreementInstanceAnalysis) {
    this.servicingMandateAgreementInstanceAnalysis = servicingMandateAgreementInstanceAnalysis;
  }


}

