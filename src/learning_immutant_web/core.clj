(ns learning-immutant-web.core
  (:require [immutant.web :as web])
  (:gen-class))

(defn app [request]
  {:status 200
   :body "Hello world!"})

(defn -main []
  (web/run app))
