package com.dhb.contract;

import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;

/**
 * <pre>
 * The device service definition.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.6.1)",
    comments = "Source: device.proto")
public final class DeviceFixServiceGrpc {

  private DeviceFixServiceGrpc() {}

  public static final String SERVICE_NAME = "com.dhb.contract.iface.DeviceFixService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.dhb.contract.deviceFix,
      com.dhb.contract.booleanReply> METHOD_INSERT_DEVICE_FIX =
      io.grpc.MethodDescriptor.<com.dhb.contract.deviceFix, com.dhb.contract.booleanReply>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "com.dhb.contract.iface.DeviceFixService", "insertDeviceFix"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.dhb.contract.deviceFix.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.dhb.contract.booleanReply.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.dhb.contract.deviceFix,
      com.dhb.contract.booleanReply> METHOD_UPDATE_DEVICE_FIX =
      io.grpc.MethodDescriptor.<com.dhb.contract.deviceFix, com.dhb.contract.booleanReply>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "com.dhb.contract.iface.DeviceFixService", "updateDeviceFix"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.dhb.contract.deviceFix.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.dhb.contract.booleanReply.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.dhb.contract.conditionsRequest,
      com.dhb.contract.deviceFix> METHOD_SEARCH_DEVICE_FIX =
      io.grpc.MethodDescriptor.<com.dhb.contract.conditionsRequest, com.dhb.contract.deviceFix>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "com.dhb.contract.iface.DeviceFixService", "searchDeviceFix"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.dhb.contract.conditionsRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.dhb.contract.deviceFix.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.dhb.contract.conditionsRequest,
      com.dhb.contract.booleanReply> METHOD_DELETE_DEVICE_FIX =
      io.grpc.MethodDescriptor.<com.dhb.contract.conditionsRequest, com.dhb.contract.booleanReply>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "com.dhb.contract.iface.DeviceFixService", "deleteDeviceFix"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.dhb.contract.conditionsRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.dhb.contract.booleanReply.getDefaultInstance()))
          .build();

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static DeviceFixServiceStub newStub(io.grpc.Channel channel) {
    return new DeviceFixServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static DeviceFixServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new DeviceFixServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static DeviceFixServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new DeviceFixServiceFutureStub(channel);
  }

  /**
   * <pre>
   * The device service definition.
   * </pre>
   */
  public static abstract class DeviceFixServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Sends a message
     * </pre>
     */
    public void insertDeviceFix(com.dhb.contract.deviceFix request,
        io.grpc.stub.StreamObserver<com.dhb.contract.booleanReply> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_INSERT_DEVICE_FIX, responseObserver);
    }

    /**
     */
    public void updateDeviceFix(com.dhb.contract.deviceFix request,
        io.grpc.stub.StreamObserver<com.dhb.contract.booleanReply> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_UPDATE_DEVICE_FIX, responseObserver);
    }

    /**
     */
    public void searchDeviceFix(com.dhb.contract.conditionsRequest request,
        io.grpc.stub.StreamObserver<com.dhb.contract.deviceFix> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_SEARCH_DEVICE_FIX, responseObserver);
    }

    /**
     */
    public void deleteDeviceFix(com.dhb.contract.conditionsRequest request,
        io.grpc.stub.StreamObserver<com.dhb.contract.booleanReply> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_DELETE_DEVICE_FIX, responseObserver);
    }

    public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_INSERT_DEVICE_FIX,
            asyncUnaryCall(
              new MethodHandlers<
                com.dhb.contract.deviceFix,
                com.dhb.contract.booleanReply>(
                  this, METHODID_INSERT_DEVICE_FIX)))
          .addMethod(
            METHOD_UPDATE_DEVICE_FIX,
            asyncUnaryCall(
              new MethodHandlers<
                com.dhb.contract.deviceFix,
                com.dhb.contract.booleanReply>(
                  this, METHODID_UPDATE_DEVICE_FIX)))
          .addMethod(
            METHOD_SEARCH_DEVICE_FIX,
            asyncUnaryCall(
              new MethodHandlers<
                com.dhb.contract.conditionsRequest,
                com.dhb.contract.deviceFix>(
                  this, METHODID_SEARCH_DEVICE_FIX)))
          .addMethod(
            METHOD_DELETE_DEVICE_FIX,
            asyncUnaryCall(
              new MethodHandlers<
                com.dhb.contract.conditionsRequest,
                com.dhb.contract.booleanReply>(
                  this, METHODID_DELETE_DEVICE_FIX)))
          .build();
    }
  }

  /**
   * <pre>
   * The device service definition.
   * </pre>
   */
  public static final class DeviceFixServiceStub extends io.grpc.stub.AbstractStub<DeviceFixServiceStub> {
    private DeviceFixServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private DeviceFixServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DeviceFixServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new DeviceFixServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Sends a message
     * </pre>
     */
    public void insertDeviceFix(com.dhb.contract.deviceFix request,
        io.grpc.stub.StreamObserver<com.dhb.contract.booleanReply> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_INSERT_DEVICE_FIX, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateDeviceFix(com.dhb.contract.deviceFix request,
        io.grpc.stub.StreamObserver<com.dhb.contract.booleanReply> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_UPDATE_DEVICE_FIX, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void searchDeviceFix(com.dhb.contract.conditionsRequest request,
        io.grpc.stub.StreamObserver<com.dhb.contract.deviceFix> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_SEARCH_DEVICE_FIX, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteDeviceFix(com.dhb.contract.conditionsRequest request,
        io.grpc.stub.StreamObserver<com.dhb.contract.booleanReply> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_DELETE_DEVICE_FIX, getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * The device service definition.
   * </pre>
   */
  public static final class DeviceFixServiceBlockingStub extends io.grpc.stub.AbstractStub<DeviceFixServiceBlockingStub> {
    private DeviceFixServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private DeviceFixServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DeviceFixServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new DeviceFixServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Sends a message
     * </pre>
     */
    public com.dhb.contract.booleanReply insertDeviceFix(com.dhb.contract.deviceFix request) {
      return blockingUnaryCall(
          getChannel(), METHOD_INSERT_DEVICE_FIX, getCallOptions(), request);
    }

    /**
     */
    public com.dhb.contract.booleanReply updateDeviceFix(com.dhb.contract.deviceFix request) {
      return blockingUnaryCall(
          getChannel(), METHOD_UPDATE_DEVICE_FIX, getCallOptions(), request);
    }

    /**
     */
    public com.dhb.contract.deviceFix searchDeviceFix(com.dhb.contract.conditionsRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_SEARCH_DEVICE_FIX, getCallOptions(), request);
    }

    /**
     */
    public com.dhb.contract.booleanReply deleteDeviceFix(com.dhb.contract.conditionsRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_DELETE_DEVICE_FIX, getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * The device service definition.
   * </pre>
   */
  public static final class DeviceFixServiceFutureStub extends io.grpc.stub.AbstractStub<DeviceFixServiceFutureStub> {
    private DeviceFixServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private DeviceFixServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DeviceFixServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new DeviceFixServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Sends a message
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.dhb.contract.booleanReply> insertDeviceFix(
        com.dhb.contract.deviceFix request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_INSERT_DEVICE_FIX, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.dhb.contract.booleanReply> updateDeviceFix(
        com.dhb.contract.deviceFix request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_UPDATE_DEVICE_FIX, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.dhb.contract.deviceFix> searchDeviceFix(
        com.dhb.contract.conditionsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_SEARCH_DEVICE_FIX, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.dhb.contract.booleanReply> deleteDeviceFix(
        com.dhb.contract.conditionsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_DELETE_DEVICE_FIX, getCallOptions()), request);
    }
  }

  private static final int METHODID_INSERT_DEVICE_FIX = 0;
  private static final int METHODID_UPDATE_DEVICE_FIX = 1;
  private static final int METHODID_SEARCH_DEVICE_FIX = 2;
  private static final int METHODID_DELETE_DEVICE_FIX = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final DeviceFixServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(DeviceFixServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }


    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_INSERT_DEVICE_FIX:
          serviceImpl.insertDeviceFix((com.dhb.contract.deviceFix) request,
              (io.grpc.stub.StreamObserver<com.dhb.contract.booleanReply>) responseObserver);
          break;
        case METHODID_UPDATE_DEVICE_FIX:
          serviceImpl.updateDeviceFix((com.dhb.contract.deviceFix) request,
              (io.grpc.stub.StreamObserver<com.dhb.contract.booleanReply>) responseObserver);
          break;
        case METHODID_SEARCH_DEVICE_FIX:
          serviceImpl.searchDeviceFix((com.dhb.contract.conditionsRequest) request,
              (io.grpc.stub.StreamObserver<com.dhb.contract.deviceFix>) responseObserver);
          break;
        case METHODID_DELETE_DEVICE_FIX:
          serviceImpl.deleteDeviceFix((com.dhb.contract.conditionsRequest) request,
              (io.grpc.stub.StreamObserver<com.dhb.contract.booleanReply>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }


    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static final class DeviceFixServiceDescriptorSupplier implements io.grpc.protobuf.ProtoFileDescriptorSupplier {

    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.dhb.contract.DeviceFixProto.getDescriptor();
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (DeviceFixServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new DeviceFixServiceDescriptorSupplier())
              .addMethod(METHOD_INSERT_DEVICE_FIX)
              .addMethod(METHOD_UPDATE_DEVICE_FIX)
              .addMethod(METHOD_SEARCH_DEVICE_FIX)
              .addMethod(METHOD_DELETE_DEVICE_FIX)
              .build();
        }
      }
    }
    return result;
  }
}
