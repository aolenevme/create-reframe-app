(ns app.views  
  (:require [reagent.core  :as reagent]            
            [re-frame.core :refer [subscribe dispatch]]))

(defn hello-world [] [:h1 "Hello world!"])

