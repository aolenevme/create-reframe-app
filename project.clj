(defproject create-reframe-app "0.0.1"
  
  :dependencies [[org.clojure/clojure "1.10.1"]
                 [org.clojure/clojurescript  "1.10.597"
                  :exclusions [com.google.javascript/closure-compiler-unshaded         
                               org.clojure/google-closure-library             
                               org.clojure/google-closure-library-third-party]]
                 [thheller/shadow-cljs       "2.8.83"]
                 [reagent "0.9.1"]
                 [re-frame "RELEASE"]
                 [binaryage/devtools "1.0.0"]
                 [clj-commons/secretary "1.2.4"]
                 [day8.re-frame/tracing "0.5.3"]]
  
    :plugins     [[lein-shadow "0.1.7"]]
  
    :clean-targets ^{:protect false} [:target-path 
                                      "shadow-cljs.edn" 
                                      "package.json" 
                                      "package-lock.json"
                                      "resources/public/js"]
  :shadow-cljs {:nrepl {:port 8777}
                
                :builds {:client {:target :browser
                                  :output-dir "resources/public/js"
                                  :modules {:client {:init-fn app.core/main!}}
                                  :devtools {:http-root "resources/public"
                                             :http-port 8280}}}}
  :aliases {"dev-auto" ["shadow" "watch" "client"]})
                                                                               
                 
                 
                 
