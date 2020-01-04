package com.example;

import com.amazonaws.services.lambda.runtime.Context;
import org.junit.BeforeClass;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.assertEquals;

public class LambdaHandlerTest {

    private static LambdaInput input;

    @BeforeClass
    public static void createInput() throws IOException {
        // TODO: set up your sample input object here.
        input = new LambdaInput();
        input.setMessage("Hello lambda");
    }

    private Context createContext() {
        TestContext ctx = new TestContext();
        ctx.setFunctionName(System.getenv("LAMBDA_FUNCTION_NAME"));
        return ctx;
    }

    @Test
    public void testLambdaFormFunctionHandler() {
        LambdaHandler handler = new LambdaHandler();
        Context ctx = createContext();

        String output = (String) handler.myHandler(input, ctx);
        System.out.println(output);
        assertEquals("INFO: We received your message", output);
    }
}
