package com.dhb.service.biz;

import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

/**
 * Created by mtime on 2018/10/28.
 */
@Service
public class Manager {
    @PostConstruct
    public void test() {
        while (true) {
            System.out.println("this is the rpc server");
            try {
                Thread.sleep(1000L);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
