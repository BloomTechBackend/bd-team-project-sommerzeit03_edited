package main.java.dependency;


import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapper;
import dagger.Module;
import dagger.Provides;
import main.java.clientprovider.DynamoDBClientProvider;

import javax.inject.Singleton;

@Module
public class DaoModule {

    @Provides
    @Singleton
    DynamoDBMapper provideDynamoDBMapper() {
        return new DynamoDBMapper(DynamoDBClientProvider.getDynamoDBClient());
    }

}
