package com.example.demo1.utility;

public class ResponseUtil {
    public static ResponseMsg success(){
        ResponseMsg responseMsg = new ResponseMsg();
        responseMsg.setCode(CodeUtil.success_code);
        responseMsg.setData(null);
        responseMsg.setMsg(CodeUtil.success_info);
        return responseMsg;
    }
    public static ResponseMsg success(Object o){
        ResponseMsg responseMsg = new ResponseMsg();
        responseMsg.setCode(CodeUtil.success_code);
        responseMsg.setData(o);
        responseMsg.setMsg(CodeUtil.success_info);
        return responseMsg;
    }
    public static ResponseMsg error(String msg){
        ResponseMsg responseMsg = new ResponseMsg();
        responseMsg.setCode(CodeUtil.error_code);
        responseMsg.setMsg(msg);
        return responseMsg;
    }
}
