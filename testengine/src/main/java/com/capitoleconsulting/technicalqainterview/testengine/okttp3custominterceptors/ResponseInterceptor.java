package com.capitoleconsulting.technicalqainterview.testengine.okttp3custominterceptors;

import okhttp3.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.util.List;

public class ResponseInterceptor implements Interceptor {

    private static final Logger logger = LogManager.getLogger(ResponseInterceptor.class);

    @Override
    public Response intercept(Chain chain) throws IOException {
        Request request = chain.request();
        Headers headers = request.headers();

        if (headers.toMultimap().getOrDefault("no-log", List.of()).size() == 1) return chain.proceed(request);

        Response response = chain.proceed(request);
        MediaType contentType = response.body().contentType();
        String bodyString = response.body().string();
        int statusCode = response.code();

        logger.info("   ╭--- RESPONSE (" + response.code() + ") --- "  );
        logger.info( "   " + bodyString.replaceAll("(\\r|\\n| )", ""));
        logger.info("   ╰------------------------------------------");
        logger.info("   ================== END REQUEST ====================");

        ResponseBody newResponseBody = ResponseBody.create(contentType, bodyString);
        return response.newBuilder().code(statusCode).body(newResponseBody).build();
    }
}
