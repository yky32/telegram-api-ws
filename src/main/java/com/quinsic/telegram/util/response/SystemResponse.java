package com.quinsic.telegram.util.response;

public interface SystemResponse {
    Response SYS0000 = new Response("SYS0000", "Success.");
    Response SYS9999 = new Response("SYS9999", "Fail.");
    Response SYS0401 = new Response("SYS0401", "Access Denied.");
}
