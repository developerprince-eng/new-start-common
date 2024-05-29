package com.newstart.microservice;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.51.0)",
    comments = "Source: sms.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class SendSingleSMSGrpc {

  private SendSingleSMSGrpc() {}

  public static final String SERVICE_NAME = "SendSingleSMS";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.newstart.microservice.SingleRequest,
      com.newstart.microservice.SingleResponse> getSendMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Send",
      requestType = com.newstart.microservice.SingleRequest.class,
      responseType = com.newstart.microservice.SingleResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.newstart.microservice.SingleRequest,
      com.newstart.microservice.SingleResponse> getSendMethod() {
    io.grpc.MethodDescriptor<com.newstart.microservice.SingleRequest, com.newstart.microservice.SingleResponse> getSendMethod;
    if ((getSendMethod = SendSingleSMSGrpc.getSendMethod) == null) {
      synchronized (SendSingleSMSGrpc.class) {
        if ((getSendMethod = SendSingleSMSGrpc.getSendMethod) == null) {
          SendSingleSMSGrpc.getSendMethod = getSendMethod =
              io.grpc.MethodDescriptor.<com.newstart.microservice.SingleRequest, com.newstart.microservice.SingleResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Send"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.newstart.microservice.SingleRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.newstart.microservice.SingleResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SendSingleSMSMethodDescriptorSupplier("Send"))
              .build();
        }
      }
    }
    return getSendMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static SendSingleSMSStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SendSingleSMSStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SendSingleSMSStub>() {
        @java.lang.Override
        public SendSingleSMSStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SendSingleSMSStub(channel, callOptions);
        }
      };
    return SendSingleSMSStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static SendSingleSMSBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SendSingleSMSBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SendSingleSMSBlockingStub>() {
        @java.lang.Override
        public SendSingleSMSBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SendSingleSMSBlockingStub(channel, callOptions);
        }
      };
    return SendSingleSMSBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static SendSingleSMSFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SendSingleSMSFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SendSingleSMSFutureStub>() {
        @java.lang.Override
        public SendSingleSMSFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SendSingleSMSFutureStub(channel, callOptions);
        }
      };
    return SendSingleSMSFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class SendSingleSMSImplBase implements io.grpc.BindableService {

    /**
     */
    public void send(com.newstart.microservice.SingleRequest request,
        io.grpc.stub.StreamObserver<com.newstart.microservice.SingleResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSendMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getSendMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.newstart.microservice.SingleRequest,
                com.newstart.microservice.SingleResponse>(
                  this, METHODID_SEND)))
          .build();
    }
  }

  /**
   */
  public static final class SendSingleSMSStub extends io.grpc.stub.AbstractAsyncStub<SendSingleSMSStub> {
    private SendSingleSMSStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SendSingleSMSStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SendSingleSMSStub(channel, callOptions);
    }

    /**
     */
    public void send(com.newstart.microservice.SingleRequest request,
        io.grpc.stub.StreamObserver<com.newstart.microservice.SingleResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSendMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class SendSingleSMSBlockingStub extends io.grpc.stub.AbstractBlockingStub<SendSingleSMSBlockingStub> {
    private SendSingleSMSBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SendSingleSMSBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SendSingleSMSBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.newstart.microservice.SingleResponse send(com.newstart.microservice.SingleRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSendMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class SendSingleSMSFutureStub extends io.grpc.stub.AbstractFutureStub<SendSingleSMSFutureStub> {
    private SendSingleSMSFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SendSingleSMSFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SendSingleSMSFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.newstart.microservice.SingleResponse> send(
        com.newstart.microservice.SingleRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSendMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SEND = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final SendSingleSMSImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(SendSingleSMSImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SEND:
          serviceImpl.send((com.newstart.microservice.SingleRequest) request,
              (io.grpc.stub.StreamObserver<com.newstart.microservice.SingleResponse>) responseObserver);
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
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class SendSingleSMSBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    SendSingleSMSBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.newstart.microservice.Sms.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("SendSingleSMS");
    }
  }

  private static final class SendSingleSMSFileDescriptorSupplier
      extends SendSingleSMSBaseDescriptorSupplier {
    SendSingleSMSFileDescriptorSupplier() {}
  }

  private static final class SendSingleSMSMethodDescriptorSupplier
      extends SendSingleSMSBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    SendSingleSMSMethodDescriptorSupplier(String methodName) {
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
      synchronized (SendSingleSMSGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new SendSingleSMSFileDescriptorSupplier())
              .addMethod(getSendMethod())
              .build();
        }
      }
    }
    return result;
  }
}
