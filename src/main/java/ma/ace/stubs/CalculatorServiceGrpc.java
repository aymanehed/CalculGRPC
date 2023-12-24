package ma.ace.stubs;

import io.grpc.stub.StreamObserver;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: calcul.proto")
public final class CalculatorServiceGrpc {

  private CalculatorServiceGrpc() {}

  public static final String SERVICE_NAME = "CalculatorService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<ma.ace.stubs.Calcul.CalculateRequest,
      ma.ace.stubs.Calcul.CalculateResponse> getAddMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "add",
      requestType = ma.ace.stubs.Calcul.CalculateRequest.class,
      responseType = ma.ace.stubs.Calcul.CalculateResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<ma.ace.stubs.Calcul.CalculateRequest,
      ma.ace.stubs.Calcul.CalculateResponse> getAddMethod() {
    io.grpc.MethodDescriptor<ma.ace.stubs.Calcul.CalculateRequest, ma.ace.stubs.Calcul.CalculateResponse> getAddMethod;
    if ((getAddMethod = CalculatorServiceGrpc.getAddMethod) == null) {
      synchronized (CalculatorServiceGrpc.class) {
        if ((getAddMethod = CalculatorServiceGrpc.getAddMethod) == null) {
          CalculatorServiceGrpc.getAddMethod = getAddMethod = 
              io.grpc.MethodDescriptor.<ma.ace.stubs.Calcul.CalculateRequest, ma.ace.stubs.Calcul.CalculateResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "CalculatorService", "add"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ma.ace.stubs.Calcul.CalculateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ma.ace.stubs.Calcul.CalculateResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new CalculatorServiceMethodDescriptorSupplier("add"))
                  .build();
          }
        }
     }
     return getAddMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ma.ace.stubs.Calcul.CalculateRequest,
      ma.ace.stubs.Calcul.CalculateResponse> getSubtractMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "subtract",
      requestType = ma.ace.stubs.Calcul.CalculateRequest.class,
      responseType = ma.ace.stubs.Calcul.CalculateResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<ma.ace.stubs.Calcul.CalculateRequest,
      ma.ace.stubs.Calcul.CalculateResponse> getSubtractMethod() {
    io.grpc.MethodDescriptor<ma.ace.stubs.Calcul.CalculateRequest, ma.ace.stubs.Calcul.CalculateResponse> getSubtractMethod;
    if ((getSubtractMethod = CalculatorServiceGrpc.getSubtractMethod) == null) {
      synchronized (CalculatorServiceGrpc.class) {
        if ((getSubtractMethod = CalculatorServiceGrpc.getSubtractMethod) == null) {
          CalculatorServiceGrpc.getSubtractMethod = getSubtractMethod = 
              io.grpc.MethodDescriptor.<ma.ace.stubs.Calcul.CalculateRequest, ma.ace.stubs.Calcul.CalculateResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "CalculatorService", "subtract"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ma.ace.stubs.Calcul.CalculateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ma.ace.stubs.Calcul.CalculateResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new CalculatorServiceMethodDescriptorSupplier("subtract"))
                  .build();
          }
        }
     }
     return getSubtractMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ma.ace.stubs.Calcul.CalculateRequest,
      ma.ace.stubs.Calcul.CalculateResponse> getMultiplyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "multiply",
      requestType = ma.ace.stubs.Calcul.CalculateRequest.class,
      responseType = ma.ace.stubs.Calcul.CalculateResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<ma.ace.stubs.Calcul.CalculateRequest,
      ma.ace.stubs.Calcul.CalculateResponse> getMultiplyMethod() {
    io.grpc.MethodDescriptor<ma.ace.stubs.Calcul.CalculateRequest, ma.ace.stubs.Calcul.CalculateResponse> getMultiplyMethod;
    if ((getMultiplyMethod = CalculatorServiceGrpc.getMultiplyMethod) == null) {
      synchronized (CalculatorServiceGrpc.class) {
        if ((getMultiplyMethod = CalculatorServiceGrpc.getMultiplyMethod) == null) {
          CalculatorServiceGrpc.getMultiplyMethod = getMultiplyMethod = 
              io.grpc.MethodDescriptor.<ma.ace.stubs.Calcul.CalculateRequest, ma.ace.stubs.Calcul.CalculateResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "CalculatorService", "multiply"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ma.ace.stubs.Calcul.CalculateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ma.ace.stubs.Calcul.CalculateResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new CalculatorServiceMethodDescriptorSupplier("multiply"))
                  .build();
          }
        }
     }
     return getMultiplyMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ma.ace.stubs.Calcul.CalculateRequest,
      ma.ace.stubs.Calcul.CalculateResponse> getDivideMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "divide",
      requestType = ma.ace.stubs.Calcul.CalculateRequest.class,
      responseType = ma.ace.stubs.Calcul.CalculateResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ma.ace.stubs.Calcul.CalculateRequest,
      ma.ace.stubs.Calcul.CalculateResponse> getDivideMethod() {
    io.grpc.MethodDescriptor<ma.ace.stubs.Calcul.CalculateRequest, ma.ace.stubs.Calcul.CalculateResponse> getDivideMethod;
    if ((getDivideMethod = CalculatorServiceGrpc.getDivideMethod) == null) {
      synchronized (CalculatorServiceGrpc.class) {
        if ((getDivideMethod = CalculatorServiceGrpc.getDivideMethod) == null) {
          CalculatorServiceGrpc.getDivideMethod = getDivideMethod = 
              io.grpc.MethodDescriptor.<ma.ace.stubs.Calcul.CalculateRequest, ma.ace.stubs.Calcul.CalculateResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "CalculatorService", "divide"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ma.ace.stubs.Calcul.CalculateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ma.ace.stubs.Calcul.CalculateResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new CalculatorServiceMethodDescriptorSupplier("divide"))
                  .build();
          }
        }
     }
     return getDivideMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static CalculatorServiceStub newStub(io.grpc.Channel channel) {
    return new CalculatorServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static CalculatorServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new CalculatorServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static CalculatorServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new CalculatorServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class CalculatorServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void add(ma.ace.stubs.Calcul.CalculateRequest request,
        io.grpc.stub.StreamObserver<ma.ace.stubs.Calcul.CalculateResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getAddMethod(), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<ma.ace.stubs.Calcul.CalculateRequest> subtract(
        io.grpc.stub.StreamObserver<ma.ace.stubs.Calcul.CalculateResponse> responseObserver) {
      return asyncUnimplementedStreamingCall(getSubtractMethod(), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<ma.ace.stubs.Calcul.CalculateRequest> multiply(
        io.grpc.stub.StreamObserver<ma.ace.stubs.Calcul.CalculateResponse> responseObserver) {
      return asyncUnimplementedStreamingCall(getMultiplyMethod(), responseObserver);
    }

    /**
     */
    public void divide(ma.ace.stubs.Calcul.CalculateRequest request,
        io.grpc.stub.StreamObserver<ma.ace.stubs.Calcul.CalculateResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getDivideMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getAddMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                ma.ace.stubs.Calcul.CalculateRequest,
                ma.ace.stubs.Calcul.CalculateResponse>(
                  this, METHODID_ADD)))
          .addMethod(
            getSubtractMethod(),
            asyncBidiStreamingCall(
              new MethodHandlers<
                ma.ace.stubs.Calcul.CalculateRequest,
                ma.ace.stubs.Calcul.CalculateResponse>(
                  this, METHODID_SUBTRACT)))
          .addMethod(
            getMultiplyMethod(),
            asyncClientStreamingCall(
              new MethodHandlers<
                ma.ace.stubs.Calcul.CalculateRequest,
                ma.ace.stubs.Calcul.CalculateResponse>(
                  this, METHODID_MULTIPLY)))
          .addMethod(
            getDivideMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                ma.ace.stubs.Calcul.CalculateRequest,
                ma.ace.stubs.Calcul.CalculateResponse>(
                  this, METHODID_DIVIDE)))
          .build();
    }
  }

