package client;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;
import ma.ace.stubs.CalculatorServiceGrpc;
import ma.ace.stubs.Calcul;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

public class client {

    public static void main(String[] args) throws InterruptedException {
        // Create a channel
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 9997).usePlaintext().build();

        // Create a stub
        CalculatorServiceGrpc.CalculatorServiceStub stub = CalculatorServiceGrpc.newStub(channel);

        // Call unary RPC (add)
        performUnaryCall(stub);



        // Call client streaming RPC (multiply)


        // Add a delay to allow gRPC calls to complete
        Thread.sleep(2000); // Adjust the duration as needed

        // Shutdown the channel
        channel.shutdown();
    }

    private static void performUnaryCall(CalculatorServiceGrpc.CalculatorServiceStub stub) {
        Calcul.CalculateRequest request = Calcul.CalculateRequest.newBuilder()
                .setNumber1(10.0)
                .setNumber2(5.0)
                .build();

        stub.add(request, new StreamObserver<Calcul.CalculateResponse>() {
            @Override
            public void onNext(Calcul.CalculateResponse response) {
                System.out.println("Unary RPC Response: " + response.getResult());
            }

            @Override
            public void onError(Throwable throwable) {
                System.out.println("Error in Unary RPC: " + throwable.getMessage());
            }

            @Override
            public void onCompleted() {
                System.out.println("Unary RPC Completed");
            }
        });
    }

    private static void performServerStreamingCall(CalculatorServiceGrpc.CalculatorServiceStub stub) {
        Calcul.CalculateRequest request = Calcul.CalculateRequest.newBuilder()
                .setNumber1(10.0)
                .setNumber2(5.0)
                .build();

        stub.subtract(request, new StreamObserver<Calcul.CalculateResponse>() {
            @Override
            public void onNext(Calcul.CalculateResponse response) {
                System.out.println("Server Streaming RPC Response: " + response.getResult());
            }

            @Override
            public void onError(Throwable throwable) {
                System.out.println("Error in Server Streaming RPC: " + throwable.getMessage());
            }

            @Override
            public void onCompleted() {
                System.out.println("Server Streaming RPC Completed");
            }
        });
    }

    private static void performClientStreamingCall(CalculatorServiceGrpc.CalculatorServiceStub stub) {
        StreamObserver<Calcul.CalculateRequest> requestObserver = stub.multiply(new StreamObserver<Calcul.CalculateResponse>() {
            @Override
            public void onNext(Calcul.CalculateResponse response) {
                System.out.println("Client Streaming RPC Response: " + response.getResult());
            }

            @Override
            public void onError(Throwable throwable) {
                System.out.println("Error in Client Streaming RPC: " + throwable.getMessage());
            }

            @Override
            public void onCompleted() {
                System.out.println("Client Streaming RPC Completed");
            }
        });

        // Send multiple requests using requestObserver.onNext()
        requestObserver.onNext(Calcul.CalculateRequest.newBuilder()
                .setNumber1(2.0)
                .setNumber2(3.0)
                .build());

        // You can send more requests as needed

        // Complete the stream
        requestObserver.onCompleted();
    }
}
