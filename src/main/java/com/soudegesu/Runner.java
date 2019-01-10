package com.soudegesu;


import io.vertx.core.Vertx;
import io.vertx.core.logging.Logger;
import io.vertx.core.logging.LoggerFactory;
import io.vertx.ext.web.Router;

public class Runner {

    private static final Logger LOGGER = LoggerFactory.getLogger(Runner.class);

    public static void main(String[] args) {

        LOGGER.info("Start up server: http://localhost:8080/");

        Vertx vertx = Vertx.vertx();
        Router router = Router.router(vertx);

        router.route("/hello")
                .handler(rc -> {
                    LOGGER.info("Receive a request : /hello");
                    rc.response().end("hogehoge");
                });

        vertx.createHttpServer()
                .requestHandler(router)
                .listen(8080);
    }
}
