package service;

import io.grpc.stub.StreamObserver;
import ma.ace.stubs.Calcul;
import ma.ace.stubs.CalculatorServiceGrpc;

public class CalculatorGrpcService extends CalculatorServiceGrpc.CalculatorServiceImplBase {

    public void add(Calcul.CalculateRequest request, StreamObserver<Calcul.CalculateResponse> responseObserver) {
        double result = request.getNumber1() + request.getNumber2();
        Calcul.CalculateResponse response = Calcul.CalculateResponse.newBuilder()
                .setResult(result)
                .build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    public void subtract(Calcul.CalculateRequest request, StreamObserver<Calcul.CalculateResponse> responseObserver) {
        double result = request.getNumber1() - request.getNumber2();
        Calcul.CalculateResponse response = Calcul.CalculateResponse.newBuilder()
                .setResult(result)
                .build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    public void multiply(Calcul.CalculateRequest request, StreamObserver<Calcul.CalculateResponse> responseObserver) {
        double result = request.getNumber1() * request.getNumber2();
        Calcul.CalculateResponse response = Calcul.CalculateResponse.newBuilder()
                .setResult(result)
                .build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void divide(Calcul.CalculateRequest request, StreamObserver<Calcul.CalculateResponse> responseObserver) {
        double result;
        if (request.getNumber2() != 0) {
            result = request.getNumber1() / request.getNumber2();
        } else {
            result = Double.POSITIVE_INFINITY; // Division by zero
        }

        Calcul.CalculateResponse response = Calcul.CalculateResponse.newBuilder()
                .setResult(result)
                .build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }
}
