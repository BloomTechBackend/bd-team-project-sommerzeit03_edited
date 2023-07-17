package main.java.lambda;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import main.java.dependency.DaggerServiceComponent;
import main.java.dependency.ServiceComponent;
import main.java.models.requests.GetTeamRequest;
import main.java.models.results.GetTeamResult;

public class GetTeamActivityProvider implements RequestHandler<GetTeamRequest, GetTeamResult> {

    private static ServiceComponent serviceComponent;

    public GetTeamActivityProvider() {}

    @Override
    public GetTeamResult handleRequest(GetTeamRequest getTeamRequest, Context context) {
        return getServiceComponent().provideGetTeamActivity().handleRequest(getTeamRequest, context);
    }

    private ServiceComponent getServiceComponent() {
        if (serviceComponent == null) {
            serviceComponent = DaggerServiceComponent.create();
        }

        return serviceComponent;
    }
}
