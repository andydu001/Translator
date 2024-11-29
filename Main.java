package org.example;

import com.amazonaws.services.xray.AWSXRayClientBuilder;
import com.amazonaws.services.chatbot.AWSChatbot;
import com.amazonaws.services.chatbot.model.CreateMicrosoftTeamsChannelConfigurationRequest;
import com.amazonaws.services.chatbot.model.TagResourceRequest;
import com.amazonaws.services.xray.AWSXRay;
import com.ibm.cloud.sdk.core.security.Authenticator;
import com.ibm.cloud.sdk.core.security.NoAuthAuthenticator;
import com.ibm.watson.common.WatsonHttpHeaders;
import io.debezium.metrics.activity.ActivityMonitoringMeter;
import com.ibm.watson.language_translator.v3.model.TranslateOptions;
import com.microsoft.graph.core.models.UploadSession;
import com.microsoft.graph.core.requests.BaseGraphRequestAdapter;
import com.microsoft.graph.core.tasks.LargeFileUploadTask;
import com.amazonaws.services.chatbot.AWSChatbotClientBuilder;
import com.amazonaws.services.chatbot.AWSChatbotClient;
import com.amazonaws.services.kinesisanalytics.AmazonKinesisAnalyticsClientBuilder;
import com.microsoft.kiota.RequestAdapter;
import com.microsoft.kiota.RequestInformation;
import com.microsoft.kiota.authentication.AnonymousAuthenticationProvider;
import com.microsoft.kiota.serialization.*;
import com.microsoft.kiota.store.BackingStoreFactory;
import com.ibm.watson.language_translator.v3.LanguageTranslator;
import okhttp3.Call;
import okhttp3.Request;
import  org.uma.jmetal.util.permutation.PermutationFactory;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException, InvocationTargetException, IllegalAccessException, NoSuchMethodException, InterruptedException {
    /*    AWSXRayClientBuilder builder = AWSXRayClientBuilder.standard();

        AWSXRay awsxRay = builder.build();

        if (awsxRay != null) {

            awsxRay.shutdown();
        }

        AWSChatbotClientBuilder chatbotBuilder =   AWSChatbotClient.builder();

        AWSChatbot awsChatbot = chatbotBuilder.build();

        if(awsChatbot != null) {
            awsChatbot.createMicrosoftTeamsChannelConfiguration(new CreateMicrosoftTeamsChannelConfigurationRequest());
            awsChatbot.tagResource(new TagResourceRequest());
        }


        AmazonKinesisAnalyticsClientBuilder ki = AmazonKinesisAnalyticsClientBuilder.standard();
        ki.build();


*/


/*
      LargeFileUploadTask largeFileUploadTask = new LargeFileUploadTask(new RequestAdapter() {
          @Override
          public void enableBackingStore(BackingStoreFactory backingStoreFactory) {

          }

          @Override
          public SerializationWriterFactory getSerializationWriterFactory() {
              return null;
          }

          @Override
          public <ModelType extends Parsable> ModelType send(RequestInformation requestInfo, HashMap<String, ParsableFactory<? extends Parsable>> errorMappings, ParsableFactory<ModelType> factory) {
              return null;
          }

          @Override
          public <ModelType extends Parsable> List<ModelType> sendCollection(RequestInformation requestInfo, HashMap<String, ParsableFactory<? extends Parsable>> errorMappings, ParsableFactory<ModelType> factory) {
              return null;
          }

          @Override
          public <ModelType> ModelType sendPrimitive(RequestInformation requestInfo, HashMap<String, ParsableFactory<? extends Parsable>> errorMappings, Class<ModelType> targetClass) {
              return null;
          }

          @Override
          public <ModelType> List<ModelType> sendPrimitiveCollection(RequestInformation requestInfo, HashMap<String, ParsableFactory<? extends Parsable>> errorMappings, Class<ModelType> targetClass) {
              return null;
          }

          @Override
          public <ModelType extends Enum<ModelType>> ModelType sendEnum(RequestInformation requestInfo, HashMap<String, ParsableFactory<? extends Parsable>> errorMappings, ValuedEnumParser<ModelType> enumParser) {
              return null;
          }

          @Override
          public <ModelType extends Enum<ModelType>> List<ModelType> sendEnumCollection(RequestInformation requestInfo, HashMap<String, ParsableFactory<? extends Parsable>> errorMappings, ValuedEnumParser<ModelType> enumParser) {
              return null;
          }

          @Override
          public void setBaseUrl(String baseUrl) {

          }

          @Override
          public String getBaseUrl() {
              return "https://www.bing.com/";
          }

          @Override
          public <T> T convertToNativeRequest(RequestInformation requestInfo) {
              return null;
          }
      }, new UploadSession(), new FileInputStream(new File("C:\\Users\\andyd\\Downloads\\output (1).pdf")), 3333L, 333L, new ParsableFactory() {
          @Override
          public Parsable create(ParseNode parseNode) {

              return null;
          }
      });

*/




        LanguageTranslator  getLanguageTranslator = new LanguageTranslator("2024-05-20", new Authenticator() {
            @Override
            public void validate() {

            }

            @Override
            public String authenticationType() {
                return null;
            }

            @Override
            public void authenticate(Request.Builder requestBuilder) {

                requestBuilder.url("https://api.us-east.language-translator.watson.cloud.ibm.com/instances/your-instance-id/v3/translate?version=2024-05-20").build();


            }
        });
        getLanguageTranslator.setServiceUrl("https://api.us-east.language-translator.watson.cloud.ibm.com");

        TranslateOptions options = new TranslateOptions.Builder().source("french").target("english").addText("Je suis malade").build();;

        System.out.println(getLanguageTranslator.translate(options).execute().getResult().getTranslations().get(0).getTranslation());

    }
}
