package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRServicingMandateAgreementRetrieveInputModelServicingMandateAgreementInstanceAnalysis
 */
public class CRServicingMandateAgreementRetrieveInputModelServicingMandateAgreementInstanceAnalysis   {
  private String servicingMandateAgreementInstanceAnalysisReference = null;

  private String servicingMandateAgreementInstanceAnalysisReportType = null;

  private String servicingMandateAgreementInstanceAnalysisParameters = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance analysis view 
   * @return servicingMandateAgreementInstanceAnalysisReference
  **/

  public String getServicingMandateAgreementInstanceAnalysisReference() {
    return servicingMandateAgreementInstanceAnalysisReference;
  }

  public void setServicingMandateAgreementInstanceAnalysisReference(String servicingMandateAgreementInstanceAnalysisReference) {
    this.servicingMandateAgreementInstanceAnalysisReference = servicingMandateAgreementInstanceAnalysisReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return servicingMandateAgreementInstanceAnalysisParameters
  **/

  public String getServicingMandateAgreementInstanceAnalysisParameters() {
    return servicingMandateAgreementInstanceAnalysisParameters;
  }

  public void setServicingMandateAgreementInstanceAnalysisParameters(String servicingMandateAgreementInstanceAnalysisParameters) {
    this.servicingMandateAgreementInstanceAnalysisParameters = servicingMandateAgreementInstanceAnalysisParameters;
  }


}

