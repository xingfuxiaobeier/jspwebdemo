package com.dhb.service.impl;

import com.dhb.contract.DeviceFixServiceGrpc;
import com.dhb.contract.booleanReply;
import com.dhb.contract.deviceFix;
import io.grpc.stub.StreamObserver;
import net.devh.springboot.autoconfigure.grpc.server.GrpcService;

/**
 * Created by mtime on 2018/10/28.
 */


@GrpcService(DeviceFixServiceGrpc.class)
public class rpcServerService extends DeviceFixServiceGrpc.DeviceFixServiceImplBase {
    @Override
    public void insertDeviceFix(deviceFix request, StreamObserver<booleanReply> responseObserver) {
        System.out.println("dhb, test rpc insert success.");
        booleanReply reply = booleanReply.newBuilder().setReply(true).build();
        responseObserver.onNext(reply);
        responseObserver.onCompleted();
    }
}