  /**
   */
  public static final class CalculatorServiceStub extends io.grpc.stub.AbstractStub<CalculatorServiceStub> {
    private CalculatorServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CalculatorServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CalculatorServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CalculatorServiceStub(channel, callOptions);
    }

    /**
     */
    public void add(ma.ace.stubs.Calcul.CalculateRequest request,
        io.grpc.stub.StreamObserver<ma.ace.stubs.Calcul.CalculateResponse> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getAddMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<ma.ace.stubs.Calcul.CalculateRequest> subtract(
            Calcul.CalculateRequest request, StreamObserver<Calcul.CalculateResponse> responseObserver) {
      return asyncBidiStreamingCall(
          getChannel().newCall(getSubtractMethod(), getCallOptions()), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<ma.ace.stubs.Calcul.CalculateRequest> multiply(
        io.grpc.stub.StreamObserver<ma.ace.stubs.Calcul.CalculateResponse> responseObserver) {
      return asyncClientStreamingCall(
          getChannel().newCall(getMultiplyMethod(), getCallOptions()), responseObserver);
    }

    /**
     */
    public void divide(ma.ace.stubs.Calcul.CalculateRequest request,
        io.grpc.stub.StreamObserver<ma.ace.stubs.Calcul.CalculateResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDivideMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class CalculatorServiceBlockingStub extends io.grpc.stub.AbstractStub<CalculatorServiceBlockingStub> {
    private CalculatorServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CalculatorServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CalculatorServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CalculatorServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public java.util.Iterator<ma.ace.stubs.Calcul.CalculateResponse> add(
        ma.ace.stubs.Calcul.CalculateRequest request) {
      return blockingServerStreamingCall(
          getChannel(), getAddMethod(), getCallOptions(), request);
    }

    /**
     */
    public ma.ace.stubs.Calcul.CalculateResponse divide(ma.ace.stubs.Calcul.CalculateRequest request) {
      return blockingUnaryCall(
          getChannel(), getDivideMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class CalculatorServiceFutureStub extends io.grpc.stub.AbstractStub<CalculatorServiceFutureStub> {
    private CalculatorServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CalculatorServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CalculatorServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CalculatorServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ma.ace.stubs.Calcul.CalculateResponse> divide(
        ma.ace.stubs.Calcul.CalculateRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDivideMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_ADD = 0;
  private static final int METHODID_DIVIDE = 1;
  private static final int METHODID_SUBTRACT = 2;
  private static final int METHODID_MULTIPLY = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final CalculatorServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(CalculatorServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_ADD:
          serviceImpl.add((ma.ace.stubs.Calcul.CalculateRequest) request,
              (io.grpc.stub.StreamObserver<ma.ace.stubs.Calcul.CalculateResponse>) responseObserver);
          break;
        case METHODID_DIVIDE:
          serviceImpl.divide((ma.ace.stubs.Calcul.CalculateRequest) request,
              (io.grpc.stub.StreamObserver<ma.ace.stubs.Calcul.CalculateResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SUBTRACT:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.subtract(
              (io.grpc.stub.StreamObserver<ma.ace.stubs.Calcul.CalculateResponse>) responseObserver);
        case METHODID_MULTIPLY:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.multiply(
              (io.grpc.stub.StreamObserver<ma.ace.stubs.Calcul.CalculateResponse>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class CalculatorServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    CalculatorServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return ma.ace.stubs.Calcul.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("CalculatorService");
    }
  }

  private static final class CalculatorServiceFileDescriptorSupplier
      extends CalculatorServiceBaseDescriptorSupplier {
    CalculatorServiceFileDescriptorSupplier() {}
  }

  private static final class CalculatorServiceMethodDescriptorSupplier
      extends CalculatorServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    CalculatorServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (CalculatorServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new CalculatorServiceFileDescriptorSupplier())
              .addMethod(getAddMethod())
              .addMethod(getSubtractMethod())
              .addMethod(getMultiplyMethod())
              .addMethod(getDivideMethod())
              .build();
        }
      }
    }
    return result;
  }
}
