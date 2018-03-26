package hello;

import com.accurate.acec.acecbosoaintegration.boorderintegration.IntegrateOrderRequest;
import com.accurate.acec.acecbosoaintegration.boorderintegration.IntegrateOrderResponse;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class IntegrateOrderEndpoint {
    private static final String NAMESPACE_URI = "http://www.accurate.com/acec/AcecBOSOAIntegration/BOOrderIntegration";

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "integrateOrderRequest")
    @ResponsePayload
    public IntegrateOrderResponse getCountry(@RequestPayload IntegrateOrderRequest request) {
        IntegrateOrderResponse response = new IntegrateOrderResponse();

        response.setStatus("OK");
        response.setMessage("Pedido integrado com sucesso!");

        return response;
    }
}
