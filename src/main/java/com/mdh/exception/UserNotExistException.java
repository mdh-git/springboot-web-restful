package com.mdh.exception;

/**
 * @Author: madonghao
 * @Date: 2019/1/21 14:37
 */
public class UserNotExistException extends RuntimeException{
    public UserNotExistException() {
        super("用户不存在");
    }
}
