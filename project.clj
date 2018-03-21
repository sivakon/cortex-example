(defproject cats-dogs-clj "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.8.0"]
  		 [net.mikera/imagez "0.12.0"]
                 [thinktopic/experiment "0.9.22"]
  		 [thinktopic/cortex "0.9.22"]]
  :main ^:skip-aot cats-dogs-clj.core
  :jvm-opts ["-Xmx8000m"]
  :target-path "target/%s"
  :uberjar-name "cats-dogs-example.jar"
  :profiles {:uberjar {:aot :all}})
