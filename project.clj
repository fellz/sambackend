(defproject backend "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "EPL-2.0 OR GPL-2.0-or-later WITH Classpath-exception-2.0"
            :url "https://www.eclipse.org/legal/epl-2.0/"}
  :dependencies [[org.clojure/clojure "1.10.1"]
                 [compojure "1.6.2"]
                 [http-kit "2.5.0"]
                 [ring/ring-defaults "0.3.2"]
                 [ring/ring-json "0.5.0"]
                 [ring-cors "0.1.13"]
                 [clj-time "0.15.2"]
                 [org.clojure/data.json "0.2.7"]
                 [org.clojure/java.jdbc "0.7.11"]
                 [org.postgresql/postgresql "9.4-1201-jdbc41"]]
  :min-lein-version "2.0.0"
  :main ^:skip-aot backend.core
  :uberjar-name "backend.jar"
  :plugins [[lein-auto "0.1.3"]]
  :profiles {:uberjar {:main backend.core, :aot :all
                       :jvm-opts ["-Dclojure.compiler.direct-linking=true"]}})
