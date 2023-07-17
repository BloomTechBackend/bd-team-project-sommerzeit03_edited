package main.java.lambda;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import main.java.dependency.DaggerServiceComponent;
import main.java.dependency.ServiceComponent;
import main.java.models.requests.UpdatePlayerRequest;
import main.java.models.results.UpdatePlayerResult;

public class UpdatePlayerActivityProvider implements RequestHandler<UpdatePlayerRequest, UpdatePlayerResult> {

    private static ServiceComponent serviceComponent;

    public UpdatePlayerActivityProvider() {

    }


    @Override
    public UpdatePlayerResult handleRequest(UpdatePlayerRequest updatePlayerRequest, Context context) {
        return getServiceComponent().provideUpdatePlayerActivity().handleRequest(updatePlayerRequest, context);
    }

    private ServiceComponent getServiceComponent() {
        if (serviceComponent == null) {
            serviceComponent = DaggerServiceComponent.create();
        }

        return serviceComponent;
    }
}
