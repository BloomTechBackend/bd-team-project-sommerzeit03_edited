package main.java.activity;

import dagger.Module;
import main.java.dynamodb.ContractDao;
import main.java.dynamodb.models.Contract;
import main.java.models.requests.CreateContractRequest;
import main.java.models.results.CreateContractResult;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import static org.mockito.MockitoAnnotations.initMocks;

public class CreateContractActivityTest {

    @Mock
    private ContractDao contractDao;

    private CreateContractActivity createContractActivity;

    @BeforeEach
    private void setup() {
        initMocks(this);
        createContractActivity = new CreateContractActivity(contractDao);
    }

    @Test
    void handleRequest_validRequest_createsContract() {
        // GIVEN
        Contract contract = new Contract();
        contract.setId("id");
        contract.setPlayerId("123");
        contract.setTotalYears(1);
        contract.setYearlySalary(10_000);
//
//        String requestedId = contract.getId();
//        String playerId = contract.getPlayerId();

        when(contractDao.saveContract(contract)).thenReturn(contract);

        CreateContractRequest createContractRequest = CreateContractRequest.builder()
                .withContractId("id")
                .withPlayerId("123")
                .withTotalYears(1)
                .withYearlySalary(10_000)
                .build();

        // WHEN
        CreateContractResult createContractResult = createContractActivity.handleRequest(createContractRequest, null);

//        verify(contractDao).saveContract(contract);

        // THEN
        assertEquals(1, createContractResult.getContractModel().getTotalYears());
        assertEquals("id", createContractResult.getContractModel().getId());

    }

}
