package cfy.bio;

import java.io.IOException;
import java.net.ServerSocket;

/**
 * Created by xxx on 2016/12/15.
 */
public class Server {

    final static int port = 8765;

    public static void main(String[] args) {
        ServerSocket server = null;
        try {
             server = new ServerSocket(port);
             System.out.println("服务端启动---");
            //阻塞服务端 一直到客户端请求连接
			 System.out.println("git  clone then add  and commit---");
             server.accept();


        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if(server != null){
                try {
                    server.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            server =null;
        }

    }

}
