(defproject graph "0.1.0-SNAPSHOT"
  :description "Grape Rights and Access Handler"
  :url "https://github.com/NullMatrix/GRAPH.git"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.8.0"]
		[clj-http "2.0.0"]
		[grape "0.1.0-SNAPSHOT"]]
  :main ^:skip-aot graph.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
