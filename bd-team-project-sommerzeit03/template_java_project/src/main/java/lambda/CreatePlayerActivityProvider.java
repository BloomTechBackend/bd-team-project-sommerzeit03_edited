package main.java.lambda;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import main.java.dependency.DaggerServiceComponent;
import main.java.dependency.ServiceComponent;
import main.java.models.requests.CreatePlayerRequest;
import main.java.models.results.CreatePlayerResult;

public class CreatePlayerActivityProvider implements RequestHandler<CreatePlayerRequest, CreatePlayerResult> {

    private static ServiceComponent serviceComponent;

    public CreatePlayerActivityProvider() {}

    @Override
    public CreatePlayerResult handleRequest(CreatePlayerRequest createPlayerRequest, Context context) {
        return getServiceComponent().provideCreatePlayerActivity().handleRequest(createPlayerRequest, context);
    }

    private ServiceComponent getServiceComponent() {
        if (serviceComponent == null) {
            serviceComponent = DaggerServiceComponent.create();
        }
        return serviceComponent;
    }
}
