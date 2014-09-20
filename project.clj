(defproject employee-monthly-payslip "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url ""
  :dependencies [[org.clojure/clojure "1.6.0"]]
  :main ^:skip-aot employee-monthly-payslip.core
  :target-path "target/%s"
  :profiles {:dev {:dependencies [[midje "1.6.3"]]
                   :plugins [[lein-midje "3.1.3"]]}
             :uberjar {:aot :all}}

  )
