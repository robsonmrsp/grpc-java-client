package br.com.robsonmrsp;

import br.com.robsonmrsp.proto.HelloWorldMessageRequest;
import br.com.robsonmrsp.proto.HelloWorldMessageResponse;
import br.com.robsonmrsp.proto.HelloWorldServiceGrpc;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		System.out.println("Hello World client!");
		ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 8083).usePlaintext().build();
		HelloWorldServiceGrpc.HelloWorldServiceBlockingStub blockingStub = HelloWorldServiceGrpc.newBlockingStub(channel);
		HelloWorldMessageRequest build = HelloWorldMessageRequest.newBuilder().setMyName("Robson").build();

		HelloWorldMessageResponse sayHello = blockingStub.sayHello(build);

		System.out.println("Resposta: " + sayHello.getGreeting());
	}
}
