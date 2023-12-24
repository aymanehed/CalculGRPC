package server;
import io.grpc.BindableService;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import service.CalculatorGrpcService;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
public class server {
    Server server ;
    private void start() throws IOException, InterruptedException {

        int port=9997 ;
        server = ServerBuilder.forPort(port)
                .addService((BindableService) new CalculatorGrpcService())
                .build()
                .start();

        System.out.println("Server started, listening on " + port);
    }
    private void stop() throws InterruptedException {
        if (server != null) {
            server.shutdown().awaitTermination(30, TimeUnit.SECONDS);
        }
    }

    private void blockUntilShutdown() throws InterruptedException {
        if (server != null) {
            server.awaitTermination();
        }
    }
    public static void main(String[] args) throws IOException, InterruptedException {
        final server ser = new server();
        ser.start();
        ser.blockUntilShutdown();
    }

}
