package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRServicingMandateAgreementRetrieveInputModelServicingMandateAgreementInstanceAnalysis;
import org.bian.dto.CRServicingMandateAgreementRetrieveInputModelServicingMandateAgreementInstanceReportRecord;

import javax.validation.Valid;
  
/**
 * CRServicingMandateAgreementRetrieveInputModel
 */
public class CRServicingMandateAgreementRetrieveInputModel   {
  private Object servicingMandateAgreementRetrieveActionTaskRecord = null;

  private String servicingMandateAgreementRetrieveActionRequest = null;

  private CRServicingMandateAgreementRetrieveInputModelServicingMandateAgreementInstanceReportRecord servicingMandateAgreementInstanceReportRecord = null;

  private CRServicingMandateAgreementRetrieveInputModelServicingMandateAgreementInstanceAnalysis servicingMandateAgreementInstanceAnalysis = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return servicingMandateAgreementRetrieveActionRequest
  **/

  public String getServicingMandateAgreementRetrieveActionRequest() {
    return servicingMandateAgreementRetrieveActionRequest;
  }

  public void setServicingMandateAgreementRetrieveActionRequest(String servicingMandateAgreementRetrieveActionRequest) {
    this.servicingMandateAgreementRetrieveActionRequest = servicingMandateAgreementRetrieveActionRequest;
  }


  /**
   * Get servicingMandateAgreementInstanceReportRecord
   * @return servicingMandateAgreementInstanceReportRecord
  **/

  public CRServicingMandateAgreementRetrieveInputModelServicingMandateAgreementInstanceReportRecord getServicingMandateAgreementInstanceReportRecord() {
    return servicingMandateAgreementInstanceReportRecord;
  }

  public void setServicingMandateAgreementInstanceReportRecord(CRServicingMandateAgreementRetrieveInputModelServicingMandateAgreementInstanceReportRecord servicingMandateAgreementInstanceReportRecord) {
    this.servicingMandateAgreementInstanceReportRecord = servicingMandateAgreementInstanceReportRecord;
  }


  /**
   * Get servicingMandateAgreementInstanceAnalysis
   * @return servicingMandateAgreementInstanceAnalysis
  **/

  public CRServicingMandateAgreementRetrieveInputModelServicingMandateAgreementInstanceAnalysis getServicingMandateAgreementInstanceAnalysis() {
    return servicingMandateAgreementInstanceAnalysis;
  }

  public void setServicingMandateAgreementInstanceAnalysis(CRServicingMandateAgreementRetrieveInputModelServicingMandateAgreementInstanceAnalysis servicingMandateAgreementInstanceAnalysis) {
    this.servicingMandateAgreementInstanceAnalysis = servicingMandateAgreementInstanceAnalysis;
  }


}

