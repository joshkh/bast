(ns bast.server
  (:require [bast.handler :refer [handler]]
            [config.core :refer [env]]
            [ring.adapter.jetty :refer [run-jetty]]
            [org.httpkit.server :as http])
  (:gen-class))

 (defn -main [& args]
   (let [port (Integer/parseInt (or (env :port) "3000"))]
     (http/run-server handler {:port port})
     ;(run-jetty handler {:port port :join? false})
     ))
