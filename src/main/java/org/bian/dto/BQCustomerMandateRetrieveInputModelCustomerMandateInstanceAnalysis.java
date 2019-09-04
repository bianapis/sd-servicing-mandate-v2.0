package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQCustomerMandateRetrieveInputModelCustomerMandateInstanceAnalysis
 */
public class BQCustomerMandateRetrieveInputModelCustomerMandateInstanceAnalysis   {
  private String customerMandateInstanceAnalysisReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance analysis view 
   * @return customerMandateInstanceAnalysisReference
  **/

  public String getCustomerMandateInstanceAnalysisReference() {
    return customerMandateInstanceAnalysisReference;
  }

  public void setCustomerMandateInstanceAnalysisReference(String customerMandateInstanceAnalysisReference) {
    this.customerMandateInstanceAnalysisReference = customerMandateInstanceAnalysisReference;
  }


}

