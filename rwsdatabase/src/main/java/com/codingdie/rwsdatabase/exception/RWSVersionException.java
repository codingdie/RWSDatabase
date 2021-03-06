package com.codingdie.rwsdatabase.exception;

/**
 * Created by xupeng on 2016/8/26.
 */
public class RWSVersionException extends  RuntimeException {

    public  static  String NO_UPGRADE_METHOD="not implement version %d to  version %d method";
    public  static  String NO_CREATE_METHOD="not implement create database method:%d";
    public  static  String FAILED_CREATE_OR_UPGRADE_DATABASE="failed create or upgrade database";

    public RWSVersionException(String detailMessage) {
        super(detailMessage);
    }
}
