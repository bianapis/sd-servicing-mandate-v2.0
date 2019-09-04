package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQCustomerMandateUpdateInputModelCustomerMandateInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQCustomerMandateUpdateOutputModel
 */
public class BQCustomerMandateUpdateOutputModel   {
  private BQCustomerMandateUpdateInputModelCustomerMandateInstanceRecord customerMandateInstanceRecord = null;

  private String customerMandateUpdateActionTaskReference = null;

  private Object customerMandateUpdateActionTaskRecord = null;

  private Object updateResponseRecord = null;


  /**
   * Get customerMandateInstanceRecord
   * @return customerMandateInstanceRecord
  **/

  public BQCustomerMandateUpdateInputModelCustomerMandateInstanceRecord getCustomerMandateInstanceRecord() {
    return customerMandateInstanceRecord;
  }

  public void setCustomerMandateInstanceRecord(BQCustomerMandateUpdateInputModelCustomerMandateInstanceRecord customerMandateInstanceRecord) {
    this.customerMandateInstanceRecord = customerMandateInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an update service call 
   * @return customerMandateUpdateActionTaskReference
  **/

  public String getCustomerMandateUpdateActionTaskReference() {
    return customerMandateUpdateActionTaskReference;
  }

  public void setCustomerMandateUpdateActionTaskReference(String customerMandateUpdateActionTaskReference) {
    this.customerMandateUpdateActionTaskReference = customerMandateUpdateActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return customerMandateUpdateActionTaskRecord
  **/

  public Object getCustomerMandateUpdateActionTaskRecord() {
    return customerMandateUpdateActionTaskRecord;
  }

  public void setCustomerMandateUpdateActionTaskRecord(Object customerMandateUpdateActionTaskRecord) {
    this.customerMandateUpdateActionTaskRecord = customerMandateUpdateActionTaskRecord;
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

