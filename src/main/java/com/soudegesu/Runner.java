package com.soudegesu;


import io.vertx.core.Vertx;
import io.vertx.ext.web.Router;

public class Runner {

    public static void main(String[] args) {
        Vertx vertx = Vertx.vertx();

        Router router = Router.router(vertx);

        router.route("/hello")
                .handler(rc -> {
                    rc.response().end("aaaa");
                });

        vertx.createHttpServer()
                .requestHandler(router)
                .listen(8080);
    }
}
