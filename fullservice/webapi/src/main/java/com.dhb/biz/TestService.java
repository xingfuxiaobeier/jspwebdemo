package com.dhb.biz;

import com.dhb.contract.DeviceFixServiceGrpc;
import io.grpc.Channel;
import net.devh.springboot.autoconfigure.grpc.client.GrpcClient;
import org.springframework.stereotype.Service;

/**
 * Created by mtime on 2018/10/28.
 */
@Service
public class TestService {
    @GrpcClient("device-grpc-server")
    private Channel channel;

    public void testService() {
        System.out.println("execute test service begin ... ");
        try {
            DeviceFixServiceGrpc.DeviceFixServiceBlockingStub stub = DeviceFixServiceGrpc.newBlockingStub(channel);
            stub.insertDeviceFix(null);
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("execute test service end ... ");
    }
}
