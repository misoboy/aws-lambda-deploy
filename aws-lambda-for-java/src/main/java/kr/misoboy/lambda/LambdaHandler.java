package kr.misoboy.lambda;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

public class LambdaHandler implements RequestHandler<Void, Void> {

    public Void handleRequest(Void v, Context context) {

        System.out.println("Hello, Lambda");
        return null;
    }
}
