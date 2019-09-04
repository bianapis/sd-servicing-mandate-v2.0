package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRServicingMandateAgreementRetrieveOutputModelServicingMandateAgreementInstanceAnalysis
 */
public class CRServicingMandateAgreementRetrieveOutputModelServicingMandateAgreementInstanceAnalysis   {
  private String servicingMandateAgreementInstanceAnalysisData = null;

  private String servicingMandateAgreementInstanceAnalysisReportType = null;

  private Object servicingMandateAgreementInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return servicingMandateAgreementInstanceAnalysisData
  **/

  public String getServicingMandateAgreementInstanceAnalysisData() {
    return servicingMandateAgreementInstanceAnalysisData;
  }

  public void setServicingMandateAgreementInstanceAnalysisData(String servicingMandateAgreementInstanceAnalysisData) {
    this.servicingMandateAgreementInstanceAnalysisData = servicingMandateAgreementInstanceAnalysisData;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return servicingMandateAgreementInstanceAnalysisReportType
  **/

  public String getServicingMandateAgreementInstanceAnalysisReportType() {
    return servicingMandateAgreementInstanceAnalysisReportType;
  }

  public void setServicingMandateAgreementInstanceAnalysisReportType(String servicingMandateAgreementInstanceAnalysisReportType) {
    this.servicingMandateAgreementInstanceAnalysisReportType = servicingMandateAgreementInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return servicingMandateAgreementInstanceAnalysisReport
  **/

  public Object getServicingMandateAgreementInstanceAnalysisReport() {
    return servicingMandateAgreementInstanceAnalysisReport;
  }

  public void setServicingMandateAgreementInstanceAnalysisReport(Object servicingMandateAgreementInstanceAnalysisReport) {
    this.servicingMandateAgreementInstanceAnalysisReport = servicingMandateAgreementInstanceAnalysisReport;
  }


}

