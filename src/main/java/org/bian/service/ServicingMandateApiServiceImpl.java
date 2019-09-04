/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.bian.dto.*;
import org.bian.util.JsonReader;
import com.fasterxml.jackson.core.type.TypeReference;

@Service
public class ServicingMandateApiServiceImpl implements ServicingMandateApiService {

	public SDServicingMandateActivateOutputModel activate(SDServicingMandateActivateInputModel request){
		return JsonReader.read("activate-SDServicingMandateActivateOutputModel.json",new TypeReference<SDServicingMandateActivateOutputModel>(){});
	}
	
	public SDServicingMandateConfigureOutputModel configure(String sdReferenceId, SDServicingMandateConfigureInputModel request){
		return JsonReader.read("configure-SDServicingMandateConfigureOutputModel.json",new TypeReference<SDServicingMandateConfigureOutputModel>(){});
	}
	
	public BQCustomerMandateControlOutputModel controlCustomermandate(String sdReferenceId, String crReferenceId, String bqReferenceId, BQCustomerMandateControlInputModel request){
		return JsonReader.read("control-BQCustomerMandateControlOutputModel.json",new TypeReference<BQCustomerMandateControlOutputModel>(){});
	}
	
	public CRServicingMandateAgreementControlOutputModel control(String sdReferenceId, String crReferenceId, CRServicingMandateAgreementControlInputModel request){
		return JsonReader.read("control-CRServicingMandateAgreementControlOutputModel.json",new TypeReference<CRServicingMandateAgreementControlOutputModel>(){});
	}
	
	public CRServicingMandateAgreementEvaluateOutputModel evaluate(String sdReferenceId, CRServicingMandateAgreementEvaluateInputModel request){
		return JsonReader.read("evaluate-CRServicingMandateAgreementEvaluateOutputModel.json",new TypeReference<CRServicingMandateAgreementEvaluateOutputModel>(){});
	}
	
	public BQCustomerMandateEvaluateOutputModel evaluateCustomermandate(String sdReferenceId, String crReferenceId, BQCustomerMandateEvaluateInputModel request){
		return JsonReader.read("evaluate-BQCustomerMandateEvaluateOutputModel.json",new TypeReference<BQCustomerMandateEvaluateOutputModel>(){});
	}
	
	public BQCustomerMandateExchangeOutputModel exchangeCustomermandate(String sdReferenceId, String crReferenceId, String bqReferenceId, BQCustomerMandateExchangeInputModel request){
		return JsonReader.read("exchange-BQCustomerMandateExchangeOutputModel.json",new TypeReference<BQCustomerMandateExchangeOutputModel>(){});
	}
	
	public CRServicingMandateAgreementExchangeOutputModel exchange(String sdReferenceId, String crReferenceId, CRServicingMandateAgreementExchangeInputModel request){
		return JsonReader.read("exchange-CRServicingMandateAgreementExchangeOutputModel.json",new TypeReference<CRServicingMandateAgreementExchangeOutputModel>(){});
	}
	
	public SDServicingMandateFeedbackOutputModel feedback(String sdReferenceId, SDServicingMandateFeedbackInputModel request){
		return JsonReader.read("feedback-SDServicingMandateFeedbackOutputModel.json",new TypeReference<SDServicingMandateFeedbackOutputModel>(){});
	}
	
	public BQCustomerMandateGrantOutputModel grantCustomermandate(String sdReferenceId, String crReferenceId, String bqReferenceId, BQCustomerMandateGrantInputModel request){
		return JsonReader.read("grant-BQCustomerMandateGrantOutputModel.json",new TypeReference<BQCustomerMandateGrantOutputModel>(){});
	}
	
	public CRServicingMandateAgreementGrantOutputModel grant(String sdReferenceId, String crReferenceId, CRServicingMandateAgreementGrantInputModel request){
		return JsonReader.read("grant-CRServicingMandateAgreementGrantOutputModel.json",new TypeReference<CRServicingMandateAgreementGrantOutputModel>(){});
	}
	
	public CRServicingMandateAgreementRequestOutputModel request(String sdReferenceId, String crReferenceId, CRServicingMandateAgreementRequestInputModel request){
		return JsonReader.read("request-CRServicingMandateAgreementRequestOutputModel.json",new TypeReference<CRServicingMandateAgreementRequestOutputModel>(){});
	}
	
	public SDServicingMandateRetrieveOutputModel retrieveSD(String sdReferenceId){
		return JsonReader.read("retrieveSD-SDServicingMandateRetrieveOutputModel.json",new TypeReference<SDServicingMandateRetrieveOutputModel>(){});
	}
	
	public CRServicingMandateAgreementRetrieveOutputModel retrieve(String sdReferenceId, String crReferenceId){
		return JsonReader.read("retrieve-CRServicingMandateAgreementRetrieveOutputModel.json",new TypeReference<CRServicingMandateAgreementRetrieveOutputModel>(){});
	}
	
	public BQCustomerMandateRetrieveOutputModel retrieveCustomermandate(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQCustomerMandateRetrieveOutputModel.json",new TypeReference<BQCustomerMandateRetrieveOutputModel>(){});
	}
	
	public List<String> retrieveBQIds(String sdReferenceId, String crReferenceId, String behaviorQualifier){
		return JsonReader.read("retrieveBQIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public List<String> retrieveBQs(){
		return JsonReader.read("retrieveBQs-String.json",new TypeReference<List<String>>(){});
	}
	
	public List<String> retrieveRefIds(String sdReferenceId){
		return JsonReader.read("retrieveRefIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public CRServicingMandateAgreementUpdateOutputModel update(String sdReferenceId, String crReferenceId, CRServicingMandateAgreementUpdateInputModel request){
		return JsonReader.read("update-CRServicingMandateAgreementUpdateOutputModel.json",new TypeReference<CRServicingMandateAgreementUpdateOutputModel>(){});
	}
	
	public BQCustomerMandateUpdateOutputModel updateCustomermandate(String sdReferenceId, String crReferenceId, String bqReferenceId, BQCustomerMandateUpdateInputModel request){
		return JsonReader.read("update-BQCustomerMandateUpdateOutputModel.json",new TypeReference<BQCustomerMandateUpdateOutputModel>(){});
	}
	
}
