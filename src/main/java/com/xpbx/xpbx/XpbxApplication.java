package com.xpbx.xpbx;

import org.kurento.jsonrpc.internal.server.config.JsonRpcConfiguration;
import org.kurento.jsonrpc.server.JsonRpcHandlerRegistry;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.Import;
import org.springframework.web.bind.annotation.RequestMapping;

@Import(JsonRpcConfiguration.class)
@SpringBootApplication
@MapperScan(value={"com.xpbx.xpbx.mapper"})
public class XpbxApplication {

    public static void main(String[] args) {
        SpringApplication.run(XpbxApplication.class, args);
    }


    @RequestMapping("/")
    public String home() {
        return "index";
    }

    //@Override
    //public void registerJsonRpcHandlers(JsonRpcHandlerRegistry registry) {
      //  registry.addHandler(new VizuJsonRpcHandler(), "/echo"); // “/echo” is the path relative to the server’s URL

    //}
}
