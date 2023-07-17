package main.java.dependency;

import dagger.Component;
import main.java.activity.*;

import javax.inject.Singleton;

@Component(modules = {DaoModule.class})
@Singleton
public interface ServiceComponent {

    CreateContractActivity provideCreateContractActivity();
    CreatePlayerActivity provideCreatePlayerActivity();
    GetContractActivity provideGetContractActivity();
    GetPlayerActivity provideGetPlayerActivity();
    GetTeamActivity provideGetTeamActivity();
    UpdatePlayerActivity provideUpdatePlayerActivity();

}
