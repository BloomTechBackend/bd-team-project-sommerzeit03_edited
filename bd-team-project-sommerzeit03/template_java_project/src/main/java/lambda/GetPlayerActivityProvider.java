package main.java.lambda;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import main.java.dependency.DaggerServiceComponent;
import main.java.dependency.ServiceComponent;
import main.java.models.requests.GetPlayerRequest;
import main.java.models.results.GetPlayerResult;

public class GetPlayerActivityProvider implements RequestHandler<GetPlayerRequest, GetPlayerResult> {

    private static ServiceComponent serviceComponent;

    public GetPlayerActivityProvider() {}


    @Override
    public GetPlayerResult handleRequest(GetPlayerRequest getPlayerRequest, Context context) {
        return getServiceComponent().provideGetPlayerActivity().handleRequest(getPlayerRequest, context);
    }

    private ServiceComponent getServiceComponent() {
        if (serviceComponent == null) {
            serviceComponent = DaggerServiceComponent.create();
        }
        return serviceComponent;
    }
}
