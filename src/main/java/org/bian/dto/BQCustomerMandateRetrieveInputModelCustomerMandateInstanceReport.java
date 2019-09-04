package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQCustomerMandateRetrieveInputModelCustomerMandateInstanceReport
 */
public class BQCustomerMandateRetrieveInputModelCustomerMandateInstanceReport   {
  private String customerMandateInstanceReportReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return customerMandateInstanceReportReference
  **/

  public String getCustomerMandateInstanceReportReference() {
    return customerMandateInstanceReportReference;
  }

  public void setCustomerMandateInstanceReportReference(String customerMandateInstanceReportReference) {
    this.customerMandateInstanceReportReference = customerMandateInstanceReportReference;
  }


}

