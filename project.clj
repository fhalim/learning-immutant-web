(defproject learning_immutant_web "0.1.0-SNAPSHOT"
  :description "Step by step Clojure web programming tutorial"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [org.immutant/immutant "2.1.4"]
                 [ring/ring-devel "1.4.0"]
                 [compojure "1.4.0"]]
  :main ^:skip-aot learning-immutant-web.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}}
  :ring {:handler learning-immutant-web.core/app :main learning-immutant-web.core}
  :plugins [[lein-cljfmt "0.5.3"]
    [lein-ring "0.9.7"]])
