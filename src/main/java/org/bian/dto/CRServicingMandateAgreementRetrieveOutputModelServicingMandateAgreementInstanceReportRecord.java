package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRServicingMandateAgreementRetrieveOutputModelServicingMandateAgreementInstanceReportRecord
 */
public class CRServicingMandateAgreementRetrieveOutputModelServicingMandateAgreementInstanceReportRecord   {
  private String servicingMandateAgreementInstanceReportData = null;

  private String servicingMandateAgreementInstanceReportType = null;

  private Object servicingMandateAgreementInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return servicingMandateAgreementInstanceReportData
  **/

  public String getServicingMandateAgreementInstanceReportData() {
    return servicingMandateAgreementInstanceReportData;
  }

  public void setServicingMandateAgreementInstanceReportData(String servicingMandateAgreementInstanceReportData) {
    this.servicingMandateAgreementInstanceReportData = servicingMandateAgreementInstanceReportData;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return servicingMandateAgreementInstanceReportType
  **/

  public String getServicingMandateAgreementInstanceReportType() {
    return servicingMandateAgreementInstanceReportType;
  }

  public void setServicingMandateAgreementInstanceReportType(String servicingMandateAgreementInstanceReportType) {
    this.servicingMandateAgreementInstanceReportType = servicingMandateAgreementInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return servicingMandateAgreementInstanceReport
  **/

  public Object getServicingMandateAgreementInstanceReport() {
    return servicingMandateAgreementInstanceReport;
  }

  public void setServicingMandateAgreementInstanceReport(Object servicingMandateAgreementInstanceReport) {
    this.servicingMandateAgreementInstanceReport = servicingMandateAgreementInstanceReport;
  }


}

