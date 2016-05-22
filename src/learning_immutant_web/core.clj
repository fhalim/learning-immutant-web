(ns learning-immutant-web.core
  (:require [immutant.web :as web]
            [ring.util.response :refer (response resource-response content-type)]
            [compojure.core     :refer (ANY GET defroutes)])
  (:gen-class))

(defroutes routes
  (GET "/" [] (resource-response "index.html" {:root 'public}))
  (GET "/hello/:id"  [id] (str "Hello, " id)))
(def app routes)

(defn -main []
  (web/run-dmc app))
