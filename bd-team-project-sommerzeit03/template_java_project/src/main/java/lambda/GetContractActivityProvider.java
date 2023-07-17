package main.java.lambda;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import main.java.dependency.DaggerServiceComponent;
import main.java.dependency.ServiceComponent;
import main.java.models.requests.GetContractRequest;
import main.java.models.results.GetContractResult;

public class GetContractActivityProvider implements RequestHandler<GetContractRequest, GetContractResult> {

    private static ServiceComponent serviceComponent;

    public GetContractActivityProvider() {}


    @Override
    public GetContractResult handleRequest(GetContractRequest getContractRequest, Context context) {
        return getServiceComponent().provideGetContractActivity().handleRequest(getContractRequest, context);
    }

    private ServiceComponent getServiceComponent() {
        if (serviceComponent == null) {
            serviceComponent = DaggerServiceComponent.create();
        }

        return serviceComponent;
    }
}
