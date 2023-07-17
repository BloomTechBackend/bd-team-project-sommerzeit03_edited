package main.java.lambda;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import main.java.dependency.DaggerServiceComponent;
import main.java.dependency.ServiceComponent;
import main.java.models.requests.CreateContractRequest;
import main.java.models.results.CreateContractResult;

public class CreateContractActivityProvider implements RequestHandler<CreateContractRequest, CreateContractResult> {

    private static ServiceComponent serviceComponent = DaggerServiceComponent.create();

    public CreateContractActivityProvider () {

    }

    @Override
    public CreateContractResult handleRequest(CreateContractRequest createContractRequest, Context context) {
        return getServiceComponent().provideCreateContractActivity().handleRequest(createContractRequest, context);
    }

    private ServiceComponent getServiceComponent() {
        if (serviceComponent == null) {
            serviceComponent = DaggerServiceComponent.create();
        }

        return serviceComponent;
    }
}
